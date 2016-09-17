/**
 * 
 */
package Ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Test160815
 * 
 * @author Joanne
 * @date 20162016年9月17日下午11:09:27
 * @version Test160815
 * @parameter
 * @return
 * @see reference
 */
public class CheckGoodsElseIfLast {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO 利用else補足其餘額的狀況
		System.out.println("請輸入目前所餘庫存量(單位:箱)");
		System.out.print("→");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 為輸入資料加上的程式
		String str = br.readLine();// 取得輸入資料
		int box = Integer.parseInt(str);// 將輸入資料轉成整數,

		if (box < 20) {
			System.out.println("存貨不足，該去備貨!");
		} else if (box < 100) {
			System.out.println("存貨尚足，提醒您注意存貨量!");
		} else {
			// 前面兩個條件都不成立的話，另外第一個條件一定是最嚴格的，而最後一個else是最寬鬆的，這樣程式才不會錯
			System.out.println("存貨充足，請安心!");
		}
		System.out.println("祝您生意興隆!");
	}

}
