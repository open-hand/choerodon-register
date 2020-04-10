package io.choerodon.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Import;

@EnableHZeroRegister
@EnableEurekaServer
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@Import(EurekaServerAutoConfiguration.class)
public class HzeroRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzeroRegisterApplication.class, args);
    }

}
