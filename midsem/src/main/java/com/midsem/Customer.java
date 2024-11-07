package com.midsem;

public class Customer {
	
  private int cid;
  private String cname;
  private String cadd;
  private Order order;
/**
 * @return the cid
 */
public int getCid() {
	return cid;
}
/**
 * @param cid the cid to set
 */
public void setCid(int cid) {
	this.cid = cid;
}
/**
 * @return the cname
 */
public String getCname() {
	return cname;
}
/**
 * @param cname the cname to set
 */
public void setCname(String cname) {
	this.cname = cname;
}
/**
 * @return the cadd
 */
public String getCadd() {
	return cadd;
}
/**
 * @param cadd the cadd to set
 */
public void setCadd(String cadd) {
	this.cadd = cadd;
}
/**
 * @return the order
 */
public Order getOrder() {
	return order;
}
/**
 * @param order the order to set
 */
public void setOrder(Order order) {
	this.order = order;
}
public Customer(int cid, String cname, String cadd, Order order) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.cadd = cadd;
	this.order = order;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Customer [cid=" + cid + ", cname=" + cname + ", cadd=" + cadd + ", order=" + order + "]";
}


  
  



}
