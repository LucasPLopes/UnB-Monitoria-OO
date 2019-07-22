import java.util.ArrayList;

public class Ex01{
    public static void main(String[] args) {
        {
            /**Antes do Java 5.0 **/
            ArrayList frutas = new ArrayList();

            frutas.add("banana");
            frutas.add("laranja");
            frutas.add("uva");
            frutas.add("maça");
            System.out.println("-----Sem generics-----\n");
            System.out.println("Sem casting: "+frutas.get(3));// warnning: operacoes inseguras
            String fruta = (String) frutas.get(3);
            System.out.println("Com casting: "+fruta);

            System.out.println("\n\n-----Usando generics-----\n");
         }

         {
             ArrayList<String> animais = new ArrayList<String>();

            animais.add("Cachorro");
            animais.add("Gato");
            animais.add("Papagaio");
            animais.add("Porquinho-da-índia");
            
            String animal = animais.get(3);
            System.out.println(animal);
         }
    }
}