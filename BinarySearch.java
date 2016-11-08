/**
 * 
 */
package Ch08_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Test160815
 * 
 * @author Joanne
 * @date 20162016年11月9日上午12:21:49
 * @version Test160815
 * @parameter
 * @return
 * @see reference
 */

class Searcher {
	int[] data;// 宣告一個無引數陣列
	int item;

	int search(int[] data, int item) {
		this.data = data;
		this.item = item;
		return binarySearch(0, data.length - 1);
	}

	int binarySearch(int low, int high) {
		if (low > high) {// 找不到。遞迴的結束式。
			return -1;
		}
		int middle = (low + high) / 2;// 取得中間元素索引
		if (item == data[middle]) {// 找到了
			return middle;
		} else if (item > data[middle]) {// 在右半邊
			return binarySearch(middle + 1, high);
		} else {
			// 在左半邊
			return binarySearch(low, middle - 1);
		}
	}
}

public class BinarySearch {

	/**
	 * 遞迴非常適合用來處理可以分解部分個別處理，再統合結果的問題
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO 以遞迴方式進行二分搜尋。Divide and Conquer
		Searcher a = new Searcher();// a是選告Searcher物件的參照。建立此物件在記憶體中的位置。

		System.out.print("請輸入要尋找的資料\n->");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int target = java.lang.Integer.parseInt(br.readLine());// 將字串轉換成int的方法

		int i = a.search(new int[] { 3, 5, 7, 8, 10, 34, 56 }, target);// 建立匿名陣列。將兩個引數傳遞給Searcher物件的參照
																		// a
																		// 的Search方法。
		if (i == -1) {
			System.out.println("找不到" + target);
		} else {
			System.out.println("在第" + i + "個元素找到" + target);
		}
	}

}
