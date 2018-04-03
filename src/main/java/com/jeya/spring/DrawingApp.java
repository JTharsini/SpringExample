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

		Triangle2 triangle2 = (Triangle2) context.getBean("triangle2");
		triangle2.draw();

		Triangle3 triangle3 = (Triangle3) context.getBean("triangle3");
		triangle3.draw();
		
		Triangle4 triangle4 = (Triangle4) context.getBean("triangle4");
		triangle4.draw();
		
		Triangle5 triangle5 = (Triangle5) context.getBean("triangle5");
		triangle5.draw();
		
		Triangle6 triangle6 = (Triangle6) context.getBean("triangle6");
		triangle6.draw();
		
		TriangleWithPoints triangleWithPoints = (TriangleWithPoints)context.getBean("triangleWithPoints");
		triangleWithPoints.draw();

		((ClassPathXmlApplicationContext) context).close();
	}
}