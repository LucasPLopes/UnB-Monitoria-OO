// Implementação da interface Comparable<T>

public class Circle implements Comparable<Circle>{
    private double radius ;

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle() {
        this(1); // radius = 1;
    }
    @Override
    public int  compareTo(Circle o ){
        if(this.radius > o.radius) return 1;
        if(this.radius == o.radius) return 0;
        return -1;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
    public static void main(String[] args) {
        Circle c1,c2;
        c1 = new Circle(1);
        c2 =new Circle(2);
        int equal = c1.compareTo(c2);
        if(equal == -1)
            System.out.println("C1 < C2: "+c2);
        else if(equal == 1)
            System.out.println("C1 > C2: "+c1);
        else
            System.out.println("C1 == C2");

    }
    

}