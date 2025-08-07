class Solution {
public:
    int countConsistentStrings(string allowed, vector<string>& words) {
        bool allowedChars[26] = {false};
        for (char c : allowed) {
            allowedChars[c - 'a'] = true;
        }

        int count = 0;
        for (const string& word : words) {
            bool isConsistent = true;
            for (char c : word) {
                if (!allowedChars[c - 'a']) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) count++;
        }

        return count;
    }
};
