import java.util.Scanner;

public class ArrList<Item> implements IList<Item> {
	
	private int [] arrList;
	private int l = 20;
	public ArrList(){
		arrList = new int [l];
	}
	private int index = 0;
	
	@Override
	public void add() {
		Scanner input = new Scanner(System.in);
		System.out.println("Введите значение для элемента массива");
		int vol = input.nextInt();
		System.out.println("Вы ввели " + vol);
		
		if (index < size()-1){
		arrList [index] = vol;
		System.out.println("Ваше значение добавлено в массив с индексом " + index);
		index++;
		} else {
			System.out.println("Текущий индекс выходит за пределы масива");
		}
	}
			
		

	@Override
	public Item get(int position) {
		index = position - 1;
		if (index < size()-1){
			int g = arrList[index];
			System.out.println("Значение Вашего запроса: " + g);
		}
		return null;
	}

	@Override
	public int size() {
		return arrList.length;
	}

	@Override
	public boolean contain() {
		Scanner input = new Scanner(System.in);
		System.out.println("Введите значение для поиска элемента");
		int v = input.nextInt();
		System.out.println("Вы вввели значение " + v);
		input.close();
		for (int i = 0; i < arrList.length - 1; i++){
			if (arrList[i] == v){
				return true;
			} 
		}
		return false;
	}
	
	@Override
	public boolean isEmpty() {
		return size() == 0;
	}
	public void printout() {
		for(int i = 0; i < size()-1; i++){
			System.out.print(arrList[i] + " ");
	}

}
}
