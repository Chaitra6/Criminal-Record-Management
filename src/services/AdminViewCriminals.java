package services;

import java.util.ArrayList;

import model.Criminal_Details;

public class AdminViewCriminals implements ViewCriminalDetails {

	@Override
	public void viewCriminals(ArrayList<Criminal_Details> criminalList) {

		for (Criminal_Details criminal : criminalList) {
			System.out.println(criminal.getCriminalID() + "\t" + criminal.getCrimeType() + "\t"
					+ criminal.getCrimeAddress() + "\t" + criminal.getCrimeDate() + "\t" + criminal.getGender() + "\t"
					+ criminal.getAge() + "\t" + criminal.getStatus() + "\n");
		}

	}

}
