package com.demo.apisimulator.controller;

import com.demo.apisimulator.model.CatchEntity;
import com.demo.apisimulator.repository.CatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CatchController {

    @Autowired
    private CatchRepository catchRepository;

    //CREATE
    @PostMapping("/gov/curp")
    public ResponseEntity<CatchEntity> createCathEntity(@RequestBody CatchEntity catchEntity) {
        if (catchEntity.getDatosDocProbatorio() != null) {
            catchEntity.getDatosDocProbatorio().setCatchEntity(catchEntity);
        }
        CatchEntity savedCathEntity = catchRepository.save(catchEntity);
        return ResponseEntity.ok(savedCathEntity);
    }

    //SEARCH
    @PostMapping("/gov/curp/search")
    public ResponseEntity<CatchEntity> searchCatchEntity(@RequestBody CatchEntity catchEntityRequest) {
        String curp = catchEntityRequest.getCurp();
        CatchEntity catchEntity = catchRepository.findByCurp(curp);
        if (catchEntity != null) {
            return ResponseEntity.ok(catchEntity);
        } else {
            return ResponseEntity.notFound().build();
        }
    }



}
