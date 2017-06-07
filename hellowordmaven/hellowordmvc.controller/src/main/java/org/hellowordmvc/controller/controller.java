package org.hellowordmvc.controller;

import org.helloworldmvc.contract.Imodel;
import org.helloworldmvc.contract.Iview;

public class controller {
	private final Iview view;
	private final Imodel model;
	public controller(Iview view, Imodel model) {
		super();
		this.view = view;
		this.model = model;
	}
	public void run(){
		this.view.displayMessage(this.model.gethelloworld());
	}
	
	
}
