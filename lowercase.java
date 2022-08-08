package corejavapart1;

public class lowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length,trim;
		//String uppercase;
String s =new String("  hi ");
String lowstr =  s.toLowerCase();
System.out.println("length:" +s.length());
System.out.println("lowercase:" +lowstr);
String s1="Sapana";
System.out.println("method:" +s.equals(s1));

String s2="bodake";
String s3="BODAKE";
System.out.println("equal:" +s2.equalsIgnoreCase(s3));
s.replace("like", "hellow");
	//dexOf
	//stIndexOf
	//substring((2 6));
System.out.println("Trim"   +s.trim());


	


	}

}
