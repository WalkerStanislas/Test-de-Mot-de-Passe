
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
public class Test_ {
    PasseTest passeTest = new PasseTest();

    public Test_(){

    }
    public void testValide1(){
        assertEquals(passeTest.Passe("Walker1234@"),true);
    }
    public void testInValide1(){
        assertNotEquals(passeTest.Passe("Walker1234"),true);
    }
    public void testValide2(){
        assertEquals(passeTest.Passe("walker1234@"),true);
    }
    public void testInValide2(){
        assertNotEquals(passeTest.Passe("12345678"),true);
    }
    public void testInValide3(){
        assertNotEquals(passeTest.Passe(""),true);
    }


    public static void main(String[] args) {
        Test_ test = new Test_();
        test.testValide1();
        test.testValide2();
        test.testInValide1();
        test.testInValide2();
        test.testInValide3();

    }

}
