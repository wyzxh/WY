package com.entity;
//分页实体类
public class Fenye {
//pageno当前页面   pagesize一页显示几条数据   datacount总数据   pagecount总页数
	private int pageno;
	private int pagesize;
	private int datacount;
	private int pagecount;
	public int getPageno() {
		return pageno;
	}
	public void setPageno(int pageno) {
		this.pageno = pageno;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public int getDatacount() {
		return datacount;
	}
	public void setDatacount(int datacount) {
		this.datacount = datacount;
	}
	public int getPagecount() {
		if(datacount%pagesize==0){
			pagecount=datacount/pagesize;
		}else{
			pagecount=datacount/pagesize+1;
		}
		return pagecount;
	}
	public void setPagecount(int pagecount) {
		this.pagecount = pagecount;
	}
	
	
}
