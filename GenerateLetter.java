import java.io.IOException;
import java.io.PrintWriter;

public class GenerateLetter {

	public static void letter(Patient p) {

		try {

			String name = p.getName() + "_warning.txt";
			PrintWriter writer = new PrintWriter(name, "UTF-8");
			writer.println("DELIBERATE SELF HARM LETTER\n\n");
		
			writer.println("We are sending this letter to inform you that the \n"
					+ "patient with the followng personal information is delibareting selfharm!!\n\n");
			writer.println("Name: " + p.getName());
			writer.println("ID: "+p.getId());
			writer.println("Address: "+p.getAddress() );
			writer.println("Please Contact us for more information");
			writer.close();
		} catch (IOException e) {

		} 

	}

	public static void main(String args[]) {

		Patient p = new Patient();
		p.setName("Giorkos");

		letter(p);
		System.out.print("OK");

	}
}
