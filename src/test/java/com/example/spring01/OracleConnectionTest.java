package com.example.spring01;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OracleConnectionTest {
	private static final Logger logger=
			LoggerFactory.getLogger(OracleConnectionTest.class);
	private static final String DRIVER =
			"oracle.jdbc.driver.OracleDriver";
	private static final String URL =
			"jdbc:oracle:thin:@localhost:1521/orcl";
	private static final String USER="srping";
	private static final String PW="1234";
	
	@Test
	// ���� �޼��带 �ȸ��� �ȴ�.
	public void testConnection() throws Exception{
		Class.forName(DRIVER);
		// try ~ with
		try(Connection conn=
				DriverManager.getConnection(URL, USER, PW)){
			System.out.println("����Ŭ�� ����Ǿ����ϴ�.");
			logger.info("����Ŭ�� ����Ǿ����ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
