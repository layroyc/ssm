package com.hp.dao;

import java.util.ArrayList;

import com.hp.entity.Business;

public interface BusinessDao {
	//ȫ��
	ArrayList<Business> selectAll();
	//���
	int insert (Business business);
	//ɾ��
	int delete(int bid);

}
