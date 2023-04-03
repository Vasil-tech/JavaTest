package СonditionalStatements;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Получаем от пользователей данные
		System.out.print("Как зовут первого игрока?");
		String user1 = in.nextLine(); 
		System.out.print("Как зовут второго игрока?");
		String user2 = in.nextLine(); 
		
		// Получаем выбор каждого из игроков
		System.out.print(user1 + ", вы хотите выбрать 32?");
		String user1_answer = in.nextLine(); 

		System.out.print(user2 + ", вы хотите выбрать rock, paper или scissors?");
		String user2_answer = in.nextLine(); 

		// Выводим результаты
		System.out.println(compare(user1_answer, user2_answer));
 }

	// Создаем функцию для сравнения результатов
	public static String compare(String u1, String u2) {
		// Если значения равны, то ничья
		if(u1 == u2)
			return("Ничья!");
		// Если первый игрок ввел «камень»,
		else if(u1 == "rock")
			// а второй игрок ввел «ножницы»,
			// то пишем победу для первого игрока
			if(u2 == "scissors")
				return("Камень выиграл!");
			// или же если второй игрок ввел не ножницы, 
			// то значит это будет бумага и второй игрок победил
			else
				return("Бумага выиграла!");
		// Аналогичные действия с другими вариантами
		else if(u1 == "scissors")
			if(u2 == "paper")
				return("Ножницы выиграли!");
			else
				return("Камень выиграл!");
		else if(u1 == "paper")
			if(u2 == "rock")
				return("Бумага выиграла!");
			else
				return("Ножницы выиграли!");
		else
			return("Неверный ввод! Необходимо ввести одно из: rock, paper или scissors");
	}
}