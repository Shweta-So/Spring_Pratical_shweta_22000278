package com.midsem;

public class Order {
	
	 int oid;
	 String oname; 
	 String qty;
	/**
	 * @return the oid
	 */
	public int getOid() {
		return oid;
	}
	/**
	 * @param oid the oid to set
	 */
	public void setOid(int oid) {
		this.oid = oid;
	}
	/**
	 * @return the oname
	 */
	public String getOname() {
		return oname;
	}
	/**
	 * @param oname the oname to set
	 */
	public void setOname(String oname) {
		this.oname = oname;
	}
	/**
	 * @return the qty
	 */
	public String getQty() {
		return qty;
	}
	/**
	 * @param qty the qty to set
	 */
	public void setQty(String qty) {
		this.qty = qty;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int oid, String oname, String qty) {
		super();
		this.oid = oid;
		this.oname = oname;
		this.qty = qty;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", oname=" + oname + ", qty=" + qty + "]";
	}
	
	
	
	

}
