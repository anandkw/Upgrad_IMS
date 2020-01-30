package com.ims.entity;

/**
 * @author sahilgupta
 *
 */
public class Order {
	
	private String id;
	private String productName;
	private int productQuantity;
	private String status;
	private String supplierId;
	private String inventoryManagerId;
	
	public Order() {
		super();
	}

	public Order(String productName, int productQuantity,String supplierId) {
		super();
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.status = "placed";
		this.supplierId = supplierId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getInventoryManagerId() {
		return inventoryManagerId;
	}

	public void setInventoryManagerId(String inventoryManagerId) {
		this.inventoryManagerId = inventoryManagerId;
	}
}
