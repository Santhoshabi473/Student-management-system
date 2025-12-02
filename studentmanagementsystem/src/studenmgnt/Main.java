package studenmgnt;
import java.util.*;
public class Main {
  public static void main(String[] args) {
	  try (Scanner sc = new Scanner(System.in)) {
		StudentDAO dao = new StudentDAO();
		  
		  while(true) {
			  System.out.println("-------Student Management System------");
			  System.out.println("1. ADD Student");
			  System.out.println("2. Update Marks");
			  System.out.println("3.Delete Student");
			  System.out.println("4.Search Student");
			  System.out.println("5.Print All Details");
			  System.out.println("6.Count Students");
			  System.out.println("7.Exit");
			  System.out.println("Choose Option:");
			  int option = sc.nextInt();
			  
			  
			  switch(option) {
			  case 1:
				  sc.nextLine();
				  
				  System.out.print("Enter the Student id: ");
				  int nid = sc.nextInt();
				  sc.nextLine();
				  
				  System.out.print("Enter the Name: ");
				  String name = sc.nextLine();
				  
				  System.out.print("Enter Department:");
				  String dept = sc.nextLine();
				  
				  System.out.print("Enter the Mark:");
				  int mark = sc.nextInt();
				  
				  dao.addStudent(new Students(nid,name,dept,mark));
				  break;
				  
			  case 2:
				  System.out.print("Enter Student Id:");
				  int uid = sc.nextInt();
				  System.out.print("Enter the marks: ");
				  int newMarks = sc.nextInt();
				  dao.updateMarks(uid, newMarks);
				  break;
			  
			  case 3:
				  System.out.print("Eenter the Student Id:");
				  int did = sc.nextInt();
				  dao.deleteStudent(did);
				  break;
			  case 4:
				  System.out.print("Enter the Student Name:");
				  String sname = sc.next();
				  dao.searchStudent(sname);
				  break;
			  case 5:
				  dao.fulldetails();
				  break;
			  case 6:
				  dao.countStudent();
				  break;
			  case 7:
				  System.out.println("Thank you for Use This Managemente System");
				  return;
			  default:
				  System.out.println("Invalid option ");
			  }
			  
		  }
	  }
	  
  }
  
}
