package com.hp.service;

import java.util.ArrayList;

import com.hp.entity.Business;
import com.hp.entity.Detail;

public interface BusinessService {
	//È«²é
	ArrayList<Business> queryAll();
	//Ìí¼Ó
	int add (Business business);
	//É¾³ý
	int del(int bid);
}
