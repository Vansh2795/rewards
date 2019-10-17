package com.reward.web.service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reward.web.model.Payment;
import com.reward.web.model.dto.Reward;
import com.reward.web.model.dto.RewardDTO;
import com.reward.web.repository.RewardRepository;
/**
 * @author vansh
 *
 */
@Service
public class RewardServiceImpl implements RewardService {
    @Autowired
    private RewardRepository rewardRepository;

    @Override
    public Payment save(Payment payment) {
    	long amount = payment.getAmount();
    	int rewardPoint = 0;
    	if (amount > 100) {
    		long value = amount - 100;
    		rewardPoint = (int) value*2 + 1*50;    		
    	}else if(amount > 50) {
    		long value = amount - 50;
    		rewardPoint = (int) value*1; 
    	}
    	payment.setRewardPoints(rewardPoint);
    	payment.setDate(LocalDate.now());
    	return rewardRepository.save(payment);
    }
    
    @Override
    public Reward getRewards(Long userId) {
    	String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    	Map<String, Integer> monthMap = new HashMap<>(); 
    	Reward reward = new Reward();
    	int totalRewards = 0;
    	List<RewardDTO> list = rewardRepository.findRewards(userId);
    	
    	for(RewardDTO rewardDTO: list) {
    		monthMap.put(months[rewardDTO.getMonth()-1], rewardDTO.getReward());
    		totalRewards+=rewardDTO.getReward();
    	}
    	
    	reward.setRewards(monthMap);
    	reward.setTotalRewards(totalRewards);
    	reward.setUserId(userId);
    	return reward;
    }
}
