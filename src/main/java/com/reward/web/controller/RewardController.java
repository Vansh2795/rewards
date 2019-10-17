package com.reward.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reward.web.model.Payment;
import com.reward.web.model.dto.Reward;
import com.reward.web.service.RewardService;

/**
 * @author vansh
 *
 */
@RestController
@RequestMapping("/api/reward")
public class RewardController {

	@Autowired
	RewardService rewardService;

	
	  // this method used to get rewards for 3 months
	  
	  @GetMapping(value ="/rewards", produces = MediaType.APPLICATION_JSON_VALUE)
	  public ResponseEntity<?> getRewards(@RequestParam Long userId){ 
		  Reward reward = rewardService.getRewards(userId); 
		  return new ResponseEntity<>(reward, HttpStatus.OK); 
	   }
	 

	// this method used to make payment
	@PostMapping(value = "/payment", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> savePayment(@RequestBody Payment payment) {
		Payment pay = rewardService.save(payment);
		return new ResponseEntity<Payment>(pay, HttpStatus.CREATED);
	}

}
