import java.util.Stack;

class Solution {
    public String reverseParentheses(String s) {
        StringBuilder res=new StringBuilder();
        Stack<Integer> openedIdx=new Stack<>();
        for (int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if (c=='('){
                openedIdx.push(res.length());
            } else if (c==')'){
                int start=openedIdx.pop();
                reverse(res,start,res.length()-1);
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
    private void reverse(StringBuilder sb, int left, int right) {
        while (left < right) {
            char temp=sb.charAt(left);
            sb.setCharAt(left,sb.charAt(right));
            sb.setCharAt(right,temp);
            left++;
            right--;
        }
    }
}
