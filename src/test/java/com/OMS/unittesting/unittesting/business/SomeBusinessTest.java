package com.OMS.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessTest {

	@Test
	void calculateSum_basic() {
		SomeBusinessImpl impl = new SomeBusinessImpl();
		int expectedResult = 6;
		assertEquals(expectedResult, impl.calculateSum(new int[] {1,2,3}));
	}
	@Test
	void calculateSum_empty() {
		SomeBusinessImpl impl = new SomeBusinessImpl();
		impl.calculateSum(new int[] {});
		int expectedResult = 0;
		assertEquals(expectedResult, impl.calculateSum(new int[] {}));
	}

}
