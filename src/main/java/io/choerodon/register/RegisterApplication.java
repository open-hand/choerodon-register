package io.choerodon.register;


import org.hzero.autoconfigure.register.EnableHZeroRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableHZeroRegister
@EnableEurekaServer
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class RegisterApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(RegisterApplication.class, args);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
