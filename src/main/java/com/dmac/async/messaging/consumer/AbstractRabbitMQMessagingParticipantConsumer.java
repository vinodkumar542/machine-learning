package com.dmac.async.messaging.consumer;



import java.io.IOException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
*
*
* @author <a href="mailto:aravindh.chinnasamy@gmail.com">Aravindh Chinnasamy</a>
* @version %I%, %G%
* @since 1.0
*/
public abstract class AbstractRabbitMQMessagingParticipantConsumer 
						implements IMessagingServiceParticipantConsumer {

	private static final String LOCAL_HOST = "localhost";
	
	protected Channel retrieveConnectionToRabbitMQServer() throws IOException {
		
		ConnectionFactory factory = new ConnectionFactory();
	    factory.setHost(LOCAL_HOST);
	    Connection connection = factory.newConnection();
	    Channel channel = connection.createChannel();
	    
	    return channel;
	}
}
