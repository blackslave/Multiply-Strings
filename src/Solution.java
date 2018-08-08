/**
 * 直接取出字串中的數字減去ASCII碼數字0之後，求出整數值，並設定最高相乘位數(num1長度+num2長度)儲存資料。
 * 之後將取出的整數做相乘動作。
 * 例如：123x456=56088
 * 個位數3x6=18，取1進位，取8作為個位數
 * 十位數6x2+5x3=27,加上個位數進位1為28，取2進位，取8作為十位數
 * 百位數6x1+5x2+4x3=28,加上十位數進位2為30，取3進位，取0做為百位數
 * 千位數5x1+4x2=13,加上百位數進位3為16,取1進位，取6作為千位數
 * 萬位數4x1=4，加上千位數進位1為5，取5作為萬位數
 * 最後再將取得的值放入字串中，並將前導零移除。
 * @author black
 *
 */
public class Solution {
	public String multiply(String num1, String num2) {
		num1 = new StringBuilder(num1).reverse().toString();
		num2 = new StringBuilder(num2).reverse().toString();
        int[] tmp = new int[num1.length()+num2.length()];        
        for(int i=0;i<num1.length();i++)
        {
        	int x = num1.charAt(i)-'0';  		//ASCII change Integer
        	for(int j=0;j<num2.length();j++)
        	{
        		int y = num2.charAt(j)-'0';		//ASCII change Integer
        		tmp[i+j] =tmp[i+j]+ x*y;
        	}
        }
          
        StringBuilder result = new StringBuilder(0);
        for(int i=0;i<tmp.length;i++)
        {
        	int a = tmp[i]%10;					//取個位數
        	int b = tmp[i]/10;					//取進位
        	result.insert(0, a);     			//save result
        	if(i<tmp.length-1)
        	{
        		tmp[i+1] = tmp[i+1] + b;
        	}
        }
        while(result.length()>0 && result.charAt(0)=='0')
        {
        	result.deleteCharAt(0);
        }           
        return	result.toString();
    }
}
