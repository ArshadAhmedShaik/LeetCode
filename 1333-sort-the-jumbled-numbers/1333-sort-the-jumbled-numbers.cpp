class Solution {
public:
    vector<int> sortJumbled(vector<int>& mapping, vector<int>& nums) {
        vector<pair<int, int>> pairs;

        for (int i = 0; i < nums.size(); i++) {
            int mapped_n = 0, base = 1;
            int num = nums[i];

            if (num == 0) {
                mapped_n = mapping[0];
            } else {
                while (num > 0) {
                    int digit = num % 10;
                    num /= 10;
                    mapped_n += base * mapping[digit];
                    base *= 10;
                }
            }

            pairs.push_back({mapped_n, i});
        }

        sort(pairs.begin(), pairs.end());

        vector<int> res;
        for (auto& p : pairs) {
            res.push_back(nums[p.second]);
        }

        return res;
    }
};