
import java.util.LinkedList;

public class aw_92_linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l2.add(20);
        l2.add(90);
        l2.add(50);
        l2.add(270);

        l1.add(6);
        l1.add(7);
        l1.add(2);
        l1.add(9);
        l1.add(0,3);
        l1.add(0,10);
        l1.addAll(l2);

        l1.addFirst(100000);
        l1.addLast(275);

        System.out.println(l1.contains(270));
        System.out.println(l1.contains(27));

        System.out.println("The index of given object is: " + l1.indexOf(270));

        l1.set(2,201);



        //l1.clear();

        for (int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(",");
        }
    }
}
