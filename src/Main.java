import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args)throws IOException{
		
		Scanner sc= new Scanner(System.in);
		
		int machine;// variable for number of machines
		int totalNumJob=0;//variable for total number of jobs
		final int SENTINEL=-1;//sentinel variable
		
		StringBuffer result= new StringBuffer("");//create a StringBuffer object
		
		ArrayList<Job> jobList= new ArrayList<Job>();// create a new ArrayList to store the jobs
		try
		{
			FileReader fileName=new FileReader("input.txt");// create a FileReader Object
			Scanner inputFile= new Scanner(fileName);// create a new Scanner that produces values scanned from the specified file
			
			while(inputFile.hasNext()){
				String[] temp=(inputFile.nextLine().split(" "));//split read lines into an array of strings by separating the string into substrings
				jobList.add(new Job(temp[0],Integer.parseInt(temp[1]),Integer.parseInt(temp[2])));//create new Job object and add it to ArrayList
				totalNumJob++;//increment the total number of jobs
			}//while
		}//try
		catch (Exception e){
			e.printStackTrace();
		}//catch
		
		Compare comparator= new Compare();//create new Compare object
		Collections.sort(jobList, comparator);//sort the list of jobs by finishing time
		System.out.println("Job List\nName\tStarting Finishing");
		for(Job j: jobList){
			System.out.println(j.getName()+"\t"+j.getStartTime()+"\t "+j.getFinishTime());
		}
		System.out.println("\nTotal number of jobs: "+ jobList.size()+"\nThe number of machines can only be less than or equal to the total number of jobs");
		System.out.print("Please enter number of machines or "+ SENTINEL +" to quit: ");//print out a prompt for the user to enter number of machines
		
		machine=sc.nextInt();//set machines to the number entered by the user
		if(machine<=totalNumJob)
		result.append("Number of Machines: "+ machine + "\n");//append the string
		
		while(machine!=SENTINEL){
			
			if(machine<=totalNumJob){
				int[] finishTime= new int[machine];//create an int array with the size of number of machines
				int totalAssignJob=0;//initialize the total number of assigned jobs
				
				for(int i=0; i<machine-1; i++)//for-loop 
					finishTime[i]=0;//set the value of the element i to 0
				
				boolean flag=true;//initialize a flag variable
				for(int i=0; i<jobList.size();i++)
				{
					System.out.println(jobList.get(i).getName());
					for(int j=0; j<i && j<machine;j++)
					{
						if(i<jobList.size()-1){
							if(finishTime[j]<jobList.get(i).getStartTime()&& (jobList.get(i).getStartTime()-finishTime[j])<(jobList.get(i+1).getStartTime()-finishTime[j]))//compare the starting time of job i with the finishing time of j
							{
								finishTime[j]=jobList.get(i).getFinishTime();//set finishing time of job j equal to job i's finishing time
								result.append("Job "+jobList.get(i).getName()+" assigned to machine "+ j +"\n");//append the string
							
							totalAssignJob++;//increment total number of assigned jobs
							flag=false;//set the flag variable to false
							break;
							}//if	
						}else{
							if(finishTime[j]<jobList.get(i).getStartTime())//compare the starting time of job i with the finishing time of j
							{
								finishTime[j]=jobList.get(i).getFinishTime();//set finishing time of job j equal to job i's finishing time
								result.append("Job "+jobList.get(i).getName()+" assigned to machine "+ j +"\n");//append the string
							
							totalAssignJob++;//increment total number of assigned jobs
							flag=false;//set the flag variable to false
							break;
							}
						}
						
					}//for-loop
					if(flag)
					{
						if(i<=machine)
						{
							if(i==machine){
								finishTime[i-1]=jobList.get(i).getFinishTime();//set job i's finishing time in array finishTime to the finish time of job i in jobList
								totalAssignJob++;//increment total number of assigned jobs
								result.append("Job "+jobList.get(i).getName()+" assigned to machine "+ (i-1)+"\n");//append the string
							}else
							{
							finishTime[i]=jobList.get(i).getFinishTime();//set job i's finishing time in array finishTime to the finish time of job i in jobList
							totalAssignJob++;//increment total number of assigned jobs
							result.append("Job "+jobList.get(i).getName()+" assigned to machine "+ i+"\n");//append the string
							}
						}//if (i<machine)
					}//if (flag)
				}//for-loop
				int totalJobLeft=totalNumJob-totalAssignJob;//calculate the number of job left unassigned
				result.append("Total number of jobs scheduled: "+ totalAssignJob+"\n"+"Total number of jobs left: "+ totalJobLeft + "\n\n");//append string
				String output=result.toString();
				System.out.println(output);//print out the result to the console
				
			}else
			{
				if (machine!=SENTINEL)
				{
					System.out.print("The number of machine cannot be greater than the total number of jobs");	
					System.out.println("\nPlease try again");//print out a prompt for the user to enter number of machines
					
				}//(machine!=SENTINEL)
				
			}//else
			System.out.print("Please enter number of machines or "+ SENTINEL + " to quit: ");//print a prompt for the user to enter the number of machines
			machine=sc.nextInt();//set machine to the integer entered by the user
			result.append("Number of Machines: "+ machine + "\n");//append string
		
		}//while
		
	}//method main
}//class Main
