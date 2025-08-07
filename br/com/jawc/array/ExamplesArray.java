/**
 * @author jawc
 */

package br.com.jawc.array;

public class ExamplesArray {

    public static void main(String[] args) {

        declararArray();
        tamanhoArray();
        percorrendoArray1();
        percorrendoArray2();
    }

    private static void declararArray(){
        System.out.println("*****declaraçãoArray*****");
        int [] a = new int[4];

        int[] b;
        b = new int[10];
        int[] c = new int[44], k = new int[22];

        int[] inicialValores = {8,15,22,44,56,68,71,20,3};

        int[] meuArray;

        meuArray = new int[10];
        meuArray[0] = 1;
        meuArray[1] = 2;
        meuArray[2] = 3;
        meuArray[3] = 4;
        meuArray[4] = 23;
        meuArray[5] = 30;
        meuArray[6] = 12;
        meuArray[7] = 22;
        meuArray[8] = 21;
        meuArray[9] = 23;

        System.out.println(meuArray[0]);
        System.out.println(meuArray[9]);
    }

    public static void tamanhoArray(){
        System.out.println("*****tamanhoArray*****");
        int [] arrayUm = {1,2,3,8,345,2123,4,325,25,};
        int [] arrayDois = {4,5,6,7,4,122435};

        if (arrayDois.length > 8){
            System.out.println("Tamanho do ArrayDois: Maior que 8!");
        }else{
            System.out.println("Tamanho do ArrayDois: Menor ou Igual a 8!");
        }
        System.out.println("Tamanho do ArrayUm: "+arrayUm.length);
    }

    public static void percorrendoArray1(){
        System.out.println("*****percorrendoArray1*****");
        int [] array1 = {1,2,3,8,345,2123,4};
        int total = 0;

        for (int i : array1){
            total += i;
        }

        System.out.println("Total da Array: "+total);
    }

    public static void percorrendoArray2(){
        System.out.println("*****percorrendoArray2*****");
        int [] array2 = {1,2,3,8,345,2123,4};
        for ( int i = 0; i < array2.length; i++){
            System.out.println(array2[i]);
        }
    }
}
