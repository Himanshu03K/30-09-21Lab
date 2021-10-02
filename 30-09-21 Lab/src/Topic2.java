/*
Super

super keyword must be the first statement of every constructor
 */
class First
{
    public First(int a)
    { //super();    // here it will call the constructor of Object class
        System.out.println("First constructor "+ a);
    }
}

class Second1 extends First
{
    Second1(int b , int c, int d)
    { super(b);
        System.out.println("Second1 Constructor "+b +" "+c);
    }
}

class Third extends Second1
{
    Third(int ta, int tb, int tc,int td)
    { super(ta,tb,tc);
        System.out.println("Third Constructor");
    }
}

public class Topic2 {
    public static void main(String[] args) {
        Third obj = new Third(10 ,20,30,40);
    }
}
