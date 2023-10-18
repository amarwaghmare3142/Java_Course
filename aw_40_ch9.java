
class MyEmployee{
    private int id;
    private String name;
    public String  getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;                    // this. is not compulsary  (nahi lihil tri chalel)
    }
    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }
}
public class aw_40_ch9 {
    public static void main(String[] args) {
        MyEmployee amar = new MyEmployee();
        amar.setName("Amar Rajendra Waghmare");
        System.out.println(amar.getName());
        int id = 5;
        amar.setId(5);
        System.out.println(amar.getId());

    }
}
