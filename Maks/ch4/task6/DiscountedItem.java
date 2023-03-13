package ch4.task6;

import java.util.Objects;

public class DiscountedItem extends Item {
    private double discount;
    public DiscountedItem(double discount, String description, double price){
        super(description, price);
        this.discount = discount;
    }
    public boolean equals(Object otherObject) {
        if(otherObject.getClass() == Item.class){
            return super.equals(otherObject);
        } else {
            if(!super.equals(otherObject)) return false;
            DiscountedItem other = (DiscountedItem) otherObject;
            return Objects.equals(discount, other.discount);
        }
    }
    public int hashCode() {
        return Objects.hash(super.hashCode(), discount);
    }
    public static void main(String[] args) {
        Item i1 = new Item("item 1", 100);
        Item i2 = new Item("item 1", 100);
        DiscountedItem d1 = new DiscountedItem(10, "item 1", 100);
        DiscountedItem d2 = new DiscountedItem(20, "item 1", 100);

        System.out.println("Symmetry");
        System.out.println(i1.equals(i2));
        System.out.println(i2.equals(i1));
        System.out.println(i1.equals(d1));
        System.out.println(d1.equals(i1));
        System.out.println(d1.equals(d2));
        System.out.println(d2.equals(d1));

        System.out.println("Transitivity");
        System.out.println(d1.equals(i1));
        System.out.println(i1.equals(d2));
        System.out.println(d1.equals(d2));
    }
}
