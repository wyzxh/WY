package com.servers;

import java.util.List;

import com.dao.ShangpinDao;
import com.entity.Shangpin;

//�ͻ�����
public interface ShangpinServers {
	//�鿴������Ʒ�б�
	public List<Shangpin> getall();
	//�����Ʒ��Ϣ
	public int addsp(Shangpin people);
	//ɾ����Ʒ��Ϣ
	public int shanchu(Shangpin people);
	//�޸���Ʒ��Ϣ
	public int xiugai(Shangpin people);
	//�޸�  ����id(�Ȳ�ѯ) �ҵ�id���޸�
	public Shangpin gai(Shangpin people);
	//��ҳ����
	public List<Shangpin> yeshu(int pageno,int pagesize);
	//��ȡ������
	public int count();
	//����id��ѯ��Ʒ
	public List<Shangpin> gouwuche(Shangpin people);
}
