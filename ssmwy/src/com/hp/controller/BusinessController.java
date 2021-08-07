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
	//添加
	@RequestMapping("/add")
	public String add(Business business){
		int i=businesserSvice.add(business);
		if(i>0){
			System.out.println("添加成功");
			return "redirect:/business/select";
		}else{
			System.out.println("添加失败");
			return "add";
		}
	}
	//全查
	@RequestMapping("/select")
	public String select(HttpSession session){
		ArrayList<Business> list=businesserSvice.queryAll();
		session.setAttribute("list", list);
		return "select";
	}
	
	//删除
		@RequestMapping("/del")
		public String del(Integer bId){
			int i = businesserSvice.del(bId);
			if(i>0){
				System.out.println("删除成功");
				return "redirect:/business/select";
			}else{
				System.out.println("删除失败");
				return "select";
			}
		}
	

}
