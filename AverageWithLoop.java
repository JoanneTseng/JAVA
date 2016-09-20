/**
 * 
 */
package Ch07;

/**
 * Test160815
 * 
 * @author Joanne
 * @date 20162016年9月20日下午3:05:50
 * @version Test160815
 * @parameter
 * @return
 * @see reference
 */
public class AverageWithLoop {

	/**
	 * 使用特殊的for迴圈(班級學生成績計算)(注意:foreach迴圈jre1.5版以上才能使用)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 使用特殊的for迴圈，(班級學生成績計算)(注意:foreach迴圈jre1.5版以上才能使用)
		double[] students = { 70, 80, 90, 95, 100 };// double型態的陣列宣告
		double sum = 0;

		for (double score : students) {// students的這些陣列變數一直輸入score之中，注意:score和students的型別要一致
			sum += score;// 加總students->score->sum一直帶入數值

		}
		// 計算平均值
		double average = sum / students.length;// 陣列是屬性，字串是用length方法所以要加()

		System.out.println("平均成績:" + average);
	}

}
