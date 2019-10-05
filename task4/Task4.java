package by.htp.hw3.task4;
import java.io.InputStreamReader;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 * 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, 
 * время отправления. Создайте данные в массив из пяти элементов типа Train, 
 * добавьте возможность сортировки элементов массива по номерам поездов. 
 * Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с 
 * одинаковыми пунктами назначения должны быть упорядочены по времени отправления. 
 * */

public class Task4 {

    public static void Task4(String[] args) {

	Train[] trains = { new Train("Минск", 104, new GregorianCalendar(2019, 10, 5, 17, 17, 0)),
		new Train("Москва", 105, new GregorianCalendar(2019, 10, 9, 10, 10, 0)),
		new Train("Гродно", 965, new GregorianCalendar(2019, 8, 4, 15, 15, 0)),
		new Train("Лида", 565, new GregorianCalendar(2019, 10, 20, 8, 8, 0)),
		new Train("Владивосток", 398, new GregorianCalendar(2019, 6, 7, 23, 23, 0)) };

	TrainLogic trainLogic = new TrainLogic();
	trainLogic.sortById(trains);
	printTrains(trains);

	System.out.print("\nВведите ID поезда: ");
	Scanner sc = new Scanner(new InputStreamReader(System.in));
	int trainId = sc.nextInt();
	Train selectedTrain = trainLogic.findTrainById(trains, trainId);
	if (selectedTrain != null) {
	    System.out.printf("Информация о поезде с ID %d:\n", trainId);
	    printTrain(selectedTrain);
	} else {
	    System.out.println("Выбранный поезд не обнаружен");
	}

	sc.close();

	System.out.println("\nСортировка по пункту назначения и времени:");
	trainLogic.sortByDestination(trains);
	printTrains(trains);
    }

    public static void printTrains(Train[] trains) {
	for (Train train : trains) {
	    printTrain(train);
	}
    }

    public static void printTrain(Train train) {
	System.out.println(train.getDestination() + " " + train.getId() + " " + train.getDepartureTime().getTime());
    }
}
