
class Solution {
    public int[] countBits(int n) {
        ArrayList<Integer> outPut = new ArrayList<>();
        
        for (int i = 0; i <= n; i++) {
            String binarys = Integer.toBinaryString(i);
            int count = 0; 

            for (char binary : binarys.toCharArray()) {
                if (binary - '0' == 1) {
                    count++;
                }
            }
            
            System.out.println("current no: " + i + ": " + count);
            outPut.add(count); 
            System.out.println("--------next------");
        }
        
        int[] list = outPut.stream().mapToInt(Integer::intValue).toArray();
        return list;
    }
}
