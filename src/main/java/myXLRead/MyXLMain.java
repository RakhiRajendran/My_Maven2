package myXLRead;

import java.io.IOException;

public class MyXLMain {

	public static void main(String[] args) throws IOException {
		String value1 = MyCode.stringDataRead(0, 1);
		System.out.println(value1);
		String value2 = MyCode.integerDataRead(1, 0);
		System.out.println(value2);
	}

}
