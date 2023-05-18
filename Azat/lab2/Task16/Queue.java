package ch2.Task16;

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
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println(queue.remove());
        queue.add("first");
        queue.add("second");
        queue.add("third");
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        queue.add("fourth");
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
