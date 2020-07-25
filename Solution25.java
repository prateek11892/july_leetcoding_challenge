// Find Minimum in Rotated Sorted Array II

class Solution {
    public int findMin(int[] arr) {
        int beg = 0;
        int end = arr.length -1;
        int mid;
        while(beg < end){
            mid = beg + (end-beg)/2;
            if(arr[mid] == arr[end]){
                end--;
            }
            else if(arr[mid] > arr[end]){
                beg = mid+1;
            }
            else{
                end = mid;
            }
        }
        return arr[end];
    }
}