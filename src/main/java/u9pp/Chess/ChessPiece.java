package u9pp.Chess;

public class ChessPiece{
    public ChessPiece[][] board;
    public int r;
    public int c;
    public boolean isWhite;

    public ChessPiece(ChessPiece[][] Jboard, int row, int col, boolean IsWhite){
    r = row;
    c = col;
    isWhite = IsWhite;
    board = Jboard;
    }


  public boolean canMoveTo(int row, int col){
    if((row >= 0 && row < board.length) && (col >= 0 && col < board[row].length)){
        if(board[row][col] == null || board[row][col].isWhite() != this.isWhite()){
            if(row == this.r && col == this.c){
                return false;
            }
            else{
                return true;
            }
        }
    }
    return false;
  }
  
  public void doMove(int row, int col){
    board[row][col] = board[r][c];
    board[r][c] = null; 
  }
  
  public boolean isWhite(){
  return true;
  }

  public boolean diagonal(int row, int col){
    int Row = Math.abs(this.r - row);
    int Col = Math.abs(this.c - col);
    if(Row == Col){
        return true;
    }
    return false;
}
public boolean boundary(int row, int col){
    if((row < board.length && row >= 0) && (col < board[row].length && col >= 0)){
        return true;
    }
    return false;
}



public boolean diagonalCheck(int row, int col){
    int Row = 1;
    int Col = 1;
        if(this.r - row > 0){Row = -1;}
        if(this.c - col > 0){Col = -1;}

        for(int currentR = this.r + Row; currentR != row; currentR += Row){
            for(int currentC = this.c + Col; currentC != col; currentC += Col){
                if(this.diagonal(currentR, currentC) && board[currentR][currentC] != null){
                    return false;
                }
            }
        }
        return true;
    }
}
