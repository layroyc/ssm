package com.hp.dao;

import java.util.ArrayList;

import com.hp.entity.Detail;

public interface DetailDao {
	//ȫ��
	ArrayList<Detail> queryAllde();
	//���
	int insertde(Detail detail);
	//ɾ��
	int deletede(int bdId);
	


}
