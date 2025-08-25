package td.msk.eazyschoolconsumrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "td.msk.eazyschoolconsumrest.proxy")
public class EazySchoolConsumRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(EazySchoolConsumRestApplication.class, args);
    }

}
