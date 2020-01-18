package com.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.Lianjie;
import com.dao.RegisterDao;
import com.entity.Register;
import com.entity.Xinxi;

//具体实现类 
public class RegisterDaoImpl extends Lianjie implements RegisterDao{
	//增加会员的新信息
	public int add(Register peopel) {
		String sql="insert into phonemessage (usename,pwd) values(?,?)";
		Object[]shuju={peopel.getUsename(),peopel.getPwd()};
		return this.gai(sql, shuju);
	}

	@Override
	public boolean jian(Register peopel) {
		String sql="select * from phonemessage where usename=? and pwd=?";
		Object[]shuzu={peopel.getUsename(),peopel.getPwd()};
		ResultSet  re=cha(sql, shuzu);
		boolean flag=false;
		try {
			while(re.next()){
				flag=true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public int add(Xinxi people) {
		String sql="insert into message  values (?,?,?,?)";
		Object[]shuju={people.getId(),people.getName(),people.getAge(),people.getPhone()};
		return this.gai(sql, shuju);
	}

	@Override
	public List<Xinxi> getxx() {
		List<Xinxi> list=new ArrayList<Xinxi>();
		String sql="select * from message";
		Object[]shuzu={};
		ResultSet re=cha(sql, shuzu);
		try {
			while(re.next()){
				Xinxi xx=new Xinxi();
				xx.setId(re.getInt("id"));
				xx.setName(re.getString("name"));
				xx.setAge(re.getInt("age"));
				xx.setPhone(re.getString("phone"));
				list.add(xx);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Xinxi update(Xinxi xx) {
		String sql="select * from message where id=?";
		Object[]shuzu={xx.getId()};
		ResultSet re=cha(sql, shuzu);
		try {
			while(re.next()){
				xx.setName(re.getString("name"));
				xx.setAge(re.getInt("age"));
				xx.setPhone(re.getString("phone"));
				xx.setId(re.getInt("id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return xx;
	}

	public int gai(Xinxi xx) {
		String sql="update message set name=?,age=?,phone=? where id=? ";
		Object[]shuju={xx.getName(),xx.getAge(),xx.getPhone(),xx.getId()};
		return gai(sql, shuju);
	}

	@Override
	public int dele(Xinxi xx) {
		String sql="delete from message where id=?";
		Object[]shuju={xx.getId()};
		return gai(sql, shuju);
	}

	@Override
	public List<Xinxi> getfen(int pageno, int pagesize) {
		String sql="select * from message  limit ?,?";
		Object[]shuzu={(pageno-1)*pagesize,pagesize};
		ResultSet re=cha(sql, shuzu);
		List<Xinxi> list=new ArrayList<Xinxi>();
		try {
			while(re.next()){
				Xinxi xx=new Xinxi();
				xx.setId(re.getInt("id"));
				xx.setName(re.getString("name"));
				xx.setAge(re.getInt("age"));
				xx.setPhone(re.getString("phone"));
				list.add(xx);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int getcount() {
		String sql="select count(1) from message";
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
}
