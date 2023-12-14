
import java.util.Scanner;

/**
 * The driver class for {@code DoublyLinkedList}.
 * 
 * @author Chihyuan Tung
 *
 */
public class LinkedListDriver {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		String type = "", command = "";
		boolean done = false;

		System.out.print("Enter list type (i - int, d - double, s - string): ");
		type = kb.next();
		while (!type.equalsIgnoreCase("i") && !type.equalsIgnoreCase("d") && !type.equalsIgnoreCase("s")) {
			System.out.println("Invalid type, please try again.");
			System.out.print("Enter list type (i - int, d - double, s - string): ");
			type = kb.next();
		}

		if (type.equalsIgnoreCase("i")) {
			Integer num, upper, lower;
			DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();

			while (!command.equalsIgnoreCase("q")) {
				if (!done) {
					System.out.println("Commands:\n" + "(i) - Insert value\r\n" + "(d) - Delete value\r\n"
							+ "(p) - Print list\r\n" + "(l) - Length\r\n" + "(t) - Print reverse\r\n"
							+ "(r) - Reverse list\r\n" + "(b) - Delete Subsection\r\n" + "(s) - Swap Alternate\r\n"
							+ "(q) - Quit program\r\n");
					done = true;
				}

				System.out.print("Enter a command: ");
				command = kb.next();

				try {
					if (command.equalsIgnoreCase("i")) {
						System.out.print("The list is: " + dll.print());
						System.out.print("Enter a number to insert: ");
						num = kb.nextInt();
						dll.insertItem(num);
						System.out.print("The list is: " + dll.print());
						System.out.print("The reverse list: " + dll.printReverse());
					} else if (command.equalsIgnoreCase("d")) {
						System.out.print("The list is: " + dll.print());
						System.out.print("Enter a number to delete: ");
						num = kb.nextInt();
						dll.deleteItem(num);
						System.out.print("The list is: " + dll.print());
						System.out.print("The reverse list: " + dll.printReverse());
					} else if (command.equalsIgnoreCase("p")) {
						System.out.print("The list is: " + dll.print());
					} else if (command.equalsIgnoreCase("l")) {
						System.out.println("The length of the list is " + dll.length());
					} else if (command.equalsIgnoreCase("t")) {
						System.out.print("The reverse list: " + dll.printReverse());
					} else if (command.equalsIgnoreCase("r")) {
						System.out.print("The original list: " + dll.print());
						dll.reverseList();
						System.out.print("The reversed list: " + dll.print());
					} else if (command.equalsIgnoreCase("b")) {
						System.out.print("Enter the lower bound: ");
						lower = kb.nextInt();
						System.out.print("Enter the upper bound: ");
						upper = kb.nextInt();
						System.out.print("The original list: " + dll.print());
						dll.deleteSubsection(upper, lower);
						System.out.print("The modified list: " + dll.print());
						System.out.print("The reverse list: " + dll.printReverse());
					} else if (command.equalsIgnoreCase("s")) {
						System.out.print("The original list: " + dll.print());
						dll.swapAlternate();
						System.out.print("The modified list: " + dll.print());
						System.out.print("The reverse list: " + dll.printReverse());
					} else if (command.equalsIgnoreCase("q")) {
						System.exit(0);
					} else {
						System.out.println("Invalid command! Please try again.");
					}
				} catch (Exception e) {
					System.out.println("Invalid input. Please try again.");
					kb.nextLine();
				}
			}
		} else if (type.equalsIgnoreCase("d")) {
			Double num, upper, lower;
			DoublyLinkedList<Double> dll = new DoublyLinkedList<>();

			while (!command.equalsIgnoreCase("q")) {
				if (!done) {
					System.out.println("Commands:\n" + "(i) - Insert value\r\n" + "(d) - Delete value\r\n"
							+ "(p) - Print list\r\n" + "(l) - Length\r\n" + "(t) - Print reverse\r\n"
							+ "(r) - Reverse list\r\n" + "(b) - Delete Subsection\r\n" + "(s) - Swap Alternate\r\n"
							+ "(q) - Quit program\r\n");
					done = true;
				}

				System.out.print("Enter a command: ");
				command = kb.next();

				try {
					if (command.equalsIgnoreCase("i")) {
						System.out.print("The list is: " + dll.print());
						System.out.print("Enter a string to insert: ");
						num = kb.nextDouble();
						dll.insertItem(num);
						System.out.print("The list is: " + dll.print());
						System.out.print("The reverse list: " + dll.printReverse());
					} else if (command.equalsIgnoreCase("d")) {
						System.out.print("The list is: " + dll.print());
						System.out.print("Enter a number to delete: ");
						num = kb.nextDouble();
						dll.deleteItem(num);
						System.out.print("The list is: " + dll.print());
						System.out.print("The reverse list: " + dll.printReverse());
					} else if (command.equalsIgnoreCase("p")) {
						System.out.print("The list is: " + dll.print());
					} else if (command.equalsIgnoreCase("l")) {
						System.out.println("The length of the list is " + dll.length());
					} else if (command.equalsIgnoreCase("t")) {
						System.out.print("The reverse list: " + dll.printReverse());
					} else if (command.equalsIgnoreCase("r")) {
						System.out.print("The original list: " + dll.print());
						dll.reverseList();
						System.out.print("The reversed list: " + dll.print());
					} else if (command.equalsIgnoreCase("b")) {
						System.out.print("Enter the lower bound: ");
						lower = kb.nextDouble();
						System.out.print("Enter the upper bound: ");
						upper = kb.nextDouble();
						System.out.print("The original list: " + dll.print());
						dll.deleteSubsection(upper, lower);
						System.out.print("The modified list: " + dll.print());
						System.out.print("The reverse list: " + dll.printReverse());
					} else if (command.equalsIgnoreCase("s")) {
						System.out.print("The original list: " + dll.print());
						dll.swapAlternate();
						System.out.print("The modified list: " + dll.print());
						System.out.print("The reverse list: " + dll.printReverse());
					} else if (command.equalsIgnoreCase("q")) {
						System.exit(0);
					} else {
						System.out.println("Invalid command! Please try again.");
					}
				} catch (Exception e) {
					System.out.println("Invalid input. Please try again.");
					kb.nextLine();
				}
			}
		} else if (type.equalsIgnoreCase("s")) {
			String string, upper, lower;
			DoublyLinkedList<String> dll = new DoublyLinkedList<>();

			while (!command.equalsIgnoreCase("q")) {
				if (!done) {
					System.out.println("Commands:\n" + "(i) - Insert value\r\n" + "(d) - Delete value\r\n"
							+ "(p) - Print list\r\n" + "(l) - Length\r\n" + "(t) - Print reverse\r\n"
							+ "(r) - Reverse list\r\n" + "(b) - Delete Subsection\r\n" + "(s) - Swap Alternate\r\n"
							+ "(q) - Quit program\r\n");
					done = true;
				}

				System.out.print("Enter a command: ");
				command = kb.next();

				try {
					if (command.equalsIgnoreCase("i")) {
						System.out.print("The list is: " + dll.print());
						System.out.print("Enter a string to insert: ");
						string = kb.next();
						dll.insertItem(string);
						System.out.print("The list is: " + dll.print());
						System.out.print("The reverse list: " + dll.printReverse());
					} else if (command.equalsIgnoreCase("d")) {
						System.out.print("The list is: " + dll.print());
						System.out.print("Enter a string to delete: ");
						string = kb.next();
						dll.deleteItem(string);
						System.out.print("The list is: " + dll.print());
						System.out.print("The reverse list: " + dll.printReverse());
					} else if (command.equalsIgnoreCase("p")) {
						System.out.print("The list is: " + dll.print());
					} else if (command.equalsIgnoreCase("l")) {
						System.out.println("The length of the list is " + dll.length());
					} else if (command.equalsIgnoreCase("t")) {
						System.out.print("The reverse list: " + dll.printReverse());
					} else if (command.equalsIgnoreCase("r")) {
						System.out.print("The original list: " + dll.print());
						dll.reverseList();
						System.out.print("The reversed list: " + dll.print());
					} else if (command.equalsIgnoreCase("b")) {
						System.out.print("Enter the lower bound: ");
						lower = kb.next();
						System.out.print("Enter the upper bound: ");
						upper = kb.next();
						System.out.print("The original list: " + dll.print());
						dll.deleteSubsection(upper, lower);
						System.out.print("The modified list: " + dll.print());
						System.out.print("The reverse list: " + dll.printReverse());
					} else if (command.equalsIgnoreCase("s")) {
						System.out.print("The original list: " + dll.print());
						dll.swapAlternate();
						System.out.print("The modified list: " + dll.print());
						System.out.print("The reverse list: " + dll.printReverse());
					} else if (command.equalsIgnoreCase("q")) {
						System.exit(0);
					} else {
						System.out.println("Invalid command! Please try again.");
					}
				} catch (Exception e) {
					System.out.println("Invalid input. Please try again.");
					kb.nextLine();
				}
			}
		}
		kb.close();
	}
}
