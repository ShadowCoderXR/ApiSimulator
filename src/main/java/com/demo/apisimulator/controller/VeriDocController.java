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
}
