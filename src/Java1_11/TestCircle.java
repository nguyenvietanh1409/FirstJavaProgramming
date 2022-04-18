package Java1_11;

public class TestCircle {
    public static void main(String[] args){
        Circle c1,c2,c3;
        c1 = new Circle();
        c2 = new Circle(2.0);
        c3 = new Circle(3.0,"Blue");

        System.out.println("The Circle has radius of "+c1.getRadius()+" and area of "+ c1.getArea());

        System.out.println("The Circle has radius of "+c2.getRadius()+" and area of "+ c2.getArea());

        System.out.println("The Circle has radius of "+c3.getRadius()+" and area of "+ c3.getArea());

        System.out.println("Using toString");
        System.out.println("=======================================");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
}
