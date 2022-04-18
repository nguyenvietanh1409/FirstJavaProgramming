package Java1_11;

public class TestInvoiceItem {
    public static void main(String[] args){
        InvoiceItem item1 = new InvoiceItem("1","Description 1",11,111111);
        System.out.println(item1.getId());
        System.out.println(item1.getDesc());
        System.out.println(item1.getQty());
        item1.setQty(20);
        System.out.println(item1.getUnitPrice());
        item1.setUnitPrice(22222);
        System.out.println(item1.getTotal());
        System.out.println(item1.toString());
    }
}
