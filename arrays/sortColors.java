class Solution {
    public void sortColors(int[] a) {
        int left = 0, index = 0, right = a.length - 1;
        int temp = 0;
        while (index <= right) {
            switch (a[index]) {
                case 0:
                    temp = a[left];
                    a[left] = a[index];
                    a[index] = temp;
                    left++;
                    index++;
                    break;
                case 1:
                    index++;
                    break;
                case 2:
                    temp = a[right];
                    a[right] = a[index];
                    a[index] = temp;
                    right--;
                    break;

            }
        }
    }
}