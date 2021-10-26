package com.joaogil.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaogil.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
