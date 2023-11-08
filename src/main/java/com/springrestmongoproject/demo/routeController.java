package com.springrestmongoproject.demo;

import java.net.http.HttpResponse;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mashape.unirest.http.JsonNode;

import com.mashape.unirest.http.Unirest;

@RestController
public class routeController {

    @GetMapping("/")
    public String rootPage() {
        return "Welcome to Root Page";
    }

}
