package com.example.spring01.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.spring01.model.dto.ProductDTO;

@Controller
public class MainController {
	private static final Logger logger= LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping("/")
	public String main(Model model) {
		// Modle : 데이터를 담는 그릇 역할, map 구조로 저장됨
		
		model.addAttribute("message","홈페이지 방문을 환영합니다.");
	
		return "main";
	}
	
	@RequestMapping(value="gugu.do", method=RequestMethod.GET)
	public String gugu(Model model) {
		int dan = 7;
		String result="";
		for(int i=1; i<9; i++) {
			result += dan+"x"+i+ "=" + dan * i + "<br>";
		}
		model.addAttribute("result", result);
		
		return "test/gugu";
	}
	
	@RequestMapping("test")
	public String test() {
		return "test";
	}
	
	@RequestMapping("test/doA")
	public String doA(Model model) {
		logger.info("doA called...");
		model.addAttribute("message", "홈페이지 방문을 환영합니다.");
		return "test/doB";
	}
	
	@RequestMapping("test/doB")
	public void doB(Model model) {
		logger.info("doB called...");
	}
	
	// 모델앤드뷰
	@RequestMapping("test/doC")
	public ModelAndView doC() {
		Map<String, Object> map = new HashMap<String, Object>();
		// 맵에 객체 저장
		map.put("product", new ProductDTO("샤프", 1000));
		// new ModelAndView("view의 이름", "맵 변수명", 맵);
		return new ModelAndView("test/doC","map", map);
	}
	
	//리다이렉트 페이지를 이동
	@RequestMapping("test/doD")
	public String doD() {
		return "redirect:/test/doE";
	}
	
	@RequestMapping("test/doE")
	public void doE() {
		System.out.println("test doE");
	}
	 
	
	
}
