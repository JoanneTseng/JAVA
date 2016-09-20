/**
 * 
 */
package Ch06_1;

/**
 * Test160815
 * 
 * @author Joanne
 * @date 20162016年9月20日下午2:37:01
 * @version Test160815
 * @parameter
 * @return
 * @see reference
 */
public class PartOf9x9 {

	/**
	 * 只輸出部分99乘法表內容，只輸出成績小於或等於60的內容
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 只輸出部分99乘法表內容,只輸出成績小於或等於30的內容
		// 宣告九九乘法表會需要用到的變數x,y以及相乘後的結果p
		int x, y, p = 0;
		// (外圈)從x=1開始執行for 迴圈
		outloop: for (x = 1; x <= 9; x++) {// 加上標籤名稱，outloop是自訂的標籤名稱
			// (內圈)從y=1開始執行for迴圈
			for (y = 1; y <= 9; y++) {
				p = x * y;
				if (p > 30) {
					System.out.print("\n");// 換行
					continue outloop;// 終止這一輪的outloop，跳回上面繼續執行下一輪
				}
				System.out.print(x + "*" + y + "=" + p + "\t");// 平移一格

			}
			System.out.println();//不寫的話，不會超過30的迴圈不會換行
		}

	}

}
