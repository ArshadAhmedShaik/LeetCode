class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if (nums.empty()) return 0;

        unordered_set<int> s;
        s.reserve(nums.size() * 2); // reduce rehashing
        for (int num : nums) {
            s.insert(num);
        }

        int longest = 0;
        for (int num : s) {
            if (!s.count(num - 1)) { // start of sequence
                int current = num;
                int count = 1;

                while (s.count(current + 1)) {
                    current++;
                    count++;
                }

                if (count > longest) longest = count;
            }
        }

        return longest;
    }
};