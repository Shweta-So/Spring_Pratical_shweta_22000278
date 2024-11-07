package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;


public class emp {
	
		private String name;
		private List<String> phone;
		private Set<String> Address;
		private Map<String,String> courses;
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the phone
		 */
		public List<String> getPhone() {
			return phone;
		}
		/**
		 * @param phone the phone to set
		 */
		public void setPhone(List<String> phone) {
			this.phone = phone;
		}
		/**
		 * @return the address
		 */
		public Set<String> getAddress() {
			return Address;
		}
		/**
		 * @param address the address to set
		 */
		public void setAddress(Set<String> address) {
			Address = address;
		}
		/**
		 * @return the courses
		 */
		public Map<String, String> getCourses() {
			return courses;
		}
		/**
		 * @param courses the courses to set
		 */
		public void setCourses(Map<String, String> courses) {
			this.courses = courses;
		}
		
		public emp() {
			super();
			// TODO Auto-generated constructor stub
		}
		public emp(String name, List<String> phone, Set<String> address, Map<String, String> courses) {
			super();
			this.name = name;
			this.phone = phone;
			Address = address;
			this.courses = courses;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "emp [name=" + name + ", phone=" + phone + ", Address=" + Address + ", courses=" + courses + "]";
		}
		
		

}
