public class Test extends {
    private void test(String tcName, String program, boolean expected){
        boolean result;
        //TODO: fill result
        if(result == expected){
            System.out.println("Passed "+tcName);
        } else {
            System.err.println("Failed "+tcName+", expected "+expected+" got "+result);
        }
    }
    
    public void static main(String[] args){
        test("example", "
{
    class A {
        boolean a;
        a = true;
        class AA {
            boolean aa;
        }
    }
    class B extends A {
        boolean b;
        b = a;
        A refA;
        B refB;
        refA = refB;
        refB.b = refA.a;
        class BB extends AA {
            boolean bb;
            bb = aa;
            while (b)
                b = a;
        }
    }
}
", true);
    }
}
