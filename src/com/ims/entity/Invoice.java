package com.ims.entity;

import java.util.Date;

public class Invoice {

	private String invoiceNumber;
	private Date date;
	private String raisedBy;
	private float amount;
	private float discount;

	public Invoice() {

	}

	public Invoice(String invoiceNumber, Date date, String raisedBy, float amount, float discount) {
		this.invoiceNumber = invoiceNumber;
		this.date = date;
		this.raisedBy = raisedBy;
		this.amount = amount;
		this.discount = discount;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getRaisedBy() {
		return raisedBy;
	}

	public void setRaisedBy(String raisedBy) {
		this.raisedBy = raisedBy;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

}
