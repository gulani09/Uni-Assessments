package task1;

import java.util.ArrayList;
import java.util.Collections;

public class Subject{
	private String subjectName;
	private String subjectCode;

	// Create default constructor
	public Subject() {
		 
	}
	// Creat two parameter constructor
	public Subject(String subjectCode, String subjectName) {
		if (isValidCode(subjectCode)) {
			this.subjectCode = subjectCode;
		} else {
			System.out.println("\nSubject Code " + subjectCode + " is invalid!!!");
		}
		this.subjectName = subjectName;
	}

	/**
    * Return the subject name value
    * @return String
    */
	public String getSubjectName() {
		return subjectName;
	}

	/**
    * Return the subject code value
    * @return String
    */
	public String getSubjectCode() {
		return subjectCode;
	}

	/**
    * Return the subject first three code value from the subject code
	* Eg: ITC from ITC206 subject code
    * @return String
    */
	public String getDiscipline(String subjectCode) {
		String disciplineCode = subjectCode.substring(0, 3);
		return disciplineCode;
	}

	/**
    * This method used to identify the subject that pssed by the user
	* in correct format.
	* 
    * @return boolean
    */
	public boolean codeMatches(String subjectCode) {
		return getSubjectCode().matches(subjectCode);
	}

	/**
	* This method used to display the subject code and subject name
	*
	* @return String
	*/
	public String toString() {
		return "The subject Code is : " + getSubjectCode() + 
			   "\nThe subeject name is : " + getSubjectName();
	}

	/**
	 * This method used to return an array
	 * containing the different 3-character discipline codes represented in the array of subjects
	 * in alphabetically order.
	 * 
	 * @param subject
	 * @return ArrayList<String>
	 */
	public ArrayList<String> allDisciplines(ArrayList<Subject> subject) {
		// Store the different discipline code in to the array list
		ArrayList<String> disciplineCodes = new ArrayList<String>();

		// iterate each subject code.
		for (int i = 0; i < subject.size(); i++) {
			// get first three letters from subject code
			String disciplineCode = getDiscipline(subject.get(i).getSubjectCode());
			// if same discipline code not in the list add the code to the list
			if (!disciplineCodes.contains(disciplineCode)) {
				disciplineCodes.add(disciplineCode);
			}
		}
		// Sort the discipline codes by ascending order
		Collections.sort(disciplineCodes);
		return disciplineCodes;
	}

	/**
	 * This method used to an array containing the different subject codes represented
	 * in the array list of subjects for the particular discipline
	 * 
	 * @param subject
	 * @param UserDisciplineCode
	 * @return ArrayList<String>
	 */
	public ArrayList<String> codesPerDiscipline(ArrayList<Subject> subject, String UserDisciplineCode) {
		// Store the different subject code with same discipline code
		ArrayList<String> subjectCodes = new ArrayList<String>();

		// iterate each subject code.
		for (int i = 0; i < subject.size(); i++) {
			// get first three letters from subject code
			String disciplineCode = getDiscipline(subject.get(i).getSubjectCode());
			// If the discipline code is in the subject object list ad the subject 
			// code to the list
			if (disciplineCode.equalsIgnoreCase(UserDisciplineCode)) {
				subjectCodes.add(subject.get(i).getSubjectCode());
			}
		}
		return subjectCodes;
	}

	/**
	 * This method used to indicating whether it satisfies the structural requirements for a subject
	 * code(6 characters, first three should be characters and last three should be intergers)
	 * 
	 * @param subjectCode
	 * @return boolean
	 */
	public boolean isValidCode(String subjectCode) {
		boolean isvalidCoe = false;	
		String numericRegex = "\\d+";
		String charRegex = "[a-zA-Z]+";

		// Check total number of character is 6
		if (subjectCode.length() == 6) {
			// Return first three letters from subject code
			String subjectFirstCode = getDiscipline(subjectCode);
			// Return last three letters from subject code
			String subjectLastCode = subjectCode.substring(3, 6);
			if (subjectFirstCode.matches(charRegex) && subjectLastCode.matches(numericRegex)) {
				isvalidCoe = true;
			}
		}	
		return isvalidCoe;
	}

	/**
	 * This method used to indicating whether that code has already been allocated to
	 * one of the subjects in the array list.
	 * 
	 * @param subject
	 * @param subjectCode
	 * @return boolean
	 */
	public boolean codeExists(ArrayList<Subject> subject, String subjectCode) {
		boolean isCodeExists = false;

		for (int i = 0; i < subject.size(); i++) {
			if (codeMatches(subject.get(i).getSubjectCode())) {
				isCodeExists = true;
			}
		}
		return isCodeExists;
	}

	public ArrayList<String> sortDisciplines(ArrayList<Subject> subject) {
		ArrayList<String> subjectsList = new ArrayList<String>();
		for (int i = 0; i < subject.size(); i ++) {
			subjectsList.add(subject.get(i).getSubjectCode() + "    " + subject.get(i).getSubjectName());
		}
		Collections.sort(subjectsList);
		return subjectsList;
	}

}
