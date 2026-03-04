/**
 * @author jawc-05
 */
package br.com.jawc.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) {
        Class pClass = Produto.class;

        System.out.println(pClass);

        Produto prod = new Produto();
        Class pClass2 = prod.getClass();
        System.out.println(pClass2);

        try{
            Constructor cons = pClass.getConstructor();
            Produto prod1 = (Produto) cons.newInstance();
            System.out.println(cons);
            System.out.println(prod1);

            Field[] fields = prod1.getClass().getDeclaredFields();
            for (Field field : fields){
                Class<?> typeF = field.getType();
                String nameF = field.getName();
                System.out.println(typeF);
                System.out.println(nameF);
            }


        }catch(NoSuchMethodException|InvocationTargetException| InstantiationException| IllegalAccessException e){
            e.printStackTrace();
}
    }
}