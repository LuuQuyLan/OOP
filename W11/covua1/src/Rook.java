public class Rook extends Piece {

    public Rook(int x, int y) {
        super(x, y);
    }

    public Rook(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        int currentX = this.getCoordinatesX();
        int currentY = this.getCoordinatesY();

        if (currentX == x || currentY == y) {
            int directionX = Integer.compare(x, currentX);
            int directionY = Integer.compare(y, currentY);

            int checkX = currentX + directionX;
            int checkY = currentY + directionY;

            while (checkX != x || checkY != y) {
                if (board.getAt(checkX, checkY) != null) {
                    return false;
                }
                checkX += directionX;
                checkY += directionY;
            }

            Piece pieceAtDestination = board.getAt(x, y);
            return pieceAtDestination == null
                    || !pieceAtDestination.getColor().equals(this.getColor());
        }
        return false;
    }
}
