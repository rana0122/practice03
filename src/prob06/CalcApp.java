package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b;
		int result;
		String op;
		String s;
		
		while( true ) {
			/*  코드를 완성 합니다 */
			System.out.print(">> ");
			s=scanner.nextLine();
			String[]tokens = s.split(" ");
			
			a=Integer.parseInt(tokens[0]);
			b=Integer.parseInt(tokens[2]);
			op=tokens[1];

			System.out.print(">> ");			
			result =CalcApp.calculator(a,b,op);
			System.out.print(result);
			System.out.println();			
			System.out.println(">> quit");
	}
		
}
	public static int calculator(int a,int b,String op ){
		int result=0;
		Calculate c;

		
		switch(op){
			case "+" :c=new Add();
						c.setValue(a, b);
						result=c.calculate();
						break;
			case "-": c=new Sub();
						c.setValue(a, b);
						result=c.calculate();
						break;
			case "*":  c= new Mul();
					c.setValue(a, b);
						result=c.calculate();
						break;
			case "/":  c= new Div();
						c.setValue(a, b);
						result=c.calculate();
						break;
			default: break;
		}
		return result;
	}
}