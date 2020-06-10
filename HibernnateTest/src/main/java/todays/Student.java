package todays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Student {
	
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		int rollno;
		int marks;
		StudentName name;
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		
		
		public StudentName getName() {
			return name;
		}
		public void setName(StudentName name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Student [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
		}
		
		
		
		

	


}
