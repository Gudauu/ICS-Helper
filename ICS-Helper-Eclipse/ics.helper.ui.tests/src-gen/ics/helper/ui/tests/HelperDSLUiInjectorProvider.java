/*
 * generated by Xtext 2.34.0
 */
package ics.helper.ui.tests;

import com.google.inject.Injector;
import ics.helper.ui.internal.HelperActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class HelperDSLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return HelperActivator.getInstance().getInjector("ics.helper.HelperDSL");
	}

}