package day2006;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int Qid;
	String Qname;
	@OneToMany( cascade = CascadeType.ALL, mappedBy = "que",fetch = FetchType.EAGER)
	List<Answer> answer;
	public int getQid() {
		return Qid;
	}
	public void setQid(int qid) {
		Qid = qid;
	}
	public String getQname() {
		return Qname;
	}
	public void setQname(String qname) {
		this.Qname = qname;
	}
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [Qid=" + Qid + ", Qname=" + Qname + "]";
	}
	 
	 
	 

}
