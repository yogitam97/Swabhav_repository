package com.techlabs.actions;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.model.Contact;
import com.techlabs.service.ContactService;

public class EditAction extends ActionSupport {
	private Contact c = null;
	private static String id;
	private static String name;
	private static String address;
	private static String number;
	private static String email;
	private static int counter = 0;
	private static int conc = 0;

	public EditAction() {
		if (counter == 2 && conc == 4) {
			counter = 0;
			conc = 0;
		}
	}

	public void validate() {

		this.c = ContactService.getInstance().getOBJ(this.id);
		;
		if (counter >= 2) {
			this.name = getName();
			this.number = getNumber();
			this.address=getAddress();
			this.email = getEmail();
			c.setName(this.name);
			c.setNumber(this.number);
			c.setEmail(this.email);
			c.setAddress(this.address);
			ContactService.getInstance().updateData(this.c, this.id);
			this.counter = 0;

		} else {

			this.name = this.c.getName();
			this.number = this.c.getNumber();
			this.email = this.c.getEmail();
			this.address=this.c.getAddress();
		}
		conc++;
		counter++;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId() {
		return id;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String execute() throws Exception {
		conc++;
		counter++;
		return this.SUCCESS;
	}

}
