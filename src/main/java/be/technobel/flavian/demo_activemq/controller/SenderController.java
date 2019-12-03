package be.technobel.flavian.demo_activemq.controller;

import be.technobel.flavian.demo_activemq.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SenderController {

    private final Producer producer;

    @Autowired
    public SenderController(Producer producer) {
        this.producer = producer;
    }

    @GetMapping("/send")
    public String sendAction() {
        this.producer.sendMessage();

        return "blop";
    }
}
