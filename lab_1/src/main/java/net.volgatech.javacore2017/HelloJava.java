package net.volgatech.javacore2017;
public class HelloJava{
    public static void main(String []args){
        String str = "";
        str += System.getProperty("os.name") + " " + System.getProperty("os.version") + " " + System.getProperty("java.version") + " " + System.getProperty("java.home");
        System.out.println("Hello, Java from " + str);
    }
}