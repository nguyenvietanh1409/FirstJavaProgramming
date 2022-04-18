package Java1_11;

public class TestCircle1_2 {
    public static void main(String[] args){
        Circle1_2 c1 = new Circle1_2(4.0);
        System.out.println(c1.getRadius());
        c1.setRadius(5.0);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
        System.out.println(c1.toString());
    }
}
