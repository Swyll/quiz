package swy;

//≈≈–Ú
public class Sort {
	int[] list;

	public Sort(int[] list) {
		super();
		this.list = list;
	}

	// √∞≈›≈≈–Ú
	public int[] bubbleSort(int[] a) {
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}

		return a;
	}

	// øÏÀŸ≈≈–Ú
	public static void quickSort(int[] a, int l, int k) {
		int i = l;
		int j = k;
		if (i < j) {
			int x = a[i];
			while (i < j) {
				if (a[j] <x) {
					a[i] = a[j];
					i++;
					if (a[i] > x) {
						a[j] = a[i];
					}
					while(a[i] <= x&&i<j) {
						i++;
					}
				}
				if (a[j] >=x) {
					j--;
				}

			}
			a[j] = x;

			quickSort(a, l, i - 1);
			quickSort(a, i + 1, k);
		}

	}

	public static void main(String[] args) {
		int[] a = { 3, 6, 5, 2, 12, 8, 7, 11 ,1};
		// a=Sort.quickSort(a,0,a.length-1);
		Sort.quickSort(a, 0, a.length - 1);
		for (int i : a) {
			System.out.println(i);
		}
	}

}
