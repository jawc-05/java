/**
 * @author jawc
 */
package br.com.jawc.patterns.gof.abstractFactory;

public class CompanyCarFactory extends Factory{

    @Override
    Car retrieveCar(String requestGrade) {
        switch (requestGrade) {
            case "A":
                return new Tesla(1000, "full", "blue");
            case "B":
                return new Audi(800, "full", "red");
            default:
                System.out.println("The requested car was unfotunately not available.");
                return null;
        }
    }
}
