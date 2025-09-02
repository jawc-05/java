/**
 * @author jawc
 */
package br.com.jawc.patterns.gof.abstractFactory;

public class CarFactory extends Factory {


    @Override
    Car retrieveCar(String requestGrade) {
        switch (requestGrade) {
            case "A":
                return new Volkswagem(175, "full", "blue");
            case "B":
                return new Toyota(435, "full", "blue");
            default:
                System.out.println("The requested car was unfotunately not available.");
                return null;
        }
    }
}
