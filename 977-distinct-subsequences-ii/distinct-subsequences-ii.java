class Solution {
    public int distinctSubseqII(String s) {
        long M=1_000_000_007;
        long[] last=new long[26];
        long total=0;

        for (char c :s.toCharArray()) {
            int index=c -'a';
            long newSubseq=(total-last[index]+1+M)%M;
            total = (total + newSubseq) % M;
            last[index] = (last[index]+newSubseq)%M;
        }
        return (int)total;
    }
}
