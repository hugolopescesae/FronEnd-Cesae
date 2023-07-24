import java.util.Scanner;

public class ex_07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size;
        int removedNumber;
        int count = 0;
        int index = 0;

        System.out.print("Insert the number of elements in the array: ");
        size = input.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Insert array["+i+"]: ");
            array[i] = input.nextInt();
        }

        System.out.print("Insert the number to remove: ");
        removedNumber = input.nextInt();

        for (int i = 0; i<array.length; i++) {
            if (array[i] == removedNumber) {
                count++;
            }
        }

        int[] newArray = new int[size-count];

        for (int i=0; i<array.length; i++) {
            if (array[i] != removedNumber) {
                newArray[index] = array[i];
                index++;
            }
        }

        if (newArray.length>0) {
            for (int i = 0; i < newArray.length; i++) {
                System.out.println(newArray[i]);
            }
        } else {
            System.out.println("Array is empty");
        }

    }

}
