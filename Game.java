import java.util.*;
class Game
{
	public static void main(String args[])
	{
		int exit = 1;
		do
		{
			Scanner scan = new Scanner(System.in);
			int count = 10;
			String m = "jodha akbar";
			String movie = m.toUpperCase();
			int len = movie.length();
			char film[] = new char[len];
			for(int i=0;i<len;i++)
			{
				if(movie.charAt(i) == ' ')
				{
					System.out.print("/");
					film[i] = '/';
				}
				else
				{	
					System.out.print("_");
					film[i] = '_';
				}
			}
			System.out.println();
			int flag = 0;
			ArrayList<Character> al = new ArrayList<Character>();
			while(count!=0)
			{	
				System.out.println("You have " + count + " chances remaining");
				System.out.print("wrong letters" + al + "\n");
				System.out.print("Guess a letter: ");
				char c = scan.next().charAt(0);
				c = Character.toUpperCase(c);
				int find = 0;
				for(int i = 0;i<len;i++)
				{
					if(movie.charAt(i) == c)
					{
						film[i] = c;
						find++;
					}
				}
				if(find==0)
				{
					if(al.indexOf(c)>=0)
						System.out.println(c + " already guessed.");
					else
					{
						al.add(c);
						count--;
					}
				}
				int num = 0;			
				for(int i=0;i<len;i++)
				{
					if(film[i] == '_')
						num++;
				}
				if (num == 0)
				{
					System.out.println("Congratulations! You have won this game.");
					break;
				}
				System.out.println("--------------------------------------------------------");
				System.out.println(film);
			}
			if (count == 0)
			{
				System.out.println("You lost this game. Better Luck Next Time.");
				System.out.println("movie is: " + movie);
			}
			System.out.println("Enter any number to continue or 0 to exit.");
			exit = scan.nextInt();
		}while(exit!=0);
	}
}