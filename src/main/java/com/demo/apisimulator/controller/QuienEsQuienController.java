package com.demo.apisimulator.controller;

import com.demo.apisimulator.util.ApiResponseUtil;
import com.demo.apisimulator.util.LogUtil;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class QuienEsQuienController {

    @GetMapping("/token")
    public Map<String, Object> getToken(@RequestParam String client_id) {
        LogUtil.logRequest("/api/token", "client_id: " + client_id);
        return ApiResponseUtil.createResponse("quienesquien/token.json");
    }

    @PostMapping("/find")
    public Map<String, Object> find(@RequestParam Map<String, String> params) {
        LogUtil.logRequest("/api/find", "client_id: " + params.get("client_id") +
                ", username: " + params.get("username") +
                ", name: " + params.get("name") +
                ", rfc: " + params.get("rfc") +
                ", curp: " + params.get("curp") +
                ", type: " + params.get("type") +
                ", list: " + params.get("list") +
                ", percent: " + params.get("percent"));
        return ApiResponseUtil.createResponse("quienesquien/fisicas.json");
    }
}
