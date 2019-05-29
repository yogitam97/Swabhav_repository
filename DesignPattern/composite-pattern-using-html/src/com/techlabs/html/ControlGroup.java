package com.techlabs.html;

import java.util.ArrayList;
import java.util.List;

public class ControlGroup implements IHtmlElement {
	private String tagName;
	private List<IHtmlElement> children;

	public ControlGroup(String tagName) {
		children = new ArrayList();
		this.tagName = tagName;

	}

	public void addChild(IHtmlElement control) {
		children.add(control);
	}

	@Override
	public String buildHtml() {
		String str="<"+tagName+">";
		for(IHtmlElement ele:children) {
			str=str+"\n"+ele.buildHtml();
		
		}
		return str+"\n"+"</"+tagName+">";
	}

	public String getTagName() {
		return tagName;
	}

	public List<IHtmlElement> getChildren() {
		return children;
	}

}
