package com.udea.niabnn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.udea.niabnn.model.niabnnResponse;
import com.udea.niabnn.service.niabnnService;

@RestController
@RequestMapping("/api")
public class AgeController {
    @Autowired
    private niabnnService niabnnService;

    @RequestMapping("/age")
    public niabnnResponse getAge(@RequestParam String name) {
        return niabnnService.getAgeForName(name);
    }

}
