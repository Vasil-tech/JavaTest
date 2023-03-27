package Functions;

public class DudBib {
    public static void main(String[] args) {
		String[] arr = {"год", "года", "лет"};
		System.out.println("2571 " + ending (2571, arr));
		System.out.println("1 " + ending (1, arr));
		System.out.println("18 " + ending (18, arr));
	}

	public static String ending(int num, String[] words) {
		// Представим что у нас число 2000.
		// При получении остатка от 100 мы получим 20
		// В условие мы это проверяем и если число было большим за 2000, 
		// то мы от него в последствие получаем еще значение при делении на 10
		num = num % 100;
		if (num > 19)
			num = num % 10;
			
		// Таким образом по итогу мы получили число в промежутке от 1 до 19
 
		// Теперь мы можем проверить это число 
		switch (num) {
			// Если 1, то первое слово из массива
			case 1: 
				// Важно заметить, что break мы не ставим, 
				// так как return и так выйдет из функции в целом
				return(words[0]);
			// 2, 3 и 4 берем второе значение из массива
			case 2: case 3: case 4:
				return(words[1]);
			default: // Для остального берем 3 значение из массива
				return(words[2]);
		}
	}
}
