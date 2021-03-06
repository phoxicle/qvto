/*******************************************************************************
 * Copyright (c) 2008, 2013 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.stdlib;



public class IntegerOperations extends AbstractContextualOperations {

//	public static final String TO_STRING_NAME = "toString"; //$NON-NLS-1$
	
//	static CallHandler TO_STRING = new CallHandler() {
//		public Object invoke(ModuleInstance module, Object source, Object[] args, QvtOperationalEvaluationEnv evalEnv) {
//			return String.valueOf(source);
//		}
//	};	
	
		
	public IntegerOperations(AbstractQVTStdlib library) {
		super(library, library.getEnvironment().getOCLStandardLibrary().getInteger());
	}
	
	@Override
	protected OperationProvider[] getOperations() {
		//OCLStandardLibrary<EClassifier> oclStdlib = getStdlib().getEnvironment().getOCLStandardLibrary();
		return new OperationProvider[] {
//			new OperationProvider(TO_STRING, TO_STRING_NAME, oclStdlib.getString())
		};
	}		
}
