package services;

import model.Criminal_Details;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class User_Operation {
	Criminal_Details criminalDetail = new Criminal_Details();
	Admin_Operation ao = new Admin_Operation();
	public ArrayList<Criminal_Details> clist = new ArrayList<Criminal_Details>(ao.criminalList);
	
	public void userOperation() throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		while(true) {
			System.out.println("\n");
			System.out.println("------------- _-_-_-_-_ Select The Operation To Be Performed _-_-_-_-_ -----------");
			System.out.println("\n");	
			
			System.out.println(" 1. Search the Criminal\n 2. View Criminals List\n ");
			
			int option = Integer.parseInt(br.readLine());

			switch (option) {
			case 1:{
				System.out.println("Enter Criminal ID...");
				int id = Integer.parseInt(br.readLine());

				System.out.println(clist.get(id - 1).getCriminalID() +"\t"
						+ clist.get(id - 1).getCrimeType() + "\t" + clist.get(id - 1).getCrimeAddress()
						+ "\t" + clist.get(id - 1).getCrimeDate() + "\t"
						+ clist.get(id - 1).getGender() + "\t" + clist.get(id - 1).getAge() + "\t"
						+ clist.get(id - 1).getStatus());
				break;
			}
			case 2:{
				UserViewCriminals uv = new UserViewCriminals();
				uv.viewCriminals(clist);
			}
			}//switch-close
			
			System.out.println("Do You Want To Make Any Operations...? 1. YES  2. NO");
			int temp = Integer.parseInt(br.readLine());
			if (temp == 1) {
				continue;
			} else {
				break;
			}

		}//While-close
		
	}
	
}
