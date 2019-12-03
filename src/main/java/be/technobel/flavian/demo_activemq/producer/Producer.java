package be.technobel.flavian.demo_activemq.producer;

import be.technobel.flavian.demo_activemq.model.User;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
@EnableJms
public class Producer {
    @Autowired
    private JmsTemplate jmsTemplate;

    @SendTo("demo_activemq.hello-world")
    public String sendMessage() {

        User user = new User();
        user.setUsername("Flavian");

        jmsTemplate.convertAndSend("demo_activemq.hello-world", new Gson().toJson(user).toString());
        return new Gson().toJson(user).toString();
    }
}
