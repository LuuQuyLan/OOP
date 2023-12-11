public class Bishop extends Piece {

    public Bishop(int x, int y) {
        super(x, y);
    }

    public Bishop(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public String getSymbol() {
        return "B";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        int currentX = this.getCoordinatesX();
        int currentY = this.getCoordinatesY();

        boolean isDiagonal = isDiagonalMove(currentX, currentY, x, y);
        if (!isDiagonal) {
            return false;
        }
        boolean hasObstacles = hasObstaclesOnDiagonal(board, currentX, currentY, x, y);
        if (hasObstacles) {
            return false;
        }
        Piece pieceAtDestination = board.getAt(x, y);
        if (pieceAtDestination != null && !pieceAtDestination.getColor().equals(this.getColor())) {
            return true; // Ăn quân cờ đối phương
        }
        return pieceAtDestination == null;
    }

    /** kiểm tra xem vị trí có nằm trên đường chéo không. */
    private boolean isDiagonalMove(int currentX, int currentY, int x, int y) {
        int deltaX = Math.abs(x - currentX);
        int deltaY = Math.abs(y - currentY);
        return deltaX == deltaY;
    }

    /** kiểm tra có quân cờ nào trên đường chéo không. */
    private boolean hasObstaclesOnDiagonal(Board board, int currentX, int currentY, int x, int y) {
        int directionX = (x > currentX) ? 1 : -1;
        int directionY = (y > currentY) ? 1 : -1;

        int checkX = currentX + directionX;
        int checkY = currentY + directionY;

        while (checkX != x && checkY != y) {
            if (board.getAt(checkX, checkY) != null) {
                return true;
            }
            checkX += directionX;
            checkY += directionY;
        }
        return false;
    }

}
