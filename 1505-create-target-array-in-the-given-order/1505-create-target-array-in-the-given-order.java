class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<index.length;i++){
            arr.add(index[i],nums[i]);
        }
            int arr1[]=new int[arr.size()];
            for(int i=0;i<arr.size();i++){
                arr1[i]=arr.get(i);
            }
            return arr1;

        
        
    }
}