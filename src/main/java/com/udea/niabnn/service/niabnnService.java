package com.udea.niabnn.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.udea.niabnn.model.niabnnResponse;


@Service
public class niabnnService {

    public niabnnResponse getAgeForName(String name){
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.agify.io/?name=" + name;
        return restTemplate.getForObject(url, niabnnResponse.class);
    }
    
}
