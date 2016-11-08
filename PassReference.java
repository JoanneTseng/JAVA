/**
 * 
 */
package Ch08_1;

/**
 * Test160815
 * 
 * @author Joanne
 * @date 20162016年11月8日下午11:01:55
 * @version Test160815
 * @parameter
 * @return
 * @see reference
 */

class TestA {// 測試類別A
	int x = 3;// 設定初始值

	void show() {
		System.out.println("x=" + x);
	}
}

class TestB {
	void changeTestA(TestA t, int newX) {
		t.x = newX;// 透過參照修改物件內容
	}
}

public class PassReference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 傳遞參照型別的資料，參照型別為記憶體位址
		TestA a = new TestA();
		TestB b = new TestB();

		a.show();
		b.changeTestA(a, 20);
		a.show();
	}

}
