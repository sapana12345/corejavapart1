package corejavapart1;

//class employee{
	//float salary= 40000;
	
	//}
//c/lass manager{
	//int id='1';
	
//}


 //class singleemployee extends employee {
//int bouns=10000;
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
//ingleemployee se= new singleemployee();
///System.out.println("salary is:"+se.salary);
//System.out.println("bouns is:"+se.bouns);
////////se.display(); 

	///}

//}
 class Animal{  
	 void eat(){System.out.println("eating...");}  
	 }  
	 class Dog extends Animal{  
	 void bark(){System.out.println("barking...");}  
	 }  
	 class BabyDog extends Dog{  
	 void weep(){System.out.println("weeping...");}  
	 }  
	 class TestInheritance2{  
	 public static void main(String args[]){  
	 BabyDog d=new BabyDog();  
	 d.weep();  
	 d.bark();  
	 d.eat();  
	 }}  