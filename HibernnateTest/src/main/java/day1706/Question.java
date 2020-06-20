package day1706;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Question {
	@Id   
	@GeneratedValue(strategy=GenerationType.TABLE)  
	private int id;    
	private String qname;    
	  
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)  
	@JoinColumn(name="qid")  
	  
	private List<Answer> answers;  
	public int getId() {  
	    return id;  
	}  
	public void setId(int id) {  
	    this.id = id;  
	}  
	public String getQname() {  
	    return qname;  
	}  
	public void setQname(String qname) {  
	    this.qname = qname;  
	}  
	public List<Answer> getAnswers() {  
	    return answers;  
	}  
	public void setAnswers(List<Answer> answers) {  
	    this.answers = answers;  
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", qname=" + qname + "]";
	}  
	
	
	
}
