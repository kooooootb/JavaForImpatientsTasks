package ch2.Task15;

import java.util.ArrayList;
public class Invoice {
    public static class Item {
        private String description;
        private int quantity;
        private double unitPrice;
        public Item(String description, int quantity, double unitPrice) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }
        public double price() { return quantity * unitPrice; }
        public String toString(){
            return String.format("description: %s, quantity: %d, unit price: %.2f", description, quantity, unitPrice);
        }
    }
    private ArrayList<Item> items = new ArrayList<>();
    public void add(Item item) { items.add(item); }
    public void print(){
        double sum = 0;
        for(Item item : items){
            System.out.println(item);
            sum += item.quantity * item.unitPrice;
        }
        System.out.printf("full price: %.2f", sum);
    }
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.add(new Invoice.Item("book", 5, 10));
        invoice.add(new Invoice.Item("pencil", 3, 20));
        invoice.add(new Invoice.Item("papers", 50, 1));
        invoice.print();
    }
}
