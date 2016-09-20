/**
 * 
 */
package Ch07_1;

/**
 * Test160815
 * 
 * @author Joanne
 * @date 20162016年9月20日下午3:46:55
 * @version Test160815
 * @parameter
 * @return
 * @see reference
 */
public class MultiArrayInit {

	/**
	 * 宣告同時設定多維陣列(ex:2*4陣列),要印出陣列每一個數值
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 宣告同時設定多維陣列(ex:2*4陣列),要印出陣列每一個數值
		// 直接設定與配置陣列
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };// 兩個[][]代表二維
		System.out.println("a共有" + a.length + "個元素。");

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i+ "]共有" + a[i].length + "個元素");

			for (int j = 0; j < a[i].length; j++) {
				System.out.println("a[" + i + "][" + j + "]" + a[i][j]);
			}
		}
	}

}
