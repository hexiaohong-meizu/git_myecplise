package com.git.common;

public class Test {
	public static void main(String[] args) {
		String str=null;
	    str=String.format("Hi, %s", "�ּ���"); // ��ʽ���ַ���
	    System.out.println(str); // ����ַ�������str������
	    System.out.printf("3>7�Ľ���ǣ�%b %n", 3>7);
	    System.out.printf("100��һ���ǣ�%d %n", 100/2);
	    System.out.printf("50Ԫ�����8.5�ۿ��ǣ�%f Ԫ%n", 50*0.85);
	    System.out.printf("������ۿ���%d%% %n", 85);
	}
}
