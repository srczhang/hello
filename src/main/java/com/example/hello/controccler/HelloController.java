package com.example.hello.controccler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Map<String, Object> hello() {
        HashMap<String, Object> hashMap = new HashMap<>(3);
        hashMap.put("code", 200);
        hashMap.put("message", "Hello");
        HashMap<String, Object> time = new HashMap<>(1);
        time.put("time", LocalDateTime.now().
                format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        hashMap.put("data", time);
        return hashMap;

    }
}
