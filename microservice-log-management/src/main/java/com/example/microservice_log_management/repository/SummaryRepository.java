package com.example.microservice_log_management.repository;

import com.example.microservice_log_management.model.Summary;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface SummaryRepository extends CrudRepository<Summary, Long> {

    Optional<Summary> findByCourseId(Long courseId);

    @Query("update summary set hit_count = hit_count + 1 where course_id=?0")
    void incrementHitCount(Long courseId);

    @Query("Select * from summary limit 100")
    List<Summary> findPopularCourses();
}
