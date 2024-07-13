package com.sp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sp.entity.MatutalFund;

@Repository
public interface MataulFundRepository extends  JpaRepository<MatutalFund, Integer>{
	
	public MatutalFund findByown(String own_by);
	
	List<MatutalFund> findByNumGreaterThan(int num);

}
