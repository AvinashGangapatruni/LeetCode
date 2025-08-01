class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tri = new ArrayList<>();
        for(int row = 0; row < numRows; row++){
            List<Integer> currRow = new ArrayList<>();
            for(int col = 0; col <= row; col++){
                if(col == 0 || col == row){
                    currRow.add(1);
                }
                else{
                    int sum = tri.get(row-1).get(col-1)+tri.get(row-1).get(col);
                    currRow.add(sum);
                }
            }
            tri.add(currRow);
        }
        return tri;
    }
}