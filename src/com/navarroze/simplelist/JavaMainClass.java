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
        Node d;
        final int sdate = 11;
        if ((d = simpleList.search(sdate))!=null) {
            System.out.println("El n° "+d.getDate()+" que esta buscando si existe en la lista");
        }else{
            System.out.println("El n° "+sdate+" no se encuentra en la lista");
        }
        simpleList.removeStart();//eliminar el primer nodo de la lista
        simpleList.removeEnd();//eliminar el ultimo nodo de la lista
        System.out.println("List\n"
                + simpleList.listSimple());
        simpleList.addStart(1);
        simpleList.addStart(2);
        simpleList.addStart(3);
        simpleList.addStart(4);
        simpleList.addStart(5);
        simpleList.addEnd(5);
        simpleList.addEnd(7);
        simpleList.addEnd(8);
        simpleList.addEnd(5);
        System.out.println("List\n"
                + simpleList.listSimple());
        simpleList.remove(5);
        System.out.println("List\n"
                + simpleList.listSimple());
        
    }
    
}
