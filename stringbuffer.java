package corejavapart1;

public class stringbuffer {
public static void main(String args[])
{
	StringBuffer sb = new StringBuffer("java full satck");
	int p = sb.length();
	System.out.println("length of string"+p);
	int q= sb.capacity();
	System.out.println("capacity of string"+q);
sb.reverse();
System.out.println("reverse of string:"+sb);
sb.replace(2, 5, "are");
System.out.println("replace of string:"+sb);
sb.delete(2, 5);
System.out.println("delete of string:"+sb);
sb.insert(2, "dbms");
System.out.println("insert of string:"+sb);
sb.ensureCapacity(56);
System.out.println("ensure capacity of string:"+sb.capacity());


}
}
