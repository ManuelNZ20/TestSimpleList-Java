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

    public void addStart(int date) {
        if (isEmpty()) {
            start = end = new Node(date);
        } else {
            Node newnode = new Node(date);
            newnode.setNext(start);
            start = newnode;
        }
    }

    public void addEnd(int date) {
        if (isEmpty()) {
            start = end = new Node(date);
        } else {
            end.setNext(new Node(date));
            end = end.getNext();
        }
    }

    public void removeStart() {
        if (start == end) {
            start = end = null;
        } else {
            Node tmp = start;
            start = start.getNext();
            tmp.setNext(null);
        }
    }

    public void removeEnd() {
        if (start == end) {
            start = end = null;
        } else {
            Node previous = null;
            for (Node n = start; n != end;) {
                previous = n;
                n = n.getNext();
            }
            end = previous;
            end.setNext(null);
        }
    }

    public void remove(int date) {
        Node current = start, previous = null, aux = null;
        while (current != null) {
            if (current.getDate() == date) {
                if (previous == null) {
                    if (start == end) {
                        start = end = null;
                    } else {
                        aux = start;
                        start = start.getNext();
                        current = start;
                    }
                } else {
                    if (current == end) {
                        aux = end;
                        previous.setNext(null);
                        end = previous;
                        aux.setNext(null);
                    }else{
                        aux = current;
                        current = current.getNext();
                        previous.setNext(current);
                        aux.setNext(null);
                    }
                }
            } else {
                previous = current;
                current = current.getNext();
            }
        }
    }

    public Node search(int date) {
        for (Node i = start; i != null; i = i.getNext()) {
            if (i.getDate() == date) {
                return i;
            }
        }
        return null;
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
