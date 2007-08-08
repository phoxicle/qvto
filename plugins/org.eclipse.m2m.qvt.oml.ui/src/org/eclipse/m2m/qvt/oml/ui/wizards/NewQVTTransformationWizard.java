/*******************************************************************************
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.qvt.oml.ui.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.m2m.qvt.oml.QvtNamesChecker;
import org.eclipse.m2m.qvt.oml.ui.QVTUIPlugin;
import org.eclipse.m2m.qvt.oml.ui.QvtPluginImages;


public class NewQVTTransformationWizard extends AbstractNewQVTElementWizard {
 
	private NewQvtTransformationCreationPage myNewQvtModulePage;
	public NewQVTTransformationWizard() {
    	setWindowTitle(Messages.NewQVTTransformationWizard_Title);//$NON-NLS-1$
    	
        ImageDescriptor desc = QvtPluginImages.getInstance().getImageDescriptor(QvtPluginImages.NEW_WIZARD);
        setDefaultPageImageDescriptor(desc);        
        setHelpAvailable(false);
    }
    
    protected NewQvtTransformationCreationPage createQvtTransformationCreationPage() {
    	if(getDestinationProvider() != null) {
    		return new NewQvtTransformationCreationPage(getDestinationProvider());
    	}
    	return new NewQvtTransformationCreationPage();
    }
    
    protected final NewQvtTransformationCreationPage getQvtTransformationCreationPage() {
    	return myNewQvtModulePage;
    }
        
	@Override
    public boolean canFinish() {
        IWizardPage[] pages = getPages();
        for (int i = 0; i < pages.length; i++) {
            if (!pages[i].isPageComplete()) {
                return false;
            }
        }
        return true;
    }
            
	@Override
	public boolean doPerformFinish(IProgressMonitor monitor) {
        try {
        	String moduleName = myNewQvtModulePage.getModuleName(); 
        	assert QvtNamesChecker.validateQvtModuleIdentifier(moduleName).isOK();
        	
        	String contents = createTransformationContents(moduleName);
        	IFile transformationFile = myNewQvtModulePage.createNewFile(contents, monitor);            		
            
        	NewQvtModuleCreationPage.openInEditor(getShell(), transformationFile);
            return true;
        } catch (Exception exception) {
            QVTUIPlugin.log(exception);
            return false;
        }
	}
	
    protected String createTransformationContents(String moduleName) {
    	StringBuffer contents = new StringBuffer();
    	contents.append("transformation ").append(moduleName).append("();"); //$NON-NLS-1$ //$NON-NLS-2$
    	contents.append("\n\n"); //$NON-NLS-1$
    	contents.append("mapping main() {\n\n}\n"); //$NON-NLS-1$    	    	

    	return contents.toString();
    }
	
	@Override
	public void addPages() {
		doAddPages();
	}

	protected void doAddPages() {
        myNewQvtModulePage = createQvtTransformationCreationPage();        
        myNewQvtModulePage.setTitle(Messages.NewQVTTransformationWizard_NewModuleFilePageTitle);//$NON-NLS-1$
        myNewQvtModulePage.setDescription(Messages.NewQVTTransformationWizard_NewModulePageDescription);//$NON-NLS-1$
        addPage(myNewQvtModulePage);

        setContentsCreated(true);        
    }
}
