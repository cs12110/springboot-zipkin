package com.zipkin.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p>
 *
 * @author cs12110 create at 2020-04-05 14:19
 * <p>
 * @since 1.0.0
 */
@SpringBootApplication
@ComponentScan(basePackages = {
        "com.zipkin"
})
public class OrderApp {

    public static void main(String[] args) {
        SpringApplication.run(OrderApp.class, args);
    }
}
