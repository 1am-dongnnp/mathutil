package com.dongnnp.mathutil.core.test;

import com.dongnnp.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;

//import static com.dongnnp.mathutil.core.MathUtility.getFactorial;
import static com.dongnnp.mathutil.core.MathUtility.*;

//import static chỉ dành cho những hàm static, để giúp ta làm biếng gõ
//tên class. lẽ ra phải là MatUtility.getFactorial(2);
//thì nay chỉ cần gõ getFactorial(2); là đủ
//giả sử class có nhiều hàm static thì ta đổi qua dấu *
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test
    public void testFactorialGivenValidArgumen3tReturnsWell() {
        assertEquals(6, getFactorial(3));
    }
    @Test
    public void testFactorialGivenValidArgumen4tReturnsWell() {
        assertEquals(24, getFactorial(4));
    }
    @Test
    public void testFactorialGivenValidArgumen5tReturnsWell() {
        assertEquals(120, getFactorial(5));
    }

    @Test  //@Test là ghi chú - annotation báo hiệu rằng hàm này là hàm main() có thể run
    //1 class test có thể có nhiều @Test, vậy một class Test có thể có nhiều hàm main() - để
    //ứng với nhiều kịch bản test, nhiều test case khác nhau đều được run!!!
        //TEST CASE #1: CHECK/VERIFY getFactorial() method with valid parameter
        //e.g.n = 0
        //STEPS/PROCEDURE=-==--=:
        //1. Given a valid n, e.g. n = 0
        //2. Call/invoke getFactorial(n = 0) method
        //3. Execute the method
        //EXPECTED RESULT:
        //  The method will return 1 as the result of 0!
        //PASSED/FAILED:
    public void testFactorialGivenValidArgumentReturnsWell() {
        //Given
        int n = 0;
        long expectedValue = 1; //hope to see 0! = 1, kì vọng
        //When
        long actualValue = getFactorial(n);
        //test, so sánh giữa expected value và actual value
        //dùng biến boolean hoặc in ra
        //Then
        assertEquals(expectedValue, actualValue);
        //So sánh xem 0! có trả về con số 1 hay không

        assertEquals(1, getFactorial(0));
        //Hàm assertEquals() sẽ so sánh 2 giá trị, nếu giống nhau
        //thì hàm sẽ trả về màu xanh lá cây - test case đã qua
        //nếu khác nhau, hàm sẽ trả về màu đỏ - test case đã thất bại

    }

}