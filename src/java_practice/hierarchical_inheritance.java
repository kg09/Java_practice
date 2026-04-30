package java_practice;

// 2 child classes --> 1 base class

class school
{
	public void school_data()
	{
		System.out.println("No of students : 800");
		System.out.println("No of teachers : 50");
	}
}

class teacher extends school
{
	public void teacher()
	{
		System.out.println("subject teachers salary: 800000");
	}
}

class student extends school
{
   public void students()
   {
	   System.out.print("Holiday time: 1 month");
   }

}

public class hierarchical_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 student st = new student();
		 st.students();
		 st.school_data();
		 
		 System.out.println("*******");
		 teacher tc = new teacher();
		 tc.teacher();
		 tc.school_data();
		
		
	}

}
