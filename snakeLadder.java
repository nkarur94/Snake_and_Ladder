import java.util.Random;
class snakeLadder{
	int diesRoll=0; //initilization of values
	int newPos=0;

	public void diesRoll(){       //method to perform dies roll
		int min=1;
		
			Random r1=new Random();   // random class object has been created
			diesRoll=min+r1.nextInt(6); //initilazing random type object using nextInt method to get random numbers from 1 to 6
			System.out.println("//////////////");
			System.out.println("No of position to move:"+diesRoll);
	}


	public void snakeOrLadder(){
		 int minn=1;
		 int playerPos=0;
		for (int i=0; newPos<100; i++)
		{
			Random rr1=new Random();
			int diceRoll100=minn+rr1.nextInt(6);
			System.out.println("dice rolled in snake and ladder:"+diceRoll100);
			
			Random r2=new Random(); // object creation
			int playCheck=r2.nextInt(3); // initialization of random typle clas
			playerPos=newPos;	
			
			switch(playCheck)  // to check the case for snake ladder or no play options
			{
				case 1:
					System.out.println("+ladder+");
					System.out.println("dies roll="+diceRoll100);
					System.out.println("player pos="+playerPos);
					newPos=diceRoll100+playerPos;               
					System.out.println("new position="+newPos);
					System.out.println("________");
					break;
				case 2:
					System.out.println("-snake-");
					System.out.println("dies roll="+diceRoll100);
                                	System.out.println("player pos="+playerPos);
					if (diceRoll100>playerPos){
						playerPos=0;
                                		//newPos=diceRoll100-playerPos;
					}
					else {
						newPos=playerPos-diceRoll100;		
					}
                                	System.out.println("new position="+newPos);
					System.out.println("________");
                                	break;
				default:
					System.out.println("#no play#");
					System.out.println("new position="+playerPos);
				        System.out.println("________");

			}

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
	
		//SL.diesRoll(); // calling  diesroll method from object
		//int dies=SL.diesRoll;
		
		SL.snakeOrLadder();//calling the method snake and ladder
	}
}
