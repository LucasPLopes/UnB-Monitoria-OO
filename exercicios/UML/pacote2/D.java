package pacote2;
import pacote1.C;

public class D extends C{
    public char at17 = 'D';
    protected float at18 = 18f;
    static String  at19 = "at19";
    private int at20 = 20;

    void m6(){
        System.out.println("M6()");
    }
    private char m7(){
        return at17;
    }

    public String m8(){
        return D.at19;
    }

    public static void main(String[] args) {
        System.out.println(new D().at19);
        
    }

}
