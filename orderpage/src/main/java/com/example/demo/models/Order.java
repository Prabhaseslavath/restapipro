package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="ordertable")
public class Order {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int orderid;
@Size(min=4,max=10)
private String ordername;
private long orderprice;
private String orderaddress;
@Min(value=1)
@Max(value=10)
private short orderquantity;
@Min(100000)
@Max(999999)
private int pincode;
private boolean status;
private String paymenttype;
@Size(min=4,max=8)
private String coupon;
public int getOrderid() {
	return orderid;
}
public void setOrderid(int orderid) {
	this.orderid = orderid;
}
public String getOrdername() {
	return ordername;
}
public void setOrdername(String ordername) {
	this.ordername = ordername;
}
public long getOrderprice() {
	return orderprice;
}
public void setOrderprice(long orderprice) {
	this.orderprice = orderprice;
}
public String getOrderaddress() {
	return orderaddress;
}
public void setOrderaddress(String orderaddress) {
	this.orderaddress = orderaddress;
}
public short getOrderquantity() {
	return orderquantity;
}
public void setOrderquantity(short orderquantity) {
	this.orderquantity = orderquantity;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
public String getPaymenttype() {
	return paymenttype;
}
public void setPaymenttype(String paymenttype) {
	this.paymenttype = paymenttype;
}
public String getCoupon() {
	return coupon;
}
public void setCoupon(String coupon) {
	this.coupon = coupon;
}
public Order(int orderid, String ordername, long orderprice, String orderaddress, short orderquantity, int pincode,
		boolean status, String paymenttype, String coupon) {
	super();
	this.orderid = orderid;
	this.ordername = ordername;
	this.orderprice = orderprice;
	this.orderaddress = orderaddress;
	this.orderquantity = orderquantity;
	this.pincode = pincode;
	this.status = status;
	this.paymenttype = paymenttype;
	this.coupon = coupon;
}
public Order() {
	super();
	// TODO Auto-generated constructor stub
}

}
