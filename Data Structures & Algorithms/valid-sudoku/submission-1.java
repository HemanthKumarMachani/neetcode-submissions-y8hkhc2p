class Solution {
    public boolean isValidSudoku(char[][] board) {
        //make sure input is valid 
        if(board == null || board.length == 0) return false;
        int N = board.length;
        Set<Character> [] rows = new HashSet[N];
        Set<Character> [] cols = new HashSet[N];
        Set<Character> [] squares = new HashSet[N];
        //initialize HashSet for each row, column and square
        for(int index = 0; index < N; index++){
            rows[index] = new HashSet<Character>();
            cols[index] = new HashSet<Character>();
            squares[index] = new HashSet<Character>();
        }
        //validate the board
        for(int row = 0; row < N; row++){
            for(int col = 0; col < N; col++){
                char val = board[row][col];
                if(val == '.') continue;
                //validate if the val is in rows
                if(rows[row].contains(val)) return false;
                //add the val to the row 
                rows[row].add(val);
                //validate if val is in cols
                if(cols[col].contains(val)) return false;
                //add the val to th col
                cols[col].add(val);
                //validate if the val is in square
                //We can get the current square using row/3 * 3 + col/3
                int squareIdx = (row/3) * 3 + (col/3);
                if(squares[squareIdx].contains(val)) return false;
                //add val to the square
                squares[squareIdx].add(val);
            }
        }
        return true;
        
    }
}