/**
 * Norman Ta
 * 6-5-2020
 *
 * Cube.java
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class Cube {
    Hashtable<Integer, CubePieces> allPieces;
    private int numPieces = 0;
    ArrayList<CubePieces> currentCubeState = new ArrayList<>(20);
    /*Default Side Colours:
        1. Red
        2. Blue
        3. Orange
        4. Green
        5. White
        6. Yellow
     */

    char[][] oneCenterSide;
    char[][] twoCenterSide;
    char[][] threeCenterSide;
    char[][] fourCenterSide;
    char[][] fiveCenterSide;
    char[][] sixCenterSide;

    public Cube(){
        CubePieces wrEdge = new CubePieces('w', 'r', '\0', 2, 0);
        CubePieces wbEdge = new CubePieces('w', 'b', '\0', 2, 1);
        CubePieces woEdge = new CubePieces('w', 'o', '\0', 2, 2);
        CubePieces wgEdge = new CubePieces('w', 'g', '\0', 2, 3);

        CubePieces wrbCor = new CubePieces('w', 'r', 'b', 3, 4);
        CubePieces wboCor = new CubePieces('w', 'b', 'o', 3, 5);
        CubePieces wogCor = new CubePieces('w', 'o', 'g', 3, 6);
        CubePieces wgrCor = new CubePieces('w', 'g', 'r', 3, 7);

        CubePieces rbEdge = new CubePieces('r', 'b', 'm', 2, 8);
        CubePieces boEdge = new CubePieces('b', 'o', 'm', 2, 9);
        CubePieces ogEdge = new CubePieces('o', 'g', 'm', 2, 10);
        CubePieces grEdge = new CubePieces('g', 'r', 'm', 2, 11);

        CubePieces yrEdge = new CubePieces('y', 'r', '\0', 2, 12);
        CubePieces ybEdge = new CubePieces('y', 'b', '\0', 2, 13);
        CubePieces yoEdge = new CubePieces('y', 'o', '\0', 2, 14);
        CubePieces ygEdge = new CubePieces('y', 'g', '\0', 2, 15);

        CubePieces yrbCor = new CubePieces('y', 'r', 'b', 3, 16);
        CubePieces yboCor = new CubePieces('y', 'b', 'o', 3, 17);
        CubePieces yogCor = new CubePieces('y', 'o', 'g', 3, 18);
        CubePieces ygrCor = new CubePieces('y', 'g', 'r', 3, 19);

        currentCubeState.add(wrEdge);
        currentCubeState.add(wrbCor);
        currentCubeState.add(wbEdge);
        currentCubeState.add(wboCor);
        currentCubeState.add(woEdge);
        currentCubeState.add(wogCor);
        currentCubeState.add(wgEdge);
        currentCubeState.add(wgrCor);
        currentCubeState.add(rbEdge);
        currentCubeState.add(boEdge);
        currentCubeState.add(ogEdge);
        currentCubeState.add(grEdge);
        currentCubeState.add(yrEdge);
        currentCubeState.add(yrbCor);
        currentCubeState.add(ybEdge);
        currentCubeState.add(yboCor);
        currentCubeState.add(yoEdge);
        currentCubeState.add(yogCor);
        currentCubeState.add(ygEdge);
        currentCubeState.add(ygrCor);

        char[][] redSide = {{'r','r','r'}, {'r','r','r'},{'r','r','r'}};
        char[][] blueSide = {{'b','b','b'}, {'b','b','b'},{'b','b','b'}};
        char[][] orangeSide = {{'o','o','o'}, {'o','o','o'},{'o','o','o'}};
        char[][] greenSide = {{'g','g','g'}, {'g','g','g'},{'g','g','g'}};
        char[][] whiteSide = {{'w','w','w'}, {'w','w','w'},{'w','w','w'}};
        char[][] yellowSide = {{'y','y','y'}, {'y','y','y'}, {'y','y','y'}};

        this.oneCenterSide = redSide;
        this.twoCenterSide = blueSide;
        this.threeCenterSide = orangeSide;
        this.fourCenterSide = greenSide;
        this.fiveCenterSide = whiteSide;
        this.sixCenterSide = yellowSide;
    }

    public Cube(ArrayList<CubePieces> currentCubeState, char[][] oneCenterSide, char[][] twoCenterSide, char[][] threeCenterSide,
                char[][] fourCenterSide, char[][] fiveCenterSide, char[][] sixCenterSide){
        this.currentCubeState = currentCubeState;
        this.oneCenterSide = oneCenterSide;
        this.twoCenterSide = twoCenterSide;
        this.threeCenterSide = threeCenterSide;
        this.fourCenterSide = fourCenterSide;
        this.fiveCenterSide = fiveCenterSide;
        this.sixCenterSide = sixCenterSide;
    }

    public void turnU() {
        CubePieces temporaryStore18th = this.currentCubeState.get(18);
        CubePieces temporaryStore19th = this.currentCubeState.get(19);
        for (int i = 19; i > 11; i--) {
            this.currentCubeState.set(i, this.currentCubeState.get(i - 2));
        }
        this.currentCubeState.set(12, temporaryStore18th);
        this.currentCubeState.set(13, temporaryStore19th);

        char greenCenter00 = this.fourCenterSide[0][0];
        char greenCenter01 = this.fourCenterSide[0][1];
        char greenCenter02 = this.fourCenterSide[0][2];

        System.arraycopy(this.threeCenterSide[0], 0, this.fourCenterSide[0], 0, 3);
        System.arraycopy(this.twoCenterSide[0], 0, this.threeCenterSide[0], 0, 3);
        System.arraycopy(this.oneCenterSide[0], 0, this.twoCenterSide[0], 0, 3);

        this.oneCenterSide[0][0] = greenCenter00;
        this.oneCenterSide[0][1] = greenCenter01;
        this.oneCenterSide[0][2] = greenCenter02;

        this.sixCenterSide = rotateSideClockWise(sixCenterSide);
    }

    public void turnU2() {
        this.turnU();
        this.turnU();
    }

    public void turnUi() {
        this.turnU();
        this.turnU2();
    }
    public void turnR(){
        CubePieces temporaryStoreID6 = this.currentCubeState.get(5);
        CubePieces temporaryStoreID3 = this.currentCubeState.get(6);
        CubePieces temporaryStoreID7 = this.currentCubeState.get(7);
        CubePieces temporaryStoreID10 = this.currentCubeState.get(10);
        CubePieces temporaryStoreID11 = this.currentCubeState.get(11);
        CubePieces temporaryStoreID18 = this.currentCubeState.get(17);
        CubePieces temporaryStoreID15 = this.currentCubeState.get(18);
        CubePieces temporaryStoreID19 = this.currentCubeState.get(19);

        this.currentCubeState.set(5, temporaryStoreID18);
        this.currentCubeState.set(6, temporaryStoreID10);
        this.currentCubeState.set(7, temporaryStoreID6);
        this.currentCubeState.set(10, temporaryStoreID15);
        this.currentCubeState.set(11, temporaryStoreID3);
        this.currentCubeState.set(17, temporaryStoreID19);
        this.currentCubeState.set(18, temporaryStoreID11);
        this.currentCubeState.set(19, temporaryStoreID7);

        char whiteCenter02 = this.fiveCenterSide[0][2];
        char whiteCenter12 = this.fiveCenterSide[1][2];
        char whiteCenter22 = this.fiveCenterSide[2][2];

        for(int i = 0; i < 3; i++){
            this.fiveCenterSide[i][2] = this.threeCenterSide[2-i][0];
        }
        for(int i = 0; i < 3; i++){
            this.threeCenterSide[2-i][0] = this.sixCenterSide[i][2];
        }
        for(int i = 0; i < 3; i++){
            this.sixCenterSide[i][2] = this.oneCenterSide[i][2];
        }

        this.oneCenterSide[0][2] = whiteCenter02;
        this.oneCenterSide[1][2] = whiteCenter12;
        this.oneCenterSide[2][2] = whiteCenter22;

        this.fourCenterSide = rotateSideClockWise(fourCenterSide);
    }
    public void turnR2(){
        this.turnR();
        this.turnR();
    }
    public void turnRi(){
        this.turnR();
        this.turnR2();
    }
    public void turnF(){
        CubePieces temporaryStoreID0 = this.currentCubeState.get(0);
        CubePieces temporaryStoreID4 = this.currentCubeState.get(1);
        CubePieces temporaryStoreID7 = this.currentCubeState.get(7);
        CubePieces temporaryStoreID8 = this.currentCubeState.get(8);
        CubePieces temporaryStoreID11 = this.currentCubeState.get(11);
        CubePieces temporaryStoreID12 = this.currentCubeState.get(12);
        CubePieces temporaryStoreID16 = this.currentCubeState.get(13);
        CubePieces temporaryStoreID19 = this.currentCubeState.get(19);

        this.currentCubeState.set(0, temporaryStoreID11);
        this.currentCubeState.set(1, temporaryStoreID7);
        this.currentCubeState.set(7, temporaryStoreID19);
        this.currentCubeState.set(8, temporaryStoreID0);
        this.currentCubeState.set(11, temporaryStoreID12);
        this.currentCubeState.set(12, temporaryStoreID8);
        this.currentCubeState.set(13, temporaryStoreID4);
        this.currentCubeState.set(19, temporaryStoreID16);

        char greenCenter00 = this.fourCenterSide[0][0];
        char greenCenter10 = this.fourCenterSide[1][0];
        char greenCenter20 = this.fourCenterSide[2][0];

        for(int i = 0; i < 3; i++){
            this.fourCenterSide[i][0] = this.sixCenterSide[2][i];
        }
        for(int i = 0; i < 3; i++){
            this.sixCenterSide[2][2-i] = this.twoCenterSide[i][2];
        }
        for(int i = 0; i < 3; i++){
            this.twoCenterSide[i][2] = this.fiveCenterSide[0][i];
        }

        this.fiveCenterSide[0][0] = greenCenter20;
        this.fiveCenterSide[0][1] = greenCenter10;
        this.fiveCenterSide[0][2] = greenCenter00;

        this.oneCenterSide = rotateSideClockWise(oneCenterSide);
    }

    public void turnF2(){
        this.turnF();
        this.turnF();
    }

    public void turnFi(){
        this.turnF();
        this.turnF2();
    }
    public void turnD(){
        CubePieces temporaryStoreID0 = this.currentCubeState.get(0);
        CubePieces temporaryStoreID1 = this.currentCubeState.get(1);
        for(int i = 0; i < 6; i++){
            this.currentCubeState.set(i, this.currentCubeState.get(i+2));
        }
        this.currentCubeState.set(6, temporaryStoreID0);
        this.currentCubeState.set(7, temporaryStoreID1);

        char oneCenter20 = oneCenterSide[2][0];
        char oneCenter21 = oneCenterSide[2][1];
        char oneCenter22 = oneCenterSide[2][2];

        System.arraycopy(twoCenterSide[2], 0, oneCenterSide[2], 0, 3);
        System.arraycopy(threeCenterSide[2], 0, twoCenterSide[2], 0, 3);
        System.arraycopy(fourCenterSide[2], 0, threeCenterSide[2], 0, 3);
        fourCenterSide[2][0] = oneCenter20;
        fourCenterSide[2][1] = oneCenter21;
        fourCenterSide[2][2] = oneCenter22;

        this.fiveCenterSide = rotateSideClockWise(fiveCenterSide);
    }

    public void turnD2(){
        this.turnD();
        this.turnD();
    }

    public void turnDi(){
        this.turnD();
        this.turnD2();
    }

    public void turnL(){
        this.rotateY2();
        this.turnR();
        this.rotateY2();
    }

    public void turnL2(){
        this.turnL();
        this.turnL();
    }

    public void turnLi(){
        this.turnL2();
        this.turnL();
    }

    public void turnB(){
        this.rotateY2();
        this.turnF();
        this.rotateY2();
    }

    public void turnB2(){
        this.turnB();
        this.turnB();
    }

    public void turnBi(){
        this.turnB2();
        this.turnB();
    }



    public void rotateY(){
        CubePieces temporaryStoreID3 = this.currentCubeState.get(6);
        CubePieces temporaryStoreID7 = this.currentCubeState.get(7);
        CubePieces temporaryStoreID11 = this.currentCubeState.get(11);
        CubePieces temporaryStoreID15 = this.currentCubeState.get(18);
        CubePieces temporaryStoreID19 = this.currentCubeState.get(19);
        for(int i = 7; i > 1; i--){
            this.currentCubeState.set(i, this.currentCubeState.get(i-2));
        }
        this.currentCubeState.set(0, temporaryStoreID3);
        this.currentCubeState.set(1, temporaryStoreID7);
        for(int i = 11; i > 8; i--){
            this.currentCubeState.set(i, this.currentCubeState.get(i-1));
        }
        this.currentCubeState.set(8, temporaryStoreID11);
        for(int i = 19; i > 13; i--){
            this.currentCubeState.set(i, this.currentCubeState.get(i-2));
        }
        this.currentCubeState.set(12, temporaryStoreID15);
        this.currentCubeState.set(13, temporaryStoreID19);

        char[][] temporaryStoreSideOne = oneCenterSide;
        oneCenterSide = fourCenterSide;
        fourCenterSide = threeCenterSide;
        threeCenterSide = twoCenterSide;
        twoCenterSide = temporaryStoreSideOne;

        this.sixCenterSide = rotateSideClockWise(sixCenterSide);
        this.fiveCenterSide = rotateSideCounterClockWise(fiveCenterSide);
    }
    public void rotateY2(){
        this.rotateY();
        this.rotateY();
    }

    public void rotateYi(){
        this.rotateY();
        this.rotateY2();
    }


    public char[][] rotateSideClockWise(char[][] src){
        char[][] retArr = new char[3][3];
        for(int i = 0; i < 3; i++){
            retArr[i][2] = src[0][i];
        }
        for(int i = 0; i < 3; i++){
            retArr[i][1] = src[1][i];
        }
        for(int i = 0; i < 3; i++){
            retArr[i][0] = src[2][i];
        }
        return retArr;
    }

    public char[][] rotateSideCounterClockWise(char[][] src){
        char[][] retArr = new char[3][3];
        for(int i = 0; i < 3; i++){
            retArr[0][i] = src[i][2];
        }
        for(int i = 0; i < 3; i++){
            retArr[1][i] = src[i][1];
        }
        for(int i = 0; i < 3; i++){
            retArr[2][i] = src[i][0];
        }
        return retArr;
    }

    public char[][] getOneCenterSide(){
        return this.oneCenterSide;
    }

    public char[][] getTwoCenterSide(){
        return this.twoCenterSide;
    }
    public char[][] getThreeCenterSide(){
        return this.threeCenterSide;
    }
    public char[][] getFourCenterSide(){
        return this.fourCenterSide;
    }
    public char[][] getFiveCenterSide(){
        return this.fiveCenterSide;
    }
    public char[][] getSixCenterSide(){
        return this.sixCenterSide;
    }

    public void printState(){
        for(int i = 0; i < 20; i++){
            System.out.println("Current ArrayList @ index " + i + " is " + currentCubeState.get(i).getId());

        }
        System.out.println("Side 1: " + Arrays.deepToString(oneCenterSide));
        System.out.println("Side 2: " + Arrays.deepToString(twoCenterSide));
        System.out.println("Side 3: " + Arrays.deepToString(threeCenterSide));
        System.out.println("Side 4: " + Arrays.deepToString(fourCenterSide));
        System.out.println("Side 5: " + Arrays.deepToString(fiveCenterSide));
        System.out.println("Side 6: " + Arrays.deepToString(sixCenterSide));
    }

    public void scrambleString(String scramble){
        for(int i = 0; i < scramble.length()-1; i++){
            if(scramble.charAt(i+1) == '\''){
                if(scramble.charAt(i) == 'U'){
                    this.turnUi();
                }
                else if(scramble.charAt(i) == 'R'){
                    this.turnRi();
                }
                else if(scramble.charAt(i) == 'F'){
                    this.turnFi();
                }
                else if(scramble.charAt(i) == 'D'){
                    this.turnDi();
                }
                else if(scramble.charAt(i) == 'B'){
                    this.turnBi();
                }
                else if(scramble.charAt(i) == 'L'){
                    this.turnLi();
                }
                else{
                    throw new IllegalArgumentException("INVALID MOVE");
                }
                i = i + 2;
            }
            else if(scramble.charAt(i+1) == '2'){
                if(scramble.charAt(i) == 'U'){
                    this.turnU2();
                }
                else if(scramble.charAt(i) == 'R'){
                    this.turnR2();
                }
                else if(scramble.charAt(i) == 'F'){
                    this.turnF2();
                }
                else if(scramble.charAt(i) == 'D'){
                    this.turnD2();
                }
                else if(scramble.charAt(i) == 'B'){
                    this.turnB2();
                }
                else if(scramble.charAt(i) == 'L'){
                    this.turnL2();
                }
                else{
                    throw new IllegalArgumentException("INVALID MOVE");
                }
                i = i + 2;
            }
            else if(scramble.charAt(i+1) == ' '){
                if(scramble.charAt(i) == 'U'){
                    this.turnU();
                }
                else if(scramble.charAt(i) == 'R'){
                    this.turnR();
                }
                else if(scramble.charAt(i) == 'F'){
                    this.turnF();
                }
                else if(scramble.charAt(i) == 'D'){
                    this.turnD();
                }
                else if(scramble.charAt(i) == 'B'){
                    this.turnB();
                }
                else if(scramble.charAt(i) == 'L'){
                    this.turnL();
                }
                else{
                    throw new IllegalArgumentException("INVALID MOVE");
                }
                i++;
            }
        }
    }

}
