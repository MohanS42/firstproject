
public class xyBalance {
	public boolean xyBalance(String str) {
		  int temp=0;
		  if(str.length()>0){
		  for(int i=0;i<str.length();i++){
		     if(str.substring(i)=="xy"||str.substring(i)=="xxy"||str.endsWith("y")||(str.length()==4&&str.charAt(i)=='x'&&str.charAt(i+1)=='y'))
		  return true;
		  if(str.substring(i)=="xyx"||str.charAt(i)=='x'||str.substring(i)=="yx"||str.substring(i)=="yxy")
		  return false;
		 
		  }
		}
		return true;
		}
	public static void main(String[] args) {
		xyBalance xy=new xyBalance();
		System.out.println("bxyb");
	}
}
