package com.bridgelabz;

public class MaxInteger {
	
    /*public static float a;
    public static float b;
    public static float c;
    public MaxInteger(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }*/
    public static int testMax(Integer a, Integer b, Integer c){
        Integer max = a;
        if (b.compareTo(max)>0) {
            max = b;
        }
        if (c.compareTo(max)>0) {
            max = c;
        }
        return max;
    }



    public static String testMax(String a, String b, String c){
        String max = a;
        if (b.compareTo(max)>0) {
            max = b;
        }
        if (c.compareTo(max)>0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {

        Integer x = 123,y = 34, z = 54;
        System.out.println("Maximum Integer value is");
        System.out.println(testMax(x,y,z));

        String xs = "Apple", ys = "Peach", zs = "Banana";
        System.out.println("Maximum String value is");
        System.out.println(testMax(xs,ys,zs));

    }
}



