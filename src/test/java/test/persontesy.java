package test;

import maven.StudentM;

import org.junit.Before;
import org.junit.Test;

public class persontesy {

	private StudentM studetn;
	@Before
	public void init() {
		studetn  = new StudentM();
	}
	@Test
	public void test(){
		studetn.name();
		
	}
	@Test
	public void test1(){
		studetn.name();
		
	}
}
