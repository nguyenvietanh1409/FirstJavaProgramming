package Java1_11;

public class TestDate {
    public static void main(String[]args){
        Date d1= new Date(14,9,2003);
        System.out.println(d1.getDay());
        System.out.println(d1.getMonth());
        System.out.println(d1.getYear());
        d1.setDay(17);
        d1.setMonth(7);
        d1.setYear(2003);
        d1.setDate(11,1,2001);
        System.out.println(d1.toString());
    }
}
