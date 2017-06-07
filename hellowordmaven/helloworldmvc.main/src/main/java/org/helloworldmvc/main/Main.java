package org.helloworldmvc.main;

import org.hellowordmvc.controller.controller;
import org.hellowordmvc.model.Model;
import org.hellowordmvc.view.view;

public class Main {

	public static void main(String[] args) {
		controller c = new controller(new view(), new Model());
		c.run();

	}

}
