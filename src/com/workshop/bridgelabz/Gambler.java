package com.workshop.bridgelabz;

import java.util.Scanner;

public class Gambler {

    //Declare variables
    static int bet=1;
    static int stake=0;
    static int fixed_stake=0;
    static int winorlost_amnt=0;
    static int percentage;
    static int max_perStake;
    static int min_perStake;
    static int woncount=0;
    static int lostcount=0;
    static int arr[] = new int[30];
    static int max=0;
    static int min=0;
    
    
    
    
    static void checkingWinOrLoose(int n) {
    	
     	for(int day=0;day<30;day++) {
     		
     		stake=stake+n;
     		fixed_stake=stake;
     		percentage=(int)(stake/2);
     		max_perStake = stake+percentage;
     		min_perStake = stake-percentage;
     		
     		
     	while(stake < max_perStake && stake > min_perStake ) {
     	int check=(int)(Math.random() *10)%2; 
     	switch(check){
     	
     	case 1:
       	 stake+=bet;
       	 
       	 break;	  
        default: 
          stake -=bet;
          
          break;	
     	}
     	
     	}
     	
     	if(stake == max_perStake) {
     		winorlost_amnt += max_perStake-fixed_stake;
            System.out.println("Gambler won the game  and resigned for the day "+winorlost_amnt);
            woncount++;//Here it counts total no of days gambler won
            
        }
        if(stake == min_perStake) {
        	winorlost_amnt -= fixed_stake-min_perStake;
        	System.out.println("Gambler lost the game  and resigned for the day "+winorlost_amnt );
        	lostcount++; //Here it counts total no of days gambler lost
     	}
        
        //stores all win or lost value to array
        arr[day] = winorlost_amnt;
     	
     	}
     	
     	System.out.println("Total no of days the gambler won is :"+ woncount);
     	System.out.println("Total no of days the gambler lost is :"+ lostcount);
     	
     	
     	//Here it compute the maximum profit or loss earned in a day
     	for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			else if(arr[i]<min) {
				min=arr[i];
			}
			
		}
     	System.out.println("The lukiest day where i got maximum "+max);
     	System.out.println("The unlukiest day where i lost maximum "+min);
     	
    }
    
    	
   
    
	public static void main(String[] args) {
	
		
		System.out.println("Enter stake value :");
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		
		//Here calling the method
		checkingWinOrLoose(n);
		scan.close();
	}

}
