package Section1;

import java.util.Scanner;

public class Code3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		String input = null;
		Scanner kb = new Scanner(System.in);
		System.out.print("Please type a string: ");

		input = kb.next();

		if (str.equals(input)) {
			System.out.println("Match");
		} else {
			System.out.println("Dont match ");
		}
		kb.close();
	}

}

//== �����ڴ� ������Ƽ�� Ÿ�Կ����� ��, �׷��� String���� �ȵ�.