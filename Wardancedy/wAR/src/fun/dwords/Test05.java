package fun.dwords;

import java.io.IOException;

public class Test05 {
 
	    public void test(int a,int b)throws IOException,ArrayIndexOutOfBoundsException{  
	        int c=a/b;  
	        if(b==0){  
	            throw new ArithmeticException();  
	        }  
	    }  
	}  

