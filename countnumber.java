package corejavapart1;
import java.util.Scanner;


public class countnumber {

public static void main(String[]args){
    String str="i love my java program";
int words=1,characters=1;
 Scanner scan=new Scanner(System.in); 

    
System.out.println("Enter the String  ");
str=scan.nextLine();
for(int i=0; i<str.length()-1; i++){
char ch=str.charAt(i);
if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
    words++;
}
else if(str.charAt(i)!=' ') {
    characters++;
}
}
System.out.println("\nTotal words: "+words);
System.out.println("Total characters: "+characters);
System.out.println("Space: "+(words-1));
}
}