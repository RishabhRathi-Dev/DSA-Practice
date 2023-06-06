class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        sort(arr);

        if (arr.length == 2){
            return true;
        }

        int d = arr[1] - arr[0];

        for (int i = 2; i < arr.length; i++){
            System.out.println(arr[i]);
            int cd = arr[i] - arr[i-1];
            if (cd != d){
                return false;
            }
        }
        
        return true;
    }

    public void sort(int[] arr) {
        int leftPointer = 0;
        int comparePointer = 0;

        while (leftPointer < arr.length){

            if (arr[leftPointer] > arr[comparePointer]){
                int temp = arr[leftPointer];
                arr[leftPointer] = arr[comparePointer];
                arr[comparePointer] = temp;
            }

            if (comparePointer < arr.length - 1){
                comparePointer++;
            } else {
                leftPointer++;
                comparePointer = 0;
            }
        }
    }
}