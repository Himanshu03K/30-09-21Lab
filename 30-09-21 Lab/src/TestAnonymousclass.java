/*
Anonymous nested class
Abstract
Interface

if you do not know the behaviour declare method with abstract modifier

if a class is having abstract method then it is mandatory to create the class with abstract modifier
 */

abstract class Result
{
    abstract public void calculateResult();
}
//
//class Second extends Result
//{
//    public void calculateResult()
//    {
//        System.out.println("Welcome");
//    }
//}

public class TestAnonymousclass {
    public static void main(String[] args) {

//        Second obj = new Second();
//        obj.calculateResult();

        Result obj1 = new Result() {
            @Override
            public void calculateResult() {
                System.out.println("Hello");
            }
        };
        Result obj2 = new Result() {
            @Override
            public void calculateResult() {
                System.out.println("Second Object");
            }
        };
        obj1.calculateResult();
        obj1.calculateResult();

        obj2.calculateResult();
    }
}
