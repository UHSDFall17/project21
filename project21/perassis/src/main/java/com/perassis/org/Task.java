package com.perassis.org;

import java.util.Scanner;

public class Task
{

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Add your Remainder \n 2.Modify your Remainder \n 3. Delete your Remainder");
		int task = scanner.nextInt();


	   if(task==1)

	     {
		      Add();
	     }
	
       else if (task ==2)
	 
	     {
       		  Modify();
       	 }

 	   else
	     {
 		  	  Delete();
	     }
    
	}


	


	Add()

	 {
		System.out.println("For which day you want to add the task \n 1.Today \n2.Tomorrow \n3.Some day");
		int day = scanner.nextInt();
		   
		switch(day)
		{
		
       			 case '1' :
       				 Today();
        			 break;
        
      			  case '2' :
      				  Tomorrow();
      				  break;
			
        		case '3' :
        			Someday();
        			break;
			
        		default :
           			System.out.println("Invalid grade");
       	 }
		
	 }
		
		
		
		Today()
		{
			System.out.println("1.Call \n 2.Check\n 3.Wish \n 4.Email \n 5.Buy \n 6.Meet/Schedule \n 7.Clean \n 8.Pay \n 9.Study \n 10.Other");
			/*Jump to the Specific Function*/
		}
		
		
		Tomorrow()
		{
			System.out.println("1.Call \n 2.Check\n 3.Wish \n 4.Email \n 5.Buy \n 6.Meet/Schedule \n 7.Clean \n 8.Pay \n 9.Study \n 10.Other");
			/*Jump to the Specific Function*/
		}
		
		Someday()
		{
			/* Get the date */
			System.out.println("1.Call \n 2.Check\n 3.Wish \n 4.Email \n 5.Buy \n 6.Meet/Schedule \n 7.Clean \n 8.Pay \n 9.Study \n 10.Other");
			/*Jump to the Specific Function*/
		}
		
		
		
		
		Call()
		{
			/*Name and Number, Date/Time*/
		}
		
		Check()
		{
			/*Check for String, Date/Time*/
		}
		
		Wish()
		{
			/*Wish name, Date/Time*/
		}
		
		Email()
		{
			/*Email-id, Date/Time*/
		}
		
		Buy()
		{
			/*Buy Product, string, Date/Time */
		}
		
		Meet()
		{
			/*Person name, Date/Time*/
		}
		
		Clean()
		{
			/*clean the item, Date/Time*/
		}
		
		Pay()
		{
			/*Pay for Name, Date/Time*/
		}
		
		Study()
		{
			/*Study String, Date/Time*/
		}
		
		Other()
		{
			/*Any String, Date/Time*/
		}



	    }





	Modify()
	  
	    {
		System.out.println("For which day you want to modify the task \n 1.Today \n2.Tomorrow \n3.Some day");
		int day1 = scanner.nextInt();


		switch(day)
		{
		
       			 case '1' :

				/*List down all the tasks
				Get the Specific Task number and Display it
				Get the modified task and replace the old one with this in the database*/
        			break;
        
      			  case '2' :
        			break;
			
        		case '3' :
        			break;
			
        		default :
           			System.out.println("Invalid grade");
       		 }
	    }



	
	delete()
	  
	    {
		System.out.println("For which day you want to delete the task \n 1.Today \n2.Tomorrow \n3.Some day");
		int day1 = scanner.nextInt();


		switch(day)
		{
		
       			 case '1' :

       				 /*List down all the tasks
       				 Get the Specific Task number and Display it
       				 Delete the task from the database*/
        			break;
        
      			  case '2' :
        			break;
			
        		case '3' :
        			break;
			
        		default :
           			System.out.println("Invalid grade");
       		
	 }


}




		

		

