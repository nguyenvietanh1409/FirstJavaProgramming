package Java1_11;

public class TestRectangle {
    public static void main(String[] args){
        Rectangle rec1 = new Rectangle(5.0f,6.0f);
        System.out.println(rec1.getLength());
        rec1.setLength(9.0f);
        System.out.println(rec1.getWidth());
        rec1.setWidth(8.0f);
        System.out.println("Area = "+ rec1.getArea());
        System.out.println("Perimeter = "+ rec1.getPerimeter());
        System.out.println(rec1.toString());
    }
}
