package com.techlabs.observer.usinglistener;

import java.awt.Event;

public class DBListener implements Listener{

	@Override
	public void listen(Event event) {
		System.out.println("DBListener is listening");
	}

}
