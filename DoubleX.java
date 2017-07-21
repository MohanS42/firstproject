
public class DoubleX {
	boolean  doubleX(String str) {
		int temp=0;
		temp=str.indexOf("x");
		if(temp==-1)
			return false;
		 String x=str.substring(temp);
		 return x.startsWith("xx");
		}
public static void main(String[] args) {
	DoubleX dou=new DoubleX();
    System.out.println(dou.doubleX("xxxdfkbhjw"));
}
}
