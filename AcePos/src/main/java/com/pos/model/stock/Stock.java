/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pos.model.stock;

/**
 *
 * @author Arif
 */
public class Stock {
    public static String STOCKID="STOCKID";
    public static String ITEMCODE="ITEMCODE";
    public static String ITEMQUANTITY="ITEMQUANTITY";

    private int stockID;
    private int itemCode;
    private int itemQuantity=-1;
    private String itemName;        //This attribute is used only when stock report is viewed.

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public int getStockID() {
        return stockID;
    }

    public void setStockID(int stockID) {
        this.stockID = stockID;
    }

    @Override
    public String toString() {
        return "Stock{" + "stockID=" + stockID + "itemCode=" + itemCode + "itemQuantity=" + itemQuantity + '}';
    }

    
}
