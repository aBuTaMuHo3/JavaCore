package net.volgatech.javacore2017;
public class HelloJava {
    public static void main(String []args) {
        String str = "";
        for(int i = 0; i < args.length; ++i) {
            str += args[i] + " ";
        }
        str += "\n" + System.getProperty("os.name") +
            "\n" + System.getProperty("os.version") +
            "\n" + System.getProperty("java.version") +
            "\n" + System.getProperty("java.home");
        System.out.println("Hello, Java from " + str);
    }
}