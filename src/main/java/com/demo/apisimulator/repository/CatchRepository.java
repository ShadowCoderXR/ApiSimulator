package com.demo.apisimulator.repository;

import com.demo.apisimulator.model.CatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatchRepository extends JpaRepository<CatchEntity,Long> {
    CatchEntity findByCurp(String curp);
}