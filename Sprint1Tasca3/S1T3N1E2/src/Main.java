import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(10);
        myList.add(22);
        myList.add(35);
        myList.add(44);
        myList.add(88);

        ArrayList<Integer> invertList = new ArrayList<Integer>();

        ListIterator<Integer> it = myList.listIterator(myList.size());

        while (it.hasPrevious()) {
            invertList.add(it.previous());
        }

        for (Integer i : invertList) {
            System.out.println(i);
        }


    }
}