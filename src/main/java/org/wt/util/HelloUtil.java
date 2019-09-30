package org.wt.util;

public class HelloUtil {
    public static String sayHello(String name){
        return "hello " + name;
    }

    public static String hi(){
        SqlUtil.javaType("bigint");
        return "hi";
    }

    public static void main(String[] args) {
        hi();
    }
}
