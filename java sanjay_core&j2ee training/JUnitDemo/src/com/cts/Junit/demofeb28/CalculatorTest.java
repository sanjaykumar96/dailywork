package com.cts.Junit.demofeb28;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	private static Calculator calculator;
	@BeforeClass
	public static void init() {
		calculator = new Calculator();
		System.out.println("objecft created");
	}

	@AfterClass
	public static void destroy() {
		calculator = null;
		System.out.println("object destroyed");
	}

	@Test
	public void test_add_success() {
		assertEquals(17, calculator.add(12, 5));
		System.out.println("inside add test test");
	}

	@Test
	public void test_sub_success() {
		assertEquals(7, calculator.sub(5, 12));
		System.out.println("inside sub test test");
	}

	@Test
	public void test_mul_success() {
		assertEquals(30, calculator.mul(5, 6));
		System.out.println("inside mul test test");

	}

	@Test
	public void test_div_success() {
		assertEquals(3, calculator.div(15, 5));
		System.out.println("inside div test test");
	}
	@Test
	public void test_isPrime_success() {
		assertEquals(true, calculator.isPrime(5));
		System.out.println("inside prime test test");
	}
	@Test
	public void test_is_Prime_success() {
		assertEquals(true, calculator.isPrime(4));
		System.out.println("inside prime1 test test");
	}

//	@Before
//	public void init() {
//		calculator = new Calculator();
//		System.out.println("objecft created");
//	}
//
//	@After
//	public void destroy() {
//		calculator = null;
//		System.out.println("object destroyed");
//	}
//
//	@Test
//	public void test_add_success() {
//		assertEquals(17, calculator.add(12, 5));
//		System.out.println("inside add test test");
//	}
//
//	@Test
//	public void test_sub_success() {
//		assertEquals(7, calculator.sub(5, 12));
//		System.out.println("inside sub test test");
//	}
//
//	@Test
//	public void test_mul_success() {
//		assertEquals(30, calculator.mul(5, 6));
//		System.out.println("inside mul test test");
//
//	}
//
//	@Test
//	public void test_div_success() {
//		assertEquals(3, calculator.div(15, 5));
//		System.out.println("inside div test test");
//	}
}
