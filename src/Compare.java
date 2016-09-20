import java.util.Comparator;


public class Compare implements Comparator {

	/**
	 * @param obj1- object 1 for comparison
	 * @param obj2- object 2 for comparison
	 * @return compare result 
	 */
	public int compare(Object obj1, Object obj2){
		Job job1= (Job) obj1;
		Job job2= (Job) obj2;
		
		return job1.compareTo(job2);
	}//method compare
}//class Compare
