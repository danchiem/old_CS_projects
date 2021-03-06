 class Coin
{
	private final int HEADS = 0;
	private final int TAILS = 1;
	
	private int face;
	
	
	public Coin()
	{
		flip();
	}
	
	public void flip()
	{
		face = (int) (Math.random() * 2);
	}
	
	public boolean isHeads()
	{
		return ( face == HEADS);
	}
	
	public String toString()
	{
		String faceName;
		if ( face == HEADS)
			faceName = "Heads";
		else
			faceName = "Tails";
		
		return faceName;
	}
}

	public class Homework5b
{
	public static void main (String[] args)
	{
		Coin coin1 = new Coin();
		Coin coin2 = new Coin();
			
		int counter1 = 0, counter2 = 0, LoopCounter = 0;
		System.out.println ( "coin 1 " + "         " + " coin 2" );
		System.out.println ( " ----------------------------------- " );
		while ( LoopCounter !=3 )
		{
			coin1.flip();
			coin2.flip();
			
			if (coin1.isHeads())
				counter1++;
			else
				counter1 = 0;
			
			if (coin2.isHeads())
				counter2++;
			else
				counter2 = 0;
			System.out.println( (coin1) + "         " + (coin2) );
			
			if (counter1 == 3)
				LoopCounter = 3;
			if (counter2 == 3)
				LoopCounter = 3;
		}
		if ( counter1 == counter2)
			System.out.println (" It is a Tie!" );
		else if ( counter1 == 3)
			System.out.println ( " Coin 1 Wins!" );
		else if ( counter2 == 3)
			System.out.println ( " Coin 2 Wins!" );
	}
}
	