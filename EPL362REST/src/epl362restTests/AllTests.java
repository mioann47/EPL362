package epl362restTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AlergyTest.class, AppointmentTest.class, ClinicTest.class, DrugTest.class, IncidentTest.class,
		OverruledWarningTest.class, PatientTest.class, treatmentTest.class, requestTest.class, usersTest.class })
public class AllTests {

}
