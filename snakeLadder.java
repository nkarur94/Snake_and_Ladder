import java.util.Random;
class snakeLadder{
	int diesRoll=0; //initilization of values
	int newPos=0;

	public void diesRoll(){       //method to perform dies roll
		int min=1;

		Random r1=new Random();   // random class object has been created
		diesRoll=min+r1.nextInt(6); //initilazing random type object using nextInt method to get random numbers from 1 to 6

		System.out.println("No of position to move:"+diesRoll);
	}


	public void snakeOrLadder(int dies, int playerPosition){
		Random r2=new Random(); // object creation
		int playCheck=r2.nextInt(3); // initialization of random typle clas
		
		switch(playCheck)  // to check the case for snake ladder or no play options
		{
			case 1:
				System.out.println("+ladder+");
				System.out.println("dies roll-"+diesRoll);
				System.out.println("player pos--"+playerPosition);
				newPos=diesRoll+playerPosition;               
				System.out.println("new position::"+newPos);
				break;
			case 2:
				System.out.println("-snake-");
				System.out.println("dies roll--"+diesRoll);
                                System.out.println("player pos--"+playerPosition);
                                newPos=diesRoll-playerPosition;
                                System.out.println("new position:"+newPos);
                                break;
			default:
				System.out.println("#no play#");
				System.out.println("new position:"+newPos);

		}
	}
	

	public static void main(String[] args)
	{
		String playerName="Nithun";
                int playerPosition=0;

		System.out.println("welcome to SNAKE and LADDER Game");
		System.out.println("********************************");
		System.out.println("Welcome\t"+playerName+"\t*LETS START THE GAME* \n*Your initial postion is*-->"+playerPosition);
                System.out.println("-----------------------------------------------");

		snakeLadder SL=new snakeLadder(); // object creation
	
		SL.diesRoll(); // calling  diesroll method from object
		int dies=SL.diesRoll;
		
		SL.snakeOrLadder(dies, playerPosition);//calling the method snake and ladder
	}
}
