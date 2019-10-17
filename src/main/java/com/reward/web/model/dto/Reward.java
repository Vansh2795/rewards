package com.reward.web.model.dto;

import java.util.Map;

/**
 * @author vansh
 *
 */
public class Reward {
	
	private Long userId;
	private Map<String, Integer> rewards;
	private Integer totalRewards;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Map<String, Integer> getRewards() {
		return rewards;
	}
	public void setRewards(Map<String, Integer> rewards) {
		this.rewards = rewards;
	}
	public Integer getTotalRewards() {
		return totalRewards;
	}
	public void setTotalRewards(Integer totalRewards) {
		this.totalRewards = totalRewards;
	}
}
