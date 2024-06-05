package knorex;

public class Question_2 
{
	public static void printTheSequence(int a, int b, int n) 
	{
        int sum = a;
        
        
        for (int i = 1; i < n; i++)
        {
            sum += Math.pow(2, i - 1) * b;
            System.out.print(" " + sum);
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        int a1 = 0, b1 = 2, n1 = 10;
        printTheSequence(a1, b1, n1); 
        
        int a2 = 5, b2 = 3, n2 = 5;
        printTheSequence(a2, b2, n2);
    }
}
	
		

	


