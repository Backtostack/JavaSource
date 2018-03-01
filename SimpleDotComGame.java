public class SimpleDotComGame {
public static void main (String[] args) {
int numOfGuesses = 0;
	// Создаем оъекты
	GameHelper helper = new GameHelper(); 
	SimpleDotCom theDotCom = new SimpleDotCom();
	// helper theDotCom 
	
	int randomNum = (int) (Math.random() * 5 ); // Генерируем случайное число
	//System.out.println("Значение переменной randomNum  " + randomNum);//Выводим на екран
	
	int [] locations = {randomNum,randomNum+1,randomNum+2}; //Создаем ячейки сайта
	
	//System.out.println("Значение переменной locations  " + locations[0] + locations[1] +locations[2]);
	theDotCom.setLocationCells(locations); // Передаем в метод массив
	
	boolean isAlive = true; // Переменная для проверки статуса игры
	while (isAlive == true) {
		String guess = helper.getUserInput("Введите число"); //Запрашиваем пользовательский ввод
		String result = theDotCom.checkYourself(guess); // Передаем значение на обработку
		numOfGuesses++;
		//System.out.println("Значение переменной numOfGuesses  " + numOfGuesses);
		if (result.equals("Потопил")) {
			isAlive = false;
			System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
}
}
}
}