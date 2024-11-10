package org.dhanush.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class MyMathTest {

    private MyMath math = new MyMath();

    @Test
    void calculateSum_ThreeMemberArray(){
        assertEquals(6, math.CalculateSum(new int[]{1,2,3}));
    }

    @Test
    void testWithNoElements(){
        assertEquals(0, math.CalculateSum(new int[]{}));
    }

    //This test has nothing do with the MyMath class
    //Its the different assert methods present
    @Test
    void differentTest(){
        assertArrayEquals(new int[] {1,2}, new int[] {1,2});
    }

    /*
        Before each test this will appear
     */
    @BeforeEach
    void beforeEach(){
        System.out.println("Before Each");
    }

    @AfterEach
    void afterEach(){
        System.out.println("After Each");
    }

    @BeforeAll
    static void beforeAll(){
        System.out.println("Before All");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("After All");
    }

}
