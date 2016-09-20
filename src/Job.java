
public class Job {

	private String name;//job's name
	private int startTime;// starting time of the job
	private int finishTime;// finishing time of the job
	
	public Job(){
		name="none";
		startTime=-1;
		finishTime=-1;
	}	//default constructor
	
	/**
	 * 
	 * @param name- the name of the job
	 * @param startTime- the starting time of the job
	 * @param finishTime - the finishing time of the job
	 */
	public Job(String name, int startTime, int finishTime){
		this.name=name;
		this.startTime=startTime;
		this.finishTime=finishTime;
	}//non-default constructor
	
	//set methods
	
	/**
	 * 
	 * @param name- the name of the job
	 */
	public void setName(String name){
		this.name=name;
	}//method setName
	
	/**
	 * 
	 * @param startTime- the starting time of the job
	 */
	public void setStartTime(int startTime){
		this.startTime=startTime;
	}//method setStartTime
	
	/**
	 * 
	 * @param finishTime- the finishing time of the job
	 */
	public void setFinishTime(int finishTime){
		this.finishTime=finishTime;
	}//method setFinishTime
	
	//access methods
	/**
	 * 
	 * @return- the name of the job
	 */
	public String getName(){
		return name;
	}//method getName
	
	/**
	 * @return- the starting time of the job
	 */
	public int getStartTime(){
		return startTime;
	}//method getStartTime
	
	/**
	 * 
	 * @return- the finishing time of the job
	 */
	public int getFinishTime(){
		return finishTime;
	}//method getFinishTime

	public int compareTo(Object obj){
		if(!(obj instanceof Job))
			throw new ClassCastException("A Job object expected. ");
		Job aJob=(Job)obj;
		if(finishTime>aJob.getFinishTime())
			return 1;
		else if(finishTime< aJob.getFinishTime())
			return -1;
		else 
			return 0;
	}//method compareTo
	
}// class Job
