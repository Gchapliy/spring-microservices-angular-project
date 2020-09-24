package com.example.microservice_course_management.repository;

import com.example.microservice_course_management.model.Transaction;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class TransactionRepositoryImpl extends AbstractGenericDao<Transaction> implements TransactionRepository{
    @Override
    public List<Transaction> findAllTransactionsOfUser(final Long userId){
        String hql="Select t from Transaction t Where t.userId = :pUserId";
        Query query = em.createQuery(hql);
        query.setParameter("pUserId",userId);
        return query.getResultList();
    }

    @Override
    public List<Transaction> findAllTransactionsOfCourse(final Long courseId){
        String hql = "Select t from Transaction t Where t.course.id = :pCourseId";
        Query query = em.createQuery(hql);
        query.setParameter("pCourseId", courseId);
        return query.getResultList();
    }
}
