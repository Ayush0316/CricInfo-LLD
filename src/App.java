import com.cricinfo.dao.person.*;
import com.cricinfo.enums.*;
import com.cricinfo.interfaces.*;
import com.cricinfo.services.*;

public class App {
    public static void main(String[] args) throws Exception {
        // This is the main entry point of the application.
        // You can initialize your application here, set up the environment, or run tests.
        System.out.println("Welcome to the Cricket Information System!");
        
        // Create teams
        TeamService teamService = new TeamServiceImpl();
        teamService.createTeam("India");
        teamService.createTeam("Australia");

        // Indian Players
        teamService.addPlayerToTeam("India", new Player("Rohit Sharma", null, PlayerType.BATSMAN, null));
        teamService.addPlayerToTeam("India", new Player("Virat Kohli", null, PlayerType.BATSMAN, null));
        teamService.addPlayerToTeam("India", new Player("Shubman Gill", null, PlayerType.BATSMAN, null));
        teamService.addPlayerToTeam("India", new Player("KL Rahul", null, PlayerType.WICKET_KEEPER, null));
        teamService.addPlayerToTeam("India", new Player("Shreyas Iyer", null, PlayerType.BATSMAN, null));
        teamService.addPlayerToTeam("India", new Player("Hardik Pandya", null, PlayerType.ALL_ROUNDER, null));
        teamService.addPlayerToTeam("India", new Player("Ravindra Jadeja", null, PlayerType.ALL_ROUNDER, null));
        teamService.addPlayerToTeam("India", new Player("Jasprit Bumrah", null, PlayerType.BOWLER, null));
        teamService.addPlayerToTeam("India", new Player("Mohammed Shami", null, PlayerType.BOWLER, null));
        teamService.addPlayerToTeam("India", new Player("Kuldeep Yadav", null, PlayerType.BOWLER, null));
        teamService.addPlayerToTeam("India", new Player("Suryakumar Yadav", null, PlayerType.BATSMAN, null));
        teamService.addPlayerToTeam("India", new Player("Ishan Kishan", null, PlayerType.WICKET_KEEPER, null));
        teamService.addPlayerToTeam("India", new Player("Axar Patel", null, PlayerType.ALL_ROUNDER, null));
        teamService.addPlayerToTeam("India", new Player("Mohammed Siraj", null, PlayerType.BOWLER, null));

        // Australian Players
        teamService.addPlayerToTeam("Australia", new Player("Pat Cummins", null, PlayerType.BOWLER, null));
        teamService.addPlayerToTeam("Australia", new Player("David Warner", null, PlayerType.BATSMAN, null));
        teamService.addPlayerToTeam("Australia", new Player("Steve Smith", null, PlayerType.BATSMAN, null));
        teamService.addPlayerToTeam("Australia", new Player("Marnus Labuschagne", null, PlayerType.BATSMAN, null));
        teamService.addPlayerToTeam("Australia", new Player("Glenn Maxwell", null, PlayerType.ALL_ROUNDER, null));
        teamService.addPlayerToTeam("Australia", new Player("Mitchell Marsh", null, PlayerType.ALL_ROUNDER, null));
        teamService.addPlayerToTeam("Australia", new Player("Alex Carey", null, PlayerType.WICKET_KEEPER, null));
        teamService.addPlayerToTeam("Australia", new Player("Marcus Stoinis", null, PlayerType.ALL_ROUNDER, null));
        teamService.addPlayerToTeam("Australia", new Player("Josh Hazlewood", null, PlayerType.BOWLER, null));
        teamService.addPlayerToTeam("Australia", new Player("Mitchell Starc", null, PlayerType.BOWLER, null));
        teamService.addPlayerToTeam("Australia", new Player("Adam Zampa", null, PlayerType.BOWLER, null));
        teamService.addPlayerToTeam("Australia", new Player("Travis Head", null, PlayerType.BATSMAN, null));
        teamService.addPlayerToTeam("Australia", new Player("Cameron Green", null, PlayerType.ALL_ROUNDER, null));
        teamService.addPlayerToTeam("Australia", new Player("Sean Abbott", null, PlayerType.BOWLER, null));

        
    }
}
