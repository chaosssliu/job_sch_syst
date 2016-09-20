Name: Shashi Liu
      Yung Chi Shih

Two options for running the examples

----RUN IN AN IDE ----

To run the program in an IDE, such as Eclipse

1. Go to File->Import
2. Select Existing Projects into Workspace
3. Click the radio button enxt to Select archive file and click the Browse button 
4. Find the archive file on your hard disk. Click oopen to select it.
5. If you have selected on archive file containing an entire Eclipse project, the project
   name will appear in the white box.
6. Click finish to perform the import.

---- COMPILE AND RUN ON THE COMMAND LINE ----

1. Run Command Prompt
2. Type the directory that contain the .java file
3. Type the javac and the name of file.java command to compile it
4. Type java and the the name of the file to excute the program

----- Direction ----
1. After running the program a prompt will display in the console"
"Total number of jobs:
The number of machines can only be less than or equal to the total number of machines
Please enter the number of machines or -1 to quit:"

2. Enter the number of machines directly to the console.

3. If the input is invalid it will ask you to enter the number of machines again until the
   input is valid.

4. After entering a valid number of machine the total number of jobs scheduled,    unscheduled, and the jobs assigned to each machines will be displayed in the console.

5. After the jobs are scheduled a prompt will be displayed in the console asking for      number of machines again. 

6. Enter -1 to quit the program.

----Input----
1. A .txt input file (job list)
2. User's input for the number of machines (enter directly to the console)


----Input Format----
1. Name_of_the_Job(String) Starting_Time(Integer) Finishing_Time(Integer)

ex. A 0 6

----Output----
1. Job list
2. Total number of job
3. A prompt for the user to enter the number of machines
4. Total number of machines
5. Schedule of each machines
6. Total numer of jobs scheduled
7. Total number of jobs unscheduled 

Example:

Job List
Name	Starting Finishing
A	0	 6
G	1	 7
F	5	 8
I	7	 9
D	5	 10
H	3	 10
M	11	 12
L	10	 13
J	11	 15
C	5	 20
K	20	 25
B	2	 30
E	12	 40

Total number of jobs: 13
The number of machines can only be less than or equal to the total number of jobs
Please enter number of machines or -1 to quit: 3
Number of Machines: 3
Job A assigned to machine 0
Job G assigned to machine 1
Job F assigned to machine 2
Job I assigned to machine 0
Job M assigned to machine 0
Job L assigned to machine 1
Job J assigned to machine 2
Job K assigned to machine 0
Total number of jobs scheduled: 8
Total number of jobs left: 5


Please enter number of machines or -1 to quit: 7
Number of Machines: 7
Job A assigned to machine 0
Job G assigned to machine 1
Job F assigned to machine 2
Job I assigned to machine 0
Job D assigned to machine 3
Job H assigned to machine 4
Job M assigned to machine 0
Job L assigned to machine 1
Job J assigned to machine 2
Job C assigned to machine 5
Job K assigned to machine 0
Job B assigned to machine 6
Job E assigned to machine 3
Total number of jobs scheduled: 13
Total number of jobs left: 0

 
