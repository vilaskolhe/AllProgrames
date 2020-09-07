import java.util.Scanner;

public class printDuplicates {
//	Technique 1 :
	public static void printDuplicateElements1() {
		System.out.print("Enter the size of array : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		System.out.print("Enter the elements on an array :");
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

//		int a[] = {2,3,4,1,2,3,1,2,8,2,1,3,2,1,1};
		int uniq[] = new int[a.length];
		int uniqCount = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					boolean present = false;
					for (int j2 = 0; j2 < uniq.length; j2++) {
						if (a[i] == uniq[j2]) {
							present = true;
						}
					}
					if (present == false) {
						uniq[uniqCount] = a[i];
						uniqCount++;
					}

				}
			}
		}
		for (int i = 0; i < uniqCount; i++) {
			System.out.println(uniq[i]);
		}
	}

	// Technique 2 :
	public static void printDuplicateElements() {
		System.out.print("Enter the size of array : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		System.out.print("Enter the elements on an array :");
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		System.out.print("Duplicate Elements in an Array are : ");
		int b[] = new int[size];

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(a[i] + " ");
			}
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i] != 0)
				System.out.print(b[i] + " ");
		}
	}

}
