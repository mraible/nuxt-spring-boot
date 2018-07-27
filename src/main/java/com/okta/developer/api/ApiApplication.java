package com.okta.developer.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
}

@RestController
class HelloWorld {

    @GetMapping("/")
    @CrossOrigin("*")
    public ResponseEntity<?> hello() {
        Map<String, String> data = new HashMap<>();
        data.put("message", "Hello World");
        return ResponseEntity.ok().body(data);
    }

}
