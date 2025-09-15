package Recursion;

public int search(int[]nums,int target){
// write your recursive solution here
return helper(nums,target,0,nums.length-1);}

public int helper(int[]nums,int target,int start,int end){if(start>end)return-1;int mid=s+(e-s)/2;if(target==arr[mid])return mid;else if(arr[mid]<target){
// right me jao
return helper(nums,target,mid+1,end);}else return helper(nums,target,start,mid-1);}