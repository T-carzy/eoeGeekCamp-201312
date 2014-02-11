
public class Filesize {
private static final byte BYTE=1;
private static final byte KB=2;
private static final byte MB=4;
private static final byte GB=8;
//private static final int KB_=1024;
//private static final int MB_=1024*1024;
//private static final int GB_= 1024*1024*1024;
public static void main(String[] args) {
	double size=512;
	System.out.println("file size="+fileSize(size,BYTE|KB|MB|GB));
	//size=10*1024;
//	System.out.println("file size="+fileSize(size,BYTE|KB|MB));
//	size=1024*1024*5;
//	System.out.println("file size="+fileSize(size,BYTE|KB|GB));
//	size=1024*1024*1024*5;
//	System.out.println("file size="+fileSize(size,GB));
}
private static String fileSize(double size, int mode) {
	String result=null;
	//最大单位GB
	if(mode==(BYTE|KB|MB|GB)){
		if(size<1024){
			return size+"Byte";
		}else if(size<1024*1024){
			return size/1024+"KB";
			
		}else if(size<1024*1024*1024){
			return size/1024*1024+"MB";
		}else{
			return size/1024*1024*1024+"GB";
		}
	}
	return result;
}
}
