import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App{

    public static void main (String[] args){

        int lengthArray;
        int[] arrayOfNumbers; // vai receber todos os números
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>(); // vai receber os números pares
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>(); // vai receber os números ímpares
        
        System.out.println("Quantos números você vai digitar?");
        try (Scanner input = new Scanner(System.in)) {
            lengthArray = input.nextInt();
            arrayOfNumbers = new int[lengthArray];

            for (int i = 0; i <= arrayOfNumbers.length-1; i++){

                System.out.println("Digite um número: ");
                arrayOfNumbers[i] = input.nextInt();

                if (arrayOfNumbers[i] % 2 == 0){
                    evenNumbers.add(arrayOfNumbers[i]);
                } else {
                    oddNumbers.add(arrayOfNumbers[i]);
                };

            }

            System.out.println("Os números digitados foram: " + Arrays.toString(arrayOfNumbers));
            System.out.println("Números pares: " + evenNumbers);
            System.out.println("Números ímpares: " + oddNumbers);
        }

    }
    
}