package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import services.Admin_Operation;
import utility.AdminValidation;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			System.out.println(
					"-------------------------------------------------------------------------------------------------------");
			System.out.println(
					"-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_  WELCOME OFFICER...!!! -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
			System.out.println(
					"-------------------------------------------------------------------------------------------------------");
			System.out.println("\n");
			
			System.out.println("1. Admin(Police)\n2. User\n");
			int option = Integer.parseInt(br.readLine());			

			switch (option) {

			case 1:{
					System.out.println("Enter UserName...");
					String name = br.readLine();
					System.out.println("Enter Password...");
					String password = br.readLine();
					
					AdminValidation adminValidation = new AdminValidation();
					boolean checkAdmin = adminValidation.checkAdminAccess(name,password);
					
					if(checkAdmin) {
						Admin_Operation admin = new Admin_Operation();
						admin.adminOperations();
					}
					else {
						System.out.println("Invalid Username Or Password...!!!");
					}
					
					
			}
			
			

			}//switch-close
			
			System.out.println("Do You Want To Continue Using the Portal...? 1. YES  2. NO");
			int temp = Integer.parseInt(br.readLine());
			if(temp == 1) {
				continue ;
			}
			else {
				break;
			}
			

		}// while-loop-close
	}

}
