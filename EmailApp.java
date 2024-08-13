import java.util.Scanner;
class Email
{

	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength=10;
	private String department;
	private int mailBoxCapacity;
	private String emailAddress;
	private String alternateEmail; 
	

	//Constructor to receive the firstName and lastName

	public Email(String firstName, String lastName)
	{
	
	this.firstName=firstName;
	this.lastName=lastName;

	System.out.println("EMAIL CREATED : " +this.firstName +" " +this.lastName);
	



	//Call a method asking for the department return the department
	
	this.department=setDepartment();		//asking private Department to pass out with the method setDepartment()
	
	System.out.println("Department : " +this.department);
	



	//Call a method that returns random password
	
	this.password=randomPassword(defaultPasswordLength());
	
	System.out.println("Your password is : " +this.password);
	




	}
	

	//Ask for the department

	private String setDepartment()
	{

	System.out.print("Department Codes \n1 for Sales \n2 for Developing \n3 for Accounting \n0 for none \n Enter department 

code: ");
	
	Scanner sc=new Scanner(System.in);
	int depChoice =sc.nextInt();
		
	if(depChoice==1){

	return "sales";
	
	}
	
	else if(depChoice==2)
	{

	return "develop";
	

	}

	else if(depChoice ==3)
	{
	
	return "accounting";

	}
	
	
	else
	{

	return " ";			//this will return nothing	


	}	
	}


	
	//Generate a random password
	
	public String randomPassword(int length)
	{

	String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ@!$#%";
	char[] password=new char[length];

	for(int i=0;i<length;i++)
	{
		
	int rand =(int) (Math.random() * passwordSet.length());
	password[i]=passwordSet.charAt(rand);

	System.out.println(rand);

	System.out.println(passwordSet.charAt (rand));

	}

	return new String(password);

	}

	//Set the mailbox capacity


	//Set the alternative email


	
	//Change the password
	

}

class EmailApp
{

	public static void main(String[] args)
	{

	Email em1=new Email("Rashik","Timalsina");
	




	}



}

