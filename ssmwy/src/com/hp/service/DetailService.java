package com.hp.service;

import java.util.ArrayList;

import com.hp.entity.Detail;

public interface DetailService {
	//ȫ��
	ArrayList<Detail> selectAllde();
	//���
	int add(Detail detail);
	//ɾ��
	int delde(int bdId);


}
