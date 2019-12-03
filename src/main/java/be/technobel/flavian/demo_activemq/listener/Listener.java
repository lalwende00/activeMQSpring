package be.technobel.flavian.demo_activemq.listener;

import com.google.common.base.Joiner;
import com.google.gson.Gson;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;
import java.util.Map;

@Component
@EnableJms
public class Listener {

//    @JmsListener(destination = "demo_activemq.hello-world")
//    public void receiveMessage(Message jsonMessage) throws JMSException {
//        String msgData = null;
//
//        LoggerFactory.getLogger(Listener.class).info("BEFORE");
//        if (jsonMessage instanceof TextMessage) {
//            TextMessage textMessage = (TextMessage) jsonMessage;
//            msgData = textMessage.getText();
//            Map data = new Gson().fromJson(msgData, Map.class);
//            // Traitement de la donnée
//            LoggerFactory.getLogger(Listener.class).info(data.get("username").toString());
//        }
//        LoggerFactory.getLogger(Listener.class).info("AFTER");
//    }
}
