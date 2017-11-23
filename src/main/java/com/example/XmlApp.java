package com.example;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlApp {
	private static final Logger log = LoggerFactory.getLogger(XmlApp.class);
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		context.registerShutdownHook();
		log.debug("学习依赖注入...");
		log.info("Context = {}", context);
		DataSource dataSource = (DataSource) context.getBean("dataSource");
		System.out.println(dataSource);
		XmlBean xmlBean = (XmlBean) context.getBean("xmlBean");
		System.out.println(xmlBean);
		XmlBean2 xmlBean2 = (XmlBean2) context.getBean("xmlBean2");
		System.out.println(xmlBean2);
		Locale locale = context.getBean(Locale.class);
		System.out.println(locale);
		
		//-------------
		log.debug("实例1");
		ExampleOne eo = (ExampleOne)context.getBean("moreComplexObject");
		List someList = eo.getSomeList();
		System.out.println(someList);
		Properties adminEmails = eo.getAdminEmails();
		System.out.println(adminEmails);
		Map someMap = eo.getSomeMap();
		System.out.println(someMap);
		Set someSet = eo.getSomeSet();
		System.out.println(someSet);
		
		//----------------
		int count = context.getBeanDefinitionCount();
		System.out.println("total bean defined: " + count);
		String[] names = context.getBeanDefinitionNames();
		for (String name: names) {
			System.out.println(context.getBean(name));
		}

	}

}
