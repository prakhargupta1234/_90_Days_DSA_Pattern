package Day48;

public class Sliding_Window_Median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	PriorityQueue<Integer> leftMaxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> rightMinHeap = new PriorityQueue<>();

    Map<Integer, Integer> delayed = new HashMap<>();

    int leftSize = 0;
    int rightSize = 0;

    public double[] medianSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        double[] result = new double[n - k + 1];

        for (int i = 0; i < n; i++) {

            addNum(nums[i]);

            if (i >= k - 1) {

                result[i - k + 1] = getMedian(k);

                removeNum(nums[i - k + 1]);
            }
        }

        return result;
    }

    private void addNum(int num) {

        if (leftMaxHeap.isEmpty() || num <= leftMaxHeap.peek()) {
            leftMaxHeap.add(num);
            leftSize++;
        } else {
            rightMinHeap.add(num);
            rightSize++;
        }

        balance();
    }

    private void removeNum(int num) {

        delayed.put(num, delayed.getOrDefault(num, 0) + 1);

        if (num <= leftMaxHeap.peek()) {
            leftSize--;
            if (num == leftMaxHeap.peek()) prune(leftMaxHeap);
        } else {
            rightSize--;
            if (num == rightMinHeap.peek()) prune(rightMinHeap);
        }

        balance();
    }

    private void balance() {

        if (leftSize > rightSize + 1) {

            rightMinHeap.add(leftMaxHeap.poll());
            leftSize--;
            rightSize++;

            prune(leftMaxHeap);
        }

        else if (leftSize < rightSize) {

            leftMaxHeap.add(rightMinHeap.poll());
            leftSize++;
            rightSize--;

            prune(rightMinHeap);
        }
    }

    private void prune(PriorityQueue<Integer> heap) {

        while (!heap.isEmpty()) {

            int num = heap.peek();

            if (delayed.containsKey(num)) {

                delayed.put(num, delayed.get(num) - 1);

                if (delayed.get(num) == 0)
                    delayed.remove(num);

                heap.poll();
            }
            else break;
        }
    }

    private double getMedian(int k) {

        if (k % 2 == 1)
            return leftMaxHeap.peek();

        return ((double) leftMaxHeap.peek() + rightMinHeap.peek()) / 2.0;
    }

}
