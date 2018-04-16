package com.jeya.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jeya.aop.service.ShapeService;
import com.jeya.aop.service.ShapeService2;
import com.jeya.aop.service.ShapeService3;
import com.jeya.aop.service.ShapeService4;
import com.jeya.aop.service.ShapeService5;

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
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("xmlforAspectToBeExecutedInAllMethodsOfAClass.xml");
		context.registerShutdownHook();
		//getByIdDependencyInjection(context);
		//getByIdConstructorInjection(context);
		//getByAlias(context);
		//getByName(context);
		//injectingObjects(context);
		//collectionsAsAttributes(context);
		//autoWireByName(context);
		//autoWireByType(context);
		//autoWireByConstructor(context);
		//applicationContextAware(context);
		//beanNameAware(context);
		//beanDefinitionInheritancea(context);
		//callBackMethods(context);
		//placeHolderFromPropertiesFile(context);
		//codingToInterfaces(context);
		//requiredAnnotation(context);
		//autoWiring(context);
		//annotationsJSR250(context);
		//componentAnnotation(context); // use xmlforcomponentannotation.xml for this
		//usageOfResourceBundleMessageSource(context); // use xmlformessagesource.xml for this
		//eventHandling(context);
		aspectOrientedProgrammingOrAOP(context);
		((ClassPathXmlApplicationContext) context).close(); // suitable only for desktop application
	}
	
	private static void aspectOrientedProgrammingForAClass(AbstractApplicationContext context) {
		ShapeService2 shapeService2 = context.getBean("shapeService2", ShapeService2.class);
		System.out.println(shapeService2.getCircle2().getName());
		System.out.println(shapeService2.getTriangle().getName());
	}

	private static void aspectOrientedProgrammingOrAOP(AbstractApplicationContext context) {
		//aopForMethodAvailableInAllClass(context);  // use xmlforAop.xml for this
		//aspectOrientedProgrammingForAClass(context); // use xmlforAopForAClass.xml for this
		//aspectOrientedProgrammingForAllGetters(context); // use xmlforAopForAllGetters.xml for this
		//multipleAspectsForAMethod(context); // use xmlforMultipleAspectsForAMethod.xml for this
		aspectToBeExecutedInAllMethodsOfAClass(context); // use xmlforAspectToBeExecutedInAllMethodsOfAClass.xml for this
	}

	private static void aspectToBeExecutedInAllMethodsOfAClass(AbstractApplicationContext context) {
		ShapeService5 shapeService5 = context.getBean("shapeService5", ShapeService5.class);
		System.out.println(shapeService5.getCircle5().getName());
		System.out.println(shapeService5.getCircle5().getRadius());
		System.out.println(shapeService5.getCircle5().grrRadius());
	}

	private static void multipleAspectsForAMethod(AbstractApplicationContext context) {
		ShapeService4 shapeService4 = context.getBean("shapeService4", ShapeService4.class);
		System.out.println(shapeService4.getCircle4().getName());
		System.out.println(shapeService4.getTriangle3().getName());
	}

	private static void aspectOrientedProgrammingForAllGetters(AbstractApplicationContext context) {
		ShapeService3 shapeService3 = context.getBean("shapeService3", ShapeService3.class);
		System.out.println(shapeService3.getCircle3().getName());
		System.out.println(shapeService3.getTriangle2().getName());
		// advice will be printed 4 times: because before the execution of getCircle3 and getTriangle2 methods also
		// aspect will be executed
	}

	private static void aopForMethodAvailableInAllClass(AbstractApplicationContext context) {
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class); // no need to caste
		System.out.println(shapeService.getCircle().getName());
		System.out.println(shapeService.getTriangle().getName());
	}

	private static void eventHandling(AbstractApplicationContext context) {
		eventByApplication(context);
		customEvent(context); //use xmlforeventhandling.xml for this
	}

	private static void customEvent(AbstractApplicationContext context) {
		Shape shape = (Shape) context.getBean("circle9");
		shape.draw();
	}

	private static void eventByApplication(AbstractApplicationContext context) {
		//MyEventListener class has been added to demonstrate this
	}

	private static void usageOfResourceBundleMessageSource(AbstractApplicationContext context) {
		messageByApplicationContext(context);
		messageByResourceBundleMessageSource(context); // with parameter substitution
	}

	private static void messageByResourceBundleMessageSource(AbstractApplicationContext context) {
		Shape shape = (Shape) context.getBean("circle8");
		shape.draw();
	}

	private static void messageByApplicationContext(AbstractApplicationContext context) {
		String message = context.getMessage("greeting", null, "Default Message if it doesn't exist", null);
		System.out.println(message);
	}

	private static void componentAnnotation(AbstractApplicationContext context) {
		Shape shape = (Shape) context.getBean("circle7");
	}

	private static void annotationsJSR250(AbstractApplicationContext context) {
		//resourceAnnotation(context); // use xmlforresourceannotation.xml for this
		lifeCycleMethodsAnnotation(context); // use xmlforlifecycleannotation.xml for this
	}

	private static void lifeCycleMethodsAnnotation(AbstractApplicationContext context) {
		Shape shape = (Shape) context.getBean("circle6");
		shape.draw();
	}

	private static void resourceAnnotation(AbstractApplicationContext context) {
		Shape shape = (Shape) context.getBean("circle5");
		shape.draw();
	}

	private static void autoWiring(AbstractApplicationContext context) {
		//autoWiringOnlyOneInThatType(context);// use xmlforautowiringonlyoneintype.xml for this
		//autoWiringMultipleInThatTypeButNameSame(context); // use xmlforautowiringmultipleintype.xml for this
		//autoWiringMultipleInThatType(context); // use xmlforautowiringmultipleintypebyqualifier.xml for this
	}

	private static void autoWiringMultipleInThatType(AbstractApplicationContext context) {
		Shape shape = (Shape) context.getBean("circle4");
		shape.draw();
	}

	private static void autoWiringMultipleInThatTypeButNameSame(AbstractApplicationContext context) {
		Shape shape = (Shape) context.getBean("circle3");
		shape.draw();
	}

	private static void autoWiringOnlyOneInThatType(AbstractApplicationContext context) {
		Shape shape = (Shape) context.getBean("circle3");
		shape.draw();
	}

	private static void requiredAnnotation(AbstractApplicationContext context) {
		// use requiredannotation.xml for this
		/**
		 * Exception in thread "main" org.springframework.beans.factory.BeanCreationException: Error creating bean with name 
		 * 'circle2' defined in class path resource [spring2.xml]: Initialization of bean failed; nested exception is org.springframework.beans.factory.BeanInitializationException: 
		 * Property 'center' is required for bean 'circle2'
		 */
		Shape shape = (Shape) context.getBean("circle2");
		shape.draw();
	}

	private static void codingToInterfaces(AbstractApplicationContext context) {
		Shape shape1 = (Shape) context.getBean("triangleWithPoints15");
		shape1.draw();
		
		Shape shape2 = (Shape) context.getBean("circle");
		shape2.draw();
	}

	private static void placeHolderFromPropertiesFile(ApplicationContext context) {
		TriangleWithPoints3 triangleWithPoints3 = (TriangleWithPoints3) context.getBean("triangleWithPoints3");
		triangleWithPoints3.draw();
	}

	private static void beanDefinitionInheritancea(AbstractApplicationContext context) {
		//beanDefinitionInheritance(context);
		//beanDefinitionInheritanceWithCollectionOverride(context);
		//beanDefinitionInheritanceWithCollectionMerge(context);
		//beanDefinitionInheritanceParentClassAbstract(context);
	}

	private static void callBackMethods(AbstractApplicationContext context) {
		System.out.println("***************************************************************************************");
		//thingsToDoWhenInitializingBean(context);
		//thingsToDoWhenDisposingBean(context);
		//thingsToDoWhenInitializingBeanByXml(context);
		//thingsToDoWhenDestroyingBeanByXml(context);
	}

	private static void thingsToDoWhenDestroyingBeanByXml(AbstractApplicationContext context) {
		TriangleWithPoints14 triangleWithPoints14 = (TriangleWithPoints14) context.getBean("triangleWithPoints14");
		triangleWithPoints14.draw();
	}

	private static void thingsToDoWhenInitializingBeanByXml(AbstractApplicationContext context) {
		TriangleWithPoints13 triangleWithPoints13 = (TriangleWithPoints13) context.getBean("triangleWithPoints13");
		triangleWithPoints13.draw();
	}

	private static void thingsToDoWhenDisposingBean(AbstractApplicationContext context) {
		TriangleWithPoints12 triangleWithPoints12 = (TriangleWithPoints12) context.getBean("triangleWithPoints12");
		triangleWithPoints12.draw();
	}

	private static void thingsToDoWhenInitializingBean(AbstractApplicationContext context) {
		TriangleWithPoints11 triangleWithPoints11 = (TriangleWithPoints11) context.getBean("triangleWithPoints11");
		triangleWithPoints11.draw();
	}

	private static void beanDefinitionInheritanceParentClassAbstract(ApplicationContext context) {
		System.out.println("***************************************************************************************");
		//TriangleWithPoints10 triangleWithPoints10 = (TriangleWithPoints10) context.getBean("triangleWithPoints10");
		//Exception in thread "main" org.springframework.beans.factory.BeanIsAbstractException: Error creating bean with name 'triangleWithPoints10': Bean definition is abstract
	}

	private static void beanDefinitionInheritanceWithCollectionMerge(ApplicationContext context) {
		System.out.println("***************************************************************************************");
		TriangleWithPoints9 triangleWithPoints9 = (TriangleWithPoints9) context.getBean("triangleInherited9");
		triangleWithPoints9.draw();
		// child list elements are merged with parent definition list
	}

	private static void beanDefinitionInheritanceWithCollectionOverride(ApplicationContext context) {
		System.out.println("***************************************************************************************");
		TriangleWithPoints8 triangleWithPoints8 = (TriangleWithPoints8) context.getBean("triangleInherited8");
		triangleWithPoints8.draw();
		// override list elements by child definition
	}

	private static void beanDefinitionInheritance(ApplicationContext context) {
		System.out.println("***************************************************************************************");
		
		TriangleWithPoints7 triangleWithPoints71 = (TriangleWithPoints7) context.getBean("triangleInherited1");
		triangleWithPoints71.draw();
		
		System.out.println("***************************************************************************************");
		
		TriangleWithPoints7 triangleWithPoints72 = (TriangleWithPoints7) context.getBean("triangleInherited2");
		triangleWithPoints72.draw();
	}

	private static void beanNameAware(ApplicationContext context) {
		TriangleWithPoints6 triangleWithPoints6 = (TriangleWithPoints6) context.getBean("triangleWithPoints6");
	}

	private static void applicationContextAware(ApplicationContext context) {
		TriangleWithPoints5 triangleWithPoints5 = (TriangleWithPoints5) context.getBean("triangleWithPoints5");
		triangleWithPoints5.initializePoints();
		triangleWithPoints5.draw();
	}

	private static void autoWireByConstructor(ApplicationContext context) {
		TriangleWithPoints4 triangleWithPoints4 = (TriangleWithPoints4) context.getBean("triangleWithPoints4");
		triangleWithPoints4.draw();
	}

	private static void autoWireByType(ApplicationContext context) {
		User user = (User) context.getBean("user");
		user.print();
	}

	private static void autoWireByName(ApplicationContext context) {
		TriangleWithPoints3 triangleWithPoints3 = (TriangleWithPoints3) context.getBean("triangleWithPoints3");
		triangleWithPoints3.draw();
	}

	private static void collectionsAsAttributes(ApplicationContext context) {
		TriangleWithPoints2 triangleWithPoints2 = (TriangleWithPoints2) context.getBean("triangleWithPoints2");
		triangleWithPoints2.draw();
	}

	private static void injectingObjects(ApplicationContext context) {
		TriangleWithPoints triangleWithPoints = (TriangleWithPoints) context.getBean("triangleWithPoints");
		triangleWithPoints.draw();
	}

	private static void getByName(ApplicationContext context) {
		Triangle8 triangle8 = (Triangle8) context.getBean("triangle-name");
		triangle8.draw();
	}

	private static void getByAlias(ApplicationContext context) {
		Triangle7 triangle7 = (Triangle7) context.getBean("triangle-alias");
		triangle7.draw();
	}

	// Set Attribute By Setter
	private static void getByIdDependencyInjection(ApplicationContext context) {
		Triangle triangle = (Triangle) context.getBean("triangle"); // get by id
		triangle.draw();
	}

	private static void getByIdConstructorInjection(ApplicationContext context) {
		constructorInjectionWithSingleArgumentConstructor(context);
		constructorInjectionWithTwoConstructorsWithDifferentNumberOfArguments(context);
		constructorInjectionWithTwoConstructorsWithSameNumberOfArgumentsSetPrimitiveValue(context);
		constructorInjectionWithTwoConstructorsWithSameNumberOfArgumentsSetObjectValue(context);
		constructorInjectionUsingIndex(context);
	}

	private static void constructorInjectionUsingIndex(ApplicationContext context) {
		Triangle6 triangle6 = (Triangle6) context.getBean("triangle6");
		triangle6.draw();
	}

	private static void constructorInjectionWithTwoConstructorsWithSameNumberOfArgumentsSetObjectValue(
			ApplicationContext context) {
		Triangle5 triangle5 = (Triangle5) context.getBean("triangle5");
		triangle5.draw();
	}

	private static void constructorInjectionWithTwoConstructorsWithSameNumberOfArgumentsSetPrimitiveValue(
			ApplicationContext context) {
		Triangle4 triangle4 = (Triangle4) context.getBean("triangle4");
		triangle4.draw();
	}

	private static void constructorInjectionWithTwoConstructorsWithDifferentNumberOfArguments(
			ApplicationContext context) {
		Triangle3 triangle3 = (Triangle3) context.getBean("triangle3");
		triangle3.draw();
	}

	private static void constructorInjectionWithSingleArgumentConstructor(ApplicationContext context) {
		Triangle2 triangle2 = (Triangle2) context.getBean("triangle2");
		triangle2.draw();
	}
}