import java.util.Scanner;


public class ReverseString {

	//Cach 1: De Quy
	public String Reverse(String str) {
		String tmp;
		if(str==null||str.length()<1){
			return str;
		}
		tmp = Reverse(str.substring(1))+str.charAt(0);
		return tmp;
	}
	//Cach 2: Noi chuoi
	public String Reverse2(String str) {
		String tmp="";
		for(int i=str.length()-1;i>=0;i--){
			tmp=tmp+str.charAt(i);
		}
		return tmp;
	}
	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		String result;
		result = rs.Reverse2(str);
		System.out.println(result);
	}
}
