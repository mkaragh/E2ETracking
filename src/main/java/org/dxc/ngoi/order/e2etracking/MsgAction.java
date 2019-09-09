package org.dxc.ngoi.order.e2etracking;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MSG_ACTION")
public class MsgAction {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ACTION_ID") 
	private String action_id;
	
	@Column(name = "MESSAGE_ID") 
	private Integer messageId;
	 
	@Column(name = "RECEIVED_DATE") 
	private String receivedDate;
	
	@Column(name = "ACTION") 
	private String action;

	public Integer getMessageId() {
		return messageId;
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	public String getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(String receivedDate) {
		this.receivedDate = receivedDate;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	

}
