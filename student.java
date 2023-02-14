import java.util.Scanner;
class Student{
	 String usn=new String();
	 String name=new String();
	 String branch=new String();
	 int phone,n;

	 public static void main(Stirng a[])
	 {
       Scanner M=new Scanner(System.in);
        System.out.println("Enter number of student");
        n=M.nextInt;
        Student []=new Student[n];
        for(int i=0;i<n;i++){
            Student S[i]=new Student();
            S[i].ad(); 
        }
        for(int i=0;i<n;i++){
        	 S[i].dis();
        }
	 }
	 void ad()
	 {
	 	Scanner M=new Scanner(System.in);
        System.out.println("Enter USN");
        usn=M.nextLine;
        System.out.println("Enter NAME");
        name=M.nextLine;
        System.out.println("Enter BRANCH");
        branch=M.nextLine;
        System.out.println("Enter phone number");
        phone=M.nextInt;
	 }
	  void dis()
	  {
	  	 System.out.println("1.USN:"+usn);
	  	 System.out.println("2.NAME:"+name);
	  	 System.out.println("1.BRANCH:"+branch);
	  	 System.out.println("1.PHONE:"+phone);
	  }

}