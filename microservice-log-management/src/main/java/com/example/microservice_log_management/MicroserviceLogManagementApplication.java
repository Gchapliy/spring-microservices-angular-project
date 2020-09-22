package com.example.microservice_log_management;

import com.example.microservice_log_management.config.CassandraConfig;
import com.example.microservice_log_management.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

@EnableDiscoveryClient
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@Import({WebConfig.class, CassandraConfig.class})
public class MicroserviceLogManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceLogManagementApplication.class, args);
    }

}
