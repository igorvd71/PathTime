
public class ArrayInAction {

	public static void main(String[] args) {
		ArrList<Integer>arrListOne;
		arrListOne = new ArrList<Integer>();
		
		arrListOne.add();
		arrListOne.add();
		System.out.println();
		
		arrListOne.printout();
		System.out.println();
		System.out.println();
		
		boolean e = arrListOne.isEmpty();
		if (e == true){
			System.out.println("Масив пуст");
		} else {
			System.out.println("Масив содержит значения");
		}
		
		System.out.println("Размер массива " + arrListOne.size());
		
				
		arrListOne.get(1);
		
		boolean c = arrListOne.contain();
		if (c == true){
			System.out.println("It has");
		} else {
			System.out.println("It hasn't");
		}
	}
	

}

