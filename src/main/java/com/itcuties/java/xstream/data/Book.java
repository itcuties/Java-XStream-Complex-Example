package com.itcuties.java.xstream.data;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * A class that reads the book tag. This is the most simple case. Only several fields
 * of basic types.
 * 
 * Of course feel free to add any other methods or un-annotated fields you wish.
 * 
 * @author itcuties
 */
@XStreamAlias("book")
public class Book {
	@XStreamAlias("title")
	private String title;
	
	@XStreamAlias("author")
	private String author;
	
	@XStreamAlias("pages-count")
	private int pagesCount;//this can also be Integer or any other numeric type

	private String fieldThatIsNotInTheXml = "field not in xml";

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", pagesCount="
				+ pagesCount + ", fieldThatIsNotInTheXml="
				+ fieldThatIsNotInTheXml + "]";
	}
}
