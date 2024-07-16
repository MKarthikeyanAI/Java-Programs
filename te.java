def convert_zigzag(s: str, numRows: int) -> str:
        # Edge case: if numRows is 1 or string is empty, return the string itself
        if numRows == 1 or numRows >= len(s):
        return s

        # Initialize a list to store strings for each row
        rows = [''] * numRows
        current_row = 0
        going_down = False

        # Iterate over each character in the input string
        for char in s:
        rows[current_row] += char  # Add character to the current row
        # Determine direction change
        if current_row == 0 or current_row == numRows - 1:
        going_down = not going_down
        # Update current row index
        current_row += 1 if going_down else -1

        # Combine rows to form the final zigzag string
        return ''.join(rows)

        # Test case
        input_str = "ABCDXYZ"
        num_rows = 3
        output = convert_zigzag(input_str, num_rows)
        print(output)  # Expected output: "AXBDYCZ"





























        #include <bits/stdc++.h>
        using namespace std;

        vector<int> breaktime(int n, vector<vector<int>>& inp) {
        vector<pair<int, int>> events;

        // Convert input intervals to events
        for (const auto& employee : inp) {
        for (int i = 0; i < employee.size(); i += 2) {
        events.push_back({employee[i], 0}); // 0 for start
        events.push_back({employee[i+1], 1}); // 1 for end
        }
        }3

        // Sort events
        sort(events.begin(), events.end());

        int count = 0;
        int lastTime = -1;

        for (const auto& event : events) {
        if (count == 0 && lastTime != -1 && event.first > lastTime) {
        return {lastTime, event.first};
        }

        if (event.second == 0) { // Start of interval
        count++;
        } else { // End of interval
        count--;
        }

        lastTime = event.first;
        }

        // No common free time found
        return {};
        }

// Test function
        int main() {
        int n = 3;
        vector<vector<int>> inp = {{1, 2, 5, 6}, {1, 3}, {4, 10}};
        vector<int> result = breaktime(n, inp);

        if (result.empty()) {
        cout << "No common free time found" << endl;
        } else {
        cout << "Common free time: (" << result[0] << ", " << result[1] << "]" << endl;
        }

        return 0;
        }