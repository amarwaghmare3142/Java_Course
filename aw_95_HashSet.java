import java.util.HashSet;

public class aw_95_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>(6,0.5f);
        h1.add(22);
        h1.add(75);
        h1.add(35);
        h1.add(55);
        h1.add(57);
        h1.add(522);
        h1.add(555);
        h1.add(57);

        System.out.println(h1);
        System.out.println(h1.size());
    }
}
