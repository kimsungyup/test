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
		System.out.println("@Before 角青");
	}
	@After
	public void testSub() {
		System.out.println("@After 角青");
	}
	@BeforeClass
	public static void testMul() {
		System.out.println("@BeforeClass 角青");
	}
	@AfterClass
	public static void testDiv() {
		System.out.println("@AfterClass 角青");
	}	
	@Test
	public void test1() {
		System.out.println("@Test1 角青");
	}	
	@Test
	public void test2() {
		System.out.println("@Test2 角青");
	}
}
