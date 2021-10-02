/*
Inferface
 */

// java 1.7
interface i1
{
    /*public static final int a = 0;
    * in interface all variable are public static final */
    public abstract void m1();
}
class one implements i1{

    @Override
    public void m1() {
        System.out.println("hello");
    }
}

public class Topic1 {
    public static void main(String[] args) {
//        one obj = new one();
//        obj.m1();

        i1 obj = new i1() {
            @Override
            public void m1() {
                System.out.println("Welcome to java class");
            }
        };
        obj.m1();
    }
}
