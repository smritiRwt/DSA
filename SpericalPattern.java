public class SpericalPattern {
    public static void main(String[] args) {
        int size=10;
        int i,j,n;
        int left,top;
        int board[][]=new int[size][size];
        left=0;
        top=size-1;
        n=1;
        for(i=1; i<=size/2; i++, left++, top--){
            for(j=left; j<=top; j++){
                board[left][j]=n++;
            }
            for(j=left+1; j<=top; j++){
                board[j][top]=n++;
            }
            for(j=top-1; j>=left; j--){
                board[top][j]=n++;
            }
            for(j=top-1; j>=left+1; j--){
                board[j][left]=n++;
            }
        }
        for(i=0; i<size; i++)
    {
        for(j=0; j<size; j++)
        {
            System.out.print(board[i][j]);
        }
        System.out.println();
    }


    }
}
