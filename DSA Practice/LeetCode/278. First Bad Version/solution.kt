/* The isBadVersion API is defined in the parent class VersionControl.
      fun isBadVersion(version: Int) : Boolean {} */

class Solution: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        var l : Int = 0
        var r : Int = n - 1

        while(l <= r){
            val mid : Int = l + (r-l)/2
            if (isBadVersion(mid)==false){
                l = mid+1
            } else{
                r = mid-1
            }
        }

        return l
	}
}