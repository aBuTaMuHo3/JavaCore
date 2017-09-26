package net.volgatech.javacore2017;
public class CaesarCipher {
    public static void main(String []args) {
        if (args.length != 3) {
            System.out.println("Incorrect parameter count");
            return;
        }
        String type = args[0];        
        int offset = Integer.parseInt(args[1]);
        if (offset < 0) {
            System.out.println("Incorrect offset parameter (less than 0)");
            return;
        }
        String str = args[2];
        String result = "";
        if (type == "-e"){
            result = caesarCipher(str, offset);
        }
        else if(type == "-d"){
            result = caesarDecipher(str, offset);
        }
        else{
            System.out.println("Incorrect parameter");
            return ;
        }
        System.out.println(result);
    }
    private static String caesarCipher(String str, int offset) {
        int l = str.length();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String newString = "";
        for (int i = 0; i < l; ++i) {
            int index = str.indexOf(alphabet.charAt(i));
            index = (index - offset) % 26;
            newString += alphabet.charAt(index);
        }
        return newString;
    }
    private static String caesarDecipher(String str, int offset) {
        int l = str.length();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String newString = "";
        for (int i = 0; i < l; ++i) {
            int index = str.indexOf(alphabet.charAt(i));
            index = (index + offset) % 26;
            newString += alphabet.charAt(index);
        }
        return newString;   
    }
}