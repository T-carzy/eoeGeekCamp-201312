package com.eoe.oop.day02;

import java.util.Scanner;

import javax.swing.text.StringContent;

public class Code06 {
static final int STRING_ACTION=1;
static final int STRINGBUILDER_ACTION=2;
static final int STRINGBUFFER_ACTION=3;
	public Code06() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("1-String连接字符串");
System.out.println("2-StringBilder连接字符串");
System.out.println("3-StringBuffer连接字符串");
int select=scanner.nextInt();
switch (select) {
case STRING_ACTION:
	stringConcat();
	break;
case STRINGBUILDER_ACTION:
stringBufferConcat();
break;
case STRINGBUFFER_ACTION:
	stringBufferConcat();
	break;

}
	}
private static void stringBufferConcat() {
StringBuffer sBuffer=new StringBuffer();
long start=System.currentTimeMillis();
for(int i=1;i<=500000;i++){
	sBuffer.append("a");
}
long end=System.currentTimeMillis();
System.out.println("cost time:"+(end-start)+"毫秒");
}
private void stringBuilderConcat() {
	StringBuilder sBuilder=new StringBuilder();
	long start=System.currentTimeMillis();
	for(int i=1;i<=500000;i++){
		sBuilder.append("a");
	}
long end=System.currentTimeMillis();
System.out.println("cost time:"+(end-start)+"毫秒");

}
private static void stringConcat() {
String s=" ";
long start=System.currentTimeMillis();
for(int i=1;i<=100000;i++){
	s+="a";
}
long end=System.currentTimeMillis();
System.out.println("cost time:"+(end-start)+"毫秒");

}
}
