/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.icshelper.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractIcsHelperValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.example.icshelper.icsHelper.IcsHelperPackage.eINSTANCE);
		return result;
	}
}