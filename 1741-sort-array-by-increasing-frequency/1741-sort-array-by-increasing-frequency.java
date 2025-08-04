class Solution {

    class Pair {
        int num;
        int freq;

        Pair(int num, int freq) {
            this.num = num;
            this.freq = freq;
        }
    }

    public int[] frequencySort(int[] nums) {

        int[] count = new int[201];
        for (var x : nums)
            count[x + 100]++;

        List<Pair> freqList = new ArrayList<>();

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0)
                freqList.add(new Pair(i - 100, count[i]));
        }

        freqList.sort((a, b) -> (a.freq == b.freq) ? b.num - a.num : a.freq - b.freq);

        int[] result = new int[nums.length];

        int index = 0;
        for (Pair p : freqList) {
            while (p.freq != 0) {
                result[index++] = p.num;
                p.freq--;
            }
        }

        return result;

    }
}