 package com.project.paintshop.morya.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PaymentInfo {
	
//	paymentId NUMBER PRIMARY KEY,
//	paymentDate DATE NOT NULL,
//	orderId NUMBER NOT NULL,
//	cardNumber NUMBER NOT NULL,
//	cardExpiryDate DATE NOT NULL,
//	cardCVV NUMBER NOT NULL,
//	cardHolderName varchar(50) NOT NULL,
//	accountNumber NUMBER NOT NULL,
//	chequeNumber NUMBER NOT NULL,
//	amount NUMBER NOT NULL,

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer paymentId;
	private Integer cardNumber;
	private Date cardExpiryDate;
	private Integer cardCVV;
	private String cardHolderName;
	
	public Integer getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}
	public Integer getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(Integer cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Date getCardExpiryDate() {
		return cardExpiryDate;
	}
	public void setCardExpiryDate(Date cardExpiryDate) {
		this.cardExpiryDate = cardExpiryDate;
	}
	public Integer getCardCVV() {
		return cardCVV;
	}
	public void setCardCVV(Integer cardCVV) {
		this.cardCVV = cardCVV;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	
	@Override
	public String toString() {
		return "PaymentInfo [paymentId=" + paymentId + ", cardNumber=" + cardNumber + ", cardExpiryDate="
				+ cardExpiryDate + ", cardCVV=" + cardCVV + ", cardHolderName=" + cardHolderName + "]";
	}	
}
