package org.jesse.domain;

public class Criteria {

	private int pageNo;
	private String type;
	private String keyword;
	private String SearchType;
	private int perPage;

	public Criteria() {
		this.pageNo = 1;
		this.perPage = 10;
	}

	public int getPage() {
		return pageNo;
	}

	public void setPage(int pageNo) {
		this.pageNo = pageNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getSearchType() {
		return SearchType;
	}

	public void setSearchType(String searchType) {
		SearchType = searchType;
	}

	public int getPerPage() {
		return perPage;
	}

	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}

	@Override
	public String toString() {
		return "Criteria [pageNo=" + pageNo + ", type=" + type + ", keyword=" + keyword + ", SearchType=" + SearchType
				+ ", perPage=" + perPage + "]";
	}

	

}
