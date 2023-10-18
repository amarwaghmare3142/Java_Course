public class aw_14_string_methods {
    public static void main(String[] args) {
        String name = "Killer";

        System.out.println(name.length());

        System.out.println(name.toLowerCase());

        System.out.println(name.toUpperCase());

        String name2 = "    Killer   ";
        System.out.println(name2.trim());

        System.out.println(name.substring(3));
        System.out.println(name.substring(2,5));

        System.out.println(name.replace("l","p"));

        System.out.println(name.startsWith("ki"));
        System.out.println(name.startsWith("Ki"));       //case sensitive

        System.out.println(name.endsWith("er"));

        System.out.println(name.charAt(4));

        String name3 = "Killeller";
        System.out.println(name3.indexOf("le"));
        System.out.println(name3.indexOf("le",5));

        System.out.println(name.lastIndexOf("e"));
        System.out.println(name.lastIndexOf("l",2));

        System.out.println(name.equals("killer"));
        System.out.println(name.equals("Killer"));     //case sensitive

        System.out.println(name.equalsIgnoreCase("KILLER"));

    //BACK SLASH

        System.out.println("I am Amar Rajendra Waghmare \nAP Nimbhore");



    }
}
