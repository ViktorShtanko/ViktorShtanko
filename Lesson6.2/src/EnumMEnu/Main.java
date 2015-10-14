//hghjghjgjgj
//hvgfgffff
package EnumMEnu;

import java.util.Scanner;

public class Main {
	public static void menu() {
		System.out.println("Enter 1 to chect does month exist "
				+ "\nEnter 2 to  show months with such a season "
				+ "\nEnter 3 to  show months with such a days "
				+ "\nEnter 4 to  show months with less amount  of days "
				+ "\nEnter 5 to  show months with bigger amount of days");
	}

	public static void main(String[] args) {
		Month[] mas = Month.values();
		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();
			switch (sc.next()) {

			case "1": {
				System.out.println("Enter month please :");
				sc = new Scanner(System.in);
				String month = sc.next();
				boolean flag = false;
				for (int i = 0; i < mas.length; i++) {
					if (month.equalsIgnoreCase(mas[i].toString())) {
						System.out.println("This month exists");
						flag = true;
					}
				}
				if (flag == false)
					System.out.println("There are no such a month");

				break;
			}
			case "2": {
				System.out.println("Enter month please :");
				sc = new Scanner(System.in);
				String month = sc.next();

				boolean flag = false;
				for (int i = 0; i < mas.length; i++) {
					if (month.equalsIgnoreCase(mas[i].toString())) {

						flag = true;
					}
				}
				if (flag == true) {
					Month mon = Month.valueOf(month.toUpperCase());

					for (Month m : mas) {
						if (m.getS().equals(mon.getS())
								&& mon.compareTo(m) != 0)
							System.out.println(m.name());
					}
				} else {
					System.out.println("There is no such a month!");
				}
				break;
			}
			case "3": {
				System.out.println("Enter month please :");
				sc = new Scanner(System.in);
				String month = sc.next();

				boolean flag = false;
				for (int i = 0; i < mas.length; i++) {
					if (month.equalsIgnoreCase(mas[i].toString())) {

						flag = true;
					}
				}
				if (flag == true) {
					Month mon = Month.valueOf(month.toUpperCase());

					for (Month m : mas) {
						if (m.getDays() == mon.getDays()
								&& mon.compareTo(m) != 0)
							System.out.println(m.name());
					}
				} else {
					System.out.println("There is no such a month!");
				}
				break;
			}
			case "4": {
				System.out.println("Enter month please :");
				sc = new Scanner(System.in);
				String month = sc.next();

				boolean flag = false;
				for (int i = 0; i < mas.length; i++) {
					if (month.equalsIgnoreCase(mas[i].toString())) {

						flag = true;
					}
				}
				if (flag == true) {
					Month mon = Month.valueOf(month.toUpperCase());

					for (Month m : mas) {
						if (m.getDays() < mon.getDays()
								&& mon.compareTo(m) != 0)
							System.out.println(m.name());
					}
				} else {
					System.out.println("There is no such a month!");
				}
				break;
			}
			case "5": {
				System.out.println("Enter month please :");
				sc = new Scanner(System.in);
				String month = sc.next();

				boolean flag = false;
				for (int i = 0; i < mas.length; i++) {
					if (month.equalsIgnoreCase(mas[i].toString())) {

						flag = true;
					}
				}
				if (flag == true) {
					Month mon = Month.valueOf(month.toUpperCase());

					for (Month m : mas) {
						if (m.getDays() > mon.getDays()
								&& mon.compareTo(m) != 0)
							System.out.println(m.name());
					}
				} else {
					System.out.println("There is no such a month!");
				}
				break;
			}
			case "6": {

				System.out.println("Enter month please :");
				sc = new Scanner(System.in);
				String month = sc.next();

				boolean flag = false;
				for (int i = 0; i < mas.length; i++) {
					if (month.equalsIgnoreCase(mas[i].toString())) {

						flag = true;
					}
				}
				int ordinals;
				if (flag == true) {
					Month mon = Month.valueOf(month.toUpperCase());
					Season mass[] = Season.values();
					ordinals = mon.getS().ordinal();
					if (ordinals == mass.length - 1) {
						ordinals = 0;
					}
					System.out.println(mass[ordinals]);
				} else {
					System.out.println("There is no such a month!");
				}
				break;

			}
			case "7": {
				System.out.println("Enter month please :");
				sc = new Scanner(System.in);
				String month = sc.next();

				boolean flag = false;
				for (int i = 0; i < mas.length; i++) {
					if (month.equalsIgnoreCase(mas[i].toString())) {

						flag = true;
					}
				}
				int ordinals;
				if (flag == true) {
					Month mon = Month.valueOf(month.toUpperCase());
					Season mass[] = Season.values();
					ordinals = mon.getS().ordinal();
					if (ordinals ==0) {
						ordinals = mass.length-1;
					}
					System.out.println(mass[ordinals]);
				} else {
					System.out.println("There is no such a month!");
				}
				break;
			}
			case "8": {
			}
			case "9": {
			}
			case "10": {
			}
			default: {
			}

			}
		}

	}
}
