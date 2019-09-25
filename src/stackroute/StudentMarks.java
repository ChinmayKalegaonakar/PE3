package stackroute;

public class StudentMarks {
	public int numOfStudents;
	public int[] stuGrades;
	public StudentMarks(int n, int[] m) {
		numOfStudents = n;
		for(Integer marks:m) {
			if(marks<0 || marks >100) {
				return;
			}
		}
		stuGrades = m;
	}
	public int getNumOfStudents() {
		return numOfStudents;
	}
	public int[] getStuGrades() {
		return stuGrades;
	}
	
}
