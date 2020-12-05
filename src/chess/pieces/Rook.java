package chess.pieces;

import chess.*;
import java.util.*;

public class Rook extends Piece {
    public static final String NOTATION = "R";
    public static final int VALUE = 5;

    public Rook(Square position, Color color) {
        super(position, color, VALUE, NOTATION);
    }

    public Set<Move> getPossibleMoves() {
        return getPossibleMoves(true);
    }

    public Set<Move> getPossibleMoves(boolean considerCheck) {
        return getStraightMoves(considerCheck);
    }

    public void draw() {
        return;
    }
}
