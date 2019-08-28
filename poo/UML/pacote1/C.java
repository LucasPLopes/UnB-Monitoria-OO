package pacote1;

public class C extends B{
    float at11 = 11f;
    protected String at12 = "at12";
    double at13 = 13.0;
    public float at15  = 15f;
    static protected boolean at16 = false;

    static void m9(){
        System.out.println("M9()");
    }

    protected boolean at16(){
        return C.at16;
    }
    public float m12(){
        return at11;
    }

    public static void main(String[] args) {
        
        new C().a.m0();
        C c = new C();

        c.at16();
        c.m1();
        
    }




}
