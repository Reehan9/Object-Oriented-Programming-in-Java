package Q_10.ISE;
import java.util.Scanner;
import Q_10.Department;
import Q_10.Faculty;
public class ISE_department implements Department {
	int research , no_of_des;
	public void readData(Faculty f) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the Faculty");
		f.name = sc.nextLine();
		System.out.println("Enter the designation of the Faculty");
		f.des = sc.nextLine();
		System.out.println("Enter the years of experience of the faculty");
		f.yoe = sc.nextInt();
		System.out.println("Enter the joining date of the faculty");
		f.join = sc.nextInt();
		System.out.println("Enter the subjects handled by the faculty");
		f.subs = sc.nextInt();
		System.out.println("Enter the age of the faculty");
		int temp = sc.nextInt();
		if(temp<=58) {
			temp = f.age;
		}
		else {
			throw new java.lang.Error("Age Exception");
		}
		System.out.println("Enter the number of research projects handeled : ");
		research = sc.nextInt();
		System.out.println("Enter the number of designation handeled by the faculty");
		no_of_des = sc.nextInt();
	}

	public void printData(Faculty f) {
		System.out.println("Name of the faculty : "+f.name);
		System.out.println("Designation of the Faculty : "+f.des);
		System.out.println("Years of experience of the faculty : "+f.yoe);
		System.out.println("Joining date of the faculty : "+f.join);
		System.out.println("Subjects handled by the faculty : "+f.subs);
		System.out.println("Age of the faculty : "+f.join);
	}

	public void print_number_designations(Faculty f) {
		System.out.println("Number of designations handeled by the faculty : "+no_of_des);
	}

	public void number_research_consultancy_projs(Faculty f) {
		System.out.println("Number of research projects handeled by the faculty "+research);		
	}

}
