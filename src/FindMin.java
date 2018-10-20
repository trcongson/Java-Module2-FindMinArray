import java.util.Random;
import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        int size;
        int [] array;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size in array: ");
        size = sc.nextInt();

        array = new int[size];
        for (int i = 0; i<array.length;i++){
            array[i] = random.nextInt(50);
        }

        System.out.println("Print array: ");
        for (int num: array){
            System.out.println(num + "\t");
        }

        int min = array[0];
        int index = 0;
        for (int i = 0; i<array.length;i++){
            if (min>array[i]){
                min = array[i];
                index = i;
            }
        }
        System.out.println("Array min: " + min + " in " + index );
    }
}
