class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> s=new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char c=board[i][j];
                if(c=='.') continue;
                String a=c+"in r"+i;
                String b=c+"in c"+j;
                String d=c+"in cube"+(i/3)+"-"+(j/3);
                if(!s.add(a) || !s.add(b) || !s.add(d))
                return false;
            }
        }
        return true;
    }
}