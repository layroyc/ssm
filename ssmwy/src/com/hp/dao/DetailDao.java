package com.hp.dao;

import java.util.ArrayList;

import com.hp.entity.Detail;

public interface DetailDao {
	//È«²é
	ArrayList<Detail> queryAllde();
	//Ìí¼Ó
	int insertde(Detail detail);
	//É¾³ý
	int deletede(int bdId);
	


}
