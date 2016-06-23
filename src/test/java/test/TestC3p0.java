package test;

import java.sql.SQLException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class TestC3p0 {
	
	@Test
	public void testC3p0 () throws SQLException{
		ApplicationContext context = new ClassPathXmlApplicationContext ("applicationContext.xml");
		ComboPooledDataSource dataSource = (ComboPooledDataSource) context.getBean("dataSource");
		dataSource.getConnection();
	}
}
