package com.ims.entity;

import java.util.Date;

class Invoice {
	
	String invoiceNumber;
	Date date;
	String raisedBy;
	float amount;
	float discount;

	String getInvoiceNumber() {
		return invoiceNumber;
	}

	void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	Date getDate() {
		return date;
	}

	void setDate(Date date) {
		this.date = date;
	}

	String getRaisedBy() {
		return raisedBy;
	}

	void setRaisedBy(String raisedBy) {
		this.raisedBy = raisedBy;
	}

	float getAmount() {
		return amount;
	}

	void setAmount(float amount) {
		this.amount = amount;
	}

	float getDiscount() {
		return discount;
	}

	void setDiscount(float discount) {
		this.discount = discount;
	}
	
}
