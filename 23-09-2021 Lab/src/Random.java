class Stu1{
        static int rollno;
        static int arr[];
/*
    public Stu1(int rollno, int[] arr) {
            this.rollno = rollno;
            this.arr = arr;
        }

 */

    public static void setRollno(int rollno) {
        Stu1.rollno = rollno;
    }

    public static int getRollno() {
        return rollno;
    }

    public static void setArr(int[] arr) {
        Stu1.arr = arr;
    }

    public static void display(){
            getRollno();
            for (int res:arr){
                System.out.println(res);
            }
        }

    }

    public class Random {
        public static void main(String[] args) {
            //Stu obj1=new Stu(23,new int[]{23_000,56,78,90});
            Stu1.setRollno(23);
            Stu1.setArr(new int[]{23_000,56,78,98});
            //System.out.println("Welcome");
            Stu1.display();
           }
}
