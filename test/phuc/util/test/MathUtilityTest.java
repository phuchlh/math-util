/*
 *  To change this license header, choose License Headers in Project Properties.
 *  To change this template file, choose Tools | Templates
 *  and open the template in the editor.
 */
package phuc.util.test;

import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;
import static phuc.util.MathUtility.*;
//chỉ có từ jdk 5, chỉ danfhc ho static
//tức là khi chơi trò import static, moih hàm static trong class này
//khi gọi thì ko cần thêm class chấm, gọi như C, vì hiểu ngầm đã chấm rồi

/**
 *
 * @author 𝙋𝙝𝙪𝙘
 */
public class MathUtilityTest {
    
    public MathUtilityTest() {
    }
    
    /*
    class này là class xài bộ thư viện JUnit dùng để test code
    theo dạng xanh - đỏ, thay vì nhìn = mắt như main, sout()
    2 file .jar đã được add vào project này, ta thoải mái xài các hàm của nó
    trong các hàm của thư viện này có n hàm đặc biiejet đều có tên xuất phát là
    assertX (expected và actual đưa vào(
    nếu nó thấy expected hok bằng actual -> nó quăng ra màu đỏ
                         có bằng actual -> nó quăng ra màu xanh
    quy tắc xanh đỏ: Tất cả XANH -> kết luận XANH
                     Ít nhất 1 ĐỎ, ko quan tâm tất cả còn lại
                                 -> kết luận ĐỎ
    đảm bảo hàm chạy đúng mọi CASE, trường hợp
    */
    
    @Test //biến hàm này sau đây thành public static void main()
    //mún nó chạy thì shift f6
    public void getFactorial_RunsWell_IfValidArgument(){
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6)); 
        assertEquals(24, getFactorial(4));
        assertEquals(1, getFactorial(0));  
    }
    
    @Test(expected = SQLException.class)
    public void getFactorial_ThrowsExeption_IfInvalidArgument(){
        //ngoại lệ k phải là value để assert()
        //chỉ có thể chụp nó lại
        getFactorial(-5);   
    }
}
