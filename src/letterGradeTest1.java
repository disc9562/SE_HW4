import com.company.letterGrade;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class letterGradeTest1 {

    @Test
    public void test1(){
        assertEquals('X', letterGrade.letterGrade(-1));
    }

    @Test
    public void test2(){
        assertEquals('F', letterGrade.letterGrade(0));
    }

    @Test
    public void test3(){
        assertEquals('F', letterGrade.letterGrade(1));
    }

    @Test
    public void test4(){
        assertEquals('A', letterGrade.letterGrade(99));
    }

    @Test
    public void test5(){
        assertEquals('A', letterGrade.letterGrade(100));
    }

    @Test
    public void test6(){
        assertEquals('X', letterGrade.letterGrade(101));
    }

    @Test
    public void test7(){
        assertEquals('B', letterGrade.letterGrade(89));
    }

    @Test
    public void test8(){
        assertEquals('A', letterGrade.letterGrade(90));
    }

    @Test
    public void test9(){
        assertEquals('A', letterGrade.letterGrade(91));
    }

    @Test
    public void test10(){
        assertEquals('C', letterGrade.letterGrade(79));
    }

    @Test
    public void test11(){
        assertEquals('B', letterGrade.letterGrade(80));
    }

    @Test
    public void test12(){
        assertEquals('B', letterGrade.letterGrade(81));
    }

    @Test
    public void test13(){
        assertEquals('D', letterGrade.letterGrade(69));
    }

    @Test
    public void test14(){
        assertEquals('C', letterGrade.letterGrade(70));
    }

    @Test
    public void test15(){
        assertEquals('C', letterGrade.letterGrade(71));
    }

    @Test
    public void test16(){
        assertEquals('F', letterGrade.letterGrade(59));
    }

    @Test
    public void test17(){
        assertEquals('D', letterGrade.letterGrade(60));
    }

    @Test
    public void test18(){
        assertEquals('D', letterGrade.letterGrade(61));
    }
}