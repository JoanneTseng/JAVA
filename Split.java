/**
 * 
 */
package Ch10_1;

/**Test160815
 * @author Joanne
 * @date 20172017年8月5日下午3:34:05
 * @version Test160815
 * @parameter
 * @return
 * @see reference
 */
public class Split {

	/**
	 * @param args
	 */
	static void prtArr(String[] a){
		for(String s : a)
			System.out.print(s+",");
		System.out.println("");
	} 
	public static void main(String[] args) {
		// TODO 測試split方法
		String s = "Joanne+Andy+Tom";
		//String比較特別，可以直接算new一個字串，可以直接呼叫字串物件可以使用的方法
		//10-32 split方法可以依照特定字元來切割字串，並將切割的結果存入字元陣列中傳回
		//split("以此為基準切割",分割成幾個元素的陣列)
		
		//(+m)指的是要同時遇到+m才成立 [+m]則是任意遇到+或m一種就成立
		//
		prtArr(s.split("[+m]",2));
		prtArr(s.split("[+m]", -2));//為負表示不限切割數目，不會去除最後的空字串
		prtArr(s.split("[+m]", 0));//limit為0，則會去除最後的空字串
		prtArr(s.split("[+m]"));//同上面那一行，省略limit的時候，limit預設為0，不限切個數目，會去除最後的空字串
	}

}
