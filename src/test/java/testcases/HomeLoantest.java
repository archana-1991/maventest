package testcases;

import org.testng.annotations.Test;

public class HomeLoantest extends BaseClass {
	
	@Test(dependsOnMethods="test2")	
	public void test1(){
		
		System.out.println("Inside Home loan test 1");
	}

@Test
public void test2() {
	
	System.out.println("Inside Home loan test 2");
	
}
}