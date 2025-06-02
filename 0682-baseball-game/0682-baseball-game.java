class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String op : operations)
        {
            if(op.equals("+")){
                int top1 = st.peek();
                int top2 = st.get(st.size() - 2);
                st.push(top1 + top2);
            }
            else if(op.equals("D"))
            {
                int top = st.peek();
                st.push(top*2);
            }
            else if(op.equals("C"))
            {
                st.pop();
            }
            else
            {
                st.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for(int score : st)
        {
            sum += score;
        }
        return sum;
    }
}