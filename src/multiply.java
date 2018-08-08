/**
 * 傳入兩個大整數字串，回傳其相乘結果。
 * num1、num2長度都小於110位
 * num1、num2不包含任何前導零，除了0本身
 * 不能使用BigInteger庫或直接將輸入轉成整數
 * @author black
 *
 */
public class multiply {
	public static void main(String []args){
		Solution Solution = new Solution();
		String num1 = "3";
		String num2 = "3";
		System.out.println(Solution.multiply(num1, num2));
	}
}
