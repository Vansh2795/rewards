package com.reward.web.model.dto;
/**
 * @author vansh
 *
 */
public class RewardDTO {
	
	private int month;
	private int reward;
	
	public RewardDTO(int month, int reward) {
		super();
		this.month = month;
		this.reward = reward;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getReward() {
		return reward;
	}
	public void setReward(int reward) {
		this.reward = reward;
	}
	
	

}
