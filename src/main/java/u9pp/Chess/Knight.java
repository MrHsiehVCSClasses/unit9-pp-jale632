package u9pp.Chess;

public class Knight extends ChessPiece{
    public Knight(ChessPiece[][] board, int row, int col, boolean IsWhite){
        super(board, row, col, IsWhite);
    }
    public boolean canMoveTo(int r, int c){
        if(super.canMoveTo(r, c)){
            if(isIt2by1(r, c)){
                return true;
            }
        }
        return false;
    }

    public boolean isIt2by1(int row, int col){
        int R = Math.abs(this.r - row);
        int C = Math.abs(this.c - col);

        if ((R == 2 && C == 1) || (R == 1 && C == 2)){
            return true;
        }
        return false;
    }

    public String toString()
    {
        String color = "n";
        if(this.isWhite){
            color = "N";
        }
        return color;
    }
}
