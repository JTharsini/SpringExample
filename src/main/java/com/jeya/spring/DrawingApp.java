package com.jeya.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		/*		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle triangle = (Triangle)factory.getBean("triangle");
		triangle.draw();
		
		deprecated: spring.xml file should be placed in root directory of project
		ApplicationContext is used to do the same job by BeanFactory and it provides
		some additional features also
		
		BeanFactory is suitable only when resources are so crucial
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		((ClassPathXmlApplicationContext) context).close();
	}
}