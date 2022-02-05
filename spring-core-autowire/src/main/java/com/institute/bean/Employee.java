package com.institute.bean;

public class Employee {
       private int id;
       private String name;
       private Address add;
       private Experience expe;
        public Employee() {
        	
        }
		public Employee(int id, String name, Address add, Experience expe) {
		
			this.id = id;
			this.name = name;
			this.add = add;
			this.expe = expe;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id=id;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
		
		public Address getAdd() {
			return add;
		}
		public void setAdd(Address address) {
			this.add=add;
		}
		
		public Experience getExpe() {
			return expe;
		} 
		public void setExpe(Experience expe) {
			this.expe=expe;
		}
	 
       
}
