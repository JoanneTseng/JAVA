/**
 * 
 */
package Ch05_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Test160815
 * 
 * @author Joanne
 * @date 20162016年9月17日下午11:43:02
 * @version Test160815
 * @parameter
 * @return
 * @see reference
 */
public class FoodMoney2 {

	/**
	 * 使用default處理非點餐選項的情況
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO 使用default處理非點餐選項的情況
		System.out.println("請選擇:1.義大利麵2.燉飯3.甜品4.湯品");
		System.out.print("→");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 為輸入資料加上的程式
		String str = br.readLine();// 取得輸入資料
		int food = Integer.parseInt(str);// 將輸入資料轉成整數,

		switch (food) { // ()內一定要放char, byte, short, int的型態
		case 1:// 沒有寫的話，是與case 2相同價格

		case 2:
			System.out.println("您的餐點220元");
			break;
		case 3:
			System.out.println("您的餐點60元");
			break;
		case 4:
			System.out.println("您的餐點40元");
			break;
		default:// 其他狀況
			System.out.println("您並未選擇正確的餐點喔");
		}
	}

}
