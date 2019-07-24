package com.example.spring01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring01.model.dto.ProductDTO;

//
@RestController // ������ 4.0���� ��� ����
public class SampleRestController {
	
	@ResponseBody //json �������� ����
	@RequestMapping("test/doF")
	public ProductDTO doF() {
		//ȣ���� ������ �����Ͱ� �Ѿ(json ����)
		return new ProductDTO("�����", 500000);
	}
}
