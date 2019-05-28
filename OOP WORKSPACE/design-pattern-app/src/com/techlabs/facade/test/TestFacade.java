package com.techlabs.facade.test;

import com.techlabs.facade.ShopKeeper;

public class TestFacade {

	public static void main(String[] args) {
		ShopKeeper shopkeeper = new ShopKeeper();
		
		shopkeeper.iphoneSale();
		shopkeeper.samsungSale();
	}

}
