package com.constru.thirdweek23_11_23;

public class StaticVariable {
	static int staticVar1;
    static String staticVar2;

    public StaticVariable(int value, String text) {
        initializeStaticVariables(value, text);
    }

    private static void initializeStaticVariables(int value, String text) {
        staticVar1 = value;
        staticVar2 = text;
    } public static void main(String[] args) {
        StaticVariable instance = new StaticVariable(42, "Hello, World!");

        System.out.println("StaticVar1: " + staticVar1);
        System.out.println("StaticVar2: " + staticVar2);
	}
}
