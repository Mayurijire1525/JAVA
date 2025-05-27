package myapp.program;


class student {

		private String name;
		private int age;
	
		public student(String n,int a) {
			name=n;
			age=a;
		}

		private void showDetails() {
			System.out.println("Student Name:"+name);
			System.out.println("Student Age:"+age);
			
		}
		
		public void display() {
			showDetails();
		}
}

public class Main {

	public static void main(String[] args) {
		student s1=new student("Mayuri",23);
		s1.display();

	}

}
