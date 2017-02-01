/**
 * 
 */
package Ch12;

/**Test160815
 * @author Joanne
 * @date 20172017年2月1日下午1:06:25
 * @version Test160815
 * @parameter
 * @return
 * @see reference
 */

abstract class Parent{//抽象類別
	abstract void show();//抽象方法
	
}

abstract class Child extends Parent{//Parent的子類別
	//沒有實作show(),自動成為抽象類別
}

class Grandson extends Child{//Child的子類別
	void show(){
		System.out.println("我有實作抽象方法囉");
	}
	
}
public class AbstractChild {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 由孫代類別實作抽象方法
		/**抽象類別中會有抽象方法，抽象方法中的內容通常可能會是空的，
		 * 所以必須要透過子類別去繼承這個抽象類別，並實作裡面的方法，
		 * 才能拿來建立物件，否則子類別依然會被視為是抽象類別，直接編議會錯誤
		 * ，並且要在子類別的前面加上abstract才可以編譯成功
		 */
	Parent p = new Grandson();//建立孫類別的物件
	p.show();
	}

}
