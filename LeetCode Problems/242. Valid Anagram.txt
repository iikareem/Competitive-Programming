class Solution {
public:
    bool isAnagram(string s, string t) {
    if (s.length()!=t.length()){
        return false;
    }
    int n =s.size();
    map<char,int>counts;
    for (int i = 0; i < n; ++i) {
        counts[s[i]]++;
        counts[t[i]]--;
    }
    for (int i = 0; i < counts.size(); ++i) {
        if (counts[i]){
            return false;
        }
    }
    return true;
    }
};