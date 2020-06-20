package day1706;

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
public class Answer {
	@Id  
    @GeneratedValue(strategy=GenerationType.TABLE)
	 private int id;    
	    private String answername;    
	    private String postedBy;  
	    public int getId() {  
	        return id;  
	    }  
	    public void setId(int id) {  
	        this.id = id;  
	    }  
	    public String getAnswername() {  
	        return answername;  
	    }  
	    public void setAnswername(String answername) {  
	        this.answername = answername;  
	    }  
	    public String getPostedBy() {  
	        return postedBy;  
	    }  
	    public void setPostedBy(String postedBy) {  
	        this.postedBy = postedBy;  
	    }
		@Override
		public String toString() {
			return "Answer [id=" + id + ", answername=" + answername + ", postedBy=" + postedBy + "]";
		} 
	    
	    
}
