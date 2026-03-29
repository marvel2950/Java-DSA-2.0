class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr2.length; i++) {
            if(map.containsKey(arr2[i])) {
                int curFreq = map.get(arr2[i]);
                map.put(arr2[i], curFreq + 1);
            } else {
                map.put(arr2[i], 1);
            }
        }

        List<Integer> list = new ArrayList<>();

        for(int num : nums1) {
            if(map.containsKey(num) && map.get(num) > 0) {
                list.add(num);
                int curFreq = map.get(num);
                map.put(num, curFreq - 1);
            }
        }

        int[] arr = new int[list.size()];

        for(int i=0; i<list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}