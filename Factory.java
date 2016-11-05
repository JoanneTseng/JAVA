public class Factory
{
  public static void manu(String[] argv)
  {
    int i = 0, fact = 1;
  
    i=Integer.parseInt(argv[0]); //不論在argv中輸入甚麼數字，實際上在argv中都是一串文字。將數值構成的字串轉換成int型別
    for(;i>0;i--)//第一格可以省略，因為前面已經有宣告變數
    {
      fact *=i;
    }
    System.out.println(argv[o]+"i="+fact);
   }
}
