import java.util.*;
public class NFL_Draft {

	public static void main(String[] args) {
		player player1 = new player("Tom Brady", "QB", "Patriots", "76 in", "225 lbs", "39", "12", "3554", "28", "2");
		player player2 = new player("Matt Ryan", "QB", "Falcons", "76 in", "217 lbs", "31", "2", "4944", "38", "7");
		player player3 = new player("Aaron Rodgers", "QB", "Packers", "74 in", "225 lbs", "33", "12", "4428", "40", "7");
		player player4 = new player("Le'Veon Bell", "RB", "Steelers", "73 in", "225 lbs", "25", "26", "1268", "7", "NA");
		player player5 = new player("Thomas Rawls", "RB", "Seahawks", "69 in", "215 lbs", "23", "34", "349", "3", "NA");
		player player6 = new player("Devonta Freeman", "RB", "Falcons", "68 in", "206 lbs", "24", "24", "1079", "11", "NA");
	}
	
	PlayerManager players = new PlayerManager();
	
	System.out.print(players.CreatPlayers());
}
