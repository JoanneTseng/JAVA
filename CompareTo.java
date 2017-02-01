/**
 * 
 */
package Ch10;

/**Test160815
 * @author Joanne
 * @date 20172017年2月1日下午12:41:20
 * @version Test160815
 * @parameter 
 * @return
 * @see reference
 */
public class CompareTo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 比較字串內容，萬國字碼中小寫大於大寫;若要大小寫視為相同，可以使用compareToIgnoreCase();若是想看某內容在裡面有沒有相同，可以使用contains()
		String a = "abcd";
		System.out.println(a.compareTo("abcb"));
		System.out.println(a.compareTo("abcd"));
		System.out.println(a.compareTo("abce"));
		System.out.println(a.compareTo("abcde"));
		System.out.println(a.compareTo("Abcd"));
	}

}
