package me.hjoon.java.array;

public class ForeachDemo {

	public static void main(String[] args) {
		String[] members = { "������", "������", "���̶�" };
        for (String e : members) {
            System.out.println(e + "�� ����� �޾ҽ��ϴ�");
        }
	}
	/* ���� ������ ���� ������ ��Ȯ�ϰ� �����ϰ� �����Ѵ�. ������ ���������δ� ����������. 
		for(String e : members)
		���� ������ �迭 members�� ���� ���� e�� ��Ƽ� �߰�ȣ ���� ������ �������ش�. 
		�ݺ����� ���������̳� ���������� ���ؼ� ���ذ��� ������Ű�� ���� �ݺ����� �۾��� ���������� ���� ���̶�� �� �� �ִ�. 
		�ڹ� 5.0���� ���Ե� ����̴�.!! 
	*/

}
