/**
 * @author jawc
 */
package br.com.jawc.switchcase;
import java.util.Scanner;

public class ExampleAnimal {

    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);

        System.out.println("Digite o nome de um animal: ");
        String text = s.next();
        String animal = exampleOfSwitchCase(text);
        System.out.println(animal);
    }

    public static String exampleOfSwitchCase(String animal){
        String result;
        switch (animal){
            case "DOG":
            case "CAT":
                result = "Domestic Animal";
                break;
            case "TIGER":
                result = "Wild Animal";
                break;
            default:
                result = "unknow animal";
                break;
        }
        return result;
    }
}

