package corejavapart1;

class student{
	int rollno;
	String Name;
	void getdata() {
		rollno=20;
		Name="sapana";
		
	}
}
class test extends student
{
	int mark;
	void getdata() {
		System.out.println("mark:"+mark);

	}
}
class result extends test{
	int total;
	void calculate() {
		total=mark;
		System.out.println("total:"+mark);
		

	}
}
public class multilevel
 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
result r1= new result();
r1.getdata();
r1.getdata();
r1.calculate();

	}
}


