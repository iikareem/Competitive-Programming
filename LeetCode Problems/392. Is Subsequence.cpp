class Solution {
public:
    bool isSubsequence(string b, string a) {
        int count=0;
    for (int i = 0; i < a.length(); ++i) {
        if (count<b.length()){
            if (b[count]==a[i]){
                count++;
            }
        }
    }
    if (count==b.length()){
        return true;
    } else{
        return false;
    }
    }

};