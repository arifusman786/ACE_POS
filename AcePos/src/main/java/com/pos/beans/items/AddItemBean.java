/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pos.beans.items;

import com.pos.model.items.Item;

/**
 *
 * @author lmkr1340
 */
public class AddItemBean {
    private Item selectedItem;
    private String itemName;
    private String category;
    private String made;
    
    //private int price;
    private float unitGrassPrice;
    //private int gst;
    private float unitGst;
    
    //private String unit;
    private String measurementUnit;
    private float unitDiscount;
    //private int interest;
    private float unitInterest;
    //private int totalPrice;
    private float unitTotalPrice;
    private float weight;    
    private String unitSize;

    public AddItemBean() {
        
    }

    public AddItemBean(String itemName, String category, float unitGrassPrice, float unitGst, String measurementUnit, float unitInterest, 
            float unitTotalPrice,
            float weight, String unitSize, float unitDiscount, String made) {
        this.itemName = itemName;
        this.category = category;
        this.unitGrassPrice = unitGrassPrice;
        this.unitGst = unitGst;
        this.measurementUnit = measurementUnit;
        this.unitInterest = unitInterest;
        this.unitTotalPrice = unitTotalPrice;
        this.weight = weight;
        this.unitSize = unitSize;
        this.unitDiscount=unitDiscount;
        this.made = made;
    }

    public Item getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(Item selectedItem) {
        this.selectedItem = selectedItem;
    }
    
    public String toString(){
        String result = "itemName = "+itemName +", "+
                "itemName = "+itemName +", "+
                "category = "+category +", "+
                "unitGst = "+unitGst +", "+
                "measurementUnit = "+measurementUnit +", "+
                "unitInterest = "+unitInterest +", "+
                "unitTotalPrice = "+unitTotalPrice +", "+
                "weight = "+weight +", "+
                "made = "+made +", "+
                "unitSize = "+unitSize +", "+
                "unitDiscount = "+unitDiscount;

        return result;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public String getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(String measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    public void setUnitGst(int unitGst) {
        this.unitGst = unitGst;
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

    public float getUnitTotalPrice() {
        return unitTotalPrice;
    }

    public void setUnitTotalPrice(float unitTotalPrice) {
        this.unitTotalPrice = unitTotalPrice;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    

   

    

   
    
}
