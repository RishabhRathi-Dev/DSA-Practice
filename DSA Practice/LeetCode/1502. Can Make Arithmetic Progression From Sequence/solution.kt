class Solution {
    fun canMakeArithmeticProgression(arr: IntArray): Boolean {
        if (arr.size == 2){
            return true
        }

        sort(arr)

        var d : Int = arr[1] - arr[0]

        for(i in 2..arr.size-1){
            var cd : Int = arr[i] - arr[i-1]
            if (cd != d){
                return false
            }
        }

        return true
    }

    fun sort(arr: IntArray){
        var leftPointer : Int = 0
        var comparePointer : Int = 0

        while(leftPointer < arr.size){

            if (arr[leftPointer] > arr[comparePointer]){
                var temp : Int = arr[leftPointer]
                arr[leftPointer] = arr[comparePointer]
                arr[comparePointer] = temp
            }

            if (comparePointer < arr.size - 1){
                comparePointer++;
            } else{
                leftPointer++;
                comparePointer = 0;
            }
        }
    }
}