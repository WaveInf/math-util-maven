/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.wave.mathutil.core;

//Class này sẽ mô phỏng, clone lại class java.util.Math
//huyền thoại, mà bên trong có các hàm static nổi tiếng
//Math.sqrt() Math.sin() Math.random()
//và con số PI

public class MathUtility {
    public static final double PI = 3.1415;
    
    //hàm này tính n! = 1,2,...n
    //thiết kế hàm này như sau
    //0! = 1! = 1
    //ko có âm giai thừa. Đưa -1!,.. -n!: throw exception
    //Vì giai thừa tăng nhanh, 20 giai thừa là đủ cho long
    //long: 18 con số 0
    //21 giai thừa thì long ko chứa đc
    //hàm chỉ cho phép n = 0...20
    //dưa ra n>20 -> throw exception
//    public static long getFactorial(int n){
//        if(n < 0 || n  > 20) 
//            throw new IllegalArgumentException("Invalid n. n must be between 0...20");
//        if(n == 0 || n == 1) 
//            return 1;
//        long product = 1;
//        for(int i = 2; i <= n; i++)
//            product *= i;
//        
//        return product;
//    }
    
   public static long getFactorial(int n){
        if(n < 0 || n  > 20) 
            throw new IllegalArgumentException("Invalid n. n must be between 0...20");
        if(n == 0 || n == 1) 
            return 1;
        
        return n * getFactorial(n-1);
        //đệ quy - recursion
    }
    
}

//5! = 1*2*3*4*5 = 5* 4!
//4! = 4*3!
//3! = 3*2! 
//2! = 2*1!
//1! = 1; //dừng
//N! = N * (N-1)!
