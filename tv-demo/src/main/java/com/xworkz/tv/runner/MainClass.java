package com.xworkz.tv.runner;

import com.xworkz.tv.entity.TVChannel;
import com.xworkz.tv.entity.dao.TVChannelDAO;
import com.xworkz.tv.entity.dao.TVChannelDAOImpl;

public class MainClass {
	public static void main(String[] args) {
		TVChannel channelEntity=new TVChannel();
		channelEntity.setChannelId(1);
		channelEntity.setChannelName("TV9");
		channelEntity.setCost(245.93);
		channelEntity.setLanguage("kannada");
		channelEntity.setType("music");
		channelEntity.setFree(false);
		
		TVChannelDAO channelDAO=new TVChannelDAOImpl();
		channelDAO.saveChannel(channelEntity);
		System.out.println("save successfully");
		
		
	}
	

}
