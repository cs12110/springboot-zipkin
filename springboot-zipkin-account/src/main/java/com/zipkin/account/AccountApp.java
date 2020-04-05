package com.zipkin.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p>
 *
 * @author cs12110 create at 2020-04-05 15:49
 * <p>
 * @since 1.0.0
 */
@SpringBootApplication
@ComponentScan(basePackages = {
        "com.zipkin"
})
public class AccountApp {

    public static void main(String[] args) {
        SpringApplication.run(AccountApp.class, args);
    }
}
