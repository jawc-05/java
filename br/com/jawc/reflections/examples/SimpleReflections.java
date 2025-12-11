/**
 * @author jawc-05
 */
package br.com.jawc.reflections.examples;

public class SimpleReflections {

    public static void main(String[] args) throws ClassNotFoundException {
        executeClass();

    }

    private static void executeClass() throws ClassNotFoundException {
        System.out.println("----CLASSES----");
        Class c1 = boolean.class;
        System.out.println(c1);

        Class c2 = int.class;
        System.out.println(c2);

        Class c3 = java.io.PrintStream.class;
        System.out.println(c3);

        Class c4 = Class.forName("java.lang.String");
        System.out.println(c4);

        System.out.println(SimpleReflections.class);
        System.out.println(SimpleReflections.class.getSimpleName());
        System.out.println(SimpleReflections.class.getName());
    }
}