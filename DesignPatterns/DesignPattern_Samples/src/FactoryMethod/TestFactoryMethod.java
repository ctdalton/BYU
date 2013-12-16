package FactoryMethod;

/*
 * Author SongYz
 * 
 * ��������ģʽ��Factory Method��  �������д�������Ĳ�����
 * ����������������һ����Ʒ�Ĺ����ӿڣ���ʵ�ʵĹ���ת�Ƶ�
 * ��������ࡣ��������ϵͳ��չ�����ԣ��ӿڵĳ��󻯴����
 * �໥�����Ķ��󴴽��ṩ����õĳ���ģʽ��
 * 
 * Factory Method pattern lets a class developer define the interface for creating
 * an object while retaining control of which class to instantiate.
 */

public class TestFactoryMethod {

	public static void main(String[] args) {

		AnimalFactory af=new DogFactory();

		af.runFactoryMethod();

	}

}

