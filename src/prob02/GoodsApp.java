package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 상품 정보 담을 배열 생성
		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
			for(int i =0;i<COUNT_GOODS;i++){
				String info= scanner.nextLine();
				String[]tokens=info.split(" ");
				
				String name= tokens[0];
				int price = Integer.parseInt(tokens[1]);
				int countStock = Integer.parseInt(tokens[2]);
				
				goods[i]= new Goods(name,price,countStock);
			}
		
		//상품 정보 출력

		for(Goods g: goods){
			g.showGoods();
		}
		// 자원정리
		scanner.close();
	}
}
