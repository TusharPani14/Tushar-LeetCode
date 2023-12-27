class Solution {
public:
    int minCost(string colors, vector<int>& neededTime) {
        int l = colors.length();
        int prev = 0, time = 0;
        for (int i = 1; i < l; i++) {
            // If the current color matches the previous one
            if (colors[i] == colors[prev]) {
                // Add the minimum time between the current and previous tasks
                time += min(neededTime[i], neededTime[prev]);
                // If the time required for the current task is less than the previous one,
                // skip the current task as it can be finished earlier with the same color
                if (neededTime[i] < neededTime[prev]) {
                    continue;
                }
            }
            // Update the previous index to the current index
            prev = i;
        }
        return time; // Return the total time taken
    }
};