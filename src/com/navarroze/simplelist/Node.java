package com.navarroze.simplelist;

public class Node {
    private int date;
    private Node next;
    
    public Node(int date){
        this(date, null);
    }
    
    public Node(int date,Node next){
        this.date = date;
        this.next = next;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
}
