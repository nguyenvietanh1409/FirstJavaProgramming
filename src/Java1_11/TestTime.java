package Java1_11;

public class TestTime {
    public static void main(String[] args){
        Time t1 = new Time(5,10,59);
        System.out.println(t1.getHour());
        System.out.println(t1.getMinute());
        System.out.println(t1.getSecond());
        t1.setHour(24);
        t1.setMinute(24);
        t1.setSecond(24);
        t1.setTime(6,8,50);

    }
}
