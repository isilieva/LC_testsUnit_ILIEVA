import calc.Calculator;
import junit.framework.TestCase; 

public class calculatorTest extends TestCase
{ 
    private static Calculator calculator= new Calculator();

#test Ajout de 2 nombres 

    public void testAdd()
    { 
        calculator.add(1);
        calculator.add(1);
        assertEquals(calculator.getResult(), 2); 
    }

#test Division de 2 nombres 

    public void testDiv()
    { 
        calculator.div(4);
        calculator.div(2);
        assertEquals(calculator.getResult(), 2); 
    }

#test Multiplication de 2 nombres 


    public void testMul()
    { 
        calculator.mul(7);
        calculator.mul(8);
        assertEquals(calculator.getResult(), 56); 
    }

#test Substraction de 2 nombres 


        public void testSub()
        { 
            calculator.sub(100);
            calculator.sub(25);
            assertEquals(calculator.getResult(), 75); 
        }
}