class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<>();
        String words1[] = s1.split(" ");
        String words2[] = s2.split(" ");

        for(int i = 0; i < words1.length; i++) {
            String w = words1[i];
            if(map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            }
            else {
                map.put(w, 1);
            }
        }

        for(int i = 0; i < words2.length; i++) {
            String w = words2[i];
            if(map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            }
            else {
                map.put(w, 1);
            }
        }

        List<String> list = new ArrayList<>();
        for(String key : map.keySet()) {
            if(map.get(key) == 1) {
                list.add(key);
            }
        }

        return list.toArray(new String[0]);
    }
}