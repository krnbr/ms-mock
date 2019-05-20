package in.n6h.ms.mock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsMockApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsMockApplication.class, args);
    }

}
