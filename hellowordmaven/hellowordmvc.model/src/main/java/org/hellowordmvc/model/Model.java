package org.hellowordmvc.model;

import org.helloworldmvc.contract.Imodel;

public class Model implements Imodel {

	@Override
	public String gethelloworld() {
		return DAOHelloWorld.getinstance().getHelloWorldMessage();
	}

}
