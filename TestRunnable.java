/**
 * 
 */
package Ch15_1;

/**Test160815
 * @author Joanne
 * @date 20172017年2月4日下午12:52:26
 * @version Test160815
 * @parameter
 * @return
 * @see reference
 */
import java.util.Date;

class TimerThread implements Runnable{//新的執行緒;實作Runnable介面
	public void run(){//新執行緒要執行的內容;重新定義run()方法
		while(true){//不斷顯示日期時間的迴圈
			for(int i = 0; i<5000000;i++);//等待一段時間
			Date now = new Date();//取得目前的時間
			System.out.println("新執行緒:"+now);//顯示時間
		}
		
	}
	
}

public class TestRunnable {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 以Runnable介面建立執行緒
		/**由於JAVA不提供多重繼承，如果某類別需要繼承其他類別，就沒有辦法再繼承Thread類別來建立執行緒
		 * 因此JAVA提供Runnable介面，讓任何類別都可以建立執行緒
		 * 也因此如果要有多個執行緒，會有兩種方式，一種是extends Thread，另一種是implements Runnable
		 * 而主要是C++這種語言可以平行式的多重繼承
		 */
		Thread newThread = new Thread((new TimerThread()));//實作Runnable介面的物件;
		//為什要特別在上面的建立物件中又建立物件
		//其實不是這樣，因為副執行緒建立物件，此為固定用法
		newThread.start();//啟動新執行緒;執行緒的實體只能呼叫start()一次
		while(true){
			for(int i = 0; i<5000000;i++);//等待一段時間
			Date now = new Date();//取得目前的時間
			System.out.println("舊執行緒:"+now);//顯示時間
		}
	}

}
