/**
 * @author jawc-05
 */
package br.com.jawc.reflections.examples;

public class SimpleReflections {

    public static void main(String[] args) {

    }

    private static void executeClass() throws ClassNotFoundException {
        System.out.println("----CLASSES----\n");
        Class c1 = boolean.class;
        System.out.println(c1);
    }
}