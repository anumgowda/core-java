package games;

import java.util.Scanner;

import com.xworkz.games.dao.GameDAO;
import com.xworkz.games.dto.GameDTO;

public class gameTester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter a id");
		 int id=sc.nextInt();
		 System.out.println("enter a name");
		 String name=sc.next();
		 System.out.println("enter a no of players");
		 int noOfPlayers=sc.nextInt();
		 System.out.println("enter type of game");
		 String type=sc.next();
		 GameDTO dto =new GameDTO (id,name,noOfPlayers,type);
		  boolean SaveStatus=GameDAO.saveGame(dto);
		  if(SaveStatus) {
			  System.out.println("save successfully");
		  }else {
			  System.out.println("save unsuccessful");
		  }
		 
	}

}
