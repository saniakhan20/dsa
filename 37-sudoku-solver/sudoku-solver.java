class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char[][] board)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                {
                    for(char c='1';c<='9';c++)
                    {
                        if(valid(board,c,i,j))
                        { 
                            board[i][j]=c;
                            if(solve(board)) return true;
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean valid(char[][] board, char c, int i,int j)
    {
        for(int a=0;a<9;a++)
        {
            if(board[i][a]==c) return false;
            if(board[a][j]==c) return false;
            int r=3*(i/3)+a/3;
            int cl=3*(j/3)+a%3;
            if(board[r][cl]==c) return false;
        }
        return true;
    }
}