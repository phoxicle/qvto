/*******************************************************************************
 * Copyright (c) 2008 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.evaluator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.internal.qvt.oml.expressions.Module;
import org.eclipse.m2m.internal.qvt.oml.stdlib.CallHandler;

public interface ModuleInstance extends EObject, ThisInstanceResolver {

	public Module getModule();

	// TODO - move entry operation handler to a Transformation instance only 
	public void setEntryOperationHandler(CallHandler handler);
	
	public CallHandler getEntryOperationHandler();

}