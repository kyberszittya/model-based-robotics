/*
 * generated by Xtext 2.23.0
 */
package hu.sze.aut.robotics.vehicle.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import hu.sze.aut.robotics.vehicle.VehicleDslRuntimeModule;
import hu.sze.aut.robotics.vehicle.VehicleDslStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class VehicleDslIdeSetup extends VehicleDslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new VehicleDslRuntimeModule(), new VehicleDslIdeModule()));
	}
	
}
