public class aw_15_problem_set {
    public static void main(String[] args) {

    //Problem 1
        String name = "Amar Rajendra Waghmare";
        name = name.toLowerCase();
        System.out.println(name);

    //Problem 2
        String name2 = "I am Amar Waghmare";
        name2 = name2.replace(" ","_");
        System.out.println(name2);

    // Problem 3
        String letter = "Dear name, Thanks a lot";
        letter = letter.replace("name","Amar");
        System.out.println(letter);

    //Problem 4
        String Amar = "Wish you very  very good    luck";
        System.out.println(Amar.indexOf("  "));
        System.out.println(Amar.indexOf("   "));

    //Problem 5
         String name3 = "Dear Amar,\n\tThis java course is Nice.\n\tThanks";
        System.out.println(name3);
    }
}
