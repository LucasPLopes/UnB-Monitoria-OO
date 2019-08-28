 package pacote1;

class A {
    public int at1;
    private String at2 = "";
    protected float at3 = 7f;
    String at4 = "";
    static String at0 = "at0";
   

    public void m0() {
        System.out.println("M0()");
    }

    float m3() {
        return 3f;
    }

    float m4() {
        return 4f;
    }

    static String m5() {
        return "M5()";
    }

    public static void main(String[] args) {
        
        System.out.println(new A().m5());
        System.err.println(new A().at0);
        
    }
}
