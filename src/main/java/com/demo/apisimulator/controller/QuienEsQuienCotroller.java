package com.demo.apisimulator.controller;

import com.demo.apisimulator.util.ApiResponseUtil;
import com.demo.apisimulator.util.LogUtil;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class QuienEsQuienCotroller {

    @GetMapping("/token")
    public Map<String, Object> getToken(@RequestParam String client_id) {
        LogUtil.logRequest("/api/token", "client_id: " + client_id);
        return ApiResponseUtil.createResponse("quienesquien/token.json");
    }

    @GetMapping("/find")
    public Map<String, Object> find(
            @RequestParam String client_id,
            @RequestParam String username,
            @RequestParam String name,
            @RequestParam(required = false) String rfc,
            @RequestParam(required = false) String curp,
            @RequestParam(required = false) Integer type,
            @RequestParam(required = false) Integer list,
            @RequestParam(required = false) Integer percent
    ) {
        LogUtil.logRequest("/api/find", "client_id: " + client_id + username + name + rfc + curp + type + list + percent);
        return ApiResponseUtil.createResponse("quienesquien/fisicas.json");
    }
}
