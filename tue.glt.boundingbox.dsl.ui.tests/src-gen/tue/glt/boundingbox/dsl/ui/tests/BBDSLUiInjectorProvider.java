/*
 * generated by Xtext 2.10.0
 */
package tue.glt.boundingbox.dsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;
import tue.glt.boundingbox.dsl.ui.internal.DslActivator;

public class BBDSLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DslActivator.getInstance().getInjector("tue.glt.boundingbox.dsl.BBDSL");
	}

}
