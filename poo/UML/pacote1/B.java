package pacote1;
import pacote1.A;

class B{

    public A a  = new A();

    private String at5 = "AT5";
    private static float at6 =  6f;
    protected String at7 = "AT7";
    protected double at8  = 8.0;
    int at9 = 9;

    void m1(){
        System.out.println("M1()");
    }

    

    public static void main(String[] args) {
        B b =new B();
         b.a.m0();
         
         System.out.println(A.m5()); 
         
    }

    
}


 
