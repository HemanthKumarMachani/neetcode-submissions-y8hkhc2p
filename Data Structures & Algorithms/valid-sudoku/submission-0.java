class Solution {
    public boolean isValidSudoku(char[][] board) {
        int N = 9;
        Set<Character>[] rows = new HashSet[N];
        Set<Character>[] columns = new HashSet[N];
        Set<Character>[] matrixes = new HashSet[N];
        //intialize HashSet for each row, column and box
        for(int index=0; index<N; index++){
            rows[index] = new HashSet<Character>();
            columns[index] = new HashSet<Character>();
            matrixes[index] = new HashSet<Character>();
        }
        //validate using nested loops
        for(int row =0; row<N; row++){
            for(int col=0; col<N; col++){
                char val = board[row][col];
                if(val == '.') continue;
                //validate row
                if(rows[row].contains(val)){
                    return false;
                }
                //if it doesn't exist, add value to the row hashset
                rows[row].add(val);
                //validate column
                if(columns[col].contains(val)){
                    return false;
                }
                //add value to the column hashset
                columns[col].add(val);
                //validate in 3X3 grid
                //find out the index hashset using row/3 + 3 + col/3
                int idx = (row/3) * 3 + (col/3);
                if(matrixes[idx].contains(val)){
                    return false;
                }
                matrixes[idx].add(val);
            }
        }
        return true;
    }
}
