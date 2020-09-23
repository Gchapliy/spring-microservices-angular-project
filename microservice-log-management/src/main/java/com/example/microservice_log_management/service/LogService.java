package com.example.microservice_log_management.service;

import com.example.microservice_log_management.model.Log;
import com.example.microservice_log_management.model.Summary;

import java.util.List;

public interface LogService {
    Summary findSummaryByCourseId(Long courseId);

    Log saveOrUpdate(Log log);

    Summary saveOrUpdate(Summary summary);

    List<Summary> findPopularCourses();
}
