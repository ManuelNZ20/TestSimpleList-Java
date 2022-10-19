package com.navarroze.simplelist;

public class SimpleList {

    private Node start;
    private Node end;

    public SimpleList() {
        start = end = null;
    }

    public boolean isEmpty() {
        return start == null;
    }
    
    public void addStart(int date){
        if (isEmpty()) {
            start = end = new Node(date);
        }else{
            Node newnode = new Node(date);
            newnode.setNext(start);
            start = newnode;
        }
    }
    
    public void addEnd(int date){
        if (isEmpty()) {
            start = end = new Node(date);
        }else{
            end.setNext(new Node(date));
            end = end.getNext();
        }
    }

    public String listSimple() {
        String list = "";
        for (Node n = start; n != null;) {
            list += (n.getNext() != null) ? n.getDate() + " - " : n.getDate();
            n = n.getNext();
        }
        return list;
    }

}
