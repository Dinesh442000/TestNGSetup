package test;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount = 10)
	public void sum() {
		int n1 = 10;
		int n2 = 20;
		int n3 = n1+n2;
		System.out.println(n3);
	}
}
