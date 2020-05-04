package payroll;

import com.ixortalk.iot.client.core.IotClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.inject.Inject;

import static org.springframework.http.ResponseEntity.ok;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class ConnectAWS {

    @Inject
    private IotClient iotClient;

    @PostMapping
    @RequestMapping(method = POST, path = "/send")
    public ResponseEntity sendAws(@RequestBody String payload) {
        iotClient.publish(payload);
        return ok().build();
    }

}
