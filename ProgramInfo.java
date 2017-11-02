/* **********************************************************
 * Programmer:      McFadden
 * Class:           CS30S
 * 
 * Assignment:      Lab Excercise 2.1
 *
 * Description:     Print banner and closing message
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class ProgramInfo
 {  // begin class
 	
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********
 	
        private String bannerOut;   //string for the banner value
        private final String endMessage = "End of Processing";  //string for the end message
     
 	// ********** constructors ***********
     
        /***********************************
          * Purpose:    Print default banner 
          * 
          * Interface:  None
          * 
          * In:         None
          * Return:     None
        ***********************************/
         public ProgramInfo(){
            
            bannerOut = "*******************************************\n";
            bannerOut += "Name:		Shae McFadden\n";
            bannerOut += "Class:		CS30S\n";
            bannerOut += "Assignment:	\n";
            bannerOut += "*******************************************\n\n";
            
            
        }//end default constructor

         /***********************************
          * Purpose:    Print assignment specific banner
          * 
          * Interface:  None
          * 
          * In:         Assignment value (String)
          * Returns:    None
        ***********************************/
         public ProgramInfo(String assignment){
            
            bannerOut = "*******************************************\n";
            bannerOut += "Name:		Shae McFadden\n";
            bannerOut += "Class:		CS30S\n";
            bannerOut += "Assignment:	" + assignment + "\n";
            bannerOut += "*******************************************\n\n";

        }//end initialized constructor
         
         /***********************************
          * Purpose:    Print assignment specific banner
          * 
          * Interface:  None
          * 
          * In:         Assignment value (int, int)
          * Returns:    None
        ***********************************/
         public ProgramInfo(int A, int Q){
            
            bannerOut = "*******************************************\n";
            bannerOut += "Name:		Shae McFadden\n";
            bannerOut += "Class:		CS30S\n";
            bannerOut += "Assignment:	A" + A + " Q" + Q + "\n";
            bannerOut += "*******************************************\n\n";

        }//end initialized constructor
 	
 	// ********** accessors **********
 	
         // ********** accessors **********
     
         /***********************************
          * Purpose:    Prints Banner
          * 
          * Interface:  None 
          * 
          * In:         None
          * Returns:    None
        ***********************************/

         public void printBanner(){
             System.out.println(bannerOut); //prints banner
         } //end of printBanner
         
         /***********************************
          * Purpose:    Prints end message
          * 
          * Interface:  None 
          * 
          * In:         None
          * Returns:    None
        ***********************************/

         public void printEndMessage(){
             System.out.println(endMessage); //prints end message
         } //end of printEndMessage
         
         /***********************************
          * Purpose:    Returns Banner
          * 
          * Interface:  None 
          * 
          * In:         None
          * Returns:    bannerOut(value)
        ***********************************/

         public String returnBanner(){
             return bannerOut; //returns banner
         } //end of returnBanner
         
         /***********************************
          * Purpose:    Returns Banner
          * 
          * Interface:  None 
          * 
          * In:         None
          * Returns:    endMessage(value)
        ***********************************/

         public String returnEndMessage(){
             return endMessage; //returns end message
         } //end of returnEndMessage
         
 	// ********** mutators **********
 
 }  // end class