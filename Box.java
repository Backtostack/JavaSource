public class Box {
	int WidthBox;
	int LongBox;
	int AmountApple;
	int SizeBox(int WidthBox, int LongBox){
		int result = WidthBox*LongBox;
		return result;
	}
	int CapacityBox (int SizeBox){
		int Cap = 0;
		if (SizeBox <= 20){
			Cap = 1;
		}
		else if (SizeBox <= 40){
			Cap = 2;
		}
		else if (SizeBox <= 60){
			Cap = 3;
		}
		return Cap;
	}
    int AmountBox (int CB, int AmountApple){
		int BoxAmount=0;
		int Am=0;
		while (AmountApple>1){
			AmountApple = AmountApple-CB;
			BoxAmount++;
			}
			return BoxAmount;
      }
}