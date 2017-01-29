package beersong;

public class BeerSong
{
	public static void main(String args[])
	{
	Ninety_Nine_Bottles_of_Beer(99);	
		}
		public static void Ninety_Nine_Bottles_of_Beer(int b)
	{
		if(b>=0)
		{
			if(b>1){
			System.out.println(b+" bottles of beer on the wall "+b+" bottles of beer");
			System.out.println("Take one down, pass it around "+(b-1)+" bottles of beer on the wall."); 
			System.out.println();
			}
			else if(b==1){
			System.out.println(b+" bottle of beer on the wall "+b+" bottle of beer");
			System.out.println("Take one down, pass it around "+(b-1)+" bottles of beer on the wall.");
			System.out.println();
			}
			else
			{
			System.out.println(b+" bottles of beer on the wall "+b+" bottles of beer");
			System.out.println("Better go to the store and buy some more! ..... 99 bottle of beer on the wall....");
			}
			Ninety_Nine_Bottles_of_Beer(b-1);
		}	
	}
}