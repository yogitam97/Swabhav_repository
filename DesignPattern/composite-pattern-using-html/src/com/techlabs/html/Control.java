package com.techlabs.html;

public class Control implements IHtmlElement{
	private String type;
	private String tagName;
	private String value;
	
	public Control( String tagName,String type, String value) {
		this.type = type;
		this.tagName = tagName;
		this.value = value;
	}

	@Override
	public String buildHtml() {
		return "   <"+tagName+" type="+type+" value="+value+">";
	}
	public String getType() {
		return type;
	}

	public String getTagName() {
		return tagName;
	}

	public String getValue() {
		return value;
	}
}
