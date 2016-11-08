/**
 * 
 */
package Ch08_2;

/**Test160815
 * @author Joanne
 * @date 20162016年11月8日下午11:24:23
 * @version Test160815
 * @parameter
 * @return
 * @see reference
 */
class Test{
	void showMultipleString(String[] strs){
		for(String s:strs){
			System.out.println(s);
		}
	}
}
public class AnonymousArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 如果這個陣列除了作為參數的傳遞以外，並沒有其他用途，便可使用匿名陣列傳遞參數
		Test a = new Test();
		a.showMultipleString(new String[]{"第一行訊息","第二行訊息","第三行訊息"}); //建立陣列元素型別的匿名陣列。指定陣列的初值。
	}

}
