// **********************************************************************
// Programmer:          McFadden
// Class:		CS30S
//
// Assignment:          Lab 2
//
// Description:         Class file for clock object
//
//
// Input:		Potential input of alarm time, current time
//                      input would come from other file
//
//  Output:		Potential output of value for alarm time and current
//                      time which would output as data to main file.
// ***********************************************************************
 
 // import files here as needed
 
 
 public class Clock
 {  // begin class
 	
 	// *********** class variable **********
 	
 	 private static int nextID = 0;
     
 	// ********** instance variable **********
         
         private int id = 0;
         
         private String delim = "[:]+";  // delimiter for parsing input strings
         private String[] tokens;        // array of input values
         
         private int ctSeconds = 0; //variable for current seconds
         private int ctMinutes = 0; //variable for current minutes
         private int ctHours = 0;   //variable for current hours
            
         private int atSeconds = 0; //variable for alarm seconds
         private int atMinutes = 0; //variable for alarm minutes
         private int atHours = 0;   //variable for alarm hours
 	
 	// ********** constructors ***********
         
        /***********************************
          * Purpose:    Create a new clock object with default properties
          * 
          * Interface:  
          * 
          * In:         None
          * Return:     None
        ***********************************/
         
         public Clock(){
             id = nextID++; //assign id number and increment
                            //next id for next constructior
             
             ctSeconds = 0; //set current seconds to default value
             ctMinutes = 0; //set current minutes to default value
             ctHours = 0;   //set current hours to default value
         
             atSeconds = 0; //set alarm seconds to default value
             atMinutes = 0; //set alarm minutes to default value
             atHours = 0;   //set alarm hours to default value

            }//end default constructor

        /***********************************
          * Purpose:    Create a new clock object with initialized properties
          *             for current time
          * 
          * Interface:  
          * 
          * In:         Current hours, minutes and seconds(int, int, int)
          * Returns:    None
        ***********************************/
         
         public Clock(int h, int m, int s){
             id = nextID++; //assign id number and increment
                            //next id for next constructior
                            
             ctSeconds = s; //set current seconds to initialized value
             ctMinutes = m; //set current minutes to initialized value
             ctHours = h;   //set current hours to initialized value
         
             atSeconds = 0; //set alarm seconds to default value
             atMinutes = 0; //set alarm minutes to default value
             atHours = 0;   //set alarm hours to default value

            }//end initialized constructor
         
         /***********************************
          * Purpose:    Create a new clock object with initialized properties
          *             for alarm time
          * 
          * Interface:  
          * 
          * In:         Alarm hours:minutes:seconds (String)
          * Returns:    None
        ***********************************/
         
         public Clock(String alarm){
             id = nextID++; //assign id number and increment
                            //next id for next constructior
             
            tokens = alarm.split (delim); //seperates input into strings
                            
             ctSeconds = 0; //set current seconds to default value
             ctMinutes = 0; //set current minutes to default value
             ctHours = 0;   //set current hours to default value
         
             atHours = Integer.parseInt(tokens[0]);   //set alarm hours to initialized value
             atMinutes = Integer.parseInt(tokens[1]); //set alarm minutes to initialized value
             atSeconds = Integer.parseInt(tokens[2]); //set alarm seconds to initialized value

        }//end initialized constructor
         
         /***********************************
          * Purpose:    Create a new clock object with initialized properties
          *             for alarm time and current time
          * 
          * Interface:  
          * 
          * In:         Alarm and current seconds, minutes and hours 
          *             (String, int, int, int)
          * Returns:    None
        ***********************************/
         
         public Clock(String alarm, int h, int m, int s){
             id = nextID++; //assign id number and increment
                            //next id for next constructior
             
            tokens = alarm.split (delim); //seperates input into strings
                            
             ctSeconds = s; //set current seconds to initialized value
             ctMinutes = m; //set current minutes to initialized value
             ctHours = h;   //set current hours to initialized value
         
             atSeconds = Integer.parseInt(tokens[2]); //set alarm seconds to initialized value
             atMinutes = Integer.parseInt(tokens[1]); //set alarm minutes to initialized value
             atHours = Integer.parseInt(tokens[0]);   //set alarm hours to initialized value

        }//end initialized constructor
 	
 	// ********** accessors **********
         
        /***********************************
          * Purpose:    returns the current time
          * 
          * Interface:  
          * 
          * In:         None
          * Returns:    Current Time (String)
        ***********************************/

         public String getCT(){
             return (ctHours + ":" + ctMinutes + ":" + ctSeconds); //return current time
         } //end of getCT
         
         /***********************************
          * Purpose:    returns the alarm time
          * 
          * Interface:  
          * 
          * In:         None
          * Returns:    alarm Time (String)
        ***********************************/

         public String getAT(){
             return (atHours + ":" + atMinutes + ":" + atSeconds); //return alarm time
         } //end of getAT
 	
        /***********************************
          * Purpose:    returns both times as a string
          * 
          * Interface:  
          * 
          * In:         None
          * Returns:    times (String)
        ***********************************/
         
         public String toString(){
         String times;
         //creates a string to displace both current and alarm time
         times = "Current time: " + ctHours + ":" + ctMinutes + ":" + ctSeconds + "\n";
         times += "Alarm is set for: " + atHours + ":" + atMinutes + ":" + atSeconds + "\n";
        
         return times; //returns the string
     } //end of toString override
 	
         /***********************************
          * Purpose:   checks if alarm and current time are equal
          * 
          * Interface:  
          * 
          * In:         None
          * Returns:    alarmON (boolean)
        ***********************************/

         public boolean alarmCheck(){
             boolean alarmON = false;
             if (ctHours == atHours && ctMinutes == atMinutes && ctSeconds == atSeconds){
                 alarmON = true; //makes it so alarm is turned on
             }//end of if ct values and at values are equal
             
             return alarmON;
         } //end of getAT
         
        // ********** mutators **********
         
        /***********************************
          * Purpose:    sets value of current time
          * 
          * Interface:  
          * 
          * In:         Hours, Minutes and Seconds (int, int, int)
          * Returns:    None
        ***********************************/

         public void setCT(int h, int m, int s){

             ctSeconds = s; //set current seconds to new time value
             ctMinutes = m; //set current minutes to new time value
             ctHours = h;   //set current hours to new time value
             
         } //end of setCT
         
         /***********************************
          * Purpose:    sets value of alarm time
          * 
          * Interface:  
          * 
          * In:         Hours:Minutes:Seconds (String)
          * Returns:    None
        ***********************************/

         public void setAT(String alarm){
             
             tokens = alarm.split (delim); //seperates input into strings
             
             atSeconds = Integer.parseInt(tokens[2]); //set alarm seconds to new time value
             atMinutes = Integer.parseInt(tokens[1]); //set alarm minutes to new time value
             atHours = Integer.parseInt(tokens[0]);   //set alarm hours to new time value
             
         } //end of setAT
         
         /***********************************
          * Purpose:    Increases seconds by one
          * 
          * Interface:  
          * 
          * In:         None
          * Returns:    None
        ***********************************/

         public void passTime(){

             if (ctSeconds == 59){ //checks to see if seconds need to be rolled over
                 ctSeconds = 0; //sets seconds back to zero
                 
                 if (ctMinutes == 59){ //checks if minutes need to be rolled over
                     ctMinutes = 0;//sets seconds back to zero
                     
                     if (ctHours == 23){
                         ctHours = 0;
                     }//end of if ctHours == 23
                     
                     else {
                         ctHours = ctHours + 1;
                     }//end of else for if ctHours == 23
                     
                 }// end of if ctSeconds == 59
                 
                 else{
                     ctMinutes = ctMinutes + 1; //adds one to minutes
                 }//end of else for if ctMinutes == 59
                 
             }//end of if ctSeconds == 59
             
             else {
                 ctSeconds = ctSeconds + 1; //adds one to minutes
             }//end of else for if ctSeconds == 59
             
         } //end of passTime
         
 
 }  // end class