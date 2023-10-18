
class MyEmployee1{
    private int id;
    private String name;

    public MyEmployee1() {
        id = 45;
        name = "Ganpati Bappa Morya";
    }

    //public MyEmployee1(String myName , int myId){
    //    id=myId;
    //    name=myName;
    //}
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
}

public class aw_42_constructors {
    public static void main(String[] args) {
        MyEmployee1 amar = new MyEmployee1();
    //    MyEmployee1 amar = new MyEmployee1("Amar Waghmare", 21);     [[constructor overloadind concept]]


        System.out.println(amar.getId());
        System.out.println(amar.getName());

    }
}
