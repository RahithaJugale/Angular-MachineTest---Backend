package com.nissan.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.Visit;

@Repository
public interface IVisitRepository extends JpaRepositoryImplementation<Visit, Integer> {

}
