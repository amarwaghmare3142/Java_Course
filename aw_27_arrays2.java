public class aw_27_arrays2 {
    public static void main(String[] args) {
        int [] marks = {100,43,93,87,65,86};
        System.out.println(marks.length);
        System.out.println(marks[2]);
        System.out.println("Printing using for loop");
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]);
            System.out.print(" ");
        }

        //Quick quiz
        //Display above list in reverse order
        for(int i=marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }

    // For each loop array
        System.out.println("For each loop");
        for(int element:marks){
            System.out.println(element);
        }


    }
}
