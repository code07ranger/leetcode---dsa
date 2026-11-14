class Solution {
    public int numFriendRequests(int[] ages) {
         int[] count = new int[121];
        for (int age : ages) {
            count[age]++;
        }
        int totalRequests = 0;
        for (int ageA = 15; ageA <= 120; ageA++) {
            if (count[ageA] == 0) continue;
            for (int ageB = 15; ageB <= ageA; ageB++) {
                if (count[ageB] == 0) continue;
                if (ageB <= 0.5 * ageA + 7) continue;
                totalRequests += count[ageA] * count[ageB];
                if (ageA == ageB) {
                    totalRequests -= count[ageA];
                }
            }
        }
        return totalRequests;
    }
}