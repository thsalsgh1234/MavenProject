package com.biz.hello.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBConnection {

	
	private static SqlSessionFactory sqlSessionFactory;
	
	static {
		
		String configFile = "com/biz/hello/config/mybatis-config.xml";
		InputStream is = null;
		
		try {
			is = Resources.getResourceAsStream(configFile);
			SqlSessionFactoryBuilder sessionFactoryBuilder
			= new SqlSessionFactoryBuilder();
			
			
			sqlSessionFactory = sessionFactoryBuilder.build(is);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static SqlSessionFactory getSqlSessionFactory() {
		
		return sqlSessionFactory;
	}
	
	
}
