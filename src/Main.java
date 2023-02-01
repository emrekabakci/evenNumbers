import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int input, total = 0, total2 = 0, average;
    Scanner inp = new Scanner(System.in);

        System.out.print("Please enter the number :");
    input = inp.nextInt();
        System.out.println("Divisible by 3 ");
    for (int i = 1; i <= input; i++){
        if (i % 3 == 0){
            total += i;
            System.out.println(i);
        }
    }
        System.out.println();
        System.out.println("Total :" + total);

        System.out.println("Divisible by 4 ");
        for (int i = 1; i <= input; i++){
            if (i % 4 == 0){
                total2 += i;
                System.out.println(i);
            }
        }
        System.out.println();
        System.out.println("Total :" + total2);

    average = (total + total2) / input;
        System.out.println("Average is:" + average);

    }
}