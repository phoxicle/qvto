/**
 * <copyright>
 * Copyright (c) 2013 Willink Transformations, University of York, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *   Adolfo Sanchez-Barbudo (University of York) - Bug397429
 * </copyright>
 */
package org.eclipse.qvto.examples.pivot.qvtoperational.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.ocl.examples.pivot.internal.impl.ElementImpl;

import org.eclipse.ocl.examples.pivot.util.Visitor;
import org.eclipse.qvto.examples.pivot.qvtoperational.DummyRelationDomain;
import org.eclipse.qvto.examples.pivot.qvtoperational.QVTOperationalPackage;
import org.eclipse.qvto.examples.pivot.qvtoperational.util.QVTOperationalVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dummy Relation Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DummyRelationDomainImpl extends ElementImpl implements DummyRelationDomain {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DummyRelationDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.DUMMY_RELATION_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <R> R accept(final QVTOperationalVisitor<R> v) {
		return v.visitDummyRelationDomain(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <R> R accept(final Visitor<R> v) {
		return ((QVTOperationalVisitor<R>)v).visitDummyRelationDomain(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings({"rawtypes", "unchecked" })
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case QVTOperationalPackage.DUMMY_RELATION_DOMAIN___ACCEPT__QVTOPERATIONALVISITOR:
				return accept((QVTOperationalVisitor)arguments.get(0));
			case QVTOperationalPackage.DUMMY_RELATION_DOMAIN___ACCEPT__VISITOR:
				return accept((Visitor)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DummyRelationDomainImpl
