package com.hp.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.dao.BusinessDao;
import com.hp.entity.Business;
import com.hp.entity.Detail;

@Service
public class BusinessServiceImpl implements BusinessService{
	@Autowired
	public BusinessDao businessDao;

	@Override
	public ArrayList<Business> queryAll() {
		// TODO Auto-generated method stub
		ArrayList<Business> list=businessDao.selectAll();
		return list;
	}

	@Override
	public int add(Business business) {
		// TODO Auto-generated method stub
		int i=businessDao.insert(business);
		return i;
		}

	@Override
	public int del(int bid) {
		// TODO Auto-generated method stub
		int i = businessDao.delete(bid);
		return i;
	}
	}


