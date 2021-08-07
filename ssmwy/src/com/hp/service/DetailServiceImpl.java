package com.hp.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.dao.DetailDao;
import com.hp.entity.Detail;
@Service
public class DetailServiceImpl implements DetailService{
	@Autowired
	public DetailDao detailDao;

	@Override
	public ArrayList<Detail> selectAllde() {
		// TODO Auto-generated method stub
		ArrayList<Detail> list = detailDao.queryAllde();
		return list;
	}

	@Override
	public int add(Detail detail) {
		// TODO Auto-generated method stub
		int i = detailDao.insertde(detail);
		
		return i;
	}

	@Override
	public int delde(int bdId) {
		// TODO Auto-generated method stub
		int i = detailDao.deletede(bdId);
		return i;
	}

	
	

}
