package test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testTest {
	test test_Test;	
	@Before
	public void testAdd() {
		System.out.println("@Before ����");
	}
	@After
	public void testSub() {
		System.out.println("@After ����");
	}
	@BeforeClass
	public static void testMul() {
		System.out.println("@BeforeClass ����");
	}
	@AfterClass
	public static void testDiv() {
		System.out.println("@AfterClass ����");
	}	
	@Test
	public void test1() {
		System.out.println("@Test1 ����");
	}	
	@Test
	public void test2() {
		System.out.println("@Test2 ����");
	}
}
