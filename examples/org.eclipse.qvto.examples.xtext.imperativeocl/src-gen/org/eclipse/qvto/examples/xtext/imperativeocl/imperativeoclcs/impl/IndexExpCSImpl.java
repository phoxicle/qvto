/**
 */
package org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.examples.xtext.base.util.BaseCSVisitor;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;

import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.impl.ExpCSImpl;

import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.ImperativeoclcsPackage;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.IndexExpCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.NameExpCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.util.ImperativeOCLCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.impl.IndexExpCSImpl#getNameExp <em>Name Exp</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.impl.IndexExpCSImpl#getFirstIndexes <em>First Indexes</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.impl.IndexExpCSImpl#getSecondIndexes <em>Second Indexes</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.impl.IndexExpCSImpl#isAtPre <em>At Pre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndexExpCSImpl extends ExpCSImpl implements IndexExpCS
{
  /**
	 * The cached value of the '{@link #getNameExp() <em>Name Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNameExp()
	 * @generated
	 * @ordered
	 */
  protected NameExpCS nameExp;

  /**
	 * The cached value of the '{@link #getFirstIndexes() <em>First Indexes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFirstIndexes()
	 * @generated
	 * @ordered
	 */
  protected EList<ExpCS> firstIndexes;

  /**
	 * The cached value of the '{@link #getSecondIndexes() <em>Second Indexes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSecondIndexes()
	 * @generated
	 * @ordered
	 */
  protected EList<ExpCS> secondIndexes;

  /**
	 * The default value of the '{@link #isAtPre() <em>At Pre</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isAtPre()
	 * @generated
	 * @ordered
	 */
  protected static final boolean AT_PRE_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isAtPre() <em>At Pre</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isAtPre()
	 * @generated
	 * @ordered
	 */
  protected boolean atPre = AT_PRE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected IndexExpCSImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return ImperativeoclcsPackage.Literals.INDEX_EXP_CS;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NameExpCS getNameExp()
  {
		return nameExp;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetNameExp(NameExpCS newNameExp, NotificationChain msgs)
  {
		NameExpCS oldNameExp = nameExp;
		nameExp = newNameExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeoclcsPackage.INDEX_EXP_CS__NAME_EXP, oldNameExp, newNameExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setNameExp(NameExpCS newNameExp)
  {
		if (newNameExp != nameExp) {
			NotificationChain msgs = null;
			if (nameExp != null)
				msgs = ((InternalEObject)nameExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeoclcsPackage.INDEX_EXP_CS__NAME_EXP, null, msgs);
			if (newNameExp != null)
				msgs = ((InternalEObject)newNameExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeoclcsPackage.INDEX_EXP_CS__NAME_EXP, null, msgs);
			msgs = basicSetNameExp(newNameExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeoclcsPackage.INDEX_EXP_CS__NAME_EXP, newNameExp, newNameExp));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<ExpCS> getFirstIndexes()
  {
		if (firstIndexes == null) {
			firstIndexes = new EObjectContainmentEList<ExpCS>(ExpCS.class, this, ImperativeoclcsPackage.INDEX_EXP_CS__FIRST_INDEXES);
		}
		return firstIndexes;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<ExpCS> getSecondIndexes()
  {
		if (secondIndexes == null) {
			secondIndexes = new EObjectContainmentEList<ExpCS>(ExpCS.class, this, ImperativeoclcsPackage.INDEX_EXP_CS__SECOND_INDEXES);
		}
		return secondIndexes;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isAtPre()
  {
		return atPre;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setAtPre(boolean newAtPre)
  {
		boolean oldAtPre = atPre;
		atPre = newAtPre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeoclcsPackage.INDEX_EXP_CS__AT_PRE, oldAtPre, atPre));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
     * @added
	 */
	public <R> R accept(final ImperativeOCLCSVisitor<R> v) {
		return v.visitIndexExpCS(this);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
     * @added
	 */
	public <R> R accept(final BaseCSVisitor<R> v) {
		return ((ImperativeOCLCSVisitor<R>)v).visitIndexExpCS(this);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case ImperativeoclcsPackage.INDEX_EXP_CS__NAME_EXP:
				return basicSetNameExp(null, msgs);
			case ImperativeoclcsPackage.INDEX_EXP_CS__FIRST_INDEXES:
				return ((InternalEList<?>)getFirstIndexes()).basicRemove(otherEnd, msgs);
			case ImperativeoclcsPackage.INDEX_EXP_CS__SECOND_INDEXES:
				return ((InternalEList<?>)getSecondIndexes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case ImperativeoclcsPackage.INDEX_EXP_CS__NAME_EXP:
				return getNameExp();
			case ImperativeoclcsPackage.INDEX_EXP_CS__FIRST_INDEXES:
				return getFirstIndexes();
			case ImperativeoclcsPackage.INDEX_EXP_CS__SECOND_INDEXES:
				return getSecondIndexes();
			case ImperativeoclcsPackage.INDEX_EXP_CS__AT_PRE:
				return isAtPre();
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
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ImperativeoclcsPackage.INDEX_EXP_CS__NAME_EXP:
				setNameExp((NameExpCS)newValue);
				return;
			case ImperativeoclcsPackage.INDEX_EXP_CS__FIRST_INDEXES:
				getFirstIndexes().clear();
				getFirstIndexes().addAll((Collection<? extends ExpCS>)newValue);
				return;
			case ImperativeoclcsPackage.INDEX_EXP_CS__SECOND_INDEXES:
				getSecondIndexes().clear();
				getSecondIndexes().addAll((Collection<? extends ExpCS>)newValue);
				return;
			case ImperativeoclcsPackage.INDEX_EXP_CS__AT_PRE:
				setAtPre((Boolean)newValue);
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
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case ImperativeoclcsPackage.INDEX_EXP_CS__NAME_EXP:
				setNameExp((NameExpCS)null);
				return;
			case ImperativeoclcsPackage.INDEX_EXP_CS__FIRST_INDEXES:
				getFirstIndexes().clear();
				return;
			case ImperativeoclcsPackage.INDEX_EXP_CS__SECOND_INDEXES:
				getSecondIndexes().clear();
				return;
			case ImperativeoclcsPackage.INDEX_EXP_CS__AT_PRE:
				setAtPre(AT_PRE_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case ImperativeoclcsPackage.INDEX_EXP_CS__NAME_EXP:
				return nameExp != null;
			case ImperativeoclcsPackage.INDEX_EXP_CS__FIRST_INDEXES:
				return firstIndexes != null && !firstIndexes.isEmpty();
			case ImperativeoclcsPackage.INDEX_EXP_CS__SECOND_INDEXES:
				return secondIndexes != null && !secondIndexes.isEmpty();
			case ImperativeoclcsPackage.INDEX_EXP_CS__AT_PRE:
				return atPre != AT_PRE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (atPre: ");
		result.append(atPre);
		result.append(')');
		return result.toString();
	}

} //IndexExpCSImpl