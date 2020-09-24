package com.example.microservice_course_management.service;

import com.example.microservice_course_management.model.Course;
import com.example.microservice_course_management.model.Transaction;

import java.util.List;

public interface CourseService {
    List<Course> allCourses();

    List<Course> filterCoursesByIdList(List<Long> idList);

    List<Course> filterCourses(String content);

    List<Transaction> filterTransactionsOfUser(Long userId);

    List<Transaction> filterTransactionsOfCourse(Long courseId);

    void saveTransaction(Transaction transaction);

    Course findCourseById(Long courseId);
}
