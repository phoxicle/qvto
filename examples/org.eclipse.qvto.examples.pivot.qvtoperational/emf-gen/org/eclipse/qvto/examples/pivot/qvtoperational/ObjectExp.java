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
package org.eclipse.qvto.examples.pivot.qvtoperational;

import org.eclipse.ocl.examples.pivot.Variable;

import org.eclipse.ocl.examples.pivot.util.Visitor;
import org.eclipse.qvto.examples.pivot.imperativeocl.InstantiationExp;
import org.eclipse.qvto.examples.pivot.qvtoperational.util.QVTOperationalVisitor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.pivot.qvtoperational.ObjectExp#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.pivot.qvtoperational.ObjectExp#getReferredObject <em>Referred Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.qvto.examples.pivot.qvtoperational.QVTOperationalPackage#getObjectExp()
 * @model
 * @generated
 */
public interface ObjectExp extends InstantiationExp {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(ConstructorBody)
	 * @see org.eclipse.qvto.examples.pivot.qvtoperational.QVTOperationalPackage#getObjectExp_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConstructorBody getBody();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.pivot.qvtoperational.ObjectExp#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(ConstructorBody value);

	/**
	 * Returns the value of the '<em><b>Referred Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Object</em>' reference.
	 * @see #setReferredObject(Variable)
	 * @see org.eclipse.qvto.examples.pivot.qvtoperational.QVTOperationalPackage#getObjectExp_ReferredObject()
	 * @model required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='objectExpression'"
	 * @generated
	 */
	Variable getReferredObject();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.pivot.qvtoperational.ObjectExp#getReferredObject <em>Referred Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Object</em>' reference.
	 * @see #getReferredObject()
	 * @generated
	 */
	void setReferredObject(Variable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model vType="org.eclipse.qvto.examples.pivot.qvtoperational.QVTOperationalVisitor<R>"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return v.visitObjectExp(this);'"
	 * @generated
	 */
	<R> R accept(QVTOperationalVisitor<R> v);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model vType="org.eclipse.ocl.examples.pivot.Visitor<R>"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((QVTOperationalVisitor<R>)v).visitObjectExp(this);'"
	 * @generated
	 */
	<R> R accept(Visitor<R> v);

} // ObjectExp
