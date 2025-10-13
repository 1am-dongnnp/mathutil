package com.dongnnp.mathutil.core;

public class MathUtility {
    //class này chưa các hàm tiện ích dùng cho mọi nơi
    //hàm tiện ích dùng cho mọi nơi nghĩa là nó không lưu lại kết quả xử lí
    //của nó bên trong, vậy nó sẽ được thiết kế là static method!!!!


    //hàm tính n!, n > 0
    //quy ước 0! = 1
    //20! vừa đủ kiểu long, 18 số 0; 21! long chứa không nổi
    // không có âm giai thừa
    //bài này giai thừa chỉ tính từ 0....20, ngoài vùng này gọi là không hợp lệ n!!!
    //0....20 -> valid boundary validated boundary - vùng giá trị hợp ệ
    //0, 20 -> boundary value - biên giới của tập giá trị
    //         xích qua 1 xíu là sang vùng invalid boundary
    //0, xích nhẹ sang trái 1 đơn vị, không ổn, không tính được
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            //ném ngoại lệ, vừa dừng hàm ngay, không có value nào được trả về
            throw new IllegalArgumentException("n must be between 0 and 20");
        }

        //biến trung gian để tính phép nhân
        long result = 1;
        for (int i = 1; i <= n ; i++) {
            result *= i;
        }
        return result;
    }
}
