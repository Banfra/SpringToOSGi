package message.service;

import java.util.ArrayList;
import java.util.List;

public class Message {
	private final List<IMessageSender> services = new ArrayList<IMessageSender>();
	 
    public void addService(final IMessageSender messageSender) {
        services.add(messageSender);
    }
 
    public void removeService(final IMessageSender messageSender) {
        services.remove(messageSender);
    }
 
    public void send(final String message) {
        for (final IMessageSender messageSender : services) {
           messageSender.send(message);
        }
    }
}
