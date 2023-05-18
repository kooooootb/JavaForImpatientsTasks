package ch2.Task17;

import java.util.Iterator;

public class Queue {
    Node first, last;

    static class Node{
        String string;
        Node next;
        Node(String string){
            this.string = string;
            next = null;
        }
        Node(String string, Node node){
            this.string = string;
            this.next = node;
        }
    }

    class Iterator implements java.util.Iterator<String> {
        Node current;
        Iterator(){
            current = Queue.this.first;
        }
        public String next(){
            String returning = current.string;
            current = current.next;
            return returning;
        }
        public boolean hasNext(){
            return current != null;
        }
    }

    Queue(){
        last = null;
        first = null;
    }
    void add(String string){
        if(last == null){
            first = new Node(string);
            last = first;
        } else {
            last.next = new Node(string);
            last = last.next;
        }
    }
    String remove(){
        final String removing;
        if(first != null){
            removing = first.string;
            first = first.next;
            if(first == null){
                last = null;
            }
        } else{
            removing = null;
        }
        return removing;
    }
    Iterator iterator(){
        return new Iterator();
    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.remove();
        queue.add("first");
        queue.add("second");
        queue.add("third");
        queue.remove();
        queue.add("fourth");

        Queue.Iterator iterator = queue.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
