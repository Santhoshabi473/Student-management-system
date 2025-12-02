package studenmgnt;

import java.sql.*;

public class StudentDAO {
      public void addStudent(Students s) {
   try {
	Connection con = Dbconnection.getConnection();
	PreparedStatement ps = con.prepareStatement("INSERT INTO students(id,name, department, marks) VALUES (?,?,?,?)");
	ps.setInt(1,s.getId());
	ps.setString(2, s.getName());
	ps.setString(3, s.getDepartment());
	ps.setInt(4, s.getMarks());
	ps.executeUpdate();
	System.out.println("STUDENT ADDED SUCCESSFULLY!");
   }
   catch(Exception e){
	   System.out.println(e);
   }
      }
      
public void updateMarks(int id,int newMarks) {
	try {
	Connection con = Dbconnection.getConnection();
	PreparedStatement ps = con.prepareStatement("UPDATE students SET marks =? WHERE id = ?");
	ps.setInt(1,newMarks);
	ps.setInt(2,id);
	ps.executeUpdate();
	System.out.println("Mark upadate Successfully!");
	}
	catch(Exception e) {
		System.out.println(e);
	}
}


public void deleteStudent(int id) {
	try {
	Connection con = Dbconnection.getConnection();
	PreparedStatement ps = con.prepareStatement("DELETE FROM students WHERE id =?");
	ps.setInt(1, id);
	ps.executeUpdate();
	System.out.println("Student Deleted Successfullu!");
	}
	catch(Exception e) {
		System.out.println(e);
	}
}

public void searchStudent(String name) {
 try {
	Connection con = Dbconnection.getConnection();
	PreparedStatement ps = con.prepareStatement("SELECT*FROM students where name=?");
	ps.setString(1, name);
	ResultSet rs = ps.executeQuery();
	
	if(rs.next()) {
		System.out.println("ID:"+rs.getInt("id"));
		System.out.println("Name:"+rs.getString("name"));
		System.out.println("Department:"+rs.getString("department"));
		System.out.println("Mark:"+rs.getInt("marks"));
	}else {
		System.out.println("Student not found ");
	}
 }
	catch(Exception e) {
		System.out.println(e); 
	}
}	
 public void fulldetails() {
	 Connection con = null;
	 PreparedStatement ps = null;
	 ResultSet rs = null;
	try {
		 con = Dbconnection.getConnection();
		 ps = con.prepareStatement("SELECT*FROM students");
		 rs = ps.executeQuery();
		
		boolean alldata = false;
		while(rs.next()) {
			alldata = true;
			System.out.println("ID:"+rs.getInt("id"));
			System.out.println("NAME:"+rs.getString("name"));
			System.out.println("Departement:"+rs.getString("department"));
			System.out.println("Mark:"+rs.getInt("marks"));
			System.out.println("-----------------------------------------------");
		}
		if(!alldata) {
			System.out.println("no data found in your database...");
		}
		
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	finally {
		try {
	if(rs!=null) rs.close();
	if(ps!=null)ps.close();
	if(con!=null)con.close();
		}
	
	catch(SQLException e) {
		System.out.println(e.getMessage());
	}
 
}
}
 public void countStudent() {
	 
	 try {
		Connection con = Dbconnection.getConnection();
		 PreparedStatement ps = con.prepareStatement("SELECT COUNT(*) as Student_Count FROM students");
		 ResultSet rs = ps.executeQuery();
		 
		 if(rs.next()) {
			 System.out.println("Total Students:"+ rs.getInt("Student_Count"));
		 }
		 con.close();
		 ps.close();
		 rs.close();
		 
	 }catch(Exception e) {
		 System.out.println(e.getMessage());
	 }
	 
 }
}
