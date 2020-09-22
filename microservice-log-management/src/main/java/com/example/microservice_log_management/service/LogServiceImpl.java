package com.example.microservice_log_management.service;

import com.example.microservice_log_management.model.Log;
import com.example.microservice_log_management.model.Summary;
import com.example.microservice_log_management.repository.LogRepository;
import com.example.microservice_log_management.repository.SummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Transactional
@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogRepository logRepository;

    @Autowired
    private SummaryRepository summaryRepository;

    @Override
    public Log saveOrUpdate(Log log) {
        Summary existSummary =
                summaryRepository.findByCourseId(log.getCourseId()).orElse(null);

        if (existSummary != null) {
            summaryRepository.delete(existSummary);
            existSummary.setHitCount(existSummary.getHitCount() + 1);
            summaryRepository.save(existSummary);
        } else {
            Summary summary = new Summary();
            summary.setCourseId(log.getCourseId());
            summary.setHitCount(1L);
            summaryRepository.save(summary);
        }
        log.setId(UUID.randomUUID());
        logRepository.save(log);
        return log;
    }

    @Override
    public List<Summary> findPopularCourses() {
        return summaryRepository.findPopularCourses();
    }

    @Override
    public Summary findSummaryByCourseId(Long courseId) {
        return summaryRepository.findByCourseId(courseId).orElse(null);
    }
}
