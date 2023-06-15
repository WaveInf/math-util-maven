/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.wave.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.wave.mathutil.core.MathUtility;

/**
 *
 * @author ASUS
 */
public class MathUtilityTest {
    @Test
    public void checkFactorialGivenRightAgrumentReturnsWell(){
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(720, MathUtility.getFactorial(6));
    }
       
}
    
    //new knowledge: DDT (data driven testing)
    //là 1 kỹ thuật viết code kiểm thử của UnitTest
    //mà tách phần data ra khỏi câu lệnh assertE()
    
    //Viết các test case hướng về việc tách data test ra riêng biệt
    
    //ko nhầm lẫn với TDD: Test driven development
    //TDD: viết code chính và code test/test case đan xen để check hàm đúng sai
    
    //DDT: trong quá trình viết code test, tách data test ra riêng 1 chỗ cho dễ đọc, bảo trì
    
    //DDT là nằm trong TDD
    