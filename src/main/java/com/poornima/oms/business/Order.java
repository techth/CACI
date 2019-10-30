package com.poornima.oms.business;

public class Order {

	private int id;
	private String desc;
	private int amount;
	private Boolean isDispatched;
	private int noOfBricks;
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", desc=" + desc + ", amount=" + amount + ", isDispatched=" + isDispatched
				+ ", noOfBricks=" + noOfBricks + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Boolean getIsDispatched() {
		return isDispatched;
	}

	public void setIsDispatched(Boolean isDispatched) {
		this.isDispatched = isDispatched;
	}

	public int getNoOfBricks() {
		return noOfBricks;
	}

	public void setNoOfBricks(int noOfBricks) {
		this.noOfBricks = noOfBricks;
	}

	public Order(int id, String desc, int amount, Boolean isDispatched, int noOfBricks)
	{
		this.id=id;
		this.desc=desc;
		this.amount=amount;
		this.isDispatched = isDispatched;
		this.noOfBricks = noOfBricks;
	}
}
