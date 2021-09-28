package com.revature.bankapp.menu;

import com.revature.bankapp.form.LoginForm;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.model.DataManager;

public class CustomerMainMenu extends Menu {

	public CustomerMainMenu(String name) {
		super(name);
		addMenuItem("Create new Account");
		addMenuItem("Log Out");
		addMenuItem("View Accounts");
	}

	@Override
	void handleAction() {
		switch (selection) {
		case 1:
			System.out.println("Create new Account");
			
			break;
			
		case 2:
			System.out.println("View Accounts");
			break;
		case 3:
			System.out.println("Logout");
	}
		
	}

}
