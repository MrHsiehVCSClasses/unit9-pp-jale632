package u9pp.Chess;
public class King extends ChessPiece{
    public King(ChessPiece[][] jboard, int row, int col, boolean IsWhite){
        super(jboard, row, col, IsWhite);
    }

    public boolean noKing(int row, int col){

        for(int r = row - 1; r < row + 2; r++){
            for(int c = col - 1; c < col + 2; c++){
                if(boundary(r, c)){
                    if(board[r][c] != null && board[r][c] instanceof King && board[r][c] != this){
                        return false;
                    }
                }
            }
        }
        return true;
    }


    public boolean canMoveTo(int row, int col){
        if(super.canMoveTo(row, col)){
            if(noKing(row, col)){
                if((row + 1 == this.r || row == this.r || row - 1 == this.r) && (col + 1 == this.c || col == this.c || col - 1 == this.c)){
                        return true;
                }
            }
        }
        return false;
    }

    public String toString()
    {
        String color = "k";
        if(this.isWhite){
            color = "K";
        }
        return color;
    }

}