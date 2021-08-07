package com.hp.dao;

import java.util.ArrayList;

import com.hp.entity.Business;

public interface BusinessDao {
	//È«²é
	ArrayList<Business> selectAll();
	//Ìí¼Ó
	int insert (Business business);
	//É¾³ý
	int delete(int bid);

}
