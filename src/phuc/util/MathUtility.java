/*
 *  To change this license header, choose License Headers in Project Properties.
 *  To change this template file, choose Tools | Templates
 *  and open the template in the editor.
 */
package phuc.util;

/**
 *
 * @author 𝙋𝙝𝙪𝙘
 */
public class MathUtility {
    //fake Math class
    //Math.sqrt() .abs() .pow() .sin() .PI()

    public static final double PI = 3.1415;

    //tinh n!
    //21! tràn long, âm giai thừa ko tính đc
    //0! = 1! = 1;
    //trong bài này chỉ tính giai thừa trong khoảng 0~20
    //nếu n < 0 hay h n > 20 -> chửi, ko tính, ko return
    public static long getFactorial(int n) {
        if (n < 0 || n > 20){            
           throw new IllegalArgumentException("n must be between 0 ... 20");
        }
        if(n == 0 || n ==1)
            return 1;
        //CPU chạy đến đây thì n = 2....20 -> ko dùng else
        
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *=i;
        }
        return result;
    }

    //có nhiều cách để test
    //kiểu gì khi test cũng phải là: tính trước kq hàm cần trả về EXPECTED VALUE
    //                              mình gọi hàm xem nó trả ra mấy, ACTUAL VALUE
    //so sánh EXPECTED VALUE == ACTUAL VALUE hay không
    //                      bằng - hàm chạy đúng tình huống x
    //                      không bằng  - hàm chạy sai cho tình huống x
    //vd:
    // 5! phải là 120 (expected)
    // khi gọi hàm getFactorial (5 đưa vào), xem kq bằng mấy (actual)
    //actual là 120 -> hàm đúng cho 2! vì khớp với expected
    //case - tình huống     n = 5: hàm đúng
    //                      n = 6 hàm trả về 720 -> hàm đúng
    //                      n = 0: trả về 1 -> hàm đúng
    //làm các case mà mình nghĩ là người dùng sẽ xài hàm như thế
    //gọi là các test case
    //một hàm có nhiều test case ứng với nhiều tình huống xài hàm
    //đảm bảo hàm đúng cho các cases thì mới release
    //bắt đầu thử nghiệm test hàm
}
