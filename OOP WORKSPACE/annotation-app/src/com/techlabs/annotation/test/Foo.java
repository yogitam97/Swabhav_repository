package com.techlabs.annotation.test;

import com.techlabs.annotation.*;
import java.lang.annotation.*;

public class Foo {

	@RequireModification
	public int m1() {
		return 1;
	}
	public int m2() {
		return 1;
	}
	@RequireModification
	public int m3() {
		return 1;
	}
	public int m4() {
		return 1;
	}
}
