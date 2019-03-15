public class Student {
	
	private String firstName;
	private String lastName;
	
	private int numOfAbsences;
	private int numOfLate;
	private int numOfPresent;
	private int numOfExcused;
	
	public Student(String f_N, String l_N) {
		firstName = f_N;
		lastName = l_N;
	}
	public void numAbsent() {
		numOfAbsences++;
	}
	public void numLate() {
		numOfLate++;
		if(numOfLate == 3){
			numOfLate = 0;
			numOfAbsences++;
		}
	}
	public void numPresent() {
		numOfPresent++;
	}
	public void numExcused() {
		numOfExcused++;
	}
	
	public int getAbsent() {
		return numOfAbsences;
	}
	public int getLate() {
		return numOfLate;
	}
	public int getPresent() {
		return numOfPresent;
	}
	public int getExcused() {
		return numOfExcused;
	}
	
	public String getFName() {
		return firstName;
	}
	public String getLName() {
		return lastName;
	}
}
