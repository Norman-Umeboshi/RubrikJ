/**
 * Norman Ta
 * 6-5-2020
 *
 * CubePieces.java
 */

public class CubePieces {

    private char sideOne;
    private char sideTwo;
    private char sideThree;
    private int numSides;
    private int id;


    public CubePieces(char sideOne, char sideTwo, char sideThree, int numSides, int id) {
        if (numSides < 2 || numSides > 3) {
            throw new IllegalArgumentException("Invalid number of sides");
        }
        if (numSides == 2) {
            //Edge Piece
            this.sideOne = sideOne;
            this.sideTwo = sideTwo;
            this.id = id;
            this.numSides = 2;
        }
        if (numSides == 3) {
            //Corner Piece
            this.sideOne = sideOne;
            this.sideTwo = sideTwo;
            this.sideThree = sideThree;
            this.id = id;
            this.numSides = 3;
        }
    }


    public int getId() {
        return id;
    }

}
