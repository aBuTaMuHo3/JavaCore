package net.volgatech.javacore2017;
public class PasswordGenerator {
    public static void main(String []args) {
        if (args.length != 2) {
            System.out.println("Incorrect parameter count");
            return;
        }
        int length = Integer.parseInt(args[0]);
        if (length < 0) {
            System.out.println("Incorrect length parameter");
            return;
        }
        int symbolsLength;
        String symbols, password = "";
        symbols = args[1];
        symbolsLength = symbols.length();
        for(int i = 0; i < length; ++i){
            int index =(int) (Math.random() * symbolsLength);
            password+=symbols.charAt(index);
        }
        System.out.println(password);
    }
}