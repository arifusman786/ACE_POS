/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pos.model.items;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import org.hibernate.SessionFactory;


/**
 *
 * @author Arif
 */
@Entity(name="Items")
@NamedQueries({
    @NamedQuery(name="Items.ALL", query = "from Items ")
})
public class Item {
    public static String ITEMCODE = "ITEMCODE";
    public static String ITEMNAME = "ITEMNAME";
    public static String WEIGHT = "WEIGHT";
    public static String MADE = "MADE";
    public static String CATEGORY = "CATEGORY";
    public static String UNITGRASSPRICE = "UNITGRASSPRICE";
    public static String UNITGST = "UNITGST";
    public static String MEASUREMENTUNIT = "MEASUREMENTUNIT";
    public static String UNITINTEREST = "UNITINTEREST";
    public static String UNITDISCOUNT = "UNITDISCOUNT";
    public static String UNITTOTALPRICE = "UNITTOTALPRICE";
    public static String UNITSIZE = "UNITSIZE";
   
    @Id
    @GeneratedValue
    @Column(name="itemcid")
    private int itemCode;
    @Column(name="itemname")
    private String itemName;
    
    private float weight;
    private String made;
    private String category;
    @Column(name="unitgrassprice")
    private float unitGrassPrice;
    @Column(name="unitgst")
    private float unitGst;
    @Column(name="measurementunit")
    private String measuremetUnit;
    @Column(name="unitinterest")
    private float unitInterest;
    @Column(name="unitdiscount")
    private float unitDiscount;
    @Column(name="unittotalprice")
    private float unitTotalPrice;
    @Column(name="unitsize")
    private String unitSize;

    public Item(SessionFactory factory) {
        System.err.println("--------------------Item's session factory constructor called");
    }

    public Item() {
                System.err.println("+++++++++++++++Item's no-argument constructor called");
    }

    
    public float getUnitTotalPrice() {
        return unitTotalPrice;
    }

    public void setUnitTotalPrice(float unitTotalPrice) {
        this.unitTotalPrice = unitTotalPrice;
    }
    

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public String getMeasuremetUnit() {
        return measuremetUnit;
    }

    public void setMeasuremetUnit(String measuremetUnit) {
        this.measuremetUnit = measuremetUnit;
    }

    public float getUnitDiscount() {
        return unitDiscount;
    }

    public void setUnitDiscount(float unitDiscount) {
        this.unitDiscount = unitDiscount;
    }

    public float getUnitGrassPrice() {
        return unitGrassPrice;
    }

    public void setUnitGrassPrice(float unitGrassPrice) {
        this.unitGrassPrice = unitGrassPrice;
    }

    public float getUnitGst() {
        return unitGst;
    }

    public void setUnitGst(float unitGst) {
        this.unitGst = unitGst;
    }

    public float getUnitInterest() {
        return unitInterest;
    }

    public void setUnitInterest(float unitInterest) {
        this.unitInterest = unitInterest;
    }

    public String getUnitSize() {
        return unitSize;
    }

    public void setUnitSize(String unitSize) {
        this.unitSize = unitSize;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Item{" + "itemCode=" + itemCode + "itemName=" + itemName + "weight=" + weight + "made=" + made + "category=" + category + "unitGrassPrice=" + unitGrassPrice + "unitGst=" + unitGst + "measuremetUnit=" + measuremetUnit + "unitInterest=" + unitInterest + "unitDiscount=" + unitDiscount + "unitTotalPrice=" + unitTotalPrice + "unitSize=" + unitSize + '}';
    }

    public static String getCommaSeparatedStrOfItemsColumns(){
        String tempStr = ITEMNAME+", "+WEIGHT+", "+MADE+", "+CATEGORY+", "+
                UNITGRASSPRICE+", "+UNITGST+", "+MEASUREMENTUNIT+", "+UNITINTEREST+", "+UNITDISCOUNT+", "+UNITTOTALPRICE+", "+UNITSIZE;
        System.out.println("comma separated list of columns = "+tempStr);
        //System.out.println("comma separated list of columns = "+tempStr.split(","));
        return tempStr;
    }

    public static String getCommaSeparatedStrOfItemsColumnsForUpdateQuery(){
        String tempStr = ITEMNAME+"=?, "+WEIGHT+"=?, "+MADE+"=?, "+CATEGORY+"=?, "+
                UNITGRASSPRICE+"=?, "+UNITGST+"=?, "+MEASUREMENTUNIT+"=?, "+UNITINTEREST+"=?, "+
                UNITDISCOUNT+"=?, "+UNITTOTALPRICE+"=?, "+UNITSIZE+"=?";
        return tempStr;
    }

//    public Item parseItemUpdateToItem(ItemUpdate itemUpdate){
//
//        return this;
//    }

    
    
    
}
