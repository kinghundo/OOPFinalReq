package exercise1;
public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    
    //Constructor
    public InvoiceItem(String id, String desc, int qty, double unitPrice){
        this.id=id;
        this.desc=desc;
        this.qty=qty;
        this.unitPrice=unitPrice;
    }

    public String getId() {
        return id;
    }
    public String getDesc() {
        return desc;
    }
    public int getQty() {
        return qty;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getTotal(){
        return unitPrice*qty;
    }
    public String toStringInvoice(){
        return "ID: "+id+" Description: "+desc+" Quantity: "+qty+" Unit Price: "
                +unitPrice;
    }
}
