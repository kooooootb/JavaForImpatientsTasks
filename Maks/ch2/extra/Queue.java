package ch2.extra;

import java.util.Observer;

public class Queue implements Iterable<String> {
    private Node first, last;
    private int size = 0;
    public static class Node{
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

    public class Iterator implements java.util.Iterator<String> {
        private Node current;
        private Node prevprev = null;
        private Node previous = null;
        public Iterator(){
            current = Queue.this.first;
        }
        public String next(){
            prevprev = previous;
            previous = current;
            String returning = current.string;
            current = current.next;
            return returning;
        }
        public boolean hasNext(){
            return current != null;
        }
        public void remove(){
            if(previous == null){ // cant remove after another removal or if no next was called
                throw new IllegalStateException();
            } else {
                Queue outer = Queue.this;
                if(previous == outer.first){ // if previous is first
                    outer.remove();
                } else{ // otherwise
                    prevprev.next = previous.next;
                    if(previous == outer.last){
                        outer.last = prevprev;
                    }
                    outer.size -= 1;
                }
                previous = null;
            }
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
        size += 1;
    }
    public String remove(){
        final String removing;
        if(first != null){
            removing = first.string;
            first = first.next;
            if(first == null){
                last = null;
            }
            size -= 1;
        } else{
            removing = null;
        }
        return removing;
    }
    public Iterator iterator(){
        return new Iterator();
    }
    public int getSize(){
        return size;
    }
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        Iterator iterator = iterator();
        while(iterator.hasNext()){
            stringBuilder.append(iterator.next());
            if(iterator.hasNext()){
                stringBuilder.append(',');
            }
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println("removed: " + queue.remove());
        queue.add("first");
        queue.add("second");
        queue.add("third");
        System.out.println("removed: " + queue.remove());
        queue.add("fourth");

        System.out.println("First iteration: " + queue + ", size: " + queue.getSize());

        Queue.Iterator iterator = queue.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals("fourth")){
                iterator.remove();
            }
        }

        System.out.println("Removing \"fourth\":" + queue + ", size: " + queue.getSize());

        for(int i = 0;i < 15;++i){
            queue.add(i + "");
        }

        System.out.println("Second iteration: " + queue + ", size: " + queue.getSize());

        iterator = queue.iterator();
        while(iterator.hasNext()){
            String prevString = iterator.next();
            if(prevString.equals("0") || prevString.equals("14") || prevString.equals("4")){
                iterator.remove();
            }
        }

        System.out.println("After deletion [0,4,14]: " + queue + ", size: " + queue.getSize());
    }
}
