import java.util.Random;
class snakeLadder{
	public void diesRoll(){
		Random r1=new Random();
		int min=1;
		int diesRoll=min+r1.nextInt(6);
		System.out.println("No of position to move:"+diesRoll);

	}
	public static void main(String[] args)
	{
		System.out.println("welcome to SNAKE and LADDER Game");
		System.out.println("********************************");
		String playerName="Nithun";
		int playerPosition=0;
		System.out.println("Welcome\t"+playerName+"\t*LETS START THE GAME* Your initial postion is:"+playerPosition);
		System.out.println("--------------------------------------------------------------------------------");
		snakeLadder SL=new snakeLadder();
		SL.diesRoll();
	}
}
