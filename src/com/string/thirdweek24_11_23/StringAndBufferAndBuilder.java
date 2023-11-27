package com.string.thirdweek24_11_23;

public class StringAndBufferAndBuilder 
{
	private String string;
    private StringBuffer stringBuffer;
    private StringBuilder stringBuilder;

    // Constructor
    public  StringAndBufferAndBuilder() {
        this.string = "";
        this.stringBuffer = new StringBuffer();
        this.stringBuilder = new StringBuilder();
    }

    // Methods for String
    public void appendString(String str) {
        this.string += str;
    }

    public String getString() {
        return this.string;
    }

    // Methods for StringBuffer
    public void appendBuffer(String str) {
        this.stringBuffer.append(str);
    }

    public String getBuffer() {
        return this.stringBuffer.toString();
    }

    // Methods for StringBuilder
    public void appendBuilder(String str) {
        this.stringBuilder.append(str);
    }

    public String getBuilder() {
        return this.stringBuilder.toString();
    }

    public static void main(String[] args) {
    	StringAndBufferAndBuilder customString = new StringAndBufferAndBuilder();

        // String operations
        customString.appendString("Hello ");
        customString.appendString("World");
        System.out.println("String Result: " + customString.getString());

        // StringBuffer operations
        customString.appendBuffer("Hello ");
        customString.appendBuffer("World");
        System.out.println("StringBuffer Result: " + customString.getBuffer());

        // StringBuilder operations
        customString.appendBuilder("Hello ");
        customString.appendBuilder("World");
        System.out.println("StringBuilder Result: " + customString.getBuilder());
    }

}
