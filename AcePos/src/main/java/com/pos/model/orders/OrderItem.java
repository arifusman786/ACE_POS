/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelclasses;

/**
 *
 * @author Arif
 */
public class OrderItem {

    public static String ORDERSDETAILSID="ORDERSDETAILSID";
    public static String ORDERID="ORDERID";
    public static String ITEMCODE="ITEMCODE";
    public static String ITEMQUANTITY="ITEMQUANTITY";
    
    private int itemCode;
    private String description;
    private float unitPrice;
    private float total;
    private int orderID;
    private int orderDetailsID;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public int getOrderDetailsID() {
        return orderDetailsID;
    }

    public void setOrderDetailsID(int orderDetailsID) {
        this.orderDetailsID = orderDetailsID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    

    @Override
    public String toString() {
        return "OrderItem{" + "itemCode=" + itemCode + "description=" + description + "unitPrice=" + unitPrice + "total=" + total + "orderID=" + orderID + "orderDetailsID=" + orderDetailsID + "quantity=" + quantity + '}';
    }

    
    
}
