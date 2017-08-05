/**
 * 
 */
package Ch11_1;

/**
 * Test160815
 * 
 * @author Joanne
 * @date 20172017年8月5日下午6:47:09
 * @version Test160815
 * @parameter
 * @return
 * @see reference
 */
public class Super {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 使用super存取父類別的同名成員
		Child c = new Child();// 產生子類別的物件
		c.Show();

		Parent p = c; // 這裡是建立一個父類別的物件，指定Child類別的物件給他，但是要注意，它的結果如果要輸出屬性，仍然是父類別的，但是如果是要輸出方法，則就會輸出子類別的方法
		System.out.println("p.i:" + p.i);// 此行仍是印出父類別的i屬性，而非子類別的
	}

}

class Parent {// 父類別
	int i = 10;

}

class Child extends Parent {
	int i = 20;

	public void Show() {
		System.out.println("super.i:" + super.i);
		System.out.println("c.i:" + i);
	}
}