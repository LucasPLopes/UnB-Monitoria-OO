public class Casa{
    public static void main(String[] args) {
        Cachorro pompeu ;
        pompeu = new Cachorro();
        pompeu.nome = "Pompeu Frederico";

        // System.out.println(pompeu.toString());

        Carro c1,c2;
        c1 = new Carro();
        
        //A qui chamamos o toString() de forma implícita
        System.out.println(c1);
        
        c2 = new Carro("Volks","Hatch",5,"Flex");
        //de forma explicita
        System.out.println(c2.toString());
    }
}