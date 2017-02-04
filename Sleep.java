/**
 * 
 */
package Ch15_2;

/**Test160815
 * @author Joanne
 * @date 20172017年2月4日下午1:44:45
 * @version Test160815
 * @parameter
 * @return
 * @see reference
 */
import java.util.*;

class TimerThread extends Thread{
	public void run(){
		try{
			while(true){
				sleep(1000);//睡眠一秒鐘，以毫秒為單位;為Thread的static方法，所以可以直接呼叫
				//當執行緒結束睡眠狀態，就會進入Ready狀態等待執行
				Date now = new Date();
				System.out.println("新執行緒:"+now);
			}
		}
		catch(InterruptedException e){}//不成功條件以及不成功時要執行的東西
	}
}

public class Sleep {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 讓執行緒進入睡眠狀態
		TimerThread newThread = new TimerThread();
		newThread.start();//是Thread裡的靜態方法;BTW 用static最主要是想讓車子都是白色，不要各自定義屬性的用意
		try{
			while(true){
				Thread.sleep(1000);
				Date now = new Date();
				System.out.println("舊執行緒:"+now);
			}
		}
		catch(InterruptedException e){}
	}

}
