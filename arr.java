import java.util.*;
public class arr {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,flag=0,i,j;
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i!=j)
                {         
                if(a[i]!=a[j])
                {
                    flag=1;
                }
                else
                {
                    flag=0;
                    break;
                }
                }
            }
            if(flag==1)
            {
                System.out.print(a[i]);
            }
        }
    }
    
}
