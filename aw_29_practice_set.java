public class aw_29_practice_set {
    public static void main(String[] args) {
        //Problem 1:


//        float[] marks = {54.6f, 76, 5f, 75.4f, 97.6f, 76.9f};
//        float sum = 0;
//        for (float element : marks) {
//            sum = sum + element;
//        }
//        System.out.println("The value of sum is: " + sum);
//
//    }

        // Problem 2:


//            int[] value = {43, 76, 64, 87, 54, 76};
//            int num = 64;
//            boolean isAnArray = false;
//            for (int element : value) {
//                if (num == element) {
//                    isAnArray = true;
//                    break;
//                }
//            }
//            if (isAnArray) {
//                System.out.println("The value is present in Array");
//            } else {
//                System.out.println("The vaule is not present in Array");
//            }

        //Problem 3:

//        float[] marks = {54.6f, 76.5f, 75.4f, 97.6f, 76.9f};
//        float sum = 0;
//            for (float element : marks) {
//                sum = sum + element;
//            }
//            System.out.println("The value of Average is: " + sum/marks.length);

        // Problem 4: matrices

//        System.out.println("Java program for adding two matrices are as following");
//        int [][] mat1 = {{1,2,3},
//                         {4,5,6}};
//        int [][] mat2 = {{2,6,13},
//                         {3,7,1}};
//        int [][] result = {{0,0,0},
//                           {0,0,0}};
//        for(int i=0; i<mat1.length; i++){
//            for(int j=0; j<mat1[i].length; j++){
//                result[i][j]=mat1[i][j]+mat2[i][j];
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.print("\n");
//        }

        // Problem no 5


//         int [] arr = {1,2,3,4,5,6,7,8,9};
//         int l = arr.length;
//         int n = Math.floorDiv(l,2);
//         int temp;
//         for(int i=0; i<n; i++){
//             temp=arr[i];
//             arr[i]=arr[l-i-1];
//             arr[l-i-1]=temp;
//         }
//         for(int element:arr){
//             System.out.print(element);
//             System.out.print(" ");
//         }

        // problem no 6:

//        int[] arr = {23, 656, 774, 768, 65, 87, 465};
//        int max = Integer.MIN_VALUE;
//        for (int element : arr) {
//            if (element > max) {
//                max = element;
//            }
//        }
//        System.out.println("The maximum value in the array is: " + max);


        // Problem no 7

        int[] arr = {68, 656, 774, 768, 65, 87, 465};
        int min = Integer.MAX_VALUE;
        for (int element : arr) {
            if (element < min) {
                min = element;
            }
        }
        System.out.println("The minimum value in the array is: " + min);

        // Problrm no 8:

//        int [] arr = {1,2,3,4,5,6,7};
//        boolean isSorted=true;
//        for(int i=0; i<arr.length-1; i++){
//            if(arr[i]>arr[i+1]){
//                isSorted=false;
//                break;
//            }
//        }
//        if(isSorted){
//            System.out.println("The Array is sorted");
//        }
//        else{
//            System.out.println("The array is not sorted");
//        }


    }
}



