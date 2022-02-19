package com.workshop.bridgelabz;

public class Gambler {
	
	//Declare Constant
    public final int STAKE=100;
    public final int BET_FOREACHGAME=1;
    
    //Declare variables
    static int bet=1;
    static int stake=100;
    
    
    static void checkingWinOrLoose() {
     	
     	while(stake < 150 && stake > 50 ) {
     	int check=(int)(Math.random() *10)%2; 
     	switch(check){
     	
     	case 1:
        {
       	 stake+=bet;
       	 break;
           //System.out.println("Gamler is winning "+stake); 	
        }
        default:
        {
          stake -=bet;
          break;
        	
         }
      }
     	
     	
    }
     	if(stake ==150) {
     	System.out.println("Gambler won the game  and resigned for the day ");
    }
    if(stake == 50) {
    	System.out.println("Gambler lost the game  and resigned for the day ");
    }
    }
     	
   
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkingWinOrLoose();
	}

}
