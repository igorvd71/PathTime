import java.util.Scanner;
public class PathCalc {

	public static void main(String[] args) {
		int[] distance = {0, 7, 12, 3, 10, 6, 9};
		//int i = 1;
		//int j = 2;
		int start, end;
		int[] way = new int[distance.length];
		
		way[0] = distance[0];
		for (int x = 1; x < distance.length; x++){
			way[x] = way[x-1] + distance[x];
		}
		
		for (int q = 0; q < way.length; q++){
			System.out.println(way[q]);
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("������� ������ ���� � ���� ������������ ����� ����� 1 � 7");
		int p = input.nextInt();
		if (p < 1 || p > 7){
			System.out.println("��������� ���� ��������� ���� �� �������� �������� ��������");
			System.out.println("������� ������ ���� � ���� ������������ ����� ����� 1 � 7");
			p = input.nextInt();
		}
		else {
			start = way[p-1];
		}
		
		System.out.println("������� ����� ���������� � ������������ ����� ����� 1 � 7");
		int c = input.nextInt();
		if (c < 1 || c > 7){
			System.out.println("��������� ���� ����� ���������� �� �������� �������� ��������");
			System.out.println("������� ����� ���������� � ���� ������������ ����� ����� 1 � 7, ��������� �� ����� ������");
			c = input.nextInt();
		}
		else {
			end = way[c-1];
		}
		
	input.close();
		
	start = way[p-1];
	end = way[c-1];
		
	System.out.print("���������� ����� ������� " + p + " � ������� " + c
				+ " ����������: " + pathCalc(start, end) + "��");
	}

	private static int pathCalc(int start, int end) {
		int path;
		if (end > start) {
			return path = end - start;
		} else {
			return path = start - end;
		}	
	}
}
