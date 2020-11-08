package HomeWork6_1;

import java.util.Scanner;

import javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction;

public class CalTest {
	public static void main(String[] args) {
		Calculator number = new Calculator();
		private int a=0;
		private String master=null;
		private String whoareu=null;
		
		while (true) {
			try {
				Scanner input = new Scanner(System.in);
				System.out.println("請輸入x的值");
				number.setX(input.nextInt());
				System.out.println("請輸入y的值");
				number.setY(input.nextInt());
				double sum = number.getSquare();
				System.out.println(number.getX() + "的" + number.getY() + "次方,答案為=" + sum);
				break;
			} catch (CallException e) {
				System.out.println(e.toString());
				System.out.println("請重新輸入");
			} catch (Exception e) {
				System.out.println("輸入格式錯誤");
				System.out.println("請重新輸入");
			}
		}
	}
}
