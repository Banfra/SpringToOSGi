package BatterySaverBundle;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceEvent;

public class Activator implements BundleActivator {
	public void start(BundleContext context)
    {
        System.out.println("BatterySaver service started");
    }
	
	public void stop(BundleContext context)
    {
        // NOTE: The service is automatically unregistered.
		System.out.println("BatterySaver service stopped");
    }
	
}
