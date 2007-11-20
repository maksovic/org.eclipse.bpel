/**
 * <copyright>
 * </copyright>
 *
 * $Id: FromPartImpl.java,v 1.8 2007/11/20 14:14:22 smoser Exp $
 */
package org.eclipse.bpel.model.impl;

import javax.wsdl.Input;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.bpel.model.FromPart;
import org.eclipse.bpel.model.FromParts;
import org.eclipse.bpel.model.PartnerActivity;
import org.eclipse.bpel.model.Variable;
import org.eclipse.bpel.model.proxy.PartProxy;
import org.eclipse.bpel.model.util.BPELConstants;
import org.eclipse.bpel.model.util.ReconciliationHelper;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.wst.wsdl.Message;
import org.eclipse.wst.wsdl.Operation;
import org.eclipse.wst.wsdl.Part;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>From Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel.model.impl.FromPartImpl#getToVariable <em>To Variable</em>}</li>
 *   <li>{@link org.eclipse.bpel.model.impl.FromPartImpl#getPart <em>Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FromPartImpl extends ExtensibleElementImpl implements FromPart {
	/**
	 * The cached value of the '{@link #getToVariable() <em>To Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable	toVariable;

	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected Part		part;
	
	/**
	 * The deserialized value of the part name.
	 * @customized
	 */
	protected String	partName	= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FromPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPELPackage.Literals.FROM_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getToVariable() {
		if (toVariable != null && toVariable.eIsProxy()) {
			InternalEObject oldToVariable = (InternalEObject) toVariable;
			toVariable = (Variable) eResolveProxy(oldToVariable);
			if (toVariable != oldToVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BPELPackage.FROM_PART__TO_VARIABLE, oldToVariable, toVariable));
			}
		}
		return toVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetToVariable() {
		return toVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToVariable(Variable newToVariable) {
		Variable oldToVariable = toVariable;
        if (!isReconciling) {
            ReconciliationHelper.replaceAttribute(this, BPELConstants.AT_TO_VARIABLE,
					newToVariable == null ? null : newToVariable.getName());
        }
		toVariable = newToVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BPELPackage.FROM_PART__TO_VARIABLE, oldToVariable, toVariable));
	}

	/**
	 * Customizes {@link #getPartGen()} to lazy-resolve the part name.
	 * @customized
	 */
	public Part getPart() {
		if (part == null && partName != null) {
			EObject container = this.eContainer;
			if (container != null && container instanceof FromParts) {
				FromParts fromParts = (FromParts) container;
				container = fromParts.eContainer();
				if (container != null && container instanceof PartnerActivity) {
					PartnerActivity partnerActivity = (PartnerActivity) container;
					if (partnerActivity != null) {
						Operation operation = partnerActivity.getOperation();
						if (operation != null) {
							Input input = operation.getInput();
							if (input != null) {
								javax.wsdl.Message message = input.getMessage();
								if (message != null) {
									// Create an part proxy with the deserialized part name.
									part = new PartProxy(eResource(), (Message) message, partName);
									partName = null;
								}
							}
						}
					}
				}
			}
		}
		return getPartGen();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part getPartGen() {
		if (part != null && part.eIsProxy()) {
			InternalEObject oldPart = (InternalEObject) part;
			part = (Part) eResolveProxy(oldPart);
			if (part != oldPart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BPELPackage.FROM_PART__PART, oldPart, part));
			}
		}
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part basicGetPart() {
		return part;
	}

	/**
	 * Set the deserialized value of the part name.
	 * @customized
	 */
	public void setPartName(String newPartName) {

		partName = newPartName;
	}
	
	/**
	 * Get the deserialized value of the part name.
	 * @customized
	 */
	public String getPartName() {

		return partName;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPart(Part newPart) {
		Part oldPart = part;
		if (!isReconciling) {
            ReconciliationHelper.replaceAttribute(this, BPELConstants.AT_PART, newPart.getName());
        }
		part = newPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPELPackage.FROM_PART__PART,
					oldPart, part));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BPELPackage.FROM_PART__TO_VARIABLE:
			if (resolve)
				return getToVariable();
			return basicGetToVariable();
		case BPELPackage.FROM_PART__PART:
			if (resolve)
				return getPart();
			return basicGetPart();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BPELPackage.FROM_PART__TO_VARIABLE:
			setToVariable((Variable) newValue);
			return;
		case BPELPackage.FROM_PART__PART:
			setPart((Part) newValue);
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
		case BPELPackage.FROM_PART__TO_VARIABLE:
			setToVariable((Variable) null);
			return;
		case BPELPackage.FROM_PART__PART:
			setPart((Part) null);
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
		case BPELPackage.FROM_PART__TO_VARIABLE:
			return toVariable != null;
		case BPELPackage.FROM_PART__PART:
			return part != null;
		}
		return super.eIsSet(featureID);
	}

} //FromPartImpl
