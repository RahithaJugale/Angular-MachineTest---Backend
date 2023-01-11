package com.nissan.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.UserRegistration;

@Repository
public interface IUserRegistrationRepository extends JpaRepositoryImplementation<UserRegistration, Integer>{

	@Query("select empId from UserRegistration where loginId = ?1")
	public Integer getEmpIdFromLoginId(Integer loginId);
}
