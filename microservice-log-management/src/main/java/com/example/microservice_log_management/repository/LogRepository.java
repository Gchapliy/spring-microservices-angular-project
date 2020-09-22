package com.example.microservice_log_management.repository;

import com.example.microservice_log_management.model.Log;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface LogRepository extends CrudRepository<Log, UUID> {
}
