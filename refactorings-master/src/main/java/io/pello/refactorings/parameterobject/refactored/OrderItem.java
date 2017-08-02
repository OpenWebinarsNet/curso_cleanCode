package io.pello.refactorings.parameterobject.refactored;

public class OrderItem {
	private Integer productID;
	private String description;
	private Integer quantity;
	private Float price;
	private Float discount;

	public OrderItem(Integer productID, String description, Integer quantity, Float price, Float discount) {
		this.setProductID(productID);
		this.setDescription(description);
		this.setQuantity(quantity);
		this.setPrice(price);
		this.setDiscount(discount);
	}

	public float totalItem () {
		return (quantity*price) - (quantity*price*discount);
	}
	public Integer getProductID() {
		return productID;
	}

	public void setProductID(Integer productID) {
		this.productID = productID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}
	
	
}