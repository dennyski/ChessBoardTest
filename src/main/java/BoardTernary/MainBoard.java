package BoardTernary;

public class MainBoard {
    public static void main(String[] args) {
        // iniciovat pole
        int rows = 8;
        int columns = rows;
        String[][] chessBoard = new String[rows][columns];
        String[] colors = {"  ", "██"}; //░░

        // naplnit sachovnici row/col for my sanity
        for (int row = 0; row < chessBoard.length; row++) {
            for (int col = 0; col < chessBoard.length; col++) {
                // satle lze zkratit dalsim ternarnim op, ale cti to..
                if (col % 2 == 0) {
                    chessBoard[row][col] = row % 2 == 0 ? colors[1] : colors[0];
                } else {
                    chessBoard[row][col] = row % 2 != 0 ? colors[1] : colors[0];
                }
            } // konec cols
        } //konec rows

        // yvkreslit sachovnici
        for (String[] strings : chessBoard) {
            for (int col = 0; col < chessBoard.length; col++) {
                System.out.print(strings[col]);
            }
            System.out.println();
        }
    }
}