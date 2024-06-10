package com.demo.apisimulator.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class ApiResponseUtil {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static Map<String, Object> createResponse(String fileName) {
        try {
            InputStream inputStream = ApiResponseUtil.class.getResourceAsStream("/responses/" + fileName);
            if (inputStream == null) {
                throw new IllegalArgumentException("Archivo no encontrado: " + fileName);
            }

            return objectMapper.readValue(inputStream, HashMap.class);
        } catch (IOException e) {
            throw new RuntimeException("Error al leer el archivo JSON: " + e.getMessage());
        }
    }
}
