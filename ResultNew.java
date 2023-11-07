/* 
NAME : RITURAJ KUMAR

BRANCH : COMPUTER SCIENCE
SEMESTER: 3RD
YEAR: SECOND
GROUP: CS-3

HTTPS://WWW.RITURAJKUMAR.COM

Note: variable names Starting with "d" is just for denoting "diploma", Read variable names without the Starting "d".
 */

import java.util.Scanner;

public class ResultNew
{
    public static void main(String[] args)
    {  
        
        System.out.println("Choose Which Result to Calculate :-->\n");
        System.out.println("1. Diploma (Enter 1)\n2. B.tech (Enter 2)\n");
        Scanner choice = new Scanner(System.in);
        int ch = choice.nextInt();

        switch (ch) {
            case 1:
        try 
        {
             Thread.sleep(500);
        } catch (InterruptedException e) {
             System.out.println("Got Interuppted !!");
                }
        //print message to Enter Marks
            System.out.println("\nWelcome to Diploma Result Calculator by Rituraj Kumar\n");


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Got Interrupted !!");
        }
            System.out.println("Student of Computer Science And Engineering\n");


        try {
            Thread.sleep (1000);
        } catch (InterruptedException e) {
            System.out.println("Got Interrupted !!");
        }
            System.out.println("At Indore Institute of Science and Technology\n");


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Got Interrupted !!");
        }
            System.out.println("Enter Your Semester Marks Below-->>");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Got Interuppted !!");
        }
            
            //new scanner object
                Scanner duser_input = new Scanner(System.in);

            //floating type array
                float[] dsem = new float[7];

            //floating type array
                float[] dsemester = new float[7];
          
            //for loop to get user inputs
            for(float di = 0; di < dsem.length;)
                {
                    //storing i into var to use in showing sem 1 to 6 message
                    float dvar = di;
    
                    //storing var+1 value into string type variable
                    String distr = String.valueOf(dvar+1);
                        if(di<=5)

                        {
                            //Show message to enter marks
                            System.out.println("Semester "+ distr.substring(0,1) +  " Marks");
                        }

                        else if(di==5)

                        {
                            System.out.println("Enter \"Total\" Marks in Semester :--> \n");
                        }

                        else

                        {
                            System.out.println("Enter \"Total\" Academic Marks :--> \n");
                        }
                
                    //store user inputs in value variable to use later on
                        float dvalue = duser_input.nextFloat();
            
            
                if(dvalue>=300 && dvalue<=750)
                { 
                    //store the value in the corresponding array element
                    dsem[(int) di] = dvalue;

                    //store the value in the corresponding array element for each semester
                    dsemester[(int) di] = dvalue;
                    di++;
                }
                    //run this if user is failed and got less than 300 marks
                else if (dvalue<300) 
                    {
                    //variable for showing you are "failed"    
                        System.out.println("Sorry ! You are Failed in Semester " +  distr.substring(0,1) + "\n");
                
                    }
                //run this to store total academic marks
                else if (di==6)
                    {
                        dsemester[(int) di] = dvalue;
                        di++;
                    }    
                    // run this if user enters invalid marks in any of the semester
                else
                    {
                        //request user to enter valid marks in semester
                        System.out.println("Please Enter Valid Marks in Semester " + distr.substring(0,1));
                    }
        }

                 //close the Scanner object
                    duser_input.close();
                    System.out.println("Calculating Your Result.....");
                 
                 try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("Got Interuppted !!");
                }



            //add sem 1 to 5
                float dsem1to5 = dsem[0]+dsem[1]+dsem[2]+dsem[3]+dsem[4]; 

            //add sem 1 to 5 and get 40%
                float dfortypercent = (int) (dsem1to5*0.4);  

            //fourty percent of 1st sem to 5th sem added with 6th sem
                float dtotalmarks = dfortypercent+dsem[5];    

            //academic
                float dpercentage = (dtotalmarks/dsemester[6])*100;

            //cumulative Grade Point Average
                float dCGPA = (float) (dpercentage/9.5);  
                           
            //copy percentage float to percentstr
                String dpercentstr = String.valueOf(dpercentage); 

            //copy CGPA to CGPAstr
                String dCGPAstr = String.valueOf(dCGPA);

            //print user semesterwise performance via loop
            for(float dj = 0; dj < dsem.length; dj++)
                {
                    //created for use to convert int to string
                        float dJ = dj; 

                    //Jstr stores Value of int (j) as "String" 
                        String dJstr = String.valueOf(dJ+1);
                    if(dj <= 5)
                    {
                        //Print Your performance Semesterwise
                        System.out.println("\nYour Performance in Semester " + dJstr.substring(0,1) + ":-->\n");
                    

                        //copying int variables to string or converting int to string
                        String dmarksstr = String.valueOf(dsemester[(int) dj]);
                        String dsempercentstr = String.valueOf(((dsemester[(int) dj])/750)*100);
                        String dsemcgpastr = String.valueOf((((dsemester[(int) dj])/750)*100)/9.5);

                         //printing semester marks, percentage and CGPA
                        System.out.println("Marks :--> " + dmarksstr.substring(0,3));
                        System.out.println("Percentage :--> " + dsempercentstr.substring(0,4) + "%");
                        System.out.println("CGPA :--> " + dsemcgpastr.substring(0,4) + "\n" );
                    }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Got Interuppted !!");
                }

            }
            // dummy waiting message using thread function
                System.out.println("Calculating Your Overall Academic Result.....\n");

            try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Got Interuppted !!");
                }
                
            //printing Overall Academic result below
                System.out.println("Your Overall Academic Percentage is :--> " + dpercentstr.substring(0,4)+"\n");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Got Interuppted !!");
            }

                System.out.println("Your Overall Academic CGPA is Around :--> " + dCGPAstr.substring(0,4) + "\n");
                System.out.println("Thank You for using This Diploma Result Calculator By Rituraj Kumar\n ");
                break;




        case 2:
        try 
        {
             Thread.sleep(500);
        } catch (InterruptedException e) {
             System.out.println("Got Interuppted !!");
                }
        //print message to Enter Marks
            System.out.println("\nWelcome to B.Tech Result Calculator by Rituraj Kumar\n");


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Got Interrupted !!");
        }
            System.out.println("Student of Computer Science And Engineering\n");


        try {
            Thread.sleep (1000);
        } catch (InterruptedException e) {
            System.out.println("Got Interrupted !!");
        }
            System.out.println("At Indore Institute of Science and Technology\n");


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Got Interrupted !!");
        }
            System.out.println("Enter Your Semester Marks Below-->>");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Got Interuppted !!");
        }
            
            //new scanner object
                Scanner user_input = new Scanner(System.in);

            //floating type array
                float[] sem = new float[9];

            //floating type array
                float[] semester = new float[9];
            
            //for loop to get user inputs
            for(float i = 0; i < sem.length;)
                {
                    //storing i into var to use in showing sem 1 to 6 message
                    float var = i;

                    //storing var+1 value into string type variable
                    String istr = String.valueOf(var+1);
                        if(i<=7)

                        {
                            //Show message to enter marks
                            System.out.println("Semester "+ istr.substring(0,1) +  " Marks");
                        }

                        else if(i==7)

                        {
                            System.out.println("Enter \"Total\" Marks in Semester :--> \n");
                        }

                        else

                        {
                            System.out.println("Enter \"Total\" Academic Marks :--> \n");
                        }
                
                    //store user inputs in value variable to use later on
                        float value = user_input.nextFloat();
            
            
                if(value>=300 && value<=750)
                { 
                    //store the value in the corresponding array element
                    sem[(int) i] = value;

                    //store the value in the corresponding array element for each semester
                    semester[(int) i] = value;
                    i++;
                }
                    //run this if user is failed and got less than 300 marks
                else if (value<300) 
                    {
                    //variable for showing you are "failed"    
                        System.out.println("Sorry ! You are Failed in Semester " +  istr.substring(0,1) + "\n");                        
                    }
                //run this to store total academic marks
                else if (i==8)
                    {
                        semester[(int) i] = value;
                        i++;
                    }    
                    // run this if user enters invalid marks in any of the semester
                else
                    {
                        //request user to enter valid marks in semester
                        System.out.println("Please Enter Valid Marks in Semester " + istr.substring(0,1));
                    }
        }

                 //close the Scanner object
                    user_input.close();
                    System.out.println("Calculating Your Result.....");
                 
                 try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("Got Interuppted !!");
                }



            //add sem 1 to 8
                float sem1to8 = sem[0]+sem[1]+sem[2]+sem[3]+sem[4]+sem[5]+sem[6]+sem[7]; 

            // //add sem 1 to 5 and get 40%
            //     float fortypercent = (int) (sem1to5*0.4);  

            // //fourty percent of 1st sem to 5th sem added with 6th sem
            //     float totalmarks = fortypercent+sem[5];   

            //academic
                float percentage = (sem1to8/semester[8])*100;

            //cumulative Grade Point Average
                float CGPA = (float) (percentage/9.5);  
                           
            //copy percentage float to percentstr
                String percentstr = String.valueOf(percentage); 

            //copy CGPA to CGPAstr
                String CGPAstr = String.valueOf(CGPA);

            //print user semesterwise performance via loop
            for(float j = 0; j < sem.length; j++)
                {
                    //created for use to convert int to string
                        float J = j; 

                    //Jstr stores Value of int (j) as "String" 
                        String Jstr = String.valueOf(J+1);
                    if(j <= 7)
                    {
                        //Print Your performance Semesterwise
                        System.out.println("\nYour Performance in Semester " + Jstr.substring(0,1) + ":-->\n");
                    

                        //copying int variables to string or converting int to string
                        String marksstr = String.valueOf(semester[(int) j]);
                        String sempercentstr = String.valueOf(((semester[(int) j])/750)*100);
                        String semcgpastr = String.valueOf((((semester[(int) j])/750)*100)/9.5);

                         //printing semester marks, percentage and CGPA
                        System.out.println("Marks :--> " + marksstr.substring(0,3));
                        System.out.println("Percentage :--> " + sempercentstr.substring(0,4) + "%");
                        System.out.println("CGPA :--> " + semcgpastr.substring(0,4) + "\n" );
                    }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Got Interuppted !!");
                }

            }
            // dummy waiting message using thread function
                System.out.println("Calculating Your Overall Academic Result.....\n");

            try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Got Interuppted !!");
                }
                
            //printing Overall Academic result below
                System.out.println("Your Overall Academic Percentage is :--> " + percentstr.substring(0,4)+"\n");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Got Interuppted !!");
            }

                System.out.println("Your Overall Academic CGPA is Around :--> " + CGPAstr.substring(0,4) + "\n");
                System.out.println("Thank You for using This B.Tech Result Calculator By Rituraj Kumar\n ");
                break;
    
                default: System.out.println("Some Error Occured...!!");
            }

    
    }
}
            
