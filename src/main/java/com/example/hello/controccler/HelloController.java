package com.example.hello.controccler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public HashMap<String, Object> hello() {
        return new HashMap<>(2) {{
            put("code", 200);
            put("message", "Hello");
        }};
    }
}
