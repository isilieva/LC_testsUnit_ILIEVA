public class CalculatorTestextends TestCase
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
        calculator.add(7);
        calculator.add(8);
        assertEquals(calculator.getResult(), 56); 
    }

#test Substraction de 2 nombres 


        public void testSub()
        { 
            calculator.add(100);
            calculator.add(25);
            assertEquals(calculator.getResult(), 75); 
        }
}