package com.eoe.sel.day05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 编写程序验证4位16进制数，
 * 并将符合条件的打印出来 (解法1)
 * 
 * @author yw
 * 
 */
public class Test03 {
	public static void main(String[] args) {
			String [] data={"0x55ff","0X78ad","0x32ah","0x7ff1"};
			String regex="0[xX][\\da-fA-F]{4}";
			Pattern p=Pattern.compile(regex);
			for (int i = 0; i < data.length; i++) {
				Matcher m=p.matcher(data[i]);
				if(m.find()){
					System.out.println(m.group());
				}
			}
	}
}
