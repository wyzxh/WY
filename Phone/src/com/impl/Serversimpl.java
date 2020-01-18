package com.impl;

import java.util.List;

import com.dao.RegisterDao;
import com.entity.Register;
import com.entity.Xinxi;
import com.servers.RegisterServes;

public class Serversimpl implements RegisterServes{
	RegisterDao m=new RegisterDaoImpl();
	public int add(Register peopel) {
		return m.add(peopel);
	}
	@Override
	public boolean jian(Register peopel) {
		return m.jian(peopel);
	}
	@Override
	public int add(Xinxi people) {
		return m.add(people);
	}
	@Override
	public List<Xinxi> getxx() {
		return m.getxx();
	}
	@Override
	public Xinxi update(Xinxi xx) {
		return m.update(xx);
	}
	@Override
	public int gai(Xinxi xx) {
		return m.gai(xx);
	}
	@Override
	public int dele(Xinxi xx) {
		return m.dele(xx);
	}
	@Override
	public List<Xinxi> getfen(int pageno, int pagesize) {
		return m.getfen(pageno, pagesize);
	}
	@Override
	public int getcount() {
		return m.getcount();
	}

}
