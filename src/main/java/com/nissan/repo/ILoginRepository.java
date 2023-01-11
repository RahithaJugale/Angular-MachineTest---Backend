package com.nissan.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.Login;

@Repository
public interface ILoginRepository extends JpaRepositoryImplementation<Login, Integer> {

	
	public Login findOneByEmailIdIgnoreCaseAndPassword(String emailId, String password);
	
	@Query("select empId from UserRegistration where loginId = ?1")
	public Integer getEmpIdFromLoginId(Integer loginId);
}
