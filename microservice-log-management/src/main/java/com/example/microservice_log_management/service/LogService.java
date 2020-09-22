package com.example.microservice_log_management.service;

import com.example.microservice_log_management.model.Log;
import com.example.microservice_log_management.model.Summary;

import java.util.List;

public interface LogService {
    Log saveOrUpdate(Log log);

    List<Summary> findPopularCourses();

    Summary findSummaryByCourseId(Long courseId);
}
