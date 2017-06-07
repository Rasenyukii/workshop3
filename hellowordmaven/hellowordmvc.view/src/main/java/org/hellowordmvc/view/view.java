package org.hellowordmvc.view;

import org.helloworldmvc.contract.Iview;

public class view implements Iview{
	

	@Override
	public void displayMessage(String message) {
		System.out.println(message);
		
	}

}
