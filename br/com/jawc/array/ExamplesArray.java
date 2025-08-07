/**
 * @author jawc
 */

package br.com.jawc.array;

public class ExamplesArray {

    public static void main(String[] args) {
        declararArray();
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
}
