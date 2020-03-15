package testProject;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TranspotationWalk transpotationWalk = new TranspotationWalk();
		// transpotationWalk.move();
		//testing
		// showing only for HJ
		// applicationContext(컨테이너)에 접근
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		// Bean의 id, dataType
		TranspotationWalk transpotationWalk = ctx.getBean("tWalk", TranspotationWalk.class);
		transpotationWalk.move();
		
		ctx.close();
		// hello~ abcde
	}

}


