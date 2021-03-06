/**
 *
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.talendfile.validation;


/**
 * A sample validator interface for {@link org.talend.designer.core.model.utils.emf.talendfile.ItemInforType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ItemInforTypeValidator {
    boolean validate();

    boolean validateIdOrName(String value);
    boolean validateSystem(boolean value);
}
