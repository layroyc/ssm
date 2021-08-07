package com.hp.service;

import java.util.ArrayList;

import com.hp.entity.Detail;

public interface DetailService {
	//È«²é
	ArrayList<Detail> selectAllde();
	//Ìí¼Ó
	int add(Detail detail);
	//É¾³ý
	int delde(int bdId);


}
