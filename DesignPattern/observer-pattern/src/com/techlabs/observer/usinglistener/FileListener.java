package com.techlabs.observer.usinglistener;

import java.awt.Event;

public class FileListener implements Listener{

	@Override
	public void listen(Event event) {
		System.out.println("FileListener is listening");
	}

}
