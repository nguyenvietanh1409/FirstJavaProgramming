package Java1_11;

public class Circle1_2 {
    private double radius = 1.0;

    public Circle1_2(double r){
        radius = r;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double r){
        radius = r;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return Math.PI;
    }
    public String toString(){
        return "Circle[radius = "+ radius + "]";
    }
}
