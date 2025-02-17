package com.ryujm.spring.ex.mvc.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SellerRepository {

	public int insertUser();
	
}
