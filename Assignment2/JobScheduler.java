/**
 * @author : Sakshi Gupta
 * @Date : 17/1/2019
 * @Classname : HexCalc
 * @Description : Hexadecimal operations and interconversion to decimal number
**/

import java.util.Scanner;

public class JobScheduler
 {
	
  public static void main(String args[])
  {
	  Scanner scan = new Scanner(System.in);
	  int arrival, burst;
	  
	     // getting the no. of processes from user
	  System.out.println("How many processes do you want to enter? ");
	  int Process = scan.nextInt();
	  int Time[][] = new int [Process][2];
	  
	  
	  
	  System.out.println("Enter the arrival time and burst time for the processes : ");
	  
	    //storing the arrival and burst time of processes in a 2D array
	  for(arrival = 0; arrival<Process; arrival++ )
	  {
		  for(burst = 0; burst<2; burst++ )
		  {
			 Time[arrival][burst] = scan.nextInt(); 
		  }
		  System.out.println("");
		  
	  }
	  
	  displayJobScheduler(Time,Process);
  }
  
   //method for finding completion time of each process
  static int[] FindingCompletionTime(int time[][], int process)
  {
	  int CompletionTime[] = new int[process];
	  int Burst;
	  CompletionTime[0] = time[0][1];
	  for(Burst=1; Burst<process; Burst++)
	  {
		  CompletionTime[Burst] = CompletionTime[Burst-1]+time[Burst][1];
	  }
	  return CompletionTime;
  }
  
   //method for finding turn around time of each process
  static int[] FindingTurnAroundTime(int completiontime[], int time[][], int process)
  {
	  int TurnAroundTime[] = new int[process];
	  int Arrival;
	  for(Arrival=0; Arrival<process; Arrival++)
	  {
		  TurnAroundTime[Arrival] = completiontime[Arrival]-time[Arrival][0];
	  }
	  return TurnAroundTime;
  }
  
   //method for finding waiting time of each process
  static int[] FindingWaitingTime(int turnaroundtime[], int time[][], int process)
  {
	  int WaitingTime[] = new int[process];
	  int Burst;
	  for(Burst=0; Burst<process; Burst++)
	  {
		  WaitingTime[Burst]   = turnaroundtime[Burst]-time[Burst][1];
	  }
	  return WaitingTime;
  }
  
  //method for displaying job scheduler
 static void displayJobScheduler(int time[][], int process)
  {
	int completiontime[] = FindingCompletionTime(time, process);
	int turnaroundtime[] = FindingTurnAroundTime(completiontime, time, process);
	int waitingtime[] =  FindingWaitingTime(turnaroundtime, time, process );  
	double Average = averagewaitingtime(waitingtime, process);
	
	 // displaying all the information
	System.out.println("Arrival time \tBurst time \tCompletion time \tTurn around time \tWaiting time");
	for(int print=0; print<process; print++)
	{
		System.out.println(time[print][0]+"\t\t"+time[print][1]+"\t\t"+completiontime[print]+"\t\t\t"+turnaroundtime[print]+"\t\t\t"+waitingtime[print]);
	}
	System.out.println("Average waiting time is : "+Average);
  }
 
 static double averagewaitingtime(int waitingtime[], int process)
  {
	 int wait ;
	 double average, Waitingtime=0;
	  //calculating total waiting time
	 for(wait=0; wait<process; wait++)
	 {
		Waitingtime =+ waitingtime[wait];
	 }
	 average=Waitingtime/process;
	 return average;
  }

 }
