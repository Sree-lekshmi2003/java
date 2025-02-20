import java.util.*;
class Smatrix
{
public static void main(String args[])
{
 Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter the no. of rows : ");
         
        int r = sc.nextInt();
         
        System.out.println("Enter the no. of columns : ");
         
        int c = sc.nextInt();
         
        int a[][] = new int[r][c];
         
        System.out.println("Enter the elements :");
         
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
         
        System.out.println("Printing the input matrix :");
         
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                System.out.print(a[i][j]+"\t");
            }
             
            System.out.println();
        }
        if(r!=c)
        {
            System.out.println("The given matrix is not a square matrix");
        }
        else
        {
            boolean symmetric = true;
             
            for (int i = 0; i < r; i++)
            {
                for (int j = 0; j < c; j++)
                {
                    if(a[i][j] != a[j][i])
                    {
                        symmetric = false;
                        break;
                    }
                }
            }
             
            if(symmetric)
            {
                System.out.println("The given matrix is symmetric...");
            }
            else
            {
                System.out.println("The given matrix is not symmetric...");
            }
        }
         
        sc.close();
    }
}
        
        
        
        
        
       
        
        
        
