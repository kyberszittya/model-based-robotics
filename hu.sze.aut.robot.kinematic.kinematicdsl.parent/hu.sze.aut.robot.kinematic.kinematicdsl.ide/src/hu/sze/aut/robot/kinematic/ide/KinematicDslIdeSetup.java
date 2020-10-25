/*
 * generated by Xtext 2.23.0
 */
package hu.sze.aut.robot.kinematic.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import hu.sze.aut.robot.kinematic.KinematicDslRuntimeModule;
import hu.sze.aut.robot.kinematic.KinematicDslStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class KinematicDslIdeSetup extends KinematicDslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new KinematicDslRuntimeModule(), new KinematicDslIdeModule()));
	}
	
}
