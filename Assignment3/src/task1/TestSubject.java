package task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TestSubject {

	/**
	 * This method used to read the subject details from the subject.txt file
	 * And store in the array list of subject object
	 * 
	 * @return ArrayList<Subject>
	 */
	private static ArrayList<Subject> readSubjectFile() {
		ArrayList<Subject> subjectList = new ArrayList<Subject>();
		String subjectCode = null;
		String subjectName = null;

		// define the read file
		File inputFile = new File("subject.txt");
		try {
			// Set up the file 
			Scanner scanner = new Scanner(inputFile);
			// Read the file until finished
			while (scanner.hasNext()) {
				subjectCode = scanner.next();
				subjectName = scanner.nextLine();
				// Create subject object and pass the argument
				Subject subject = new Subject(subjectCode, subjectName);
				subjectList.add(subject);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("The error occuring due to read the subject.txt file");
		}
		return subjectList;
	}

	/**
	 * This method used to display the subject details from the array list
	 * 
	 * @param displaySubject
	 */
	private static void displaySubject(ArrayList<String> displaySubject) {
		System.out.println("\n***Subject Details***");
		for (int i = 0; i < displaySubject.size(); i++) {
			System.out.println(displaySubject.get(i));
		}
		System.out.println("\n_____________________");
	}

	/**
	 * This method used to display the subject codes from the array list
	 * 
	 * @param subjectCodeList
	 */
	private static void displaySubjectCode(ArrayList<String> subjectCodeList) {
		System.out.println("\n***Subject Code Details***");
		for (int i = 0; i < subjectCodeList.size(); i++) {
			System.out.println(subjectCodeList.get(i));
		}
		System.out.println("\n_____________________");
	}

	/**
	 * This method used to write the subject details into the file.
	 *  
	 * @param subjectCode
	 * @param subjectName
	 */
	private static void writeFile(String subjectCode, String subjectName) {
		try {
			FileWriter outfile = new FileWriter("subjects.txt", true);
			BufferedWriter bw = new BufferedWriter(outfile);
		    PrintWriter out = new PrintWriter(bw);
			/*for(int i=0; i<subjects.size(); i++){
				outfile.print(subjects.get(i).getSubjectCode()+" ");
				outfile.println(subjects.get(i).getSubjectName());
			}*/
			outfile.close();
		} catch (IOException e) {
			System.out.println("Error occured while writting the file!!!");
		}	
	}

	// call main method of this class
	public static void main(String[] args) {
		// Create Subject object
		Subject subject = new Subject();
		// Create scanner object
		Scanner scanner = new Scanner(System.in);
		// Call readSubjectFile method return subject array list object
		ArrayList<Subject> subjectList = readSubjectFile();
	
		boolean userReEnterSubject = true;
		while (userReEnterSubject) {
			System.out.println("\nDo you want to add a new Subject: (Y/N)? ");
			String userWish = scanner.nextLine();

			if (userWish.equalsIgnoreCase("Y")) {
				// Display all subject with the Ascending order
				ArrayList<String> displaySubject = subject.sortDisciplines(subjectList);
				if (displaySubject != null && !displaySubject.isEmpty()) {
					// Call displaySubject method to islay the all subjects
					displaySubject(displaySubject);					
				} else {
					System.out.println("\nNo Subjects in the list!!!");
				}

				boolean userReEnterDiscipline = true;
				while (userReEnterDiscipline) {
					System.out.println("\nDo you want to enter the new discipline Code: (Y/N)? ");
					String disciplineWish = scanner.nextLine();

					if (disciplineWish.equalsIgnoreCase("Y")) {
						// Get subject code from user
						System.out.println("\nEnter the Subject Discipline Code: ");
						String DisciplineCode = scanner.nextLine();
						// Retrieve all subjects code related to the discipline code
						ArrayList<String> subjectCodeList = subject.codesPerDiscipline(subjectList, DisciplineCode);
						if (subjectCodeList != null && !subjectCodeList.isEmpty()) {
							displaySubjectCode(subjectCodeList);
						} else {
							System.out.println("\nNo Subjects Codes for the discipline code in the list!!!");
						}

						// Get Subject Code from user
						System.out.println("\nEnter the Subject Code: ");
						String subjectCode = scanner.nextLine();
						// Get Subject Name from user
						System.out.println("\nEnter the Subject Name: ");
						String subjectName = scanner.nextLine();

						if (subjectCode != null && subjectName != null) {
							// Create subject object with two argument
							Subject subjectAdd = new Subject(subjectCode, subjectName);
							if (subjectAdd.isValidCode(subjectCode)) {
								if (subjectAdd.codeExists(subjectList, subjectCode)) {
									System.out.println("\nSubject al ready exists in the subject list!!!\nTry with another subject");
									continue;
								} else {
									// Display the Subject name and Code
									System.out.println(subjectAdd);
									subjectList.add(subjectAdd);
									writeFile(subjectCode, subjectName);
									continue;
								}
							} else {
								continue;
							}
						} else {
							System.out.println("\nPleae enter the correct subject code and name!!!");	
						}
					} else if (disciplineWish.equalsIgnoreCase("N")) {
						userReEnterDiscipline = false;
					} else {
						userReEnterDiscipline = true;
					}
				}
			} else if (userWish.equalsIgnoreCase("N")) {
				System.out.println("\nProgram Ending!!!!!");
				userReEnterSubject = false;
			} else {
				userReEnterSubject = true;
			}
		}
	}	
}
