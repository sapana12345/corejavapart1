package corejavapart1;

public class palindromestringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strInput = "mom";
	      StringBuffer sb = new StringBuffer(strInput);
	      sb.reverse();
	      String str = sb.toString();
	      if(strInput.equals(str))
	      {
	         System.out.println(" string is palindrome."+str);
	      }
	      else
	      {
	         System.out.println(" string is not palindrome."+str);
	      }
}
	
}
