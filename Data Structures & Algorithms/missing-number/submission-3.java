class Solution {
    public int missingNumber(int[] nums) {
        int missingNumber = 0;

        TreeSet<Integer> set = new TreeSet();
        for (int num : nums){
            set.add(num);
        }
        int n = set.size();
        System.out.println(set.size());
    for (int i = 0;i <= n;i++){

        if (set.contains(i)){
            System.out.println("this is i exists: " + i);
        }else{
             missingNumber = i;
             break;  
        }}
    return missingNumber;
    }
 }


