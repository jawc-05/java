/**
 * @author jawc
 */
package br.com.jawc;

public class Operadores {

    public static void main (String args[]){
        operacoesAritmeticas();
        operacoesAtribuicoes();
        operacoesIncrementais();
        operadoresRelacionais();
        operadoresLogicos();
}

    private static void operadoresLogicos() {
        int num1 = 10;
        //1..10
        boolean isInside10 = num1>=1 && num1<=10;
        System.out.println("isInside" + isInside10);

        boolean isInsideOr10 = num1>=1 || num1<=10;
        System.out.println("isInsideOr" + isInsideOr10);

        boolean isNot10 = num1 >= 10 || num1 <= 10;
        System.out.println("isNot" + !isNot10);

        //1..20
        boolean isInside20 = num1>=1 && num1<=20;
        System.out.println("isInside" + isInside20);

        //1..9
        boolean isInside9 = num1>=1 && num1<=9;
        System.out.println("isInside" + isInside9);

    }


    private static void operacoesAritmeticas() {
    System.out.println("*** Operações Aritmeticas ***");
    int num1 = 10;
    int num2 = 20;
    int num3 = 30;

    int num4 = num1 + num2;
    int num5 = num4 - num1;
    int num6 = num3 * num5;

    System.out.println(num4);
    System.out.println(num5);
    System.out.println(num6);
}

private static void operadoresRelacionais() {
    System.out.println("*** Operações Relacionais ***");
    int num1 = 10;
    int num2 = 10;
    boolean isHigher = num1 > num2;
    System.out.println(isHigher);

    boolean isEqual = num1 == num2;
    System.out.println(isEqual);

    boolean isDiff = num1 != num2;
    System.out.println(isDiff);

    boolean isHigherOrEqual = num1 >= num2;
    System.out.println(isHigherOrEqual);

    boolean isLower = num1 < num2;
    System.out.println(isLower);

}

public static void operacoesIncrementais(){
    System.out.println("*** Operações Incrementais ***");

    int num1 = 10;
    System.out.println(num1);

    num1++;
    System.out.println(num1);

    num1--;
    System.out.println(num1);
}

public static void operacoesAtribuicoes(){
    System.out.println("*** Operações Atribuicoes ***");
    int num1 = 10;
    int num2 = 20;
    int num3 = num1 + num2;
    System.out.println(num3);
    num3 += num3;
    int num4 = num3 + 30;
    System.out.println(num4);
}

}
