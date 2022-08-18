import java.util.Scanner;
public class Quiz
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int ans;
        int numberRight = 0;
        
        System.out.println("How Many Letters Are in the Alphabet?");
        System.out.println("1: 20 | 2: 23 | 3: 40 | 4: 26");
        ans = console.nextInt();
        if(ans == 4)
        {
            numberRight += 1;
        }else
        {
            System.out.println(ans);
        }
        System.out.println("What is 9 * 6?");
        System.out.println("1: 36 | 2: 54 | 3: 60 | 4: 50");
        ans = console.nextInt();
        if(ans == 2)
        {
            numberRight += 1;
        }else
        {
            System.out.println(ans);
        }
        System.out.println("What is Captial of The United States?");
        System.out.println("1: Brazil | 2: Colombia | 3: Washington D.C | 4: Washington");
        ans = console.nextInt();
        if(ans == 3)
        {
            numberRight += 1;
        }else
        {
            System.out.println(ans);
        }
        System.out.println("You Got " + numberRight + " Right");
    }
}
