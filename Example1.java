package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example1 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add("Home");
        al.add("Street");
        al.add("City");
        al.add("State");
        al.add("ZIP");

        System.out.println("Content of the al ");
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            Object element = itr.next();
            System.out.println(element + " ");
        }

        //modify objects being iterated
        ListIterator litr = al.listIterator();
        while(litr.hasNext()){
            Object element = litr.next();
            litr.set(element + " + ");
            }

        System.out.println("Modified content of al ");
        itr = al.iterator();
        while(itr.hasNext()){
            Object element = itr.next();
            System.out.println(element + " + ");
        }

        //Display the list backwards
        System.out.println("Modified list backwards ");
        while(litr.hasPrevious()){
            Object element = litr.previous();
            System.out.println(element + " + ");
        }
    }
}
