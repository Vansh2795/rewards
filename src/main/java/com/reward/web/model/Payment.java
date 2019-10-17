package com.reward.web.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author vansh
 *
 */
@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentType;
    
    private Long amount;

    private LocalDate date;
    
    private Integer rewardPoints;
    
    private Long userId;
    
    private Long orderId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		if(date == null)
		 date = LocalDate.now();
		return date;
	}

	public void setDate(LocalDate date) {		
		  this.date = date;
	}

	public Integer getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(Integer rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
       
}
