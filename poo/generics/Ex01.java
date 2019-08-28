import java.util.ArrayList;

public class Ex01 {

    private class Animal {
        String nome;

        public Animal(String nome) {
            this.nome = nome;
        }

        @Override
        public String toString() {
            return super.toString() + "Animal [nome=" + nome + "]";
        }

    }

    public static void main(String[] args) {
        {
            /** Antes do Java 5 **/
            ArrayList frutas = new ArrayList();

            frutas.add("banana");
            frutas.add("laranja");
            frutas.add("uva");
            frutas.add("maça");
            System.out.println("-----Sem generics-----\n");
            System.out.println("Sem casting: " + frutas.get(3));// warnning: operacoes inseguras
            String fruta = (String) frutas.get(3);
            System.out.println("Com casting: " + fruta);

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
        
        {

            /** Estilo de Array a partir do java 7 **/
            System.out.println("\n\n-----A partir do Java 7 mais Inner Class-----\n");
            ArrayList<Ex01.Animal> animais = new ArrayList<>();
            animais.add(new Ex01().new Animal("Cachorro"));
            animais.add(new Ex01().new Animal("Papagaio"));
            animais.add(new Ex01().new Animal("Gato"));
            animais.add(new Ex01().new Animal("Porquinho-da-índia"));

            System.out.println(animais.get(3).toString());
        }
    }
}