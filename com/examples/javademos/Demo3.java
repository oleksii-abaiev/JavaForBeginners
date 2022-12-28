package com.examples.javademos;

public class Demo3 {
	// Пример 3. Вывод текстовых надписей на экран
	
	public static void main(String[] args) {
		// слова Hello World! будут выведены друг за другом в одной и той же строке
		Console.print("Hello");
		Console.print("World!");

		// ничего не выводится (пусто), но курсор переводится на следующую строку
		Console.println("");

		// вывод двух строк текста 
		Console.println("First string");
		Console.println("Second string");
	}
}

