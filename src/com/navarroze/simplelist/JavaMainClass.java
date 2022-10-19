package com.navarroze.simplelist;

/**
 * @author MANUEL
 */
public class JavaMainClass {

    public static void main(String[] args) {
        SimpleList simpleList = new SimpleList();
        simpleList.addStart(1);
        simpleList.addStart(2);
        simpleList.addStart(3);
        simpleList.addStart(4);
        simpleList.addStart(5);
        simpleList.addEnd(7);
        simpleList.addEnd(8);
        System.out.println("List\n"
                + simpleList.listSimple());
    }
    
}
