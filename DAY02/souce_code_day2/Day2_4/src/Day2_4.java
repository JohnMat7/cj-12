//take input from user using command line

// String to int
// NP to P
// UNBOXING 
// String to int ==> Integer.parseInt()
// String to float ==> Float.parseFloat()
// String to double ==> Double.parseDouble() 



class Day2_4
{ 
    public static void main(String args[])
    {
        int n1 = Integer.parseInt(args[0]); //String(NP) to int(P) 
        int n2 = Integer.parseInt(args[1]);//String(NP) to int(P) 
        System.out.println("N1 = "+n1+" N2 = "+n2+ " Result = "+(n1+n2));
        
    }

}

