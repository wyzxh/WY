package com.dao;

import java.util.List;

import com.entity.Gouwuche;

public interface Gouwu {
	//��ӽ����ﳵ�ķ���
	public int jia(Gouwuche people);
	//��ʾ���ﳵ���б�
	public List<Gouwuche> getall();
	//ɾ����Ʒ,����id
	public int shan(Gouwuche people);
}
