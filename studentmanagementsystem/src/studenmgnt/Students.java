package studenmgnt;

public class Students {
	private int id;
	private String name;
	private String department;
	private int marks;
	
	public Students(String name,String department,int marks) {
		this.name = name;
		this.department = department;
		this.marks = marks;	
	}
	public Students(int id, String name,String department, int marks) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.marks = marks;
	}
	
	public int getId() {return id;}
    public void setID(int id){this.id = id;}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public String getDepartment() {return department;}
	public void setDepartment(String department) {this.department = department;}
	
	public int getMarks() {return marks;}
	public void setMarks(int marks) {this.marks = marks;}
	
	
	
}
