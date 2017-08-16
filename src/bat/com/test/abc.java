package bat.com.test;

public class abc {
	//将二进制字符串转换成int数组
	  public static int[] BinstrToIntArray(String binStr) {    
	    char[] temp=binStr.toCharArray();
	    int[] result=new int[temp.length];  
	    for(int i=0;i<temp.length;i++) {
	      result[i]=temp[i]-48;
	    }
	    return result;
	  }
	   
	  //将二进制转换成字符
	   public static char BinstrToChar(String binStr){
	     int[] temp=BinstrToIntArray(binStr);
	     int sum=0;
	     for(int i=0; i<temp.length;i++){
	       sum +=temp[temp.length-1-i]<<i;
	     }  
	     return (char)sum;
	  }
	  
	  public static void main(String[] args) {
		/*   	String binStr = Integer.toBinaryString(Integer.valueOf("\\346\\234\235\344\273\223\344\270\200\345\244\252\351\203\216",8));
		    String binStr = "111001110001011 1001011011101010";
		   	System.out.println(binStr);
		    String[] tempStr=binStr.split(" ");
		    char[] tempChar=new char[tempStr.length];
		    for(int i=0;i<tempStr.length;i++) {
		      tempChar[i]=BinstrToChar(tempStr[i]);
		    }
		    System.out.println(String.valueOf(tempChar));*/
	}
}
