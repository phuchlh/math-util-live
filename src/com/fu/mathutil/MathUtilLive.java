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
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        long result = MathUtil.getFactorial(5);
        System.out.println("5! = 120; actual =  "+ result);
        //kĩ thuật kiểm thử
        //expected = actual -> đúng
        
        //thêm code sau lần đầu làm chuyện ấy
        // 7/7/2021 5:35pm
        System.out.println("1! = 1; actual =  "+ MathUtil.getFactorial(1));
        System.out.println("3! = 6; actual =  "+ MathUtil.getFactorial(3));
    }
    
}
