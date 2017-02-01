/**
 * 
 */
package Ch12_1;

/**
 * Test160815
 * 
 * @author Joanne
 * @date 20172017年2月1日下午1:48:18
 * @version Test160815
 * @parameter
 * @return
 * @see reference
 */

interface Surfacing {
	double area();// 計算面s積的方法
}

class Shape {// 代表圖形原點的類別
	protected double x, y;// 座標;用protected表示只有同一個套件或者是子類別可存取該成員變數

	public Shape(double x, double y) {// 建構子
		this.x = x;
		this.y = y;
	}

	public String toSting() {
		return "圖形原點：(" + x + "," + y + ")";
	}
}

class Circle extends Shape implements Surfacing {// 包含繼承父類別與實作介面的分法
	private double r;// 圓形半徑
	final static double PI = 3.1415982;// 圓周率常數

	/**
	 * 用static代表共享的靜態常數，代表如果建立一個新的物件 ，這個PI並不會被複製多份，而是只會有一份，
	 * 而使用final表示這個PI值並不會被修改， 若不是final就可以被修改，當他處修改PI值時，所有的PI會一起被修改
	 */
	public Circle(double x, double y, double r) {
		super(x, y);// 呼叫父類別建構方法，也就是如同=new shape(x,y)
		this.r = r;
	}

	public double area() {// 計算圓面積，此處就是實作介面中的方法,
		// 在介面中宣告的方法
		return PI * r * r;
	}

	public String toString() {// 這裡有用override去覆蓋父類別的方法
		return "圓心:(" + x + "," + y + ")、半徑:" + r + "、面積:" + area();
	}

}

public class ShapeArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 介面(interface)的實作，介面代表一種共通的行為;實作Surfacing介面
		/**
		 * 介面代表一種共通的行為，例如飛行 定義好介面後就必須要實作該介面，並使用implement保留字
		 * 介面中的方法會自動轉為抽象方法，因此實作介面時，必須要完全實作介面的所有方法
		 */
		Circle c = new Circle(5, 6, 7);
		System.out.println(c.toString());
	}

}
