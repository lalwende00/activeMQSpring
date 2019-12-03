package be.technobel.flavian.demo_activemq.jobs;

import be.technobel.flavian.demo_activemq.model.User;
import com.google.gson.Gson;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SayHelloJob {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Scheduled(cron = "* * * ? * *")
    public void sendJob() {
        LoggerFactory.getLogger(SayHelloJob.class).debug("===== START JOB =====");
        User user = new User();
        user.setUsername("Flavian");

        jmsTemplate.convertAndSend("demo_activemq.hello-world", new Gson().toJson(user).toString());
    }
}
