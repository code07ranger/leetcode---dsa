bool checkValidString(char* s) {
    int low=0;  // Minimum possible open parentheses
    int high=0; // Maximum possible open parantheses

    for (int i=0;s[i]!='\0';i++) {
        char c=s[i];
        if(c=='('){
            low++;
            high++;
        } else if(c==')'){
            if(low>0)low--;
            high--;
        } else if(c=='*'){
            if (low>0) low--;
            high++;
        }
        if (high<0) {
            return false;
        }
    }
    return low==0;
}