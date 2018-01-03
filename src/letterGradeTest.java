import com.company.letterGrade;
import org.junit.Test;

import static org.junit.Assert.*;

public class letterGradeTest {

    @Test
    public void test1(){
        assertEquals('X', letterGrade.letterGrade(-1));
    }

    @Test
    public void test2(){
        assertEquals('X', letterGrade.letterGrade(101));
    }

    @Test
    public void test3(){
        assertEquals('A', letterGrade.letterGrade(95));
    }

    @Test
    public void test4(){
        assertEquals('B', letterGrade.letterGrade(85));
    }

    @Test
    public void test5(){
        assertEquals('C', letterGrade.letterGrade(77));
    }

    @Test
    public void test6(){
        assertEquals('D', letterGrade.letterGrade(66));
    }

    @Test
    public void test7(){
        assertEquals('F', letterGrade.letterGrade(58));
    }
}