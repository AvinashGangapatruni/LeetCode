class Solution {
    public int removeStones(int[][] stones) {
        List<List<Integer>> adjList = createAdjList(stones);
        int numberOfComponents = 0;
        boolean[] visited = new boolean[stones.length];
        for(int i=0;i<stones.length;i++)
        {
            if(!visited[i])
            {
                dfs(adjList,i,visited);
                numberOfComponents++;
            }
        }
        return stones.length - numberOfComponents;
    }
    void dfs(List<List<Integer>> adjList,int stone,boolean[] visited)
    {
        visited[stone] = true;
        for(int neighbor : adjList.get(stone))
        {
            if(!visited[neighbor])
            {
                dfs(adjList,neighbor,visited);
            }
        }
    }
    List<List<Integer>> createAdjList(int [][] stones)
    {
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<stones.length;i++){
            adjList.add(new ArrayList<>());
        }
        for(int i=0;i<stones.length;i++)
        {
            for(int j=i+1;j<stones.length;j++)
            {
                if(stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]){
                adjList.get(i).add(j);
                adjList.get(j).add(i);
            }
        }
    }
    return adjList;
}
}