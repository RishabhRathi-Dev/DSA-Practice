public class Solution {
    public IList<IList<int>> Generate(int numRows) {
        IList<IList<int>> output = new List<IList<int>>();
        if (numRows == 0)
        {
            return output;
        }

        output.Add(new List<int> { 1 });

        for (int i = 1; i < numRows; i++)
        {
            IList<int> curr = new List<int> { 1 };
            int j = 1;
            IList<int> prev = output[i - 1] as List<int>;

            while (j < i)
            {
                curr.Add(prev[j - 1] + prev[j]);
                j++;
            }

            curr.Add(1);
            output.Add(curr);
        }

        return output;
    }
}