package cn.edu.xyc.test;

class Array {
	public static void selectSort(int[] arry) {
		for (int x = 0; x < arry.length; x++) {
			for (int y = x + 1; y < arry.length; y++)
				if (arry[x] < arry[y]) {
					int temp = arry[x];
					arry[x] = arry[y];
					arry[y] = temp;
				}
		}
	}

	public static void main(String[] args) {
		int arry[] = { 5, 3, 2, 6, 7, 4 };
		A.printArray(arry); // 培序前
		selectSort(arry); // 培序
		A.printArray(arry);
	}
}

class A {
	public static void printArray(int[] arry) {
		System.out.print("[");
		for (int x = 0; x < arry.length; x++) {
			if (x != arry.length)
				System.out.print(arry[x] + ",");
			else
				System.out.print(arry[x]);
		}
}

}
