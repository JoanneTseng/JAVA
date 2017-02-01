/**
 * 
 */
package Ch15;

/**Test160815
 * @author Joanne
 * @date 20172017年2月1日下午3:39:11
 * @version Test160815
 * @parameter
 * @return
 * @see reference
 */
import java.util.Date;//匯入java.util套件中的Date類別

class TimerThread extends Thread{//新的執行緒
	public void run(){//新執行緒要執行的內容;重新定義Thread中的run()方法
		while(true){//不斷顯示日期時間的迴圈
			for(int i = 0; i<5000000; i++);//等待一段時間;延遲程式執行的時間
			Date now = new Date();//取得目前時間
			System.out.println("新執行緒:"+now);//顯示時間
		}
	}
	
}
public class TestThread {//Java本身就會有一個執行緒，其負責執行main()方法

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 最簡單的多執行緒程式
		TimerThread newThread = new TimerThread();//建立一個新的執行緒物件
		newThread.start();//啟動newThread這個Thread物件的執行緒，在這個新的執行緒物件中會呼叫run方法，執行執行緒的內容
		while(true){//不斷顯示日期時間的迴圈
			for(int i=0; i<5000000;i++);//等待一段時間
			Date now = new Date();//取得日期時間
			System.out.println("舊執行緒："+now);//顯示時間;呼叫now物件的toString方法，得到該物件的資訊
		}
	}

}
