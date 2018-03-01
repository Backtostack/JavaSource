public class SimpleDotCom {
	int [] locationCells; // Массив для хранения "сайта"
	int numOfHits = 0; //Значения количества попаданий
	public void setLocationCells (int[] locs) { // Сеттер для locationCells
		locationCells = locs;
	}
	public String checkYourself (String stringGuess){ //Проверяем попадание
		
		int guess = Integer.parseInt (stringGuess); // Преобразовываем тип
		
		//System.out.println("Значение переменной guess  " + guess);
		
		String result = "Мимо";
		//System.out.println("Значение переменной до инкрементации numOfHits++ " + numOfHits);
		for (int cell : locationCells){ // Перебираем массив locationCells
			if (guess == cell) { //Проверяем попадание
				result = "Попал";
				numOfHits++;
			//System.out.println("Значение переменной после инкрементации numOfHits++ " + numOfHits);
			break;
			}
			//System.out.println("Значение переменной result " + result);
		}
		if (numOfHits == locationCells.length){
			result = "Потопил";
		}
		System.out.println(result);
		return result;
	}
}