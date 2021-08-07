package com.hp.controller;


import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hp.entity.Business;
import com.hp.entity.Detail;
import com.hp.service.BusinessService;

@Controller
@RequestMapping("/business")
public class BusinessController {
	@Autowired
	private BusinessService businesserSvice;
	//���
	@RequestMapping("/add")
	public String add(Business business){
		int i=businesserSvice.add(business);
		if(i>0){
			System.out.println("��ӳɹ�");
			return "redirect:/business/select";
		}else{
			System.out.println("���ʧ��");
			return "add";
		}
	}
	//ȫ��
	@RequestMapping("/select")
	public String select(HttpSession session){
		ArrayList<Business> list=businesserSvice.queryAll();
		session.setAttribute("list", list);
		return "select";
	}
	
	//ɾ��
		@RequestMapping("/del")
		public String del(Integer bId){
			int i = businesserSvice.del(bId);
			if(i>0){
				System.out.println("ɾ���ɹ�");
				return "redirect:/business/select";
			}else{
				System.out.println("ɾ��ʧ��");
				return "select";
			}
		}
	

}
