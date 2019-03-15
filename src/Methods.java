 public class Methods {
	
	public static void sortFirstName(Student[] s) {
		int j;
        boolean flag = true;  // will determine when the sort is finished
        Student temp;

        while ( flag ) {
            flag = false;
            for ( j = 0;  j < s.length - 1;  j++ ) {
                if ( s [j].getFName().compareToIgnoreCase( s [ j+1 ].getFName() ) > 0 ) {  // ascending sort
                    temp = s [ j ];
                    s [ j ] = s [ j+1];  // swapping
					s [ j+1] = temp;
                    flag = true;
                }
            }
		}
	}
	
	public static boolean searchFirstName(Student[] s, String fName) {
		boolean naaName = false;
		for(int i = 0; i < s.length; i++) {
			if(s[i].getFName().equals(fName)) {
				System.out.println("");
				System.out.println("________________________________________________");
				System.out.println(s[i].getFName() + " " + s[i].getLName() + " Status: ");
				System.out.println("Number of Present: " + s[i].getPresent());
				System.out.println("Number of Late: " + s[i].getLate());
				System.out.println("Number of Absent: " + s[i].getAbsent());
				System.out.println("Number of Excused: " + s[i].getExcused());
				if(s[i].getAbsent() == 9)
					System.out.println("This student is AF :(");
				System.out.println("________________________________________________");
				System.out.println("");
				naaName = true;
			}
		}
		return naaName;
	}
	
	public static boolean searchLastName(Student[] s, String lName) {
		boolean naaName = false;
		for(int i = 0; i < s.length; i++) {
			if(s[i].getLName().equals(lName)) {
				System.out.println("");
				System.out.println("________________________________________________");
				System.out.println(s[i].getFName() + " " + s[i].getLName() + " Status: ");
				System.out.println("Number of Present: " + s[i].getPresent());
				System.out.println("Number of Late: " + s[i].getLate());
				System.out.println("Number of Absent: " + s[i].getAbsent());
				System.out.println("Number of Excused: " + s[i].getExcused());
				if(s[i].getAbsent() == 9)
					System.out.println("This student is AF :(");
				System.out.println("________________________________________________");
				System.out.println("");
				naaName = true;
			}
		}
		return naaName;
	}
	
	public static void print(Student[] s) {
		for(int i = 0; i < 8 ; i++) {
			System.out.println("");
			System.out.println("________________________________________________");
			System.out.println(s[i].getFName() + " " + s[i].getLName() + " Status: ");
			System.out.println("Number of Present: " + s[i].getPresent());
			System.out.println("Number of Late: " + s[i].getLate());
			System.out.println("Number of Absent: " + s[i].getAbsent());
			System.out.println("Number of Excused: " + s[i].getExcused());
			if(s[i].getAbsent() == 9)
					System.out.println("This student is AF :(");
			System.out.println("________________________________________________");
			System.out.println("");
		}
	}
	
	public static void menu(){
		System.out.println("");
		System.out.println(" _____________________________________________________________________");
		System.out.println("|                      Press 1 - Add a new session.                   |");
		System.out.println("|                  Press 2 - Search for a student's log.              |");
		System.out.println("|                   Press 3 - Print all student's log.                |");
		System.out.println("|                       Press 4 - End the program.                    |");
		System.out.println("|_____________________________________________________________________|");

	}
}
