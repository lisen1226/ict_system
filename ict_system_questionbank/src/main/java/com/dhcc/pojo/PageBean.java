package com.dhcc.pojo;

import java.util.List;

public class PageBean<T> {
	 // 当前页
    private Integer currentPage;
    // 每页显示的总条数
    private Integer pageSize=20;
    
    //总记录条数
    private Long totalNum;
    // 总页数
    private Long totalPage;
    // 分页结果
    private List<T> items;
    
	public PageBean() {
		super();
	}
	
	public PageBean(Long totalNum,Long total, List<T> items) {
		super();
		this.totalNum=totalNum;
		this.totalPage = total;
		this.items = items;
	}

	public Long getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Long getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public List<T> getItems() {
		return items;
	}
	public void setItems(List<T> items) {
		this.items = items;
	}
    

}
