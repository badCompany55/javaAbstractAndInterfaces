package trans;

import java.util.*;

public class Main
{
	public static ArrayList<AbstractVehicle> filteredList = new ArrayList<AbstractVehicle>();
	public static void printVehicles(ArrayList<AbstractVehicle> vehicles, CheckVehicle tester)
	{
		for (AbstractVehicle v : vehicles)
		{
			if (tester.test(v))
			{
				System.out.println(v.getName() + " " + v.getFuelLevel());
				filteredList.add(v);
			}
		}
	}

	public static void main(String[] args)
	{
		Horse black = new Horse("Black Stallion");
		Horse seabiscuit = new Horse("Seabiscuit");

		seabiscuit.eat(10);
		black.eat(25);

		for (int i = 0; i < 3; i++)
		{
			seabiscuit.move();
		}
		// System.out.println(seabiscuit.getFuelLevel());
		// System.out.println();

		HorseFromVehicle secretariat = new HorseFromVehicle("Secretariat", 10);
		secretariat.addFuel(10);
		// System.out.println("Secretariat " + secretariat.getFuelLevel());

		HorseFromVehicle eclipse = new HorseFromVehicle("Eclipse");
		// System.out.println("Eclipse " + eclipse.getFuelLevel());
		eclipse.move(10);

		HorseFromVehicle trigger = new HorseFromVehicle("Trigger", 10);
		HorseFromVehicle seattleSlew = new HorseFromVehicle("Seattle Slew", 10);
		HorseFromVehicle americanPharoah = new HorseFromVehicle("Amarican Pharoah", 10);

		Auto vw = new Auto(1, "EuroVan", 2000);
		Auto toyota = new Auto(10, "Tundra", 1998);
		Auto honda = new Auto(5, "Accord", 2010);
		vw.move();
		vw.move(5);

		ArrayList<AbstractVehicle> myList = new ArrayList<AbstractVehicle>();
		myList.add(secretariat);
		myList.add(trigger);
		myList.add(seattleSlew);
		myList.add(americanPharoah);
		myList.add(eclipse);
		myList.add(vw);
		myList.add(toyota);
		myList.add(honda);

		printVehicles(myList, v -> v.getFuelLevel() < 0);

		System.out.print("\nHorse with positive fuel");
		printVehicles(myList, v -> (v.getFuelLevel() > 0) && (v instanceof HorseFromVehicle));	

		myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));

		// for (AbstractVehicle v : myList)
		// {
		// 	System.out.println(v);
		// }

		myList.forEach((v) -> System.out.println(v));
	}
}
