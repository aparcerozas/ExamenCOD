package factorial;


public class Factorial {


    public static void main(String[] args) {
    int j = 8;
    int f;       
    int i;
    if (j == 0)
        f = 1;
    else
    {
    f = 1;
        for (i = j; i >= 1; i--)
        {
            f = f * i;
        }
    }    
  
 

    System.out.println(f); 


    }
    
}