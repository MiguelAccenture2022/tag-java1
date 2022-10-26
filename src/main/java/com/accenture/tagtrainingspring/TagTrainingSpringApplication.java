package com.accenture.tagtrainingspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//http://localhost:8080/screenings
//http://localhost:8080/screening/84358402

@SpringBootApplication
public class TagTrainingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TagTrainingSpringApplication.class, args);
	// 	SpringApplication.run(TagTrainingSpringApplication.class, args);
	// 	printWelcomeMessage();
	// 	Patient patient = new Patient("David", 1, LocalDate.of(1999,04,01), Gender.MALE) ;
	//	Patient patient2 = new Patient("James", 2, LocalDate.of(1999,06,07), Gender.MALE) ;
	// 	Patient patient3 = new Patient("Sarah", 3, LocalDate.of(1990,05,01), Gender.FEMALE) ;

	// 	Screening first	 = new Screening(123,patient, LocalDate.now(), true) ;
	// 	Screening second = new Screening(124,patient2, LocalDate.now(), false) ;
	// 	Screening third  = new Screening(125,patient3, LocalDate.now(), false) ;

	// 	List<Screening> screenings = new ArrayList<Screening>(); 

	// 	ScreeningDatabase database = new ScreeningDatabase();
	// 	database.addPatient(patient);
	// 	database.addPatient(patient2);
	// 	database.addPatient(patient3);

	// 	database.addScreening(first);
	// 	database.addScreening(second);
	// 	database.addScreening(third);

	// 	ScreeningService service = new ScreeningService(database) ;
	// 	screenings = service.allScreenings();

	// 	//Task 1
	// 	//System.out.println("Patient "+patient.getName()+" has a malignant diagnosis of "+first.getResult()) ;
	// 	//System.out.println("Screening: "+first.getScreeningId()+" has a match of "+service.isScreening(first,patient)+" with patient: "+patient.getName()) ;

	// 	for (int i=0; i<screenings.size(); i++){
	// 		System.out.println("Screening for patient "+screenings.get(i).getPatientId().getName()+" returned a malignant result of "+screenings.get(i).getResult()) ;
	// 	}

	// 	Screening task3 = service.match("Cian");
	// 	if (task3 != null)
	// 		System.out.println(task3.getPatientId().getName()+" : Result "+task3.getResult());
	// 	else
	// 		System.out.println("No screening was found") ;

		
	// 	// //Checking if patient and patient who did screening are different
	// 	// System.out.println("Patient "+patient2.getName()+" has a malignant diagnosis of "+second.getResult()) ;
	// 	// System.out.println("Screening: "+second.getScreeningId()+" has a match of "+service.isScreening(second,patient)+" with patient: "+patient2.getName()) ;

	// }

	// private static void printWelcomeMessage() {
	// 	System.out.println("\n" +
	// 			"  _______       _____   _______        _       _             \n" +
	// 			" |__   __|/\\   / ____| |__   __|      (_)     (_)            \n" +
	// 			"    | |  /  \\ | |  __     | |_ __ __ _ _ _ __  _ _ __   __ _ \n" +
	// 			"    | | / /\\ \\| | |_ |    | | '__/ _` | | '_ \\| | '_ \\ / _` |\n" +
	// 			"    | |/ ____ \\ |__| |    | | | | (_| | | | | | | | | | (_| |\n" +
	// 			"    |_/_/    \\_\\_____|    |_|_|  \\__,_|_|_| |_|_|_| |_|\\__, |\n" +
	// 			"                                                        __/ |\n" +
	// 			"                                                       |___/ \n");
	// }

}
}
