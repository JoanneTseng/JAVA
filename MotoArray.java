class Moto {
	double gas;// 載油量
	double eff;// 耗油率

	void printState()// void表示此方法無傳回值。顯示物件狀態的方法。此類別的一個方法。
	{
		System.out.print("目前載油量為" + gas + "公升，");
		System.out.println("耗油率為每公升跑" + eff + "公里");

	}
}

public class MotoArray {

	/**
	 * @param args
	 */

	/*
	 * public class BuildMoto { public static void main(String[] argv) { Moto
	 * oldmoto = new Moto();//建立物件
	 * 
	 * oldmoto.gas = 10;//設定成員變數值 oldmoto.eff = 1;
	 * System.out.print("舊機車oldmoto"); oldmoto.printState();//呼叫方法 } }
	 */

	public static void main(String[] args) {
		// TODO 建立多個物件陣列
		Moto[] ManyMotos = new Moto[3]; // Manymotos是陣列名稱。宣告物件陣列。此行會配置陣列空間

		for (int i = 0; i < ManyMotos.length; i++) {
			ManyMotos[i] = new Moto();// 依序為陣列的每一個元素，配置物件記憶體空間。
			ManyMotos[i].gas = 100 + i * 10;
			ManyMotos[i].eff = 10 + i * 2.5;
		}
		for (int i = 0; i < ManyMotos.length; i++) {// 輸出物件陣列內容
			System.out.println((i + 1) + "號車");
			ManyMotos[i].printState();// 呼叫方法
		}
	}

}

