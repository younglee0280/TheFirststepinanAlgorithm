package bubblesort;

public class BubbleSort {
	// 배열 출력할 printArray 삽입
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("[" + a[i] + "]");
		}
		System.out.printf("\n");
	}

	public static void main(String[] args) {

		int a[] = { 90, 34, 78, 12, 56 };
		int ins, cmp, temp;

		// 정렬 전 배열 내용을 표시
		System.out.printf("정렬 전 배열 내용 출력\n");
		printArray(a);
		System.out.printf("\n"); // 줄 사이 간격

		// 버블 정렬로 오름차순 정렬
		for (ins = 0; ins < 5 - 1; ins++) {
			for (cmp = 0; cmp < 5 - ins - 1; cmp++) {
				if (a[cmp] > a[cmp + 1]) {
					temp = a[cmp];
					a[cmp] = a[cmp + 1];
					a[cmp + 1] = temp;
				}
			}
		}
		// 정렬 후 배열 내용을 표시
		System.out.printf("정렬 후 배열 내용 출력\n");
		printArray(a);
		System.out.printf("\n");
	}

}
