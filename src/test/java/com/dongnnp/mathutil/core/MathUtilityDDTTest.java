package com.dongnnp.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    //chuẩn bị b data để riêng, sau đó fill vào lệnh test
    //mang 2 chiều, mỗi dòng là 1 cặp data, gồm giá trị kì vọng | con n!

    public static Object[][] initTestData() {
        //trả về mảng 2 chiều
        //Object dataset = {,,,,}; //={các phần tử mảng cách nhau bằng dấu ,}
        //{5,10,15,20}
        Object[][] dataset = {
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120},
                {6, 720}
        };
         return dataset;
    }

    //@Test
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgRunsWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}