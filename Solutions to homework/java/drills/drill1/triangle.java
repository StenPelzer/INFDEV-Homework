package drills.drill1;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args)  {
        System.out.print("Enter a small number: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String result = "";

        for(int i=0; i < number; i++){
            for(int j=0; j < number; j++) {
                if(i < number-j) {
                    result += "*";
                }
            }
            result += "\n";
        }

        System.out.println(result);
    }
}
