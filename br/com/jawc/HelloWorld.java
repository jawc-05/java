package br.com.jawc;

public class HelloWorld{

    public static void main(String[] args){
        String ambiente = args[0];
        if(ambiente.equalsIgnoreCase("DEV")) {
            System.out.println("Executando em DEV");
        }else if(ambiente.equalsIgnoreCase("TEST")) {
            System.out.println("Executando em TEST");
        }else{
            System.out.println(ambiente);
        }
    }
}