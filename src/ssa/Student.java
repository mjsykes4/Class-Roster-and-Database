package ssa;

import java.util.*;

public class Student {
	
	static ArrayList<Student> classRoster = new ArrayList<Student>();
		public String id;
	    public String firstName;
	    public String lastName;
		public String eyeColor;
		public String monthsEmployed;
		
		static HashMap<String, Student> studentKey = new HashMap<String, Student>();
		
		
		public Student() {
			classRoster = new ArrayList<Student>();
			studentKey = new HashMap<String, Student>();
			for(String[] roster : students) {
				classRoster.add(new Student(roster[0], roster[1], roster[2], roster[3], roster[4]));
		}
			for(Student s1 : classRoster) {
				studentKey.put(s1.getId(), s1);
			}
		}
		public void printClassRoster() {
			System.out.println("  Id" + "\t\t" + "First Name" + "\t\t" + "Last Name" + "\t\t" 
					+ "Eye Color" + "\t" + "Months Employed");
			System.out.println("======" + "\t\t" + "==========" + "\t\t" + "========="
					 + "\t\t" + "=========" + "\t" + "===============");
			for(Student s1 : classRoster) {
			System.out.println(s1);			
		}
		System.out.println("\nThese three students represent the Id's directly above and below mine numerically");
		System.out.println(studentKey.get("229949"));
		List keys = new ArrayList(studentKey.keySet());
		Collections.sort(keys);
		int myId = keys.indexOf("229949");
		System.out.println(studentKey.get(keys.get(myId-1)));
		System.out.println(studentKey.get(keys.get(myId+1)));
		}		
		public String toString() {
			return (this.getId() + "\t\t" + this.getFirstName() +"\t\t" + this.getLastName() +
				"\t\t" + this.getEyeColor() + "\t\t\t" + this.getMonthsEmployed());
		}
		 
			public Student(String id, String firstName, String lastName, String eyeColor, String monthsEmployed) {
				this.setId(id);
				this.setFirstName(firstName);
				this.setLastName(lastName);
				this.setEyeColor(eyeColor);
				this.setMonthsEmployed(monthsEmployed);
			}
		
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEyeColor() {
			return eyeColor;
		}

		public void setEyeColor(String eyeColor) {
			this.eyeColor = eyeColor;
		}

		public String getMonthsEmployed() {
			return monthsEmployed;
		}

		public void setMonthsEmployed(String monthsEmployed) {
			this.monthsEmployed = monthsEmployed;
		}		

			
				 static String[][] students = {
						{"004014", "Aisha   ", "Covington", "brown", "10"},
						{"006789", "Arun    ", "Soma     ", "brown", " 2"},
						{"772223", "Daniel  ", "Kiros    ", "brown", " 3"},
						{"267252", "Dax     ", "Richards ", "brown", "12"},
						{"008888", "Evan    ", "Tizard   ", "brown", "12"},
						{"523420", "Gabriel ", "Hamilton ", "other", "10"},
						{"474143", "Jonathan", "Stafford ", "brown", "13"},
						{"005255", "Joseph  ", "Hill     ", "brown", "13"},
						{"215296", "Joshua  ", "Franey   ", "other", "27"},
						{"001449", "Karen   ", "Reiter   ", "blue ", "10"},
						{"004400", "Kevin   ", "Tran     ", "other", "12"},
						{"005295", "Kyle    ", "Deen     ", "blue ", " 2"},
						{"306700", "Li      ", "Lui      ", "brown", "12"},
						{"001122", "Michael ", "Clair    ", "other", "12"},
						{"229949", "Michael ", "Sykes    ", "brown", "13"},
						{"004444", "Peter   ", "Choi     ", "brown", " 2"},
						{"132617", "Reuben  ", "Turner   ", "blue ", "12"},
						{"343769", "Shaquil ", "Timmons  ", "brown", "11"},
						{"001212", "Stephen ", "Rook     ", "brown", "11"},
						{"009999", "Steve   ", "Ellwood  ", "other", " 2"},		
				};
		}

