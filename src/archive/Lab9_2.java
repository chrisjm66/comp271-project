package archive;// Chris Mangan COMP271

import player.Player;
public class Lab9_2 {
    public static void main(String[] args) {
    	// Get the 2D array
        String[][] playerData = getPlayerData();
        
        // Create a player array
        Player[] players = new Player[playerData.length];
        for (int i = 0; i < players.length; i++) {
			players[i] = new Player(playerData[i][0], playerData[i][1], Integer.parseInt(playerData[i][2]));
		}
        
        // Print player names		
        System.out.println("Player names:");
        printPlayers(players);
        
        // Shuffle players
        Player temp;
        int randomIndex;
        for (int i = 0; i < players.length; i++) {
			randomIndex = (int)(Math.random() * players.length);
			temp = players[i];
			players[i] = players[randomIndex];
			players[randomIndex] = temp;
		}
        
        // Reprint player names
        System.out.println("\n\nShuffled player names:");
        printPlayers(players);
    }
    
    private static void printPlayers(Player[] players) {
		for (int i = 0; i < players.length; i++) {
			if(i!=0 && i%5 == 0) {
				System.out.print("\n");
			}
			System.out.printf("%-15s", players[i].getName());
		}
		
	}

	// Define the 2D Array
	private static String[][] getPlayerData() {
		String[][] data = {
				{"0768542", "RaisingRita", "2000"}, 
				{"1432567", "LuckBeALady", "2132"},
				{"2435573", "OneEyedJack", "1400"}, 
				{"2435768", "JimBob", "8200"},  
				{"3476981", "AcesHigh", "8320"}, 
				{"3499981", "Maurice", "46530"},  
				{"4369876", "FullHouse", "2300"}, 
				{"4936876", "Grandma", "5900"},  
				{"5564832", "TheGambler", "3900"}, 
				{"5584326", "Mickie", "3400"},  
				{"6987637", "FoldEm!", "10100"}, 
				{"6987987", "Minnie", "11000"},  
				{"7098255", "Donald", "5500"}, 
				{"7098352", "LuckyLou", "4900"},  
				{"8143876", "BettyBetter", "4550"}, 
				{"8143988", "Pluto", "10750"},  
				{"9745129", "Dino", "1950"}, 
				{"9765122", "Wilma", "5850"},  
				{"9765467", "FastFreddy", "2650"}, 
				{"9867423", "HitMe!", "1600"}
		};
		return data;
	}
	
	
	
}
