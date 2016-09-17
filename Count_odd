/**
 * 
 */
package Ch06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Test160815
 * 
 * @author Joanne
 * @date 20162016年9月17日下午10:14:14
 * @version Test160815
 * @parameter
 * @return
 * @see reference
 */
public class Count_odd {

	/**
	 * 計算在某範圍內所有奇數和
	 * @param 
	 */

	public static void main(String[] args) throws IOException {
		// 讓使用者可以輸入資料的main，為輸入資料加上的程式

		int sum = 0, range; // 宣告累加值sum及計算範圍range

		System.out.println("請輸入想要計算的奇數和範圍(結尾數值)");
		System.out.print("→");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 為輸入資料加上的程式

		String str = br.readLine();// 取得輸入資料
		range = Integer.parseInt(str);// 將輸入資料轉成整數, 因為前面有宣告參數int range 所以不需要在這裡再加一次int

		for (int i = 1; i <= range; i += 2) {
			sum += i;
		}

		System.out.println("1到" + range + "所有奇數和為" + sum);

	}

}
