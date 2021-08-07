package com.hp.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hp.entity.Business;
import com.hp.entity.Detail;
import com.hp.service.DetailService;

@Controller
@RequestMapping("/detail")
public class DetailController {
	@Autowired
	public DetailService detailService;
	@RequestMapping("/insert")
	//添加
	public String add(Detail detail){
		int i=detailService.add(detail);
		if(i>0){
			System.out.println("添加成功");
			return "redirect:/detail/queryAll";
		}else{
			System.out.println("添加失败");
			return "add";
		}
	}
	//全查
	@RequestMapping("/queryAll")
	public String queryAll(HttpSession session){
		ArrayList<Detail> detail=detailService.selectAllde();
		session.setAttribute("detail", detail);
		return "select";
	}
}
