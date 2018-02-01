class SubGrids {
	
	public static void main(String[] args) throws java.lang.Exception {
		SubGrids obj = new SubGrids();
		obj.findMaxSubMatrix(new int[][] { { -5, 5, -5 }, { 5, -5, 5 },
				{ -5, 5, -5 } });
		// findMaxSubMatrix(new int[][] {
		// {1, 2, -1, -4, -20},
		// {-8, -3, 4, 2, 1},
		// {3, 8, 10, 1, 3},
		// {-4, -1, 1, 7, -6}
		// });
	}

	public int[] kadane(int[] array) {
		int[] result = new int[] { Integer.MIN_VALUE, 0, -1 };
		int currentSum = 0;
		int localStart = 0;

		for (int i = 0; i < array.length; i++) {
			currentSum += array[i];
			if (currentSum < 0) {
				currentSum = 0;
				localStart = i + 1;
			} else if (currentSum > result[0]) {
				result[0] = currentSum;
				result[1] = localStart;
				result[2] = i;
			}
		}

		if (result[2] == -1) {
			result[0] = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i] > result[0]) {
					result[0] = array[i];
					result[1] = i;
					result[2] = i;
				}
			}
		}

		return result;
	}

	public void findMaxSubMatrix(int[][] array) {
		int totalCols = array[0].length;
		int totalRows = array.length;
		int[] currentResult;
		int maxSum = Integer.MIN_VALUE;
		int left = 0;
		int top = 0;
		int right = 0;
		int bottom = 0;

		for (int leftCol = 0; leftCol < totalCols; leftCol++) {
			int[] tempArray = new int[totalRows];

			for (int rightCol = leftCol; rightCol < totalCols; rightCol++) {

				for (int i = 0; i < totalRows; i++) {
					tempArray[i] += array[i][rightCol];
				}
				currentResult = kadane(tempArray);
				if (currentResult[0] > maxSum) {
					maxSum = currentResult[0];
					left = leftCol;
					top = currentResult[1];
					right = rightCol;
					bottom = currentResult[2];
				}
			}
		}
		System.out.println("MaxSum: " + maxSum + ", range: [(" + left + ", "
				+ top + ")(" + right + ", " + bottom + ")]");
	}
}
