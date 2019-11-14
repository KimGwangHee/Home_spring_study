package com.example.spring01.controller;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

// junit4�� �׽�Ʈ
@RunWith(SpringJUnit4ClassRunner.class)
//���� ������ ��� ����
@WebAppConfiguration
@ContextConfiguration(
		locations= {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})

public class MainControllerTest {
	//�α� ó���� ���� ��ü ����
	private static final Logger logger =
			LoggerFactory.getLogger(MainControllerTest.class);
	
	@Inject // �������� ����
	WebApplicationContext wac;
	MockMvc mockMvc; //�������� ��Ʈ�ѷ��� �׽�Ʈ�ϱ� ���� ��ü
	
	@Before // �׽�Ʈ���� ȣ��Ǵ� �ڵ�
	public void setup() throws Exception{
		mockMvc= MockMvcBuilders.webAppContextSetup(this.wac).build();
		System.out.println("setup...");
	}
	
	@Test
	public void testDoA() throws Exception {
		// �䰡 �ϼ����� �ʴ� ���¿����� �׽�Ʈ�� ������
		mockMvc.perform(MockMvcRequestBuilders.get("/test/doA"));
		logger.info("doA...");
		
	}

}