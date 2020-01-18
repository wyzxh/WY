package com.impl;

import java.util.List;

import com.dao.ShangpinDao;
import com.entity.Shangpin;
import com.servers.ShangpinServers;

public class SpServersimpl implements ShangpinServers{
	ShangpinDao sp=new ShangpinDaoimpl();
	public List<Shangpin> getall() {
		return sp.getall();
	}
	@Override
	public int addsp(Shangpin people) {
		return sp.addsp(people);
	}
	@Override
	public int shanchu(Shangpin people) {
		return sp.shanchu(people);
	}
	@Override
	public int xiugai(Shangpin people) {
		return sp.xiugai(people);
	}
	@Override
	public Shangpin gai(Shangpin people) {
		return sp.gai(people);
	}
	@Override
	public List<Shangpin> yeshu(int pageno, int pagesize) {
		return sp.yeshu(pageno, pagesize);
	}
	@Override
	public int count() {
		return sp.count();
	}
	@Override
	public List<Shangpin> gouwuche(Shangpin people) {
		return sp.gouwuche(people);
	}

}
