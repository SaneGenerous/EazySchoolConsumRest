package td.msk.eazyschoolconsumrest.proxy;

import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import td.msk.eazyschoolconsumrest.config.ProjectConfiguration;
import td.msk.eazyschoolconsumrest.model.Contact;

import java.util.List;

@FeignClient(name = "contact", url = "http://localhost:8080/api/contact",
    configuration = ProjectConfiguration.class)
public interface ContactProxy {

    @GetMapping(value = "/getMessagesByStatus")
    @Headers(value = "Content-type: application/json")
    public List<Contact> getMessagesByStatus(@RequestParam("status") String status);
}
