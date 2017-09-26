package net.volgatech.javacore2017;
public class TypesTable {
    public static void main(String [] args) {
        System.out.printf("%-10s|%25s|%25s|%2s%n", "Type", "Min", "Max", "Size");
        System.out.printf("%-10s|%25d|%25d|%2d%n", "Long", Long.MIN_VALUE, Long.MAX_VALUE, Long.SIZE);
        System.out.printf("%-10s|%25d|%25d|%2d%n", "Integer", Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.SIZE);
        System.out.printf("%-10s|%25d|%25d|%2d%n", "Short", Short.MIN_VALUE, Short.MAX_VALUE, Short.SIZE);
        System.out.printf("%-10s|%25d|%25d|%2d%n", "Byte", Byte.MIN_VALUE, Byte.MAX_VALUE, Byte.SIZE);
        //System.out.printf("%-10s|%25f|%25f|%2d%n", "double", -Double.MAX_VALUE, Double.MAX_VALUE, Double.SIZE);
        System.out.printf("%-10s|%25f|%25f|%2d%n", "Float", Float.MIN_VALUE, Float.MAX_VALUE, Float.SIZE);
        System.out.printf("%-10s|%25c|%25c|%2d%n", "Char", Character.MIN_VALUE, Character.MAX_VALUE, Character.SIZE);
    }
}