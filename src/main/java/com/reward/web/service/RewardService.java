package com.reward.web.service;

import com.reward.web.model.Payment;
import com.reward.web.model.dto.Reward;

/**
 * @author vansh
 *
 */
public interface RewardService {
    
	Payment save(Payment payment);
	
	Reward getRewards(Long userId);
}
