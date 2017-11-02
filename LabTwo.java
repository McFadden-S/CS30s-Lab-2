// **********************************************************************
// Programmer:          McFadden
// Class:		CS30S
//
// Assignment:          Lab 2
//
// Description:         COnstructs four clock objects and manipulates one clocks
//                      values and prints all the clocks values
//
//
// Input:		None
//
//  Output:		It will out put the current time and alarm time for each
//                      of the clocks along with additional outputs for clock one as its changed
                        
// ***********************************************************************

import javax.swing.*;
import java.text.DecimalFormat;

public class LabTwo
{  // begin class
	public static void main(String args[])
	{  // begin main
	// ***** declaration of constants *****
	
	// ***** declaration of variables *****
	
	// ***** create objects *****
		
	 ProgramInfo banners = new ProgramInfo("Lab Excercise 2"); //constructs Program info object
            
         Clock clockOne = new Clock();  //constructs default clock object
         Clock clockTwo = new Clock(12, 35, 20); //constructs initialized clock object
         Clock clockThree = new Clock("23:43:10"); //constructs initialized clock object
         Clock clockFour = new Clock("23:43:10", 12, 35, 20); //constructs initialized clock object
            
	// ***** create input stream ****
		
	// ***** Print Banner *****
	
		banners.printBanner();
		
	// ***** get input *****
	
	// ***** processing *****
	
                System.out.println("Clock One: (default)\n" 
                        + clockOne.toString()); //output for values of clockOne
                
                clockOne.setCT(7, 30, 10); //changes current time
                System.out.println("Clock One's time has been changed to: " + clockOne.getCT() + 
                        "\n (Time set and checked through method)"); //prints changed value
                
                clockOne.setAT("8:30:10"); //changes alarm
                System.out.println("Clock One's alarm has been changed to: " + clockOne.getAT() + 
                        "\n (Alarm set and checked through method)" + "\n"); //prints changed value
                
                while (clockOne.alarmCheck() != true){
                    clockOne.passTime();//passes one second
                }//end of time pass loop
                
                System.out.println("BUZZ BUZZ ALARM BUZZ BUZZ"); //alarm sounds
                System.out.println("Clock One: (Time passed a second at a time through a loop"
                        + ")\n" + clockOne.toString()); //prints new values for clock one
        
	// ***** output *****
	
		
                System.out.println("Clock Two: (Current time set in construction)\n" 
                        + clockTwo.toString()); //output for values of clock two
                System.out.println("Clock Three: (Alarm set in construction)\n" 
                        + clockThree.toString()); //output for values of clock three
                System.out.println("Clock Four: (Both time and alarm set in construction)\n" 
                        + clockFour.toString()); //output for values of clock four

	// ***** closing message *****
	
		banners.printEndMessage(); //prints end message
	
	}  // end main	
}  // end class