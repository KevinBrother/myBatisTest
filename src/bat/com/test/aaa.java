package bat.com.test;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class aaa {
	static String utfToString(byte[] data) {
		String str = null;
		try {
			str = new String(data, "utf-8");
		} catch (UnsupportedEncodingException e) {
			;
		}
		return str;

	}

	public static String convert(String str) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < str.length(); i++) {
			System.out.println(i + "+++++++++" + (int)str.charAt(i));
			list.add((int) str.charAt(i));
		}
		System.out.println(list);
		byte[] b = new byte[list.size()];
		for (int i = 0; i < list.size(); i++)
			b[i] = list.get(i).byteValue();
		return utfToString(b);
	}

	public static void main(String[] args) {
		System.out.println(convert("\346\234\235\344\273\223\344\270\200\345\244\252\351\203\216"));
	}
	
}
