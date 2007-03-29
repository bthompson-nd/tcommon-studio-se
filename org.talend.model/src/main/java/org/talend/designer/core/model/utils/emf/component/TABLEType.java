/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.component;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TABLE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.TABLEType#getCOLUMN <em>COLUMN</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.TABLEType#isREADONLY <em>READONLY</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getTABLEType()
 * @model extendedMetaData="name='TABLE_._type' kind='elementOnly'"
 * @generated
 */
public interface TABLEType extends EObject {
    /**
     * Returns the value of the '<em><b>COLUMN</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.core.model.utils.emf.component.COLUMNType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>COLUMN</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>COLUMN</em>' containment reference list.
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getTABLEType_COLUMN()
     * @model type="org.talend.designer.core.model.utils.emf.component.COLUMNType" containment="true"
     *        extendedMetaData="kind='element' name='COLUMN' namespace='##targetNamespace'"
     * @generated
     */
    EList getCOLUMN();

    /**
     * Returns the value of the '<em><b>READONLY</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>READONLY</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>READONLY</em>' attribute.
     * @see #isSetREADONLY()
     * @see #unsetREADONLY()
     * @see #setREADONLY(boolean)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getTABLEType_READONLY()
     * @model default="false" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='READONLY' namespace='##targetNamespace'"
     * @generated
     */
    boolean isREADONLY();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.TABLEType#isREADONLY <em>READONLY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>READONLY</em>' attribute.
     * @see #isSetREADONLY()
     * @see #unsetREADONLY()
     * @see #isREADONLY()
     * @generated
     */
    void setREADONLY(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.TABLEType#isREADONLY <em>READONLY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetREADONLY()
     * @see #isREADONLY()
     * @see #setREADONLY(boolean)
     * @generated
     */
    void unsetREADONLY();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.TABLEType#isREADONLY <em>READONLY</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>READONLY</em>' attribute is set.
     * @see #unsetREADONLY()
     * @see #isREADONLY()
     * @see #setREADONLY(boolean)
     * @generated
     */
    boolean isSetREADONLY();

} // TABLEType