package com.xworkz.games.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.games.dto.GameDTO;
import  static com.xworkz.games.dbconstatnts.DbConstants.*;

public class GameDAO {
	public static boolean saveGame(GameDTO dto) {
		if(dto==null) {
			return false;
		}else
		{
			Connection connection=null;
			PreparedStatement preparedStatement=null;
			try {
				connection=DriverManager.getConnection(JDBCURL,USERNAME,PASSWORD);
				preparedStatement=connection.prepareStatement("insert into games values(?,?,?,?)");
				preparedStatement.setInt(1,dto.getGameId());
				preparedStatement.setString(2,dto.getName());
				preparedStatement.setInt(3,dto.getNoOfPlayers());
				preparedStatement.setString(4,dto.getType());
				preparedStatement.execute();
				return true;
			}catch(SQLException e) {
				e.printStackTrace();
				
			}finally {
				try {
					if(preparedStatement!=null)
						preparedStatement.close();
					if(connection!=null)
						connection.close();
					
					
				}catch(SQLException e) {
					
				}
			}
			return false;
		}
	}

}
