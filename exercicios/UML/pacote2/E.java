package pacote2;

class E{
    public boolean at21 = false;
    static protected char at22 = 'E';
    protected String at23 = "at23";

    D d ;

    public  E(){
        d = new D();
    }

    protected void m2()
    {
        System.out.println("M2()");
    }
    

    static float m10(){
        return 10f;
    }

    public static String mX(){
        D d = new D();
        return d.at19;
    }
    public static void main(String[] args) {
        System.out.println( mX());

    }

}
