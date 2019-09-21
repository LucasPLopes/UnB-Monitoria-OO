
public class Main {
    public static void main(String[] args) {
        // Jumpable test1 = new Jumpable(); error
        
        Jumpable jump01 = new Jumpable(){};
        
        // Animal animal01 = new Jumpable(){}; error
        // Lion lion = new Animal(); error
        // Lion lion = (Lion) new Animal(); error

        Animal animal01 = (Animal) new Lion();
        // Lion lion = new Animal(); error
        // Jumpable jump02 = new Animal(); error

        Jumpable jump03 = new Lion();

        // Exception in thread "main" java.lang.ClassCastException: class Animal cannot
        // be cast to class Jumpable
        // Jumpable jump04 = (Jumpable) new Animal(); error
        // Jumpable jump04 = (Jumpable)(new Animal());
    }
}