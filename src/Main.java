
import phuc.util.MathUtility;

/*
 *  To change this license header, choose License Headers in Project Properties.
 *  To change this template file, choose Tools | Templates
 *  and open the template in the editor.
 */

/**
 *
 * @author 𝙋𝙝𝙪𝙘
 */
public class Main {
    public static void main(String[] args) {
        //kĩ thuật tets căn bản: nhìn bằng mắt các test case để kết luận hàm đúng sai
        long expected = 120;
        long actual = MathUtility.getFactorial(5);
        //kì vọng thực tế cái gì lưu ở actual 
        //so sánh = mắt
        System.out.println("5! ? expected " + expected + " ; actual: "+ actual);
        
        System.out.println("6! expected 720; actual: " + MathUtility.getFactorial(6));
        
        System.out.println("0! expected 1; actual: " + MathUtility.getFactorial(0));
        
        //kì vọng ném về ngoại lệ nếu đưa số âm
        MathUtility.getFactorial(-5);
        //ko sout vì quăng lỗi ngay khi gọi hàm
        //xem có đúng ngoại lệ đã thiết kế không để chửi thằng dùng hàm không đúng cách
        
    }
}

//nhược điểm:
//dùng mắt để so sánh từng trường hợp xài hàm: so sánh expected với actual
//nếu test nhiều tình huống -> mắt mỏi vì dò từng ouutput

//NÂNG CAO
//gom các test case lại, chạy 1 lượt như ở trên
//máy so giùm ta actual và expected
//NẾU TẤT CẢ CÁC TEST CASE ĐỀU ĐÚNG - QUĂNG RA 1 MÀU XANH - ĐÈN XANH - CODE ỔN
//NẾU RẨ CẢ CÁC CASE ĐỀU ĐÚNG, NGOẠI TRỪ CÓ 1, 2 THẰNG NÀO ĐÓ 
//EXPECTED KHÁC ACTUAL, THẤY 1 MÀU ĐỎ -> HÀM SAI
//                      HÀM ĐÚNG GẦN HẾT, SAI 1 HÀM -> HÀM KHÔNG ĐÁNG TIN CẬY
//ĐỎ: CHỈ CÓ ÍT NHẤT 1 CẶP EXPECTED ACTUAL KO BẰNG NHAU -> HÀM SAI

//THAY VIF NHÌN TỪNG CASES, TA CHỈ NHÌN XANH HOẶC ĐỎ LÀ ĐỦ
//TA CẦN BỘ THƯ VIỆN LÀM GIÚP VIỆC NÀY
//BỘ THƯ VIỆN LÀM 2 VIỆC: SO SÁNH EXPECTED VÀ ACTUAL
//                          TÙY KHỚP -> THẢY RA MÀU XANH
//                              KO KHỚP -> THẢY RA MÀU ĐỎ
//NÓ TỰ QUÉT HẾT CÁC CASE MÀ MÌNH ĐÃ THIẾT KẾ ĐỂ KẾT LUẬN, MẮT NHÌN 1 MÀU LÀ ĐỦ
//BỘ THƯ VIỆN NÀY LÀ NHỮNG FILE .JAR, .DLL ĐƯỢC ADD THÊM VÀO PROJECT
//Bộ thư viện này mang cái tên chung cho mọi ngôn ngữ lập trình - UNIT TEST
//đối với Java: JUnit, TestNG;
//        C#:   NUnit
//        PHP:  PHPUnit
//............................
