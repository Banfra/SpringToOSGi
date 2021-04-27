package message;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import message.service.Message;

public class Activator {
	
	public void start(BundleContext context) throws Exception {
        context.registerService(Message.class.getName(), messageService, null);
    }
 
    public void stop(BundleContext context) throws Exception {
        messageService = null;
    }
}
