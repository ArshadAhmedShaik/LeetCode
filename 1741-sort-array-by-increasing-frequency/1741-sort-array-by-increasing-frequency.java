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
       
        int offset = 100;
        int[] count = new int[201];
        
        for(var x: nums) {
            count[x+offset]++;
        }
        int x = 0;
        for(var y: count) {
            if(y!=0) {
                x++;
            }
        }
        Pair[] freq = new Pair[x];
        // update numbers and frequencies
        int index = 0;
       for(int i = 0;i < count.length;i++) {
            if(count[i] != 0) {
                    freq[index++] =  new Pair(i-offset, count[i]);
            }
       }
       Arrays.sort(freq, new Comparator<Pair>() {
                public int compare(Pair a, Pair b) {
                    if(a.freq==b.freq) {
                        return b.num - a.num;
                    } else {
                        return a.freq - b.freq;
                    }
                }
       });
       
       int ind = 0;
       for(int i = 0;i < freq.length;i++) {
            while(freq[i].freq != 0) {
                nums[ind++] = freq[i].num;
                freq[i].freq--;
            }
       }

       return nums;

    }
}