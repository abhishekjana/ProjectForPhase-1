package lockme.com;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Demo {
	 void welcome() throws IOException {
		 int s,ch1;
		 char ch2='y';
		 Scanner sc=new Scanner(System.in);
		 
			while(true) {
			System.out.println("\nEnter your preference");
			System.out.println("1: RETURN CURRENT FILES OF CURRENT DIRECTORY\n2: FILE MANIPULATION\n3: CLOSE THE APPLICATION");
			
			s=sc.nextInt();
			
			switch(s) {
			
			case 1: 
				File files= new File("F:\\AAAAAAAAAAAA");
				String filenames[]=files.list();
				for(String filename : filenames) {
					System.out.println(filename);
					
				}
				break;
				
			case 2:
					
				System.out.println("1: Add a file to the existing directory \n2: Delete the file\n3: Search the file");
				int m=sc.nextInt();
				
				switch(m) {
				
				
				case 1:
					File file1= new File("F:\\AAAAAAAAAAAA\\FILE5.txt");
				boolean status;
				if(file1.exists())
					System.out.println("YOUR FILE IS ALRAEDY EXIST\n");
				else {
					status=file1.createNewFile();
					System.out.println((status==true)?"FILE CREATED.....\n":"FILE NOT CREATED...\n");
					
				}
				System.out.println("Enter y to continue and n to exit and log out");
                 ch2 = sc.next().charAt(0);
                 if(ch2=='n') {
                	 System.out.println("*****YOU ARE LOGGED OUT******");
                	 return;
                 }
				break;
				
				
				case 2:
					File file2=new File("F:\\\\AAAAAAAAAAAA\\\\FILE2.txt");
				if(file2.exists()) {
					file2.delete();
					System.out.println("YOUR FILE DELETED\n");
					}
				else System.out.println("FILE DOESN'T EXIST\n");
				System.out.println("Enter y to continue and n to exit");
                ch2 = sc.next().charAt(0);
                if(ch2=='n') {
               	 System.out.println("*****YOU ARE LOGGED OUT******");
               	 return;
                }
					break;
					
				case 3:
					File file= new File("F:\\AAAAAAAAAAAA\\FILE4.txt");
					if(file.exists())
					System.out.println("*******************CONGOOOOOO**********************\n"+file.getName()+" EXIST\n");
					else System.out.println("********************OOOOOOHHHHHHH SORRRYYY YOUR FILE DOESN'T EXIST\n");
					System.out.println("Enter y to continue and n to exit");
	                 ch2 = sc.next().charAt(0);
	                 if(ch2=='n') {
	                	 System.out.println("*****YOU ARE LOGGED OUT******");
	                	 return;
	                 }
					break;
				
				default :
		            System.out.println("INVALID OPTION");
		            
					break;	
						
						
				}
				break;
				
			case 3:
				System.out.println("***********YOU ARE LOGGED OUT**************\nTHANKYOU");
				return;
			}
			}
	         }
	 void login() throws IllegalAccessException {
		    System.out.println("***************************************************************************************");
			System.out.println("***************************************************************************************");
			System.out.println("***************************************************************************************");
			System.out.println("*****************************WELCOME TO LOCKERS PVT.LTD********************************");
			System.out.println("*****************************DEVELOPED BY ABHISHEK JANA********************************");
			System.out.println("****************************************************************************************");
			System.out.println("****************************************************************************************");
			
	 
	   String username ;
	    String password;
	    String yes_0r_no;
	    String scann;
	    String passscan;

	    Scanner scan = new Scanner(System.in);
	    Scanner scanner = new Scanner(System.in);

	    Scanner name = new Scanner(System.in);
	    System.out.println("*****************PLEASE SIGNUP USING YOUR USERNAME AND PASSWORD******************");


	    System.out.println("Username:");
	    username = name.next().toLowerCase();

	    Scanner pass = new Scanner(System.in);
	    System.out.println("Password:");
	    password = pass.next().toLowerCase();


	    System.out.println("*********ACCOUNT CREATED**********");

	    Scanner ask = new Scanner(System.in);
	    System.out.println("DO YOU WANT TO LOGIN?\nYES    or    NO) :");

	     yes_0r_no = ask.next().toLowerCase();



	    while (true){
	        if (yes_0r_no.equals("yes")){
	            System.out.println("Username:");
	          scann = scan.next().toLowerCase();
	          if (scann == username) {
	              continue;
	          }
	        System.out.println("Password");
	        passscan = scanner.next().toLowerCase();
	        if (passscan.equals(password)) {
	            System.out.println("You are logged in");
	            break;

	        }if (!password.equals(passscan)) {
	            throw new IllegalAccessException();
	            }
	        }

	        if (yes_0r_no.equals("no"))
	            break ;
	    }
	    }
}
	 

public class Lockers {

	public static void main(String[] args) throws IOException, IllegalAccessException {
		Demo demo = new Demo();
		demo.login();
		demo.welcome();
		
		
	}

}

