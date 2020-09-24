package com.example.microservice_course_management.repository;

import com.example.microservice_course_management.model.Course;

import java.util.List;

public interface CourseRepository extends IGenericDao<Course>{
    List<Course> filterCourses(String text);

    List<Course> filterCoursesByIdList(List<Long> idList);
}
