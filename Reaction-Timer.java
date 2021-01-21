import java.time.LocalTime;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;
public class WPMProgram 
{
	public static void main (String [] args) throws InterruptedException
	{
		String [] words={"hammmer","cute ","pretty","marvellous","angel","shineprincess","princess","enchanting","magical fairy","lindas"};
		
		System.out.println("3");
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("2");
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("1");
		TimeUnit.SECONDS.sleep(1);
		
		Random rnum= new Random();
		for(int i=0;i<10 ;i++)
		{
			System.out.print(words[rnum.nextInt(9)]+"  ");
		}
		System.out.println();
		
		double start =LocalTime.now().toNanoOfDay();
		
		Scanner scan=new Scanner(System.in);
		String typeWords= scan.nextLine();
		
		double end  =LocalTime.now().toNanoOfDay();
		
		double elapsedTime=end - start;
		
		double seconds=elapsedTime/ 1000000000.0;
		System.out.println(seconds);
		
		int numChars=typeWords.length();
		int wpm =(int) ((((double)numChars / 5) /seconds )*60);
		
		System.out.println("Your wpm is " + wpm + " ! ");
		
		
		
	}
	
}
