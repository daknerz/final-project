import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Methods list = new Methods();
		String[] name = 
		{"Reana Salada",
		"Danijel Carlos",
		"Jessie Lagrosas",
		"Rangie Obispo",
		"Raymond Inson",
		"Hanniel Estareja",
		"Allan Calacat",
		"Lance Parantar"};
		
		Student[] s = new Student[name.length];	
		
		for(int i = 0; i < name.length; i++) { 
			String[] parts = name[i].split(" ");
			s[i] = new Student(parts[0], parts[1]);
		}
		
		list.sortFirstName(s);
		
		Scanner butang = new Scanner(System.in);
		int i = 0;
		String choice = "";
		boolean repeater = true;
		System.out.println(" ______________________________________________________________________");
		System.out.println("|                     Welcome to Attendance Checker                    |");
		System.out.println("|                 Welcome to Attendance Checker Teacher!               |");
    System.out.println("|                  This is an Attendace Checker in Java!               |");
		System.out.println("|                       HAS UNLIMITED SESSIONS!!!!                     |");
		System.out.println("|             Has the standard 3 late's is equals to 1 absent          |");
		System.out.println("| Indicates AF if the student is beyond 8 absences in the students log |");
		System.out.println("|                     God Bless, and have a good day!                  |");
		while (repeater) {
		System.out.println("|                         Please enter a number:                       |");
		System.out.println("|______________________________________________________________________|");
		list.menu();
		choice = butang.nextLine();
		
		switch (choice) {
			
			case "1": {
				System.out.println(" ______________________________________________________________________________");
				System.out.println("|                                  New Session                                 |");
				System.out.println("| Please enter (p) for present, (a) for absent, (l) for late, (e) for excused. |");
				System.out.println("|______________________________________________________________________________|");
				System.out.println((i + 1) + " Session: ");
				i++;
				
				for(int j = 0; j < s.length; j++) {	//go through each student
				while(true) {
					System.out.println("");
					System.out.println("_______________________");
					System.out.println("Name: " + name[j]);
					System.out.println("Status: ");
					String input = butang.nextLine();
					if(input.equalsIgnoreCase("p")) {
						s[j].numPresent();
						break;
					}else if(input.equalsIgnoreCase("a")) {
						s[j].numAbsent();
						break;
					}else if(input.equalsIgnoreCase("l")) {
						s[j].numLate();
						break;
					}else if(input.equalsIgnoreCase("e")) {
						s[j].numExcused();
						break;
					}else {
						System.out.println("Error, please try again");
						System.out.println("_______________________");
						System.out.println("");
					}
				}
				}break;
				
			}
			
			case "2": {
				boolean valid = false;
				while(!valid) {
					System.out.println(" _________________________________");
					System.out.println("| Search by:                      |");
					System.out.println("| [1] First name                  |");
					System.out.println("| [2] Last name                   |");
					System.out.println("| To search, please enter number: |");
					System.out.println("|_________________________________|");
					switch(butang.nextLine()) {
						
						case "1":
							System.out.println("Please enter first name ex.Carlos:");
							String fName = butang.nextLine();
							while(!list.searchFirstName(s,fName)) {
								if(s[i].getAbsent() == 9)
								System.out.println("");
								System.out.print("Error, please try again: ");
								fName = butang.nextLine();
							}
							valid = true;
							break;
						case "2":
							System.out.println("Please enter last name ex.Carlos:");
							String lName = butang.nextLine();
							while(!list.searchLastName(s,lName)) {
								if(s[i].getAbsent() == 9)
								System.out.println("");
								System.out.print("Error, please try again: ");
								lName = butang.nextLine();
							}
							valid = true;
							break;
						default:
							System.out.println("");
							System.out.println("Error, please try again.");
					}
				}break;
			}
			
			case "3": {
				list.print(s);
				break;
			}
			
			case "4": {
				System.out.println(" ____________________________________________________________ ");
				System.out.println("|       Thank you for using the Attendance Checker :)        |");
				System.out.println("|                                                            |");
				System.out.println("|                                                            |");
				System.out.println("|                                                            |");
				System.out.println("|                                                            |");
				System.out.println("|                                                            |");
				System.out.println("|         Special thanks to Odyssey2061 and friends          |");
				System.out.println("|                And Sissy for MORAL SUPPORT <3              |");
				System.out.println("|____________________________________________________________|");
				repeater = false;
			break;
			}
		}
		}
	}
}
