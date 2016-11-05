class Moto
{
  double gas;//載油量
  double eff;//耗油率
  
  void printState()//void表示此方法無傳回值。顯示物件狀態的方法。此類別的一個方法。
  {
    System.out.print("目前載油量為"+gas+"公升，"); 
    System.out.println("耗油率為每公升跑"+eff+"公里");
  
  }
}

public class BuildMoto
{
  public static void main(String[] argv)
  {
    Moto oldmoto = new Moto();//建立物件
  
    oldmoto.gas = 10;//設定成員變數值
    oldmoto.eff = 1;
    System.out.print("舊機車oldmoto");
    oldmoto.printState();//呼叫方法
  }
}
