/**
 * 
 */
package Ch11_2;

/**Test160815
 * @author Joanne
 * @date 20172017年8月5日下午7:20:18
 * @version Test160815
 * @parameter
 * @return
 * @see reference
 */
public class Default {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動呼叫父類別的建構方法
		Child c = new Child();//產生子類別的物件
	}

}

class Parent{//父類別
	Parent(){//建構方法
		System.out.println("執行父類別的建構方法");
	}
}

class Child extends Parent{//子類別
	Child(){//建構方法
		//super(); //重點-會自動產生super()呼叫父類別的建構方法，所以即使沒有寫也沒有關係
		System.out.println("執行子類別的建構方法");
		
	}
}