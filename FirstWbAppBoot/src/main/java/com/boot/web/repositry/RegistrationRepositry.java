package com.boot.web.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.web.entity.RegistrationEntity;
@Repository
public interface RegistrationRepositry extends JpaRepository<RegistrationEntity, Integer>{
	@Override
	 <S extends RegistrationEntity> S save(S entity);

}
