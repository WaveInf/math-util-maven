/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.wave.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.wave.mathutil.core.MathUtility.*;

/**
 *
 * @author ASUS
 */
public class MathUtilityAdvancedTest {

    //Hàm trả về mảng 2 chiều gồn nhiều dòng, 2 cột
    //0 -> 1
    //2 -> 2
    //4 -> 24
   
    public static Object[][] initTestData(){
        Object testData[][] = {{0,1},
                               {1,1},
                               {2,2},
                               {4,24},
                               {6,720}
                            };
        
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource("initTestData")
    public void checkFactorialGivenRightAgrumentReturnsWell(int n, long expected){
                     //cột 1               //cột 0
        assertEquals(expected, getFactorial(n));       
    }
}

//Bắt ngoại lệ thì sao, tức là hàm của ta getF() trả về ngoại lệ
//khi đưa N = -1, -2, >20
//JUNIT đưa ra hàm mới, AssertThrows()
//Hàm này lại xài Lambda expression vào thứ 5

//TDD: Test driven development
//là kỹ thuật viết code chính cần phải đc kiểm tra ngay về chất lượng để test code chính
//đan xen, xen kẽ cùng với việc thiết kế các test cases
//Lập trình mà viết code chính và code test (JUnit, Unit Test)
//đan xen gọi là TDD

//DDT: data driven testing
//là kỹ thuật mở rộng, bổ sung thêm cho TDD trong đó việc viết code test do tách riêng ra
//so với test data nghĩa bộ dữ liệu test thường đc đặt ở 1 mảng 2 chiều 
//hoặc để ở table, file txt, excel sau đó đc nhồi/fill/map vào trong câu lệnh test
//Việc data tách riêng ra, sau đó fill trở lại hàm so sánh qua tên biến thì DDT còn đc gọi là PARAMETERIZED TESTING
