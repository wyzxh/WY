package com.impl;

import java.util.List;

import com.dao.Gouwu;
import com.entity.Gouwuche;
import com.servers.GouwucheServes;

public class GwcServersImpl implements GouwucheServes{
	Gouwu gw=new GouwucheImpl();

	@Override
	public int jia(Gouwuche people) {
		return gw.jia(people);
	}

	@Override
	public List<Gouwuche> getall() {
		return gw.getall();
	}

	@Override
	public int shan(Gouwuche people) {
		return gw.shan(people);
	}
	
}
