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
package org.eclipse.qvto.examples.pivot.imperativeocl.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.examples.pivot.internal.impl.LiteralExpImpl;

import org.eclipse.ocl.examples.pivot.util.Visitor;
import org.eclipse.qvto.examples.pivot.imperativeocl.ImperativeOCLPackage;
import org.eclipse.qvto.examples.pivot.imperativeocl.OrderedTupleLiteralExp;
import org.eclipse.qvto.examples.pivot.imperativeocl.OrderedTupleLiteralPart;
import org.eclipse.qvto.examples.pivot.imperativeocl.util.ImperativeOCLVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ordered Tuple Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.pivot.imperativeocl.impl.OrderedTupleLiteralExpImpl#getPart <em>Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderedTupleLiteralExpImpl extends LiteralExpImpl implements OrderedTupleLiteralExp {
	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected EList<OrderedTupleLiteralPart> part;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderedTupleLiteralExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImperativeOCLPackage.Literals.ORDERED_TUPLE_LITERAL_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrderedTupleLiteralPart> getPart() {
		if (part == null) {
			part = new EObjectContainmentEList<OrderedTupleLiteralPart>(OrderedTupleLiteralPart.class, this, ImperativeOCLPackage.ORDERED_TUPLE_LITERAL_EXP__PART);
		}
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <R> R accept(final ImperativeOCLVisitor<R> v) {
		return v.visitOrderedTupleLiteralExp(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <R> R accept(final Visitor<R> v) {
		return ((ImperativeOCLVisitor<R>)v).visitOrderedTupleLiteralExp(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImperativeOCLPackage.ORDERED_TUPLE_LITERAL_EXP__PART:
				return ((InternalEList<?>)getPart()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImperativeOCLPackage.ORDERED_TUPLE_LITERAL_EXP__PART:
				return getPart();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImperativeOCLPackage.ORDERED_TUPLE_LITERAL_EXP__PART:
				getPart().clear();
				getPart().addAll((Collection<? extends OrderedTupleLiteralPart>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ImperativeOCLPackage.ORDERED_TUPLE_LITERAL_EXP__PART:
				getPart().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ImperativeOCLPackage.ORDERED_TUPLE_LITERAL_EXP__PART:
				return part != null && !part.isEmpty();
		}
		return super.eIsSet(featureID);
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
			case ImperativeOCLPackage.ORDERED_TUPLE_LITERAL_EXP___ACCEPT__IMPERATIVEOCLVISITOR:
				return accept((ImperativeOCLVisitor)arguments.get(0));
			case ImperativeOCLPackage.ORDERED_TUPLE_LITERAL_EXP___ACCEPT__VISITOR:
				return accept((Visitor)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //OrderedTupleLiteralExpImpl
