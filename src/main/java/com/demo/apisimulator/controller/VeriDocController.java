package com.demo.apisimulator.controller;

import com.demo.apisimulator.util.ApiResponseUtil;
import com.demo.apisimulator.util.LogUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class VeriDocController {
    @PostMapping("/gov/curp")
    public Map<String, Object> validateCurp(@RequestBody String request) {
        LogUtil.logRequest("/api/gov/curp", request);
        return ApiResponseUtil.createResponse("curp.json");
    }

    @PostMapping("/gov/ine")
    public Map<String, Object> validateIne(@RequestBody String request) {
        LogUtil.logRequest("/api/gov/ine", request);
        return ApiResponseUtil.createResponse("ine.json");
    }

    @PostMapping("/gov/rfc")
    public Map<String, Object> validateRFC(@RequestBody String request) {
        LogUtil.logRequest("/api/gov/rfc", request);
        return ApiResponseUtil.createResponse("rfc.json");
    }

    @PostMapping("/auth/token")
    public Map<String, Object> validateLogin(@RequestBody String request) {
        LogUtil.logRequest("/api/auth/token", request);
        return ApiResponseUtil.createResponse("auth.json");
    }

}
