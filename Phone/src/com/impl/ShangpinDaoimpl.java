package com.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.Lianjie;
import com.dao.ShangpinDao;
import com.entity.Fenye;
import com.entity.Shangpin;

public class ShangpinDaoimpl extends Lianjie implements ShangpinDao{

	public List<Shangpin> getall() {
		List<Shangpin> list=new ArrayList<Shangpin>();
		String sql="select * from commodity";
		Object[]shuzu={};
		ResultSet res=cha(sql, shuzu);
		try {
			while(res.next()){
				Shangpin sp=new Shangpin();
				sp.setName(res.getString("name"));
				sp.setId(res.getInt("id"));
				sp.setDazhe(res.getString("dazhe"));
				sp.setYuanjia(res.getString("yuanjia"));
				list.add(sp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int addsp(Shangpin people) {
		String sql="insert into commodity (name,dazhe,yuanjia) values (?,?,?)";
		Object[]shuju={people.getName(),people.getDazhe(),people.getYuanjia()};
		return gai(sql, shuju);
	}

	@Override
	public int shanchu(Shangpin people) {
		String sql="delete from commodity where id=?";
		Object[]shuju={people.getId()};
		return gai(sql, shuju);
	}

	@Override
	public int xiugai(Shangpin people) {
		String sql="update commodity set name=?,dazhe=?,yuanjia=? where id=?";
		Object[]shuju={people.getName(),people.getDazhe(),people.getYuanjia(),people.getId()};
		return gai(sql, shuju);
	}

	@Override
	public Shangpin gai(Shangpin people) {
		String sql="select * from commodity where id=?";
		Object[]shuzu={people.getId()};
		ResultSet re=cha(sql, shuzu);
		try {
			while(re.next()){
				people.setName(re.getString("name"));
				people.setDazhe(re.getString("dazhe"));
				people.setYuanjia(re.getString("yuanjia"));
				people.setId(re.getInt("id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return people;
	}

	@Override
	public List<Shangpin> yeshu(int pageno,int pagesize) {
		String sql="select * from commodity limit ?,?";
		Object[]shuzu={(pageno-1)*pagesize,pagesize};
		ResultSet re=cha(sql, shuzu);
		List<Shangpin> list=new ArrayList<Shangpin>();
		try {
			while(re.next()){
				Shangpin sp=new Shangpin();
				sp.setName(re.getString("name"));
				sp.setDazhe(re.getString("dazhe"));
				sp.setYuanjia(re.getString("yuanjia"));
				sp.setId(re.getInt("id"));
				list.add(sp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int count() {
		String sql="select count(1) from commodity";
		Object[]shuzu={};
		ResultSet re=cha(sql, shuzu);
		int count=0;
		try {
			while(re.next()){
				count=re.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
	public static void main(String[] args) {
		ShangpinDaoimpl ss=new ShangpinDaoimpl();
		/*int m=ss.count();
		System.out.println(m);*/
		Shangpin sp=new Shangpin();
		sp.setId(2);
		List<Shangpin> list=ss.gouwuche(sp);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getName()+list.get(i).getYuanjia()+list.get(i).getDazhe());
		}
	}

	@Override
	public List<Shangpin> gouwuche(Shangpin people) {
		String sql="select * from commodity where id=?";
		Object[]shuzu={people.getId()};
		ResultSet re=cha(sql, shuzu);
		List<Shangpin> list=new ArrayList<Shangpin>();
		try {
			while(re.next()){
				people.setName(re.getString("name"));
				people.setDazhe(re.getString("dazhe"));
				people.setYuanjia(re.getString("yuanjia"));
				people.setId(re.getInt("id"));
				list.add(people);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
