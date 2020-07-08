package com.springboot.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class FeedBack {
	
	@Id
	@GeneratedValue
	private int id;
	private String fname;
	public FeedBack() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private String lname;
	private String email;
	private String address;
	private String product;
	private String value;
	private String sati;
	private String pros;
	private String changes;
	
	

public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getFname() {
		return fname;
	}




	public void setFname(String fname) {
		this.fname = fname;
	}




	public String getLname() {
		return lname;
	}




	public void setLname(String lname) {
		this.lname = lname;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public String getProduct() {
		return product;
	}




	public void setProduct(String product) {
		this.product = product;
	}




	public String getValue() {
		return value;
	}




	public void setValue(String value) {
		this.value = value;
	}




	public String getSati() {
		return sati;
	}




	public void setSati(String sati) {
		this.sati = sati;
	}




	public String getPros() {
		return pros;
	}




	public void setPros(String pros) {
		this.pros = pros;
	}




	public String getChanges() {
		return changes;
	}




	public void setChanges(String changes) {
		this.changes = changes;
	}




public FeedBack(String fname, String lname, String email, String address, String product, String value, String sati,
			String pros, String changes) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.address = address;
		this.product = product;
		this.value = value;
		this.sati = sati;
		this.pros = pros;
		this.changes = changes;
	}




@Override
public String toString() {
	return "Feedback [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", address=" + address
			+ ", product=" + product + ", value=" + value + ", sati=" + sati + ", pros=" + pros + ", changes=" + changes
			+ "]";
}


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        FeedBack other = (FeedBack) obj;
        if (id != other.id) {
            return false;
        }
        return true;
    }


}