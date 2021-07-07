/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author Phúc
 */

    //VIẾT CLASS ĐỂ CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI
    //KHI TA CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI, ĐÓ LÀ LÚC TA KHÔNG CẦN NHỚ CÁI GÌ CHO RIÊNG TA
    //HÀM STATIC GIÚP TA LÀM ĐIỀU NÀY
public class MathUtil {
    // n! = 1.2.3.4.5.6.n
    // quy ước: 0! = 1! = 1
    // ko tính giai thừa cho số âm
    // 20! là vừa khớp
    // >20! lố kiểu long rồi
    // đưa vào số âm -> đập mặt lỗi
    
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument, n must be lower than 20, greater than 0 ");
        //gặp throw hàm dừng liền
        
        //xuống đây trường hợp n = 0-20
        if(n == 0 || n == 1) return 1; //dừng khi n đặc biệt
        
        //đến đây thì n = 2-20
        //for hoặc đệ quy
        
        long product = 1;
        for (int i = 2; i < n; i++)
            product *= i; //nhân liên tục với i
        return product;
    }
}
