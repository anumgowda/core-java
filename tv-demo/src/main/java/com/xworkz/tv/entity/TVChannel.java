package com.xworkz.tv.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
 @Data
	@Entity
	@Table(name="tv_channel")


	public class TVChannel {
		@Id
		@Column(name="channel_id")
		private  int channelId;
		private String channelName;
		private double cost;
		private String language;
		private String type;
		private boolean isFree;
		


}
