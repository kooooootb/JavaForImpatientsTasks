package ch2.extra;

public class Queue implements Iterable<String> {
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
        private Node current;
        private Node previous = null;
        public Iterator(){
            current = Queue.this.first;
        }
        public String next(){
            previous = current;
            String returning = current.string;
            current = current.next;
            return returning;
        }
        public boolean hasNext(){
            return current != null;
        }
        public void remove(){
            if(previous == null){ // current is first node in queue
                if(Queue.this.first != null){
                    if(Queue.this.first == Queue.this.last){
                        Queue.this.first = null;
                        Queue.this.last = null;
                        current = null;
                    } else {
                        Queue.this.first = Queue.this.first.next;
                        current = Queue.this.first;
                    }
                }
            } else if(current != null){ // not after-last not first
                current = current.next;
                previous.next = current;
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
    }
    public String remove(){
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
    public Iterator iterator(){
        return new Iterator();
    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println("removed: " + queue.remove());
        queue.add("first");
        queue.add("second");
        queue.add("third");
        System.out.println("removed: " + queue.remove());
        queue.add("fourth");

        System.out.println("First iteration: ");
        for(String str : queue) {
            System.out.print(str + " ");
        }
        System.out.println();

        System.out.println("Removing");
        Queue.Iterator iterator = queue.iterator();
        while(iterator.hasNext()){
            iterator.remove();
        }

        System.out.println("Left: " + queue.remove());

        for(int i = 0;i < 15;++i){
            queue.add(i + "");
        }

        System.out.println("second iteration: ");
        for(String str : queue){
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
