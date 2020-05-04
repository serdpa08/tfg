package payroll;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseTestController {
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/prueba")
    ResponseEntity<String> valor(
            @RequestParam("valor") int variable) {

        if (variable > 1) {
            return new ResponseEntity<>(
                    "El número es mayor de 0",
                    HttpStatus.BAD_REQUEST);
        }
        else {
            return new ResponseEntity<>(
                    "Your age is " + variable,
                    HttpStatus.OK);
        }
    }
}
