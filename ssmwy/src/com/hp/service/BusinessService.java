package com.hp.service;

import java.util.ArrayList;

import com.hp.entity.Business;
import com.hp.entity.Detail;

public interface BusinessService {
	//ȫ��
	ArrayList<Business> queryAll();
	//���
	int add (Business business);
	//ɾ��
	int del(int bid);
}
