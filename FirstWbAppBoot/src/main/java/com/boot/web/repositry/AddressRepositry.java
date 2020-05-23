package com.boot.web.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.web.entity.Address;
@Repository
public interface AddressRepositry extends JpaRepository<Address, Integer>{
	@Override
	 <S extends Address> S save(S entity);

}
