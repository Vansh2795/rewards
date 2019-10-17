package com.reward.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.reward.web.model.Payment;
import com.reward.web.model.dto.RewardDTO;
/**
 * @author vansh
 *
 */
public interface RewardRepository extends JpaRepository<Payment, Long> {
	
	@Query(value = "select new com.reward.web.model.dto.RewardDTO(month(p.date) as month, sum(p.reward_points) as reward) from payment p where p.user_id=?1 group by month", nativeQuery = true)
	List<RewardDTO> findRewards(@Param ("userId") Long userId);
}
