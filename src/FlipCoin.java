
public class FlipCoin {
	public static void main(String[] args) {
		int headsCount = 0;
		int tailsCount=0;
		double heads, tails;
		for(int i=0;i<20; i++)
		{
				if (Math.random() < 0.5){
				System.out.println("Heads");
				headsCount++;
				}else{
				System.out.println("Tails");
				tailsCount++;
				}				
		}
		System.out.println("times heads: "+headsCount);
		System.out.println("times tails: "+tailsCount);
		
		heads = headsCount / (double)20 *100;
		tails = tailsCount / (double)20 *100;
		
		System.out.println("percentage of head: " + heads + "%");
		System.out.println("percentage of tail: " + tails + "%");
	}

}