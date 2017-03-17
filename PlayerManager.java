import java.util.*;
public class PlayerManager {
	
	public void CreatPlayers(){
		player[] NFLArray;
		NFLArray= new player[6];
		NFLArray[0] = new player("Tom Brady", "QB", "Patriots", 76, 225, 39, 12, 3554, 28, 2);
		NFLArray[1] = new player("Matt Ryan", "QB", "Falcons", 76, 217, 31, 2, 4944, 38, 7);
		NFLArray[2] = new player("Aaron Rodgers", "QB", "Packers", 74, 225, 33, 12, 4428, 40, 7);
		NFLArray[3] = new player("Le'Veon Bell", "RB", "Steelers", 73, 225, 25, 26, 1268, 7, 0);
		NFLArray[4] = new player("Thomas Rawls", "RB", "Seahawks", 69, 215, 23, 34, 349, 3, 0);
		NFLArray[5] = new player("Devonta Freeman", "RB", "Falcons", 68, 206, 24, 24, 1079, 11, 0);
		
		for(int i = 0; i <=5 ; i ++)
			
			System.out.print("The names of the players that are available for draft are: "+NFLArray[i].getname() + "\n");
		
}
}
