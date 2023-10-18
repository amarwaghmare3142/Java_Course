
interface sampleInterfaace{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterfaace{
    void meth3();
    void meth4();
}
class mySampleClass implements childSampleInterface{
    public void meth3(){
        System.out.println("Meth3");
    }
    public void meth4(){
        System.out.println("Meth4");
    }
    public void meth1(){
        System.out.println("Meth1");
    }
    public void meth2(){
        System.out.println("Meth2");
    }
}

public class aw_58_inheritanceIn_interface {
    public static void main(String[] args) {
        mySampleClass Amar = new mySampleClass();
        Amar.meth1();
        Amar.meth2();
        Amar.meth3();
        Amar.meth4();
    }
}
