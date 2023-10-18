import java.util.ArrayDeque;

public class aw_93_ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(9);
        ad1.add(5);
        ad1.add(6);
        ad1.add(2);
        ad1.add(99);

        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1);
    }
}
