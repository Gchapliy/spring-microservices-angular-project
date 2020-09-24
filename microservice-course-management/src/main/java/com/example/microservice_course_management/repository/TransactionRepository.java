package com.example.microservice_course_management.repository;

import com.example.microservice_course_management.model.Transaction;

import java.util.List;

public interface TransactionRepository extends IGenericDao<Transaction> {
    List<Transaction> findAllTransactionsOfUser(Long userId);

    List<Transaction> findAllTransactionsOfCourse(Long courseId);
}
