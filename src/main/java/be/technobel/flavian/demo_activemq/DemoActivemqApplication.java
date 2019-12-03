package be.technobel.flavian.demo_activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoActivemqApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoActivemqApplication.class, args);
    }

}
