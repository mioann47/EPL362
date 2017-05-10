import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class GenerateFiles {

	public static boolean compareDates(String d1) {

		boolean expired = true;

		try {
			// If you already have date objects then skip 1

			// 1
			// Create 2 dates starts
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date1 = sdf.parse(d1);
			Date current = new Date();

			// Create 2 dates ends
			// 1

			// Date object is having 3 methods namely after,before and equals
			// for comparing
			// after() will return true if and only if date1 is after date 2
			if (date1.after(current)) {
				expired = false;
			}

//			System.out.println();
		} catch (ParseException | java.text.ParseException ex) {
			ex.printStackTrace();
		}
		return expired;
	}

	public static void letter(Patient p) {

		try {

			String name = p.getName() + "_warning.txt";
			PrintWriter writer = new PrintWriter(name, "UTF-8");
			writer.println("DELIBERATE SELF HARM LETTER\n\n");

			writer.println("We are sending this letter to inform you that the \n"
					+ "patient with the followng personal information is delibareting selfharm!!\n\n");
			writer.println("Name: " + p.getName());
			writer.println("ID: " + p.getId());
			writer.println("Address: " + p.getAddress());
			writer.println("Please Contact us for more information");
			writer.close();
		} catch (IOException e) {

		}

	}

	public static void dailyList() {

		ArrayList<Appointment> ap = GetArrayLists.getAppointmentsList();
		ArrayList<Patient> pa = GetArrayLists.getPatientsList();

		String name = "attendanceFailed.txt";
		PrintWriter writer = null;

		try {
			writer = new PrintWriter(name, "UTF-8");
			// writer.println("Patients that failed to attend\n\n");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		writer.println("Patients that failed to attend\n\n");
		int i, j;
		for (i = 0; i < ap.size(); i++) {

			System.out.println(ap.get(i).getStatus());
			System.out.println(compareDates(ap.get(i).getDate()));
			//System.out.println(ap.get(i).getStatus().equals("ACTIVE"));
			if (compareDates(ap.get(i).getDate()) && (ap.get(i).getStatus()).charAt(0)=='A') {
				
				System.out.println("vvilla1");
				
				for (j = 0; j < pa.size(); j++) {

					if (ap.get(i).getPatient_id() == pa.get(j).getId()) {
				
						System.out.println("vvilla");
						writer.println("Name: " + pa.get(j).getName());
						writer.println("ID: " + pa.get(j).getId());
						writer.println("Doctor" + ap.get(i).getDoctor());
						writer.println(
								"-----------------------------------------------------------------------------------------------------");
					}

				}

			}

		}

		writer.close();

	}

	public static void main(String args[]) {
		dailyList();

	}
}
