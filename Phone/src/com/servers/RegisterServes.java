package com.servers;

import java.util.List;

import com.entity.Register;
import com.entity.Xinxi;

public interface RegisterServes {
	//�ͻ�����˺ŵķ���
	public int add(Register peopel);
	//���ͻ���½��Ϣ�ķ���
	public boolean jian(Register peopel);
	//�ͻ���Ӹ�����Ϣ
	public int add(Xinxi people);
	//�鿴���л�Ա�ķ���
	public List<Xinxi>getxx();
	//����id�鿴��Ϣ�ķ���
	public Xinxi update(Xinxi xx);
	//�޸���Ϣ
	public int gai(Xinxi xx);
	//�ͻ�ɾ����Ϣ�ķ���
	public int dele(Xinxi xx);
	//��ҳ
	public List<Xinxi> getfen(int pageno, int pagesize) ;
	//��ȡ������
	public int getcount() ;
}
