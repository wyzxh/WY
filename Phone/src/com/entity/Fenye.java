package com.entity;
//��ҳʵ����
public class Fenye {
//pageno��ǰҳ��   pagesizeһҳ��ʾ��������   datacount������   pagecount��ҳ��
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
