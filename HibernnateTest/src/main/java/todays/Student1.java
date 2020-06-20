package todays;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Student1 {
	
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		int rollno;
		int marks;
		
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
		
		
		
		@Override
		public String toString() {
			return "Student [rollno=" + rollno + ", marks=" + marks + "]";
		}
		
		
		
		

	


}
