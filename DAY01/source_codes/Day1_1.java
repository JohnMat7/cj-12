// Print the "Hello Everyone"
/*
Author : Dr.Akshita
Organization  :Sunbeam
Date : 1st August 2023
Program  : Printing the "Hello Every one"
Name : Day1_1.java
*/ 

class Day1_1
{
    //entry point method / function
    public static void main(String args[])
    {
        System.out.println("Hello Everyone!!"); 
    }    
}

//Compilation
//C:\Users\sunbeam\Desktop\Code\DAY1> javac Day1_1.java
// Execution 
//C:\Users\sunbeam\Desktop\Code\DAY1> java Day1_1
//Output
//Hello Everyone!!



// main() is called by OS
// OS is outside this scope of the program
// main() is called by OS which is outside the program 
// thats why we declare main() as public 

// since main() is not returning any value so its return type is void

//main() is a keyword from which OS will understand its entry point function


// main() is a method which is declared as static
// main() is declared in class Day1_1
// we donot create object of class in which main() is residing



// the file name of the java program must be same 
// as the class name in which main() is residing
// javac Day1_1.java ===> Day1_1.class
// java Day1_1 ===> Execution phase
// OS will search entry point function main() inside Day1_1.class
// that why we keep the same name as the class name in which main is present


//String args[] are used for taking command line arguments
