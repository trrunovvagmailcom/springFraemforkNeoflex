package com.app;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
@Log
@RestController
public class SimpleRestController {
    @GetMapping("/get")
    public String  returnRandomId() {
        return UUID.randomUUID().toString();
    }
}
