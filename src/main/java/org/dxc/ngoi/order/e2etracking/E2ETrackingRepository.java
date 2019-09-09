package org.dxc.ngoi.order.e2etracking;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface E2ETrackingRepository extends JpaRepository<MsgAction, Integer> { 
	
	List<MsgAction> findByMessageId(String messageId);

}
