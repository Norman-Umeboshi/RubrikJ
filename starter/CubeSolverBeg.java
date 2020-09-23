/**
 * Norman Ta
 * 9-5-2020
 *
 * CubeSolverBeg.java
 */

import java.util.Arrays;


public class CubeSolverBeg {

    final static int WREDGE_IDPIECE_ZERO= 0;
    final static int WBEDGE_IDPIECE_ONE = 1;
    final static int WOEDGE_IDPIECE_TWO = 2;
    final static int WGEDGE_IDPIECE_THREE = 3;
    final static int WRBCOR_IDPIECE_FOUR = 4;
    final static int WBOCOR_IDPIECE_FIVE = 5;
    final static int WOGCOR_IDPIECE_SIX = 6;
    final static int WGRCOR_IDPIECE_SEVEN = 7;
    final static int RBEDGE_IDPIECE_EIGHT = 8;
    final static int BOEDGE_IDPIECE_NINE = 9;
    final static int OGEDGE_IDPIECE_TEN = 10;
    final static int GREDGE_IDPIECE_ELEVEN = 11;

    final static int FIRST_LAYER_INDEX_ZERO = 0;
    final static int FIRST_LAYER_INDEX_ONE = 1;
    final static int FIRST_LAYER_INDEX_TWO = 2;
    final static int FIRST_LAYER_INDEX_THREE = 3;
    final static int FIRST_LAYER_INDEX_FOUR = 4;
    final static int FIRST_LAYER_INDEX_FIVE = 5;
    final static int FIRST_LAYER_INDEX_SIX = 6;
    final static int FIRST_LAYER_INDEX_SEVEN = 7;
    final static int SECOND_LAYER_INDEX_EIGHT = 8;
    final static int SECOND_LAYER_INDEX_NINE = 9;
    final static int SECOND_LAYER_INDEX_TEN = 10;
    final static int SECOND_LAYER_INDEX_ELEVEN = 11;
    final static int THIRD_LAYER_INDEX_TWELVE = 12;
    final static int THIRD_LAYER_INDEX_THIRTEEN = 13;
    final static int THIRD_LAYER_INDEX_FOURTEEN = 14;
    final static int THIRD_LAYER_INDEX_FIFTEEN = 15;
    final static int THIRD_LAYER_INDEX_SIXTEEN = 16;
    final static int THIRD_LAYER_INDEX_SEVENTEEN = 17;
    final static int THIRD_LAYER_INDEX_EIGHTEEN = 18;
    final static int THIRD_LAYER_INDEX_NINETEEN = 19;

    final static int ZEROTH_COL_ROW_MATRIX = 0;
    final static int FIRST_COL_ROW_MATRIX = 1;
    final static int SECOND_COL_ROW_MATRIX = 2;

    final static int WHITE_CHAR_FLAG = 'w';
    final static int RED_CHAR_FLAG = 'r';
    final static int BLUE_CHAR_FLAG = 'b';
    final static int ORANGE_CHAR_FLAG = 'o';
    final static int GREEN_CHAR_FLAG = 'g';
    final static int YELLOW_CHAR_FLAG = 'y';
    final static int NONE_CHAR_FLAG = 'n';

    final static String WHITE_STRING_FLAG = "white ";
    final static String RED_STRING_FLAG = "red ";
    final static String BLUE_STRING_FLAG = "blue ";
    final static String ORANGE_STRING_FLAG = "orange ";
    final static String GREEN_STRING_FLAG = "green ";
    final static String YELLOW_STRING_FLAG = "yellow ";

    final static int YELLOW_EOLL_DOT_INT = 1;
    final static int YELLOW_EOLL_LINE_OR_L_INT = 3;

    final static int YELLOW_COLL_CROSS = 5;
    final static int YELLOW_COLL_SUNE = 6;
    final static int YELLOW_COLL_BALLOON = 7;

    final static String repositionRedMessage = "Hold the Rubik's cube so that the Red Center is facing you and the White center is at the bottom.\n";
    final static String repositionBlueMessage = "Hold the Rubik's cube so that the Blue Center is facing you and the White center is at the bottom.\n";
    final static String repositionOrangeMessage = "Hold the Rubik's cube so that the Orange Center is facing you and the White center is at the bottom.\n";
    final static String repositionGreenMessage = "Hold the Rubik's cube so that the Green Center is facing you and the White center is at the bottom.\n";

    final static String WR_EDGE_CORRECT_LOCATION = "We can see that the White-Red Edge piece is located in the front-bottom slot, which is the correct location.\n";

    final static String WR_EDGE_BOTTOM_LAYER_INITIAL = "We can see that the White-Red Edge piece is located in the bottom layer ";
    final static String WR_EDGE_BOTTOM_LAYER_LEFT = "on the left side.\nSimply turn the down-layer clockwise (D) to put in the correct position.\n";
    final static String WR_EDGE_BOTTOM_LAYER_BACK = "at the back side.\nSimply turn the down-layer twice (D2) to put in the correct position.\n";
    final static String WR_EDGE_BOTTOM_LAYER_RIGHT = "on the right side.\nSimply turn the down-layer counter-clockwise (D') to put in the correct position.\n";
    final static String WR_EDGE_BOTTOM_LATER_SOLVED = "but it is already in the right location so you do not have to worry about it.\n";

    final static String WR_EDGE_MIDDLE_LAYER_INITIAL = "We can see that the White-Red Edge piece is located in the middle layer ";
    final static String WR_EDGE_TOP_LAYER_INITIAL = "We can see that the White-Red Edge piece is located in the top layer ";

    final static String WB_EDGE_BOTTOM_LAYER_INITIAL = "We can see that the White-Blue Edge piece is located in the bottom layer ";
    final static String WB_EDGE_MIDDLE_LAYER_INITIAL = "We can see that the White-Blue Edge piece is located in the middle layer ";
    final static String WB_EDGE_TOP_LAYER_INITIAL = "We can see that the White-Blue Edge piece is located in the top layer ";

    final static String WO_EDGE_BOTTOM_LAYER_INITIAL = "We can see that the White-Orange Edge piece is located in the bottom layer ";
    final static String WO_EDGE_MIDDLE_LAYER_INITIAL = "We can see that the White-Orange Edge piece is located in the middle layer ";
    final static String WO_EDGE_TOP_LAYER_INITIAL = "We can see that the White-Orange Edge piece is located in the top layer ";

    final static String WG_EDGE_BOTTOM_LAYER_INITIAL = "We can see that the White-Green Edge piece is located in the bottom layer ";
    final static String WG_EDGE_MIDDLE_LAYER_INITIAL = "We can see that the White-Green Edge piece is located in the middle layer ";
    final static String WG_EDGE_TOP_LAYER_INITIAL = "We can see that the White-Green Edge piece is located in the top layer ";

    final static String WRB_COR_BOTTOM_LAYER_INITIAL = "We can see that the White-Red-Blue Corner piece is located in the bottom layer ";
    final static String WRB_COR_TOP_LAYER_INITIAL = "We can see that the White-Red-Blue Corner piece is located in the top layer ";

    final static String WBO_COR_BOTTOM_LAYER_INITIAL = "We can see that the White-Blue-Orange Corner piece is located in the bottom layer ";
    final static String WBO_COR_TOP_LAYER_INITIAL = "We can see that the White-Blue-Orange Corner piece is located in the top layer ";

    final static String WOG_COR_BOTTOM_LAYER_INITIAL = "We can see that the White-Orange-Green Corner piece is located in the bottom layer ";
    final static String WOG_COR_TOP_LAYER_INITIAL = "We can see that the White-Orange-Green  Corner piece is located in the top layer ";

    final static String WGR_COR_BOTTOM_LAYER_INITIAL = "We can see that the White-Green-Red Corner piece is located in the bottom layer ";
    final static String WGR_COR_TOP_LAYER_INITIAL = "We can see that the White-Green-Red  Corner piece is located in the top layer ";

    final static String RB_EDGE_MIDDLE_LAYER_INITIAL = "We can see that the Red-Blue Edge piece is located in the middle layer ";
    final static String RB_EDGE_TOP_LAYER_INITIAL = "We can see that the Red-Blue Edge piece is located in the top layer ";

    final static String ROTATION_PHRASE_Y = "rotate the cube to the left (Y) ";
    final static String ROTATION_PHRASE_Y2 = "rotate the cube to the right twice (Y2) ";
    final static String ROTATION_PHRASE_Yi = "rotate the cube to the right (Y') ";

    final static String CROSS_EDGE_BOTTOM_LAYER_FRONT = "at the bottom-front slot.\nSimply " + ROTATION_PHRASE_Yi + "so that it is in the bottom-right slot.\n";
    final static String CROSS_EDGE_BOTTOM_LAYER_LEFT = "at the bottom-left slot.\nSimply " + ROTATION_PHRASE_Y2 + "so that it is in the bottom-right slot.\n";
    final static String CROSS_EDGE_BOTTOM_LAYER_BACK = "at the bottom-back slot.\nSimply " + ROTATION_PHRASE_Y + "so that it is in the bottom-right slot\n";
    final static String CROSS_EDGE_BOTTOM_LAYER_RIGHT = "at the bottom-right slot, which is the correct slot";
    final static String CROSS_EDGE_BOTTOM_RIGHT_TURN = "Now simply turn the right-layer twice (R2) so that the edge piece is at the top layer.\n";
    final static String CROSS_EDGE_MIDDLE_LAYER_FRONT_LEFT = "at the front-left slot.\nSimply " + ROTATION_PHRASE_Yi + "so that it is in the front-right slot.\n";
    final static String CROSS_EDGE_MIDDLE_LAYER_BACK_LEFT = "at the back-left slot.\nSimply " + ROTATION_PHRASE_Y2 + "so that it is in the front-right slot.\n";
    final static String CROSS_EDGE_MIDDLE_LAYER_BACK_RIGHT = "at the back-right slot.\nSimply " + ROTATION_PHRASE_Y + "so that it is in the front-right slot.\n";
    final static String CROSS_EDGE_MIDDLE_LAYER_FRONT_RIGHT = "at the front-right slot, which is the correct slot.\n";
    final static String CROSS_EDGE_MIDDLE_RIGHT_TURN = "Now simply turn the right-layer up (R) so that the edge piece is at the top layer.\n";
    final static String CROSS_EDGE_MIDDLE_RURIUI_TURN = "Now simply use the following algorithm so that the edge piece is at the top layer:\n";
    final static String CROSS_EDGE_TOP_LAYER_LEFT = "at the left.\nSimply turn the up-layer counter-clockwise (U') so that it is at the front-top slot.\n";
    final static String CROSS_EDGE_TOP_LAYER_BACK = "at the back.\nSimply turn the up-layer twice (U2) so that it is at the front-top slot.\n";
    final static String CROSS_EDGE_TOP_LAYER_RIGHT = "at the right.\nSimply turn the up-layer clockwise (U) so that it is at the front-top slot.\n";
    final static String CROSS_EDGE_TOP_LAYER_FRONT = "at the front, which is the correct location\n";
    final static String CROSS_EDGE_TOP_FRONT_TURN = "Now simply turn the front-layer twice (F2) so that the edge piece is now at the front-bottom slot.\n";
    final static String CROSS_EDGE_FLIPPED_CROSS = "The edge in it the correct spot, but it is flipped. To fix it, perform this algorithm:\n";
    final static String CROSS_EDGE_SOLVED = "Looks like the edge is in the correct location and in the correct orientation. Let us move onto the next edge\n";
    final static String CROSS_EDGE_SOLVED_FINISH = "Looks like the edge is in the correct location and in the correct orientation. Let us move onto the next step\n";

    final static String SIDE_CORNER_BOTTOM_LAYER_FRONT_LEFT = "at the front-left slot.\nSimply " + ROTATION_PHRASE_Yi + "so that it is in the front-right slot.\n";
    final static String SIDE_CORNER_BOTTOM_LAYER_BACK_LEFT = "at the back-left slot.\nSimply " + ROTATION_PHRASE_Y2 + "so that it is in the front-right slot.\n";
    final static String SIDE_CORNER_BOTTOM_LAYER_BACK_RIGHT = "at the back-right slot.\nSimply " + ROTATION_PHRASE_Y + "so that it is in the front-right slot.\n";
    final static String SIDE_CORNER_BOTTOM_LAYER_FRONT_RIGHT = "at the front-right slot, which is the correct slot for this algorithm.\n";
    final static String SIDE_CORNER_TOP_LAYER_FRONT_LEFT = "at the front-left slot.\nSimply turn the cube to the right (U') so that it is in the front-right slot.\n";
    final static String SIDE_CORNER_TOP_LAYER_BACK_LEFT = "at the back-left slot.\nSimply turn the cube to the right twice (U2) so that it is in the front-right slot.\n";
    final static String SIDE_CORNER_TOP_LAYER_BACK_RIGHT = "at the back-right slot.\nSimply turn the cube to the left (U) so that it is in the front-right slot.\n";
    final static String SIDE_CORNER_TOP_LAYER_FRONT_RIGHT = "at the front-right slot, which is the correct slot for this algorithm.\n";
    final static String SIDE_CORNER_BOTTOM_TO_TOP = "Now to get the piece from the bottom layer to the top, simply perform this algorithm:\n";
    final static String SIDE_CORNER_TOP_INSERT_PTA = "Now to insert the piece into the correct location, simply perform this algorithm";
    final static String SIDE_CORNER_TOP_INSERT_PTB = ":\n";
    final static String SIDE_CORNER_TOP_INSERT_PTC = " 3 times in a row:\n";
    final static String SIDE_CORNER_SOLVED = "Looks like the corner is in the correct location and in the correct orientation. Let us move onto the next corner\n";
    final static String SIDE_CORNER_SOLVED_FINISH = "Looks like the corner is in the correct location and in the correct orientation. Let us move onto the next step\n";

    final static String MID_LAYER_BACK_LEFT = "at the back-left slot.\nSimply " + ROTATION_PHRASE_Y2 + "and perform the following algorithm so that it ends up at the top layer:\n";
    final static String MID_LAYER_BACK_RIGHT = "at the back-right slot.\nSimply " + ROTATION_PHRASE_Y + "and perform the following algorithm so that it ends up at the top layer:\n";
    final static String MID_LAYER_FRONT_RIGHT = "at the front-right slot.\nSimply perform the following algorithm so that it ends up at the top layer:\n";
    final static String MID_LAYER_FRONT_LEFT = "at the front-left slot.\n";
    final static String MID_LAYER_FRONT_LEFT_UNSOLVED = "And unfortunately it looks unsolved so we have to " + ROTATION_PHRASE_Yi + "so that the edge is moved from the front-left to the front-right" +
        " and perform the following algorithm to re-flip the edge:\n";
    final static String MID_LAYER_FRONT_LEFT_SOLVED = "But it looks as though it is already solved and in the right location, so let us move onto the next edge.\n";

    final static String TOP_LAYER_EOLL_INITIAL = "Now lets look at the top and solve the yellow cross by counting the amount of yellow-edge stickers that are facing the top side.\nRemember, only account for the" +
        " yellow-EDGE stickers, we do not have to worry about the yellow-corner stickers in this step.\n\n";
    final static String TOP_LAYER_EOLL_DOT = "We can see that the top has no yellow-edge stickers facing up. To make this a yellow cross, we have to perform the following algorithm:\n";
    final static String TOP_LAYER_EOLL_LINE_PT1 = "We can see that the top has 2 yellow-edge stickers facing up and they form a line with the yellow-center. To make this a yellow cross, ";
    final static String TOP_LAYER_EOLL_LINE_PT2A = "first, " + ROTATION_PHRASE_Y + "so that the line of yellow-edge pieces is horizontal, then ";
    final static String TOP_LAYER_EOLL_PEF_ALG = "perform the following algorithm:\n";
    final static String TOP_LAYER_EOLL_L = "We can see that the top has 2 yellow-edge stickers facing up and they form an 'L' with the yellow-center. To make this a yellow cross, ";
    final static String TOP_LAYER_EOLL_L_PT2A = "first, " + ROTATION_PHRASE_Y + "so that the L of yellow-edges is in the top-left, then ";
    final static String TOP_LAYER_EOLL_L_PT2B = "first, " + ROTATION_PHRASE_Y2 + "so that the L of yellow-edges is in the top-left, then ";
    final static String TOP_LAYER_EOLL_L_PT2C = "first, " + ROTATION_PHRASE_Yi + "so that the L of yellow-edges is in the top-left, then ";
    final static String TOP_LAYER_EOLL_SOLVED = "We can see that the top has 4 yellow-edge stickers facing up, making a cross, which means that we can move onto the next step.\n";

    final static String TOP_LAYER_COLL_CROSS_INITIAL = "Now lets look at the yellow corners and see how many of them are facing up. We can see that in this case, there are ";
    final static String TOP_LAYER_COLL_CROSS_NONE_PT1 = "no yellow-corners facing up. There is only a cross of yellow edges.\n";
    final static String TOP_LAYER_COLL_CROSS_TO_SUNE = "We want to turn this into a SUNE case, where there is 1 yellow corner facing up.\n";
    final static String TOP_LAYER_COLL_CROSS_NONE_PT2A = TOP_LAYER_COLL_CROSS_TO_SUNE + "To do this, " + ROTATION_PHRASE_Y + "so that there the is a yellow sticker on the left side of the cube, " +
        "located at the top-right slot. Then, perform a SUNE algorithm:\n";
    final static String TOP_LAYER_COLL_CROSS_NONE_PT2B = TOP_LAYER_COLL_CROSS_TO_SUNE + "To do this, " + ROTATION_PHRASE_Y2 + "so that there the is a yellow sticker on the left side of the cube, " +
        "located at the top-right slot. Then, perform a SUNE algorithm:\n";
    final static String TOP_LAYER_COLL_CROSS_NONE_PT2C = TOP_LAYER_COLL_CROSS_TO_SUNE + "To do this, " + ROTATION_PHRASE_Yi + "so that there the is a yellow sticker on the left side of the cube, " +
        "located at the top-right slot. Then, perform a SUNE algorithm:\n";
    final static String TOP_LAYER_COLL_CROSS_TWO_PT1 = "2 yellow-corners facing up.\n";
    final static String TOP_LAYER_COLL_CROSS_TWO_PT2A = TOP_LAYER_COLL_CROSS_TO_SUNE + "To do this, " + ROTATION_PHRASE_Y + "so that there is a yellow sticker on the front side of the cube, " +
        "located at the top-left slot. Then, perform a SUNE algorithm:\n";
    final static String TOP_LAYER_COLL_CROSS_TWO_PT2B = TOP_LAYER_COLL_CROSS_TO_SUNE + "To do this, " + ROTATION_PHRASE_Y2 + "so that there is a yellow sticker on the front side of the cube, " +
        "located at the top-left slot. Then, perform a SUNE algorithm:\n";
    final static String TOP_LAYER_COLL_CROSS_TWO_PT2C = TOP_LAYER_COLL_CROSS_TO_SUNE + "To do this, " + ROTATION_PHRASE_Yi + "so that there is a yellow sticker on the front side of the cube, " +
        "located at the top-left slot. Then, perform a SUNE algorithm:\n";
    final static String TOP_LAYER_COLL_CROSS_PT2_SOLVED = "In this case, the yellow sticker is at the correct location so we just need to perform a SUNE algorithm:\n";
    final static String TOP_LAYER_COLL_CROSS_SUNE_PT1 = "Now, there is one yellow-corner facing up, giving us a SUNE case.";
    final static String TOP_LAYER_COLL_CROSS_SUNE_PT2A = "To start, " + ROTATION_PHRASE_Y + "so that the yellow sticker facing up is in the bottom-left slot and perform the SUNE algorithm:\n";
    final static String TOP_LAYER_COLL_CROSS_SUNE_PT2B = "To start, " + ROTATION_PHRASE_Y2 + "so that the yellow sticker facing up is in the bottom-left slot and perform the SUNE algorithm:\n";
    final static String TOP_LAYER_COLL_CROSS_SUNE_PT2C = "To start, " + ROTATION_PHRASE_Yi + "so that the yellow sticker facing up is in the bottom-left slot and perform the SUNE algorithm:\n";
    final static String TOP_LAYER_COLL_CROSS_SOLVED = "Looks solved so let us move to the next step.\n\n";
    final static String TOP_LAYER_COLL_CROSS_ANTI_SUNE = "Seems like it did not work but simply turn the top layer to the right twice (U2) and perform another SUNE algorithm:\n";

    final static String TOP_LAYER_CPLL_INITIAL = "Now for this step, we want to look for headlights, where a side has corners of the same color.\nIn this case, ";
    final static String TOP_LAYER_CPLL_HEADLIGHTS_TPERM = "perform the following algorithm called a T-Permutation:\n";
    final static String TOP_LAYER_CPLL_HEADLIGHTS_RED = "the red side is the side with headlights. First, " + ROTATION_PHRASE_Y + "so that the headlights are on the left, then " + TOP_LAYER_CPLL_HEADLIGHTS_TPERM;
    final static String TOP_LAYER_CPLL_HEADLIGHTS_BLUE = "the blue side is the side with headlights. Simply " + TOP_LAYER_CPLL_HEADLIGHTS_TPERM;
    final static String TOP_LAYER_CPLL_HEADLIGHTS_ORANGE = "the orange side is the side with headlights. First, " + ROTATION_PHRASE_Yi + "so that the headlights are on the left, then " + TOP_LAYER_CPLL_HEADLIGHTS_TPERM;
    final static String TOP_LAYER_CPLL_HEADLIGHTS_GREEN = "the green side is the side with headlights. First, " + ROTATION_PHRASE_Y2 + "so that the headlights are on the left, then " + TOP_LAYER_CPLL_HEADLIGHTS_TPERM;
    final static String TOP_LAYER_CPLL_NO_HEADLIGHTS = "none of the sides have headlights. That means we have to perform the following algorithm called a Y-Permutation:\n";

    final static String TOP_LAYER_EPLL_INITIAL = "\nWe can see now that the sides have headlights. We just simply have to cycle the edges and the cube will be solved.\n";
    final static String TOP_LAYER_EPLL_PT2 = "We can see that the ";
    final static String TOP_LAYER_EPLL_PT3A = "side will be solved if we simply ";
    final static String TOP_LAYER_EPLL_PT3B = "sides all have headlights on the cube. To solve this, simply ";
    final static String TOP_LAYER_EPLL_PT4 = "and ";
    final static String TOP_LAYER_EPLL_PT5 = "so that the solved bar is in the back.\n";
    final static String TOP_LAYER_EPLL_PT4A = "turn the top layer to the left (U) ";
    final static String TOP_LAYER_EPLL_PT4B = "turn the top layer to the left twice (U2) ";
    final static String TOP_LAYER_EPLL_PT4C = "turn the top layer to the right (U') ";
    final static String TOP_LAYER_EPLL_PT6A = "Then simply perform the following algorithm to cycle the edges:\n";
    final static String TOP_LAYER_EPLL_PT6B = "perform the following algorithm to fix the edges:\n";

    final static String SOLVED = "\nNow the cube is finished! Congratulations!\n";

    //Algorithms
    final static String FLIPPING_WHITE_EDGES = "F2 U' R' F R\n";
    final static String RURIUI_REPEAT_ALG = "R U R' U'\n";
    final static String URUIRU_REPEAT_ALG = "U R U' R'\n";
    final static String MID_INSERT_RIGHT = "U R U' R' U' F' U F\n";
    final static String MID_INSERT_LEFT = "U' F' U F U R U' R'\n";
    final static String MID_INSERT_FIX = "U R U' R' U' F' U F U' R U' R' U' F' U F\n";
    final static String EOLL_DOT = "F R U R' U' F' U2 F U R U' R' F'\n";
    final static String EOLL_L = "F U R U' R' F'\n";
    final static String EOLL_LINE = "F R U R' U' F'\n";
    final static String COLL_SUNE = "R U R' U R U2 R'\n";
    final static String PLL_T_PERM = "R U R' U' R' F R2 U' R' U' R U R' F'\n";
    final static String PLL_Y_PERM = "F R U' R' U' R U R' F' R U R' U' R' F R F'\n";
    final static String PLL_Ua_PERM = "R2 U R U R' U' R' U' R' U R'\n";
    final static String PLL_Ub_PERM = "R U' R U R U R U' R' U' R2\n";
    final static String PLL_H_PERM = "R2 U2 R U2 R2 U2 R2 U2 R U2 R2\n";
    final static String PLL_Z_PERM = "R U R' U R' U' R' U R U' R' U' R2 U R U2\n";

    final static int MAX_SIZE = 20;
    final static int BIGGEST_RANGE_ARRAY = 3;

    Cube cubeToSolve;
    String solutionMessage = "";

    public CubeSolverBeg(Cube cubeToSolve) {
        this.cubeToSolve = cubeToSolve;
    }

    public void performRURiUi() {
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnUi();
    }

    public void performURUiRi() {
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnRi();
    }

    public void orientFlippedWhiteEdge(){
        solutionMessage = solutionMessage + CROSS_EDGE_FLIPPED_CROSS;
        solutionMessage = solutionMessage + FLIPPING_WHITE_EDGES;
        this.cubeToSolve.turnF2();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnF();
        this.cubeToSolve.turnR();
    }

    public void performRightMidInsert() {
        solutionMessage = solutionMessage + MID_INSERT_RIGHT;
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnFi();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnF();
    }

    public void performLeftMidInsert() {
        solutionMessage = solutionMessage + MID_INSERT_LEFT;
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnFi();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnF();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnRi();
    }

    public void reorientMidInsert(){
        this.performRightMidInsert();
        this.cubeToSolve.turnU2();
        this.performRightMidInsert();
    }

    public void performDotEOLL() {
        solutionMessage = solutionMessage + EOLL_DOT;
        this.cubeToSolve.turnF();
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnFi();
        this.cubeToSolve.turnU2();
        this.cubeToSolve.turnF();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnFi();
    }

    public void performLEOLL() {
        solutionMessage = solutionMessage + EOLL_L;
        this.cubeToSolve.turnF();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnFi();
    }

    public void performLineEOLL() {
        solutionMessage = solutionMessage + EOLL_LINE;
        this.cubeToSolve.turnF();
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnFi();
    }

    public void performSune() {
        solutionMessage = solutionMessage + COLL_SUNE;
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnU2();
        this.cubeToSolve.turnRi();
    }

    public void performTPerm() {
        solutionMessage = solutionMessage + PLL_T_PERM;
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnF();
        this.cubeToSolve.turnR2();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnFi();
    }

    public void performYPerm() {
        solutionMessage = solutionMessage + PLL_Y_PERM;
        this.cubeToSolve.turnF();
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnFi();
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnF();
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnFi();
    }

    public void performUaPerm() {
        solutionMessage = solutionMessage + PLL_Ua_PERM;
        this.cubeToSolve.turnR2();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnRi();
    }

    public void performUbPerm() {
        solutionMessage = solutionMessage + PLL_Ub_PERM;
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnR2();
    }

    public void performHPerm() {
        solutionMessage = solutionMessage + PLL_H_PERM;
        this.cubeToSolve.turnR2();
        this.cubeToSolve.turnU2();
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnU2();
        this.cubeToSolve.turnR2();
        this.cubeToSolve.turnU2();
        this.cubeToSolve.turnR2();
        this.cubeToSolve.turnU2();
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnU2();
        this.cubeToSolve.turnR2();
    }

    public void performZPerm() {
        solutionMessage = solutionMessage + PLL_Z_PERM;
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnR2();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnU2();
    }

    public void finishWhiteCross(){
        //White-Red Edge
        this.repositionRedAsOne();
        int indexOfWREdge = this.findPiece(WREDGE_IDPIECE_ZERO);
        if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_ZERO).getId() != WREDGE_IDPIECE_ZERO) {
            if (indexOfWREdge < SECOND_LAYER_INDEX_EIGHT) {
                solutionMessage = solutionMessage + WR_EDGE_BOTTOM_LAYER_INITIAL;
                if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_TWO).getId() == WREDGE_IDPIECE_ZERO){
                    solutionMessage = solutionMessage + WR_EDGE_BOTTOM_LAYER_LEFT;
                    this.cubeToSolve.turnD();
                }
                else if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_FOUR).getId() == WREDGE_IDPIECE_ZERO){
                    solutionMessage = solutionMessage + WR_EDGE_BOTTOM_LAYER_BACK;
                    this.cubeToSolve.turnD2();
                }
                else if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_SIX).getId() == WREDGE_IDPIECE_ZERO){
                    solutionMessage = solutionMessage + WR_EDGE_BOTTOM_LAYER_RIGHT;
                    this.cubeToSolve.turnDi();
                }
                else{
                    solutionMessage = solutionMessage + WR_EDGE_BOTTOM_LATER_SOLVED;
                }
            }
            if (indexOfWREdge < THIRD_LAYER_INDEX_TWELVE && indexOfWREdge > FIRST_LAYER_INDEX_SEVEN) {
                solutionMessage = solutionMessage + WR_EDGE_MIDDLE_LAYER_INITIAL;
                if(this.cubeToSolve.currentCubeState.get(SECOND_LAYER_INDEX_EIGHT).getId() == WREDGE_IDPIECE_ZERO){
                    solutionMessage = solutionMessage + CROSS_EDGE_MIDDLE_LAYER_FRONT_LEFT;
                    this.cubeToSolve.rotateYi();
                }
                else if(this.cubeToSolve.currentCubeState.get(SECOND_LAYER_INDEX_NINE).getId() == WREDGE_IDPIECE_ZERO){
                    solutionMessage = solutionMessage + CROSS_EDGE_MIDDLE_LAYER_BACK_LEFT;
                    this.cubeToSolve.rotateY2();
                }
                else if(this.cubeToSolve.currentCubeState.get(SECOND_LAYER_INDEX_TEN).getId() == WREDGE_IDPIECE_ZERO){
                    solutionMessage = solutionMessage + CROSS_EDGE_MIDDLE_LAYER_BACK_RIGHT;
                    this.cubeToSolve.rotateY();
                }
                else{
                    solutionMessage = solutionMessage + CROSS_EDGE_MIDDLE_LAYER_FRONT_RIGHT;
                }
                solutionMessage = solutionMessage + CROSS_EDGE_MIDDLE_RIGHT_TURN;
                this.cubeToSolve.turnR();
                this.repositionRedAsOne();
            }
            indexOfWREdge = this.findPiece(WREDGE_IDPIECE_ZERO);
            if (indexOfWREdge > SECOND_LAYER_INDEX_ELEVEN) {
                solutionMessage = solutionMessage + WR_EDGE_TOP_LAYER_INITIAL;
                if(this.cubeToSolve.currentCubeState.get(THIRD_LAYER_INDEX_FOURTEEN).getId() == WREDGE_IDPIECE_ZERO){
                    solutionMessage = solutionMessage + CROSS_EDGE_TOP_LAYER_LEFT;
                    this.cubeToSolve.turnUi();
                }
                else if(this.cubeToSolve.currentCubeState.get(THIRD_LAYER_INDEX_SIXTEEN).getId() == WREDGE_IDPIECE_ZERO){
                    solutionMessage = solutionMessage + CROSS_EDGE_TOP_LAYER_BACK;
                    this.cubeToSolve.turnU2();
                }
                else if(this.cubeToSolve.currentCubeState.get(THIRD_LAYER_INDEX_EIGHTEEN).getId() == WREDGE_IDPIECE_ZERO){
                    solutionMessage = solutionMessage + CROSS_EDGE_TOP_LAYER_RIGHT;
                    this.cubeToSolve.turnU();
                }
                else{
                    solutionMessage = solutionMessage + CROSS_EDGE_TOP_LAYER_FRONT;
                }
                solutionMessage = solutionMessage + CROSS_EDGE_TOP_FRONT_TURN;
                this.cubeToSolve.turnF2();
            }
        }
        else{
            solutionMessage = solutionMessage + WR_EDGE_CORRECT_LOCATION;
        }

        if (this.cubeToSolve.fiveCenterSide[ZEROTH_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] != WHITE_CHAR_FLAG) {
            this.orientFlippedWhiteEdge();
        }
        solutionMessage = solutionMessage + CROSS_EDGE_SOLVED;
        solutionMessage = solutionMessage + "\n";

        //White-Blue Edge
        this.repositionBlueAsOne();
        int indexOfWBEdge = this.findPiece(FIRST_LAYER_INDEX_ONE);
        if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_ZERO).getId() != WBEDGE_IDPIECE_ONE){
            if(indexOfWBEdge < SECOND_LAYER_INDEX_EIGHT){
                solutionMessage = solutionMessage + WB_EDGE_BOTTOM_LAYER_INITIAL;
                if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_ZERO).getId() == WBEDGE_IDPIECE_ONE){
                    solutionMessage = solutionMessage + CROSS_EDGE_BOTTOM_LAYER_FRONT;
                    this.cubeToSolve.rotateYi();
                }
                else if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_TWO).getId() == WBEDGE_IDPIECE_ONE){
                    solutionMessage = solutionMessage + CROSS_EDGE_BOTTOM_LAYER_LEFT;
                    this.cubeToSolve.rotateY2();
                }
                else if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_FOUR).getId() == WBEDGE_IDPIECE_ONE){
                    solutionMessage = solutionMessage + CROSS_EDGE_BOTTOM_LAYER_BACK;
                    this.cubeToSolve.rotateY();
                }
                else{
                    solutionMessage = solutionMessage + CROSS_EDGE_BOTTOM_LAYER_RIGHT;
                }
                solutionMessage = solutionMessage + CROSS_EDGE_BOTTOM_RIGHT_TURN;
                this.cubeToSolve.turnR2();
                this.repositionBlueAsOne();
            }
            if(indexOfWBEdge < THIRD_LAYER_INDEX_TWELVE && indexOfWBEdge > FIRST_LAYER_INDEX_SEVEN){
                solutionMessage = solutionMessage + WB_EDGE_MIDDLE_LAYER_INITIAL;
                if(this.cubeToSolve.currentCubeState.get(SECOND_LAYER_INDEX_EIGHT).getId() == WBEDGE_IDPIECE_ONE){
                    solutionMessage = solutionMessage + CROSS_EDGE_MIDDLE_LAYER_FRONT_LEFT;
                    this.cubeToSolve.rotateYi();
                }
                else if(this.cubeToSolve.currentCubeState.get(SECOND_LAYER_INDEX_NINE).getId() == WBEDGE_IDPIECE_ONE){
                    solutionMessage = solutionMessage + CROSS_EDGE_MIDDLE_LAYER_BACK_LEFT;
                    this.cubeToSolve.rotateY2();
                }
                else if(this.cubeToSolve.currentCubeState.get(SECOND_LAYER_INDEX_TEN).getId() == WBEDGE_IDPIECE_ONE){
                    solutionMessage = solutionMessage + CROSS_EDGE_MIDDLE_LAYER_BACK_RIGHT;
                    this.cubeToSolve.rotateY();
                }
                else{
                    solutionMessage = solutionMessage + CROSS_EDGE_MIDDLE_LAYER_FRONT_RIGHT;
                }
                solutionMessage = solutionMessage + CROSS_EDGE_MIDDLE_RURIUI_TURN;
                solutionMessage = solutionMessage + RURIUI_REPEAT_ALG;
                this.performRURiUi();
                this.repositionBlueAsOne();
            }
            indexOfWBEdge = this.findPiece(WBEDGE_IDPIECE_ONE);
            if(indexOfWBEdge > SECOND_LAYER_INDEX_ELEVEN){
                solutionMessage = solutionMessage + WB_EDGE_TOP_LAYER_INITIAL;
                if(this.cubeToSolve.currentCubeState.get(THIRD_LAYER_INDEX_FOURTEEN).getId() == WBEDGE_IDPIECE_ONE){
                    solutionMessage = solutionMessage + CROSS_EDGE_TOP_LAYER_LEFT;
                    this.cubeToSolve.turnUi();
                }
                else if(this.cubeToSolve.currentCubeState.get(THIRD_LAYER_INDEX_SIXTEEN).getId() == WBEDGE_IDPIECE_ONE){
                    solutionMessage = solutionMessage + CROSS_EDGE_TOP_LAYER_BACK;
                    this.cubeToSolve.turnU2();
                }
                else if(this.cubeToSolve.currentCubeState.get(THIRD_LAYER_INDEX_EIGHTEEN).getId() == WBEDGE_IDPIECE_ONE){
                    solutionMessage = solutionMessage + CROSS_EDGE_TOP_LAYER_RIGHT;
                    this.cubeToSolve.turnU();
                }
                else{
                    solutionMessage = solutionMessage + CROSS_EDGE_TOP_LAYER_FRONT;
                }
                solutionMessage = solutionMessage + CROSS_EDGE_TOP_FRONT_TURN;
                this.cubeToSolve.turnF2();
            }
        }
        else{
            solutionMessage = solutionMessage + WR_EDGE_CORRECT_LOCATION;
        }

        if(this.cubeToSolve.fiveCenterSide[ZEROTH_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] != WHITE_CHAR_FLAG){
            this.orientFlippedWhiteEdge();
        }
        solutionMessage = solutionMessage + CROSS_EDGE_SOLVED;
        solutionMessage = solutionMessage + "\n";

        //White-Orange Edge
        this.repositionOrangeAsOne();
        int indexOfWOEdge = this.findPiece(WOEDGE_IDPIECE_TWO);
        if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_ZERO).getId() != WOEDGE_IDPIECE_TWO){
            if(indexOfWOEdge < SECOND_LAYER_INDEX_EIGHT){
                solutionMessage = solutionMessage + WO_EDGE_BOTTOM_LAYER_INITIAL;
                if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_ZERO).getId() == WOEDGE_IDPIECE_TWO){
                    solutionMessage = solutionMessage + CROSS_EDGE_BOTTOM_LAYER_FRONT;
                    this.cubeToSolve.rotateYi();
                }
                else if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_TWO).getId() == WOEDGE_IDPIECE_TWO){
                    solutionMessage = solutionMessage + CROSS_EDGE_BOTTOM_LAYER_LEFT;
                    this.cubeToSolve.rotateY2();
                }
                else if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_FOUR).getId() == WOEDGE_IDPIECE_TWO){
                    solutionMessage = solutionMessage + CROSS_EDGE_BOTTOM_LAYER_BACK;
                    this.cubeToSolve.rotateY();
                }
                else{
                    solutionMessage = solutionMessage + CROSS_EDGE_BOTTOM_LAYER_RIGHT;
                }
                solutionMessage = solutionMessage + CROSS_EDGE_BOTTOM_RIGHT_TURN;
                this.cubeToSolve.turnR2();
                this.repositionOrangeAsOne();
            }
            if(indexOfWOEdge < THIRD_LAYER_INDEX_TWELVE && indexOfWOEdge > FIRST_LAYER_INDEX_SEVEN){
                solutionMessage = solutionMessage + WO_EDGE_MIDDLE_LAYER_INITIAL;
                if(this.cubeToSolve.currentCubeState.get(SECOND_LAYER_INDEX_EIGHT).getId() == WOEDGE_IDPIECE_TWO){
                    solutionMessage = solutionMessage + CROSS_EDGE_MIDDLE_LAYER_FRONT_LEFT;
                    this.cubeToSolve.rotateYi();
                }
                else if(this.cubeToSolve.currentCubeState.get(SECOND_LAYER_INDEX_NINE).getId() == WOEDGE_IDPIECE_TWO){
                    solutionMessage = solutionMessage + CROSS_EDGE_MIDDLE_LAYER_BACK_LEFT;
                    this.cubeToSolve.rotateY2();
                }
                else if(this.cubeToSolve.currentCubeState.get(SECOND_LAYER_INDEX_TEN).getId() == WOEDGE_IDPIECE_TWO){
                    solutionMessage = solutionMessage + CROSS_EDGE_MIDDLE_LAYER_BACK_RIGHT;
                    this.cubeToSolve.rotateY();
                }
                else{
                    solutionMessage = solutionMessage + CROSS_EDGE_MIDDLE_LAYER_FRONT_RIGHT;
                }
                solutionMessage = solutionMessage + CROSS_EDGE_MIDDLE_RURIUI_TURN;
                solutionMessage = solutionMessage + RURIUI_REPEAT_ALG;
                this.performRURiUi();
                this.repositionOrangeAsOne();
            }
            indexOfWOEdge = this.findPiece(WOEDGE_IDPIECE_TWO);
            if(indexOfWOEdge > SECOND_LAYER_INDEX_ELEVEN){
                solutionMessage = solutionMessage + WO_EDGE_TOP_LAYER_INITIAL;
                if(this.cubeToSolve.currentCubeState.get(THIRD_LAYER_INDEX_FOURTEEN).getId() == WOEDGE_IDPIECE_TWO){
                    solutionMessage = solutionMessage + CROSS_EDGE_TOP_LAYER_LEFT;
                    this.cubeToSolve.turnUi();
                }
                else if(this.cubeToSolve.currentCubeState.get(THIRD_LAYER_INDEX_SIXTEEN).getId() == WOEDGE_IDPIECE_TWO){
                    solutionMessage = solutionMessage + CROSS_EDGE_TOP_LAYER_BACK;
                    this.cubeToSolve.turnU2();
                }
                else if(this.cubeToSolve.currentCubeState.get(THIRD_LAYER_INDEX_EIGHTEEN).getId() == WOEDGE_IDPIECE_TWO){
                    solutionMessage = solutionMessage + CROSS_EDGE_TOP_LAYER_RIGHT;
                    this.cubeToSolve.turnU();
                }
                else{
                    solutionMessage = solutionMessage + CROSS_EDGE_TOP_LAYER_FRONT;
                }
                solutionMessage = solutionMessage + CROSS_EDGE_TOP_FRONT_TURN;
                this.cubeToSolve.turnF2();
            }
        }
        else{
            solutionMessage = solutionMessage + WR_EDGE_CORRECT_LOCATION;
        }

        if(this.cubeToSolve.fiveCenterSide[ZEROTH_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] != WHITE_CHAR_FLAG){
            this.orientFlippedWhiteEdge();
        }
        solutionMessage = solutionMessage + CROSS_EDGE_SOLVED;
        solutionMessage = solutionMessage + "\n";

        //White-Green Edge
        this.repositionGreenAsOne();
        int indexOfWGEdge = this.findPiece(3);
        if(this.cubeToSolve.currentCubeState.get(0).getId() != WGEDGE_IDPIECE_THREE){
            if(indexOfWGEdge < SECOND_LAYER_INDEX_EIGHT){
                solutionMessage = solutionMessage + WG_EDGE_BOTTOM_LAYER_INITIAL;
                if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_ZERO).getId() == WGEDGE_IDPIECE_THREE){
                    solutionMessage = solutionMessage + CROSS_EDGE_BOTTOM_LAYER_FRONT;
                    this.cubeToSolve.rotateYi();
                }
                else if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_TWO).getId() == WGEDGE_IDPIECE_THREE){
                    solutionMessage = solutionMessage + CROSS_EDGE_BOTTOM_LAYER_LEFT;
                    this.cubeToSolve.rotateY2();
                }
                else if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_FOUR).getId() == WGEDGE_IDPIECE_THREE){
                    solutionMessage = solutionMessage + CROSS_EDGE_BOTTOM_LAYER_BACK;
                    this.cubeToSolve.rotateY();
                }
                else{
                    solutionMessage = solutionMessage + CROSS_EDGE_BOTTOM_LAYER_RIGHT;
                }
                solutionMessage = solutionMessage + CROSS_EDGE_BOTTOM_RIGHT_TURN;
                this.cubeToSolve.turnR2();
                this.repositionGreenAsOne();
            }
            if(indexOfWGEdge < THIRD_LAYER_INDEX_TWELVE && indexOfWGEdge > FIRST_LAYER_INDEX_SEVEN){
                solutionMessage = solutionMessage + WG_EDGE_MIDDLE_LAYER_INITIAL;
                if(this.cubeToSolve.currentCubeState.get(SECOND_LAYER_INDEX_EIGHT).getId() == WGEDGE_IDPIECE_THREE){
                    solutionMessage = solutionMessage + CROSS_EDGE_MIDDLE_LAYER_FRONT_LEFT;
                    this.cubeToSolve.rotateYi();
                }
                else if(this.cubeToSolve.currentCubeState.get(SECOND_LAYER_INDEX_NINE).getId() == WGEDGE_IDPIECE_THREE){
                    solutionMessage = solutionMessage + CROSS_EDGE_MIDDLE_LAYER_BACK_LEFT;
                    this.cubeToSolve.rotateY2();
                }
                else if(this.cubeToSolve.currentCubeState.get(SECOND_LAYER_INDEX_TEN).getId() == WGEDGE_IDPIECE_THREE){
                    solutionMessage = solutionMessage + CROSS_EDGE_MIDDLE_LAYER_BACK_RIGHT;
                    this.cubeToSolve.rotateY();
                }
                else{
                    solutionMessage = solutionMessage + CROSS_EDGE_MIDDLE_LAYER_FRONT_RIGHT;
                }
                solutionMessage = solutionMessage + CROSS_EDGE_MIDDLE_RURIUI_TURN;
                solutionMessage = solutionMessage + RURIUI_REPEAT_ALG;
                this.performRURiUi();
                this.repositionGreenAsOne();
            }
            indexOfWGEdge = this.findPiece(WGEDGE_IDPIECE_THREE);
            if(indexOfWGEdge > SECOND_LAYER_INDEX_ELEVEN){
                solutionMessage = solutionMessage + WG_EDGE_TOP_LAYER_INITIAL;
                if(this.cubeToSolve.currentCubeState.get(THIRD_LAYER_INDEX_FOURTEEN).getId() == WGEDGE_IDPIECE_THREE){
                    solutionMessage = solutionMessage + CROSS_EDGE_TOP_LAYER_LEFT;
                    this.cubeToSolve.turnUi();
                }
                else if(this.cubeToSolve.currentCubeState.get(THIRD_LAYER_INDEX_SIXTEEN).getId() == WGEDGE_IDPIECE_THREE){
                    solutionMessage = solutionMessage + CROSS_EDGE_TOP_LAYER_BACK;
                    this.cubeToSolve.turnU2();
                }
                else if(this.cubeToSolve.currentCubeState.get(THIRD_LAYER_INDEX_EIGHTEEN).getId() == WGEDGE_IDPIECE_THREE){
                    solutionMessage = solutionMessage + CROSS_EDGE_TOP_LAYER_RIGHT;
                    this.cubeToSolve.turnU();
                }
                else{
                    solutionMessage = solutionMessage + CROSS_EDGE_TOP_LAYER_FRONT;
                }
                solutionMessage = solutionMessage + CROSS_EDGE_TOP_FRONT_TURN;
                this.cubeToSolve.turnF2();
            }
        }
        else{
            solutionMessage = solutionMessage + WR_EDGE_CORRECT_LOCATION;
        }

        if(this.cubeToSolve.fiveCenterSide[ZEROTH_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] != WHITE_CHAR_FLAG){
            this.orientFlippedWhiteEdge();
        }
        solutionMessage = solutionMessage + CROSS_EDGE_SOLVED_FINISH;
        solutionMessage = solutionMessage + "\n";
    }

    public void insertWhiteCorners(){
        this.repositionBlueAsOne();
        int indexOfWRBCor = this.findPiece(WRBCOR_IDPIECE_FOUR);
        if(checkCF2LSolved(WRBCOR_IDPIECE_FOUR)) {
            if (indexOfWRBCor < SECOND_LAYER_INDEX_EIGHT) {
                solutionMessage = solutionMessage + WRB_COR_BOTTOM_LAYER_INITIAL;
                if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_ONE).getId() == WRBCOR_IDPIECE_FOUR){
                    solutionMessage = solutionMessage + SIDE_CORNER_BOTTOM_LAYER_FRONT_LEFT;
                    this.cubeToSolve.rotateYi();
                }
                else if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_THREE).getId() == WRBCOR_IDPIECE_FOUR){
                    solutionMessage = solutionMessage + SIDE_CORNER_BOTTOM_LAYER_BACK_LEFT;
                    this.cubeToSolve.rotateY2();
                }
                else if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_FIVE).getId() == WRBCOR_IDPIECE_FOUR){
                    solutionMessage = solutionMessage + SIDE_CORNER_BOTTOM_LAYER_BACK_RIGHT;
                    this.cubeToSolve.rotateY();
                }
                else{
                    solutionMessage = solutionMessage + SIDE_CORNER_BOTTOM_LAYER_FRONT_RIGHT;
                }
                solutionMessage = solutionMessage + SIDE_CORNER_BOTTOM_TO_TOP;
                solutionMessage = solutionMessage + RURIUI_REPEAT_ALG;
                this.performRURiUi();
                indexOfWRBCor = this.findPiece(WRBCOR_IDPIECE_FOUR);
                this.repositionBlueAsOne();
            }
            if (indexOfWRBCor > SECOND_LAYER_INDEX_ELEVEN) {
                solutionMessage = solutionMessage + WRB_COR_TOP_LAYER_INITIAL;
                if(this.cubeToSolve.currentCubeState.get(THIRD_LAYER_INDEX_THIRTEEN).getId() == WRBCOR_IDPIECE_FOUR){
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_LAYER_FRONT_LEFT;
                    this.cubeToSolve.turnUi();
                }
                else if(this.cubeToSolve.currentCubeState.get(THIRD_LAYER_INDEX_FIFTEEN).getId() == WRBCOR_IDPIECE_FOUR){
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_LAYER_BACK_LEFT;
                    this.cubeToSolve.turnU2();
                }
                else if(this.cubeToSolve.currentCubeState.get(THIRD_LAYER_INDEX_SEVENTEEN).getId() == WRBCOR_IDPIECE_FOUR){
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_LAYER_BACK_RIGHT;
                    this.cubeToSolve.turnU();
                }
                else{
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_LAYER_FRONT_RIGHT;
                }
                solutionMessage = solutionMessage + SIDE_CORNER_TOP_INSERT_PTA;
                if(this.cubeToSolve.oneCenterSide[ZEROTH_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX] == WHITE_CHAR_FLAG){
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_INSERT_PTB;
                    solutionMessage = solutionMessage + URUIRU_REPEAT_ALG;
                    this.performURUiRi();
                }
                else if (this.cubeToSolve.fourCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] == WHITE_CHAR_FLAG){
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_INSERT_PTB;
                    solutionMessage = solutionMessage + RURIUI_REPEAT_ALG;
                    this.performRURiUi();
                }
                else if(this.cubeToSolve.sixCenterSide[SECOND_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX] == WHITE_CHAR_FLAG){
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_INSERT_PTC;
                    solutionMessage = solutionMessage + RURIUI_REPEAT_ALG;
                    this.performRURiUi();
                    this.performRURiUi();
                    this.performRURiUi();
                }
            }
        }
        solutionMessage = solutionMessage + SIDE_CORNER_SOLVED;
        solutionMessage = solutionMessage + "\n";

        //WBO Corner
        this.repositionOrangeAsOne();
        int indexOfWBOCor = this.findPiece(WBOCOR_IDPIECE_FIVE);
        if(checkCF2LSolved(WBOCOR_IDPIECE_FIVE)) {
            if (indexOfWBOCor < SECOND_LAYER_INDEX_EIGHT) {
                solutionMessage = solutionMessage + WBO_COR_BOTTOM_LAYER_INITIAL;
                if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_ONE).getId() == WBOCOR_IDPIECE_FIVE){
                    solutionMessage = solutionMessage + SIDE_CORNER_BOTTOM_LAYER_FRONT_LEFT;
                    this.cubeToSolve.rotateYi();
                }
                else if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_THREE).getId() == WBOCOR_IDPIECE_FIVE){
                    solutionMessage = solutionMessage + SIDE_CORNER_BOTTOM_LAYER_BACK_LEFT;
                    this.cubeToSolve.rotateY2();
                }
                else if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_FIVE).getId() == WBOCOR_IDPIECE_FIVE){
                    solutionMessage = solutionMessage + SIDE_CORNER_BOTTOM_LAYER_BACK_RIGHT;
                    this.cubeToSolve.rotateY();
                }
                else{
                    solutionMessage = solutionMessage + SIDE_CORNER_BOTTOM_LAYER_FRONT_RIGHT;
                }
                solutionMessage = solutionMessage + SIDE_CORNER_BOTTOM_TO_TOP;
                solutionMessage = solutionMessage + RURIUI_REPEAT_ALG;
                this.performRURiUi();
                indexOfWBOCor = this.findPiece(WBOCOR_IDPIECE_FIVE);
                this.repositionOrangeAsOne();
            }
            if (indexOfWBOCor > SECOND_LAYER_INDEX_ELEVEN) {
                solutionMessage = solutionMessage + WBO_COR_TOP_LAYER_INITIAL;
                if(this.cubeToSolve.currentCubeState.get(THIRD_LAYER_INDEX_THIRTEEN).getId() == WBOCOR_IDPIECE_FIVE){
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_LAYER_FRONT_LEFT;
                    this.cubeToSolve.turnUi();
                }
                else if(this.cubeToSolve.currentCubeState.get(THIRD_LAYER_INDEX_FIFTEEN).getId() == WBOCOR_IDPIECE_FIVE){
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_LAYER_BACK_LEFT;
                    this.cubeToSolve.turnU2();
                }
                else if(this.cubeToSolve.currentCubeState.get(THIRD_LAYER_INDEX_SEVENTEEN).getId() == WBOCOR_IDPIECE_FIVE){
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_LAYER_BACK_RIGHT;
                    this.cubeToSolve.turnU();
                }
                else{
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_LAYER_FRONT_RIGHT;
                }
                solutionMessage = solutionMessage + SIDE_CORNER_TOP_INSERT_PTA;
                if(this.cubeToSolve.oneCenterSide[ZEROTH_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX] == WHITE_CHAR_FLAG){
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_INSERT_PTB;
                    solutionMessage = solutionMessage + URUIRU_REPEAT_ALG;
                    this.performURUiRi();
                }
                else if (this.cubeToSolve.fourCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] == WHITE_CHAR_FLAG){
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_INSERT_PTB;
                    solutionMessage = solutionMessage + RURIUI_REPEAT_ALG;
                    this.performRURiUi();
                }
                else if(this.cubeToSolve.sixCenterSide[SECOND_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX] == WHITE_CHAR_FLAG){
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_INSERT_PTC;
                    solutionMessage = solutionMessage + RURIUI_REPEAT_ALG;
                    this.performRURiUi();
                    this.performRURiUi();
                    this.performRURiUi();
                }
            }
        }
        solutionMessage = solutionMessage + SIDE_CORNER_SOLVED;
        solutionMessage = solutionMessage + "\n";

        //WOG Corner
        this.repositionGreenAsOne();
        int indexOfWOGCor = this.findPiece(WOGCOR_IDPIECE_SIX);
        if(checkCF2LSolved(WOGCOR_IDPIECE_SIX)) {
            if (indexOfWOGCor < SECOND_LAYER_INDEX_EIGHT) {
                solutionMessage = solutionMessage + WOG_COR_BOTTOM_LAYER_INITIAL;
                if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_ONE).getId() == WOGCOR_IDPIECE_SIX){
                    solutionMessage = solutionMessage + SIDE_CORNER_BOTTOM_LAYER_FRONT_LEFT;
                    this.cubeToSolve.rotateYi();
                }
                else if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_THREE).getId() == WOGCOR_IDPIECE_SIX){
                    solutionMessage = solutionMessage + SIDE_CORNER_BOTTOM_LAYER_BACK_LEFT;
                    this.cubeToSolve.rotateY2();
                }
                else if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_FIVE).getId() == WOGCOR_IDPIECE_SIX){
                    solutionMessage = solutionMessage + SIDE_CORNER_BOTTOM_LAYER_BACK_RIGHT;
                    this.cubeToSolve.rotateY();
                }
                else{
                    solutionMessage = solutionMessage + SIDE_CORNER_BOTTOM_LAYER_FRONT_RIGHT;
                }
                solutionMessage = solutionMessage + SIDE_CORNER_BOTTOM_TO_TOP;
                solutionMessage = solutionMessage + RURIUI_REPEAT_ALG;
                this.performRURiUi();
                indexOfWOGCor = this.findPiece(6);
                this.repositionGreenAsOne();
            }
            if (indexOfWOGCor > SECOND_LAYER_INDEX_ELEVEN) {
                solutionMessage = solutionMessage + WOG_COR_TOP_LAYER_INITIAL;
                if(this.cubeToSolve.currentCubeState.get(THIRD_LAYER_INDEX_THIRTEEN).getId() == WOGCOR_IDPIECE_SIX){
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_LAYER_FRONT_LEFT;
                    this.cubeToSolve.turnUi();
                }
                else if(this.cubeToSolve.currentCubeState.get(THIRD_LAYER_INDEX_FIFTEEN).getId() == WOGCOR_IDPIECE_SIX){
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_LAYER_BACK_LEFT;
                    this.cubeToSolve.turnU2();
                }
                else if(this.cubeToSolve.currentCubeState.get(THIRD_LAYER_INDEX_SEVENTEEN).getId() == WOGCOR_IDPIECE_SIX){
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_LAYER_BACK_RIGHT;
                    this.cubeToSolve.turnU();
                }
                else{
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_LAYER_FRONT_RIGHT;
                }
                solutionMessage = solutionMessage + SIDE_CORNER_TOP_INSERT_PTA;
                if(this.cubeToSolve.oneCenterSide[ZEROTH_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX] == WHITE_CHAR_FLAG){
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_INSERT_PTB;
                    solutionMessage = solutionMessage + URUIRU_REPEAT_ALG;
                    this.performURUiRi();
                }
                else if (this.cubeToSolve.fourCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] == WHITE_CHAR_FLAG){
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_INSERT_PTB;
                    solutionMessage = solutionMessage + RURIUI_REPEAT_ALG;
                    this.performRURiUi();
                }
                else if(this.cubeToSolve.sixCenterSide[SECOND_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX] == WHITE_CHAR_FLAG){
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_INSERT_PTC;
                    solutionMessage = solutionMessage + RURIUI_REPEAT_ALG;
                    this.performRURiUi();
                    this.performRURiUi();
                    this.performRURiUi();
                }
            }
        }
        solutionMessage = solutionMessage + SIDE_CORNER_SOLVED;
        solutionMessage = solutionMessage + "\n";

        //WGR Corner
        this.repositionRedAsOne();
        int indexOfWGRCor = this.findPiece(WGRCOR_IDPIECE_SEVEN);
        if(checkCF2LSolved(WGRCOR_IDPIECE_SEVEN)) {
            if (indexOfWGRCor < SECOND_LAYER_INDEX_EIGHT) {
                solutionMessage = solutionMessage + WGR_COR_BOTTOM_LAYER_INITIAL;
                if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_ONE).getId() == WGRCOR_IDPIECE_SEVEN){
                    solutionMessage = solutionMessage + SIDE_CORNER_BOTTOM_LAYER_FRONT_LEFT;
                    this.cubeToSolve.rotateYi();
                }
                else if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_THREE).getId() == WGRCOR_IDPIECE_SEVEN){
                    solutionMessage = solutionMessage + SIDE_CORNER_BOTTOM_LAYER_BACK_LEFT;
                    this.cubeToSolve.rotateY2();
                }
                else if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_FIVE).getId() == WGRCOR_IDPIECE_SEVEN){
                    solutionMessage = solutionMessage + SIDE_CORNER_BOTTOM_LAYER_BACK_RIGHT;
                    this.cubeToSolve.rotateY();
                }
                else{
                    solutionMessage = solutionMessage + SIDE_CORNER_BOTTOM_LAYER_FRONT_RIGHT;
                }
                solutionMessage = solutionMessage + SIDE_CORNER_BOTTOM_TO_TOP;
                solutionMessage = solutionMessage + RURIUI_REPEAT_ALG;
                this.performRURiUi();
                indexOfWGRCor = this.findPiece(WGRCOR_IDPIECE_SEVEN);
                this.repositionRedAsOne();
            }
            if (indexOfWGRCor > SECOND_LAYER_INDEX_ELEVEN) {
                solutionMessage = solutionMessage + WGR_COR_TOP_LAYER_INITIAL;
                if(this.cubeToSolve.currentCubeState.get(THIRD_LAYER_INDEX_THIRTEEN).getId() == WGRCOR_IDPIECE_SEVEN){
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_LAYER_FRONT_LEFT;
                    this.cubeToSolve.turnUi();
                }
                else if(this.cubeToSolve.currentCubeState.get(THIRD_LAYER_INDEX_FIFTEEN).getId() == WGRCOR_IDPIECE_SEVEN){
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_LAYER_BACK_LEFT;
                    this.cubeToSolve.turnU2();
                }
                else if(this.cubeToSolve.currentCubeState.get(THIRD_LAYER_INDEX_SEVENTEEN).getId() == WGRCOR_IDPIECE_SEVEN){
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_LAYER_BACK_RIGHT;
                    this.cubeToSolve.turnU();
                }
                else{
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_LAYER_FRONT_RIGHT;
                }
                solutionMessage = solutionMessage + SIDE_CORNER_TOP_INSERT_PTA;
                if(this.cubeToSolve.oneCenterSide[ZEROTH_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX] == WHITE_CHAR_FLAG){
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_INSERT_PTB;
                    solutionMessage = solutionMessage + URUIRU_REPEAT_ALG;
                    this.performURUiRi();
                }
                else if (this.cubeToSolve.fourCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] == WHITE_CHAR_FLAG){
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_INSERT_PTB;
                    solutionMessage = solutionMessage + RURIUI_REPEAT_ALG;
                    this.performRURiUi();
                }
                else if(this.cubeToSolve.sixCenterSide[SECOND_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX] == WHITE_CHAR_FLAG){
                    solutionMessage = solutionMessage + SIDE_CORNER_TOP_INSERT_PTC;
                    solutionMessage = solutionMessage + RURIUI_REPEAT_ALG;
                    this.performRURiUi();
                    this.performRURiUi();
                    this.performRURiUi();
                }
            }
        }
        solutionMessage = solutionMessage + SIDE_CORNER_SOLVED_FINISH;
        solutionMessage = solutionMessage + "\n";
    }

    public void insertMiddleEdges() {
        //Red-Blue Mid Edge
        this.repositionRedAsOne();
        int indexOfRedBlueEdge = this.findPiece(RBEDGE_IDPIECE_EIGHT);
        if (indexOfRedBlueEdge < SECOND_LAYER_INDEX_EIGHT) {
            throw new IllegalStateException("1st Layer Not Solved");
        }
        if (indexOfRedBlueEdge < THIRD_LAYER_INDEX_TWELVE) {
            solutionMessage = solutionMessage + RB_EDGE_MIDDLE_LAYER_INITIAL;
            if(this.cubeToSolve.currentCubeState.get(SECOND_LAYER_INDEX_EIGHT).getId() != RBEDGE_IDPIECE_EIGHT){
                if(this.cubeToSolve.currentCubeState.get(SECOND_LAYER_INDEX_NINE).getId() == RBEDGE_IDPIECE_EIGHT){
                    solutionMessage = solutionMessage + MID_LAYER_BACK_LEFT;
                    this.cubeToSolve.rotateY2();
                    this.performRightMidInsert();
                }
                else if(this.cubeToSolve.currentCubeState.get(SECOND_LAYER_INDEX_TEN).getId() == RBEDGE_IDPIECE_EIGHT){
                    solutionMessage = solutionMessage + MID_LAYER_BACK_RIGHT;
                    this.cubeToSolve.rotateY();
                    this.performRightMidInsert();
                }
                else if(this.cubeToSolve.currentCubeState.get(SECOND_LAYER_INDEX_ELEVEN).getId() == RBEDGE_IDPIECE_EIGHT){
                    solutionMessage = solutionMessage + MID_LAYER_FRONT_RIGHT;
                    this.performRightMidInsert();
                }
            }
            else{
                solutionMessage = solutionMessage + MID_LAYER_FRONT_LEFT;
                if(this.cubeToSolve.oneCenterSide[FIRST_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] != this.cubeToSolve.oneCenterSide[FIRST_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX]){
                    solutionMessage = solutionMessage + MID_LAYER_FRONT_LEFT_UNSOLVED;
                    solutionMessage = solutionMessage + MID_INSERT_FIX;
                    this.cubeToSolve.rotateYi();
                    this.reorientMidInsert();
                }
                else{
                    solutionMessage = solutionMessage + MID_LAYER_FRONT_LEFT_SOLVED;
                }
            }
            indexOfRedBlueEdge = this.findPiece(RBEDGE_IDPIECE_EIGHT);
            this.repositionRedAsOne();
        }
        if (indexOfRedBlueEdge > SECOND_LAYER_INDEX_ELEVEN) {
            while (this.cubeToSolve.currentCubeState.get(THIRD_LAYER_INDEX_TWELVE).getId() != RBEDGE_IDPIECE_EIGHT) {
                this.cubeToSolve.turnU();
            }
            if (this.cubeToSolve.oneCenterSide[ZEROTH_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] != RED_CHAR_FLAG &&
                this.cubeToSolve.twoCenterSide[FIRST_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == this.cubeToSolve.oneCenterSide[ZEROTH_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX]) {
                this.cubeToSolve.turnU();
                this.cubeToSolve.rotateYi();
                this.performRightMidInsert();
            } else if (this.cubeToSolve.oneCenterSide[0][1] == this.cubeToSolve.oneCenterSide[1][1]) {
                this.cubeToSolve.rotateYi();
                this.performLeftMidInsert();
            }
        }

        //Blue-Orange Mid Edge
        this.repositionBlueAsOne();
        int indexOfBlueOrangeEdge = this.findPiece(9);
        if (indexOfBlueOrangeEdge < 8) {
            throw new IllegalStateException("1st Layer Not Solved");
        }
        if (indexOfBlueOrangeEdge < 12) {
            while (this.cubeToSolve.currentCubeState.get(11).getId() != 9) {
                this.cubeToSolve.rotateY();
            }
            this.performRightMidInsert();
            indexOfBlueOrangeEdge = this.findPiece(9);
            this.repositionBlueAsOne();
        }
        if (indexOfBlueOrangeEdge > 11) {
            while (this.cubeToSolve.currentCubeState.get(12).getId() != 9) {
                this.cubeToSolve.turnU();
            }
            if (this.cubeToSolve.oneCenterSide[0][1] != 'b' && this.cubeToSolve.twoCenterSide[1][1] == this.cubeToSolve.oneCenterSide[0][1]) {
                this.cubeToSolve.turnU();
                this.cubeToSolve.rotateYi();
                this.performRightMidInsert();
            } else if (this.cubeToSolve.oneCenterSide[0][1] == this.cubeToSolve.oneCenterSide[1][1]) {
                this.cubeToSolve.rotateYi();
                this.performLeftMidInsert();
            }
        }

        //Orange-Green Mid Edge
        this.repositionOrangeAsOne();
        int indexOfOrangeGreenEdge = this.findPiece(10);
        if (indexOfOrangeGreenEdge < 8) {
            throw new IllegalStateException("1st Layer Not Solved");
        }
        if (indexOfOrangeGreenEdge < 12) {
            while (this.cubeToSolve.currentCubeState.get(11).getId() != 10) {
                this.cubeToSolve.rotateY();
            }
            this.performRightMidInsert();
            indexOfOrangeGreenEdge = this.findPiece(10);
            this.repositionOrangeAsOne();
        }
        if (indexOfOrangeGreenEdge > 11) {
            while (this.cubeToSolve.currentCubeState.get(12).getId() != 10) {
                this.cubeToSolve.turnU();
            }
            if (this.cubeToSolve.oneCenterSide[0][1] != 'o' && this.cubeToSolve.twoCenterSide[1][1] == this.cubeToSolve.oneCenterSide[0][1]) {
                this.cubeToSolve.turnU();
                this.cubeToSolve.rotateYi();
                this.performRightMidInsert();
            } else if (this.cubeToSolve.oneCenterSide[0][1] == this.cubeToSolve.oneCenterSide[1][1]) {
                this.cubeToSolve.rotateYi();
                this.performLeftMidInsert();
            }
        }

        //Green-Red Mid Edge
        this.repositionGreenAsOne();
        int indexOfGreenRedEdge = this.findPiece(11);
        if (indexOfGreenRedEdge < 8) {
            throw new IllegalStateException("1st Layer Not Solved");
        }
        if (indexOfGreenRedEdge < 12) {
            while (this.cubeToSolve.currentCubeState.get(11).getId() != 11) {
                this.cubeToSolve.rotateY();
            }
            this.performRightMidInsert();
            indexOfGreenRedEdge = this.findPiece(11);
            this.repositionGreenAsOne();
        }
        if (indexOfGreenRedEdge > 11) {
            while (this.cubeToSolve.currentCubeState.get(12).getId() != 11) {
                this.cubeToSolve.turnU();
            }
            if (this.cubeToSolve.oneCenterSide[0][1] != 'g' && this.cubeToSolve.twoCenterSide[1][1] == this.cubeToSolve.oneCenterSide[0][1]) {
                this.cubeToSolve.turnU();
                this.cubeToSolve.rotateYi();
                this.performRightMidInsert();
            } else if (this.cubeToSolve.oneCenterSide[0][1] == this.cubeToSolve.oneCenterSide[1][1]) {
                this.cubeToSolve.rotateYi();
                this.performLeftMidInsert();
            }
        }
    }

    public void orientYellowEdges() {
        solutionMessage = solutionMessage + TOP_LAYER_EOLL_INITIAL;
        int amountOfYellowFacingUp = this.countYellowsUp();
        int amountOfYellowEdgesFacingUp = countYellowEdgesUp();
        if (amountOfYellowFacingUp == 0) {
            throw new IllegalStateException("Invalid State of Last Layer");
        }
        if (amountOfYellowEdgesFacingUp == YELLOW_EOLL_DOT_INT) {
            solutionMessage = solutionMessage + TOP_LAYER_EOLL_DOT;
            this.performDotEOLL();
        }
        else if (amountOfYellowEdgesFacingUp == YELLOW_EOLL_LINE_OR_L_INT) {
            if (this.cubeToSolve.sixCenterSide[FIRST_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] == this.cubeToSolve.sixCenterSide[FIRST_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX] ||
                this.cubeToSolve.sixCenterSide[ZEROTH_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == this.cubeToSolve.sixCenterSide[SECOND_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX]) {
                solutionMessage = solutionMessage + TOP_LAYER_EOLL_LINE_PT1;
                if (this.cubeToSolve.sixCenterSide[ZEROTH_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == this.cubeToSolve.sixCenterSide[SECOND_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX]) {
                    solutionMessage = solutionMessage + TOP_LAYER_EOLL_LINE_PT2A;
                    this.cubeToSolve.rotateY();
                }
                solutionMessage = solutionMessage + TOP_LAYER_EOLL_PEF_ALG;
                this.performLineEOLL();
            } else {
                solutionMessage = solutionMessage + TOP_LAYER_EOLL_L;
                if(this.cubeToSolve.sixCenterSide[FIRST_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] == this.cubeToSolve.sixCenterSide[SECOND_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX]){
                    solutionMessage = solutionMessage + TOP_LAYER_EOLL_L_PT2A;
                    this.cubeToSolve.rotateY();
                }
                else if(this.cubeToSolve.sixCenterSide[FIRST_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX] == this.cubeToSolve.sixCenterSide[SECOND_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX]){
                    solutionMessage = solutionMessage + TOP_LAYER_EOLL_L_PT2B;
                    this.cubeToSolve.rotateY2();
                }
                else if(this.cubeToSolve.sixCenterSide[FIRST_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX] == this.cubeToSolve.sixCenterSide[ZEROTH_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX]){
                    solutionMessage = solutionMessage + TOP_LAYER_EOLL_L_PT2C;
                    this.cubeToSolve.rotateYi();
                }
                solutionMessage = solutionMessage + TOP_LAYER_EOLL_PEF_ALG;
                this.performLEOLL();
            }
        }
        else{
            solutionMessage = solutionMessage + TOP_LAYER_EOLL_SOLVED;
        }
        solutionMessage = solutionMessage + "\n";
    }

    public void orientYellowCorners() {
        int amountOfYellowFacingUp = countYellowsUp();
        solutionMessage = solutionMessage + TOP_LAYER_COLL_CROSS_INITIAL;
        if (amountOfYellowFacingUp == YELLOW_COLL_CROSS) {
            solutionMessage = solutionMessage + TOP_LAYER_COLL_CROSS_NONE_PT1;
            if (this.cubeToSolve.twoCenterSide[ZEROTH_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX] == YELLOW_CHAR_FLAG) {
                solutionMessage = solutionMessage + TOP_LAYER_COLL_CROSS_PT2_SOLVED;
            }
            else if(this.cubeToSolve.oneCenterSide[ZEROTH_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX] == YELLOW_CHAR_FLAG){
                solutionMessage = solutionMessage + TOP_LAYER_COLL_CROSS_NONE_PT2A;
                this.cubeToSolve.rotateY();
            }
            else if(this.cubeToSolve.threeCenterSide[ZEROTH_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX] == YELLOW_CHAR_FLAG){
                solutionMessage = solutionMessage + TOP_LAYER_COLL_CROSS_NONE_PT2C;
                this.cubeToSolve.rotateYi();
            }
            else if(this.cubeToSolve.fourCenterSide[ZEROTH_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX] == YELLOW_CHAR_FLAG){
                solutionMessage = solutionMessage + TOP_LAYER_COLL_CROSS_NONE_PT2B;
                this.cubeToSolve.rotateY2();
            }
            this.performSune();
            amountOfYellowFacingUp = this.countYellowsUp();
        } else if (amountOfYellowFacingUp == YELLOW_COLL_BALLOON) {
            solutionMessage = solutionMessage + TOP_LAYER_COLL_CROSS_TWO_PT1;
            if (this.cubeToSolve.oneCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] == YELLOW_CHAR_FLAG) {
                solutionMessage = solutionMessage + TOP_LAYER_COLL_CROSS_PT2_SOLVED;
            }
            else if (this.cubeToSolve.fourCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] == YELLOW_CHAR_FLAG) {
                solutionMessage = solutionMessage + TOP_LAYER_COLL_CROSS_TWO_PT2A;
                this.cubeToSolve.rotateY();
            }
            else if (this.cubeToSolve.threeCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] == YELLOW_CHAR_FLAG) {
                solutionMessage = solutionMessage + TOP_LAYER_COLL_CROSS_TWO_PT2B;
                this.cubeToSolve.rotateY2();
            }
            else if (this.cubeToSolve.twoCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] == YELLOW_CHAR_FLAG) {
                solutionMessage = solutionMessage + TOP_LAYER_COLL_CROSS_TWO_PT2C;
                this.cubeToSolve.rotateYi();
            }
            this.performSune();
            amountOfYellowFacingUp = this.countYellowsUp();
        }

        //Orient When Sune Case
        if (amountOfYellowFacingUp == YELLOW_COLL_SUNE) {
            solutionMessage = solutionMessage + TOP_LAYER_COLL_CROSS_SUNE_PT1;
            if (this.cubeToSolve.sixCenterSide[SECOND_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] == YELLOW_CHAR_FLAG) {
                solutionMessage = solutionMessage + TOP_LAYER_COLL_CROSS_PT2_SOLVED;
            }
            else if (this.cubeToSolve.sixCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] == YELLOW_CHAR_FLAG) {
                solutionMessage = solutionMessage + TOP_LAYER_COLL_CROSS_SUNE_PT2C;
                this.cubeToSolve.rotateYi();
            }
            else if (this.cubeToSolve.sixCenterSide[ZEROTH_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX] == YELLOW_CHAR_FLAG) {
                solutionMessage = solutionMessage + TOP_LAYER_COLL_CROSS_SUNE_PT2B;
                this.cubeToSolve.rotateY2();
            }
            else if (this.cubeToSolve.sixCenterSide[SECOND_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX] == YELLOW_CHAR_FLAG) {
                solutionMessage = solutionMessage + TOP_LAYER_COLL_CROSS_SUNE_PT2A;
                this.cubeToSolve.rotateY();
            }
            else {
                throw new IllegalStateException("Invalid Sune Case");
            }

            if (this.cubeToSolve.oneCenterSide[ZEROTH_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX] == YELLOW_CHAR_FLAG) {
                this.performSune();
                solutionMessage = solutionMessage + TOP_LAYER_COLL_CROSS_SOLVED;
            } else if (this.cubeToSolve.fourCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] == YELLOW_CHAR_FLAG) {
                this.performSune();
                this.cubeToSolve.turnU2();
                solutionMessage = solutionMessage + TOP_LAYER_COLL_CROSS_ANTI_SUNE;
                this.performSune();
            } else {
                throw new IllegalStateException("Invalid Sune Case");
            }
        }
    }

    public void permuteYellowCorners() {
        this.repositionRedAsOne();
        if (!checkCPLLSolved()) {
            solutionMessage = solutionMessage + TOP_LAYER_CPLL_INITIAL;
            if(cubeToSolve.oneCenterSide[0][0] == cubeToSolve.oneCenterSide[0][2]){
                solutionMessage = solutionMessage + TOP_LAYER_CPLL_HEADLIGHTS_RED;
                this.cubeToSolve.rotateY();
                this.performTPerm();
            }
            else if(cubeToSolve.twoCenterSide[0][0] == cubeToSolve.twoCenterSide[0][2]){
                solutionMessage = solutionMessage + TOP_LAYER_CPLL_HEADLIGHTS_BLUE;
                this.performTPerm();
            }
            else if(cubeToSolve.threeCenterSide[0][0] == cubeToSolve.threeCenterSide[0][2]){
                solutionMessage = solutionMessage + TOP_LAYER_CPLL_HEADLIGHTS_ORANGE;
                this.cubeToSolve.rotateYi();
                this.performTPerm();
            }
            else if(cubeToSolve.fourCenterSide[0][0] == cubeToSolve.fourCenterSide[0][2]){
                solutionMessage = solutionMessage + TOP_LAYER_CPLL_HEADLIGHTS_GREEN;
                this.cubeToSolve.rotateY2();
                this.performTPerm();
            }
            else{
                solutionMessage = solutionMessage + TOP_LAYER_CPLL_NO_HEADLIGHTS;
                this.performYPerm();
            }
        }
    }

    public void permuteYellowEdges() {
        if (this.checkSolved()) {
            solutionMessage = solutionMessage + SOLVED;
            return;
        }
        if(!this.checkPLLSkip()) {
            solutionMessage = solutionMessage + TOP_LAYER_EPLL_INITIAL;
            this.repositionRedAsOne();
            if (this.findSideHeadlightsSolved() != NONE_CHAR_FLAG) {
                solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT2;
                if (this.findSideHeadlightsSolved() == RED_CHAR_FLAG) {
                    solutionMessage = solutionMessage + RED_STRING_FLAG;
                    solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT3A;
                    if (this.cubeToSolve.oneCenterSide[FIRST_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == GREEN_CHAR_FLAG) {
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT4A;
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT4;
                        solutionMessage = solutionMessage + ROTATION_PHRASE_Y;
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT5;
                        this.cubeToSolve.turnU();
                        this.cubeToSolve.rotateY();
                    } else if (this.cubeToSolve.oneCenterSide[FIRST_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == ORANGE_CHAR_FLAG) {
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT4B;
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT5;
                        this.cubeToSolve.turnU2();
                    } else if (this.cubeToSolve.oneCenterSide[FIRST_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == BLUE_CHAR_FLAG) {
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT4C;
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT4;
                        solutionMessage = solutionMessage + ROTATION_PHRASE_Yi;
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT5;
                        this.cubeToSolve.turnUi();
                        this.cubeToSolve.rotateYi();
                    } else if (this.cubeToSolve.oneCenterSide[FIRST_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == RED_CHAR_FLAG) {
                        solutionMessage = solutionMessage + ROTATION_PHRASE_Y2;
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT5;
                        this.cubeToSolve.rotateY2();
                    }
                } else if (this.findSideHeadlightsSolved() == BLUE_CHAR_FLAG) {
                    solutionMessage = solutionMessage + BLUE_STRING_FLAG;
                    solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT3A;
                    if (this.cubeToSolve.oneCenterSide[FIRST_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == GREEN_CHAR_FLAG) {
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT4B;
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT5;
                        this.cubeToSolve.turnU2();
                    } else if (this.cubeToSolve.oneCenterSide[FIRST_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == ORANGE_CHAR_FLAG) {
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT4C;
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT4;
                        solutionMessage = solutionMessage + ROTATION_PHRASE_Yi;
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT5;
                        this.cubeToSolve.turnUi();
                        this.cubeToSolve.rotateYi();
                    } else if (this.cubeToSolve.oneCenterSide[FIRST_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == BLUE_CHAR_FLAG) {
                        solutionMessage = solutionMessage + ROTATION_PHRASE_Y2;
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT5;
                        this.cubeToSolve.rotateY2();
                    } else if (this.cubeToSolve.oneCenterSide[FIRST_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == RED_CHAR_FLAG) {
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT4A;
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT4;
                        solutionMessage = solutionMessage + ROTATION_PHRASE_Y;
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT5;
                        this.cubeToSolve.turnU();
                        this.cubeToSolve.rotateY();
                    }
                } else if (this.findSideHeadlightsSolved() == GREEN_CHAR_FLAG) {
                    solutionMessage = solutionMessage + GREEN_STRING_FLAG;
                    solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT3A;
                    if (this.cubeToSolve.oneCenterSide[FIRST_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == GREEN_CHAR_FLAG) {
                        solutionMessage = solutionMessage + ROTATION_PHRASE_Y2;
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT5;
                        this.cubeToSolve.rotateY2();
                    } else if (this.cubeToSolve.oneCenterSide[FIRST_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == ORANGE_CHAR_FLAG) {
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT4A;
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT4;
                        solutionMessage = solutionMessage + ROTATION_PHRASE_Y;
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT5;
                        this.cubeToSolve.turnU();
                        this.cubeToSolve.rotateY();
                    } else if (this.cubeToSolve.oneCenterSide[FIRST_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == BLUE_CHAR_FLAG) {
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT4B;
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT5;
                        this.cubeToSolve.turnU2();
                    } else if (this.cubeToSolve.oneCenterSide[FIRST_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == RED_CHAR_FLAG) {
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT4C;
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT4;
                        solutionMessage = solutionMessage + ROTATION_PHRASE_Yi;
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT5;
                        this.cubeToSolve.turnUi();
                        this.cubeToSolve.rotateYi();
                    }
                } else if (this.findSideHeadlightsSolved() == ORANGE_CHAR_FLAG) {
                    solutionMessage = solutionMessage + ORANGE_STRING_FLAG;
                    solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT3A;
                    if (this.cubeToSolve.oneCenterSide[FIRST_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == GREEN_CHAR_FLAG) {
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT4C;
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT4;
                        solutionMessage = solutionMessage + ROTATION_PHRASE_Yi;
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT5;
                        this.cubeToSolve.turnUi();
                        this.cubeToSolve.rotateYi();
                    } else if (this.cubeToSolve.oneCenterSide[FIRST_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == ORANGE_CHAR_FLAG) {
                        solutionMessage = solutionMessage + ROTATION_PHRASE_Y2;
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT5;
                        this.cubeToSolve.rotateY2();
                    } else if (this.cubeToSolve.oneCenterSide[FIRST_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == BLUE_CHAR_FLAG) {
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT4A;
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT4;
                        solutionMessage = solutionMessage + ROTATION_PHRASE_Y;
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT5;
                        this.cubeToSolve.turnU();
                        this.cubeToSolve.rotateY();
                    } else if (this.cubeToSolve.oneCenterSide[FIRST_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == RED_CHAR_FLAG) {
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT4B;
                        solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT5;
                        this.cubeToSolve.turnU2();
                    }
                }
                solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT6A;
                if (cubeToSolve.twoCenterSide[ZEROTH_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == cubeToSolve.fourCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX]
                    && cubeToSolve.twoCenterSide[ZEROTH_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == cubeToSolve.fourCenterSide[ZEROTH_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX]) {
                    this.performUaPerm();
                } else if (cubeToSolve.fourCenterSide[ZEROTH_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == cubeToSolve.twoCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX]
                    && cubeToSolve.fourCenterSide[ZEROTH_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == cubeToSolve.twoCenterSide[ZEROTH_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX]) {
                    this.performUbPerm();
                }
            } else {
                solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT3B;
                if (cubeToSolve.oneCenterSide[ZEROTH_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == cubeToSolve.threeCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX]
                    && cubeToSolve.twoCenterSide[ZEROTH_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == cubeToSolve.fourCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX]) {
                    solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT6B;
                    this.performHPerm();
                }
                else if (cubeToSolve.oneCenterSide[ZEROTH_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == cubeToSolve.twoCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX]
                    && cubeToSolve.threeCenterSide[ZEROTH_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == cubeToSolve.fourCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX]) {
                    solutionMessage = solutionMessage + ROTATION_PHRASE_Yi;
                    solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT6B;
                    this.cubeToSolve.rotateYi();
                    this.performZPerm();
                }
                else if (cubeToSolve.oneCenterSide[ZEROTH_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == cubeToSolve.fourCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX]
                    && cubeToSolve.twoCenterSide[ZEROTH_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == cubeToSolve.threeCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX]) {
                    solutionMessage = solutionMessage + TOP_LAYER_EPLL_PT6B;
                    this.performZPerm();
                }
                while (!this.checkSolved()) {
                    this.cubeToSolve.turnU();
                }
            }
        }
        else{
            while (!this.checkSolved()) {
                this.cubeToSolve.turnU();
            }
        }
        solutionMessage = solutionMessage + SOLVED;
    }

    public int countYellowsUp() {
        int amountOfYellowFacingUp = 0;
        for (int i = 0; i < BIGGEST_RANGE_ARRAY; i++) {
            for (int j = 0; j < BIGGEST_RANGE_ARRAY; j++) {
                if (this.cubeToSolve.sixCenterSide[i][j] == YELLOW_CHAR_FLAG) {
                    amountOfYellowFacingUp++;
                }
            }
        }
        return amountOfYellowFacingUp;
    }

    public int countYellowEdgesUp() {
        int amountOfYellowEdgesFacingUp = 0;
        if (this.cubeToSolve.sixCenterSide[ZEROTH_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == YELLOW_CHAR_FLAG) {
            amountOfYellowEdgesFacingUp++;
        }
        for (int i = 0; i < BIGGEST_RANGE_ARRAY; i++) {
            if (this.cubeToSolve.sixCenterSide[FIRST_COL_ROW_MATRIX][i] == YELLOW_CHAR_FLAG) {
                amountOfYellowEdgesFacingUp++;
            }
        }
        if (this.cubeToSolve.sixCenterSide[SECOND_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] == YELLOW_CHAR_FLAG) {
            amountOfYellowEdgesFacingUp++;
        }
        return amountOfYellowEdgesFacingUp;
    }

    public boolean checkCPLLSolved() {
        if (this.cubeToSolve.oneCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] == this.cubeToSolve.oneCenterSide[ZEROTH_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX]) {
            if (this.cubeToSolve.twoCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] == this.cubeToSolve.twoCenterSide[ZEROTH_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX]) {
                if (this.cubeToSolve.threeCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] == this.cubeToSolve.threeCenterSide[ZEROTH_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX]) {
                    if (this.cubeToSolve.fourCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] == this.cubeToSolve.fourCenterSide[ZEROTH_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean checkCF2LSolved(int pieceId){
        if(this.cubeToSolve.currentCubeState.get(FIRST_LAYER_INDEX_SEVEN).getId() == pieceId && this.cubeToSolve.fiveCenterSide[ZEROTH_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX] == WHITE_CHAR_FLAG){
            return false;
        }
        return true;
    }

    public int findPiece(int id) {
        for (int i = 0; i < MAX_SIZE; i++) {
            if (this.cubeToSolve.currentCubeState.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void repositionRedAsOne() {
        solutionMessage = solutionMessage + repositionRedMessage;
        while (this.cubeToSolve.oneCenterSide[FIRST_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] != RED_CHAR_FLAG) {
            this.cubeToSolve.rotateY();
        }
    }

    public void repositionBlueAsOne() {
        solutionMessage = solutionMessage + repositionBlueMessage;
        while (this.cubeToSolve.oneCenterSide[FIRST_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] != BLUE_CHAR_FLAG) {
            this.cubeToSolve.rotateY();
        }
    }

    public void repositionOrangeAsOne() {
        solutionMessage = solutionMessage + repositionOrangeMessage;
        while (this.cubeToSolve.oneCenterSide[FIRST_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] != ORANGE_CHAR_FLAG) {
            this.cubeToSolve.rotateY();
        }
    }

    public void repositionGreenAsOne() {
        solutionMessage = solutionMessage + repositionGreenMessage;
        while (this.cubeToSolve.oneCenterSide[FIRST_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX] != GREEN_CHAR_FLAG) {
            this.cubeToSolve.rotateY();
        }
    }


    public boolean checkSolved() {
        char[][] redSide = {{'r', 'r', 'r'}, {'r', 'r', 'r'}, {'r', 'r', 'r'}};
        char[][] blueSide = {{'b', 'b', 'b'}, {'b', 'b', 'b'}, {'b', 'b', 'b'}};
        char[][] orangeSide = {{'o', 'o', 'o'}, {'o', 'o', 'o'}, {'o', 'o', 'o'}};
        char[][] greenSide = {{'g', 'g', 'g'}, {'g', 'g', 'g'}, {'g', 'g', 'g'}};
        char[][] whiteSide = {{'w', 'w', 'w'}, {'w', 'w', 'w'}, {'w', 'w', 'w'}};
        char[][] yellowSide = {{'y', 'y', 'y'}, {'y', 'y', 'y'}, {'y', 'y', 'y'}};

        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(cubeToSolve.getOneCenterSide(), redSide) &&
                Arrays.deepEquals(cubeToSolve.getTwoCenterSide(), blueSide) &&
                Arrays.deepEquals(cubeToSolve.getThreeCenterSide(), orangeSide) &&
                Arrays.deepEquals(cubeToSolve.getFourCenterSide(), greenSide) &&
                Arrays.deepEquals(cubeToSolve.getFiveCenterSide(), whiteSide) &&
                Arrays.deepEquals(cubeToSolve.getSixCenterSide(), yellowSide)) {
                return true;
            }
            this.cubeToSolve.rotateY();
        }
        return false;
    }

    public boolean checkPLLSkip() {
        if (this.cubeToSolve.oneCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] == this.cubeToSolve.oneCenterSide[ZEROTH_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX]
            && this.cubeToSolve.oneCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] == this.cubeToSolve.oneCenterSide[ZEROTH_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX]) {
            if (this.cubeToSolve.twoCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] == this.cubeToSolve.twoCenterSide[ZEROTH_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX]
                && this.cubeToSolve.twoCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] == this.cubeToSolve.twoCenterSide[ZEROTH_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX]) {
                if (this.cubeToSolve.threeCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] == this.cubeToSolve.threeCenterSide[ZEROTH_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX]
                && this.cubeToSolve.threeCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] == this.cubeToSolve.threeCenterSide[ZEROTH_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX]) {
                    if (this.cubeToSolve.fourCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] == this.cubeToSolve.fourCenterSide[ZEROTH_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX]
                    && this.cubeToSolve.fourCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] == this.cubeToSolve.fourCenterSide[ZEROTH_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public char findSideHeadlightsSolved(){
        for(int i = 0; i < 4; i++) {
            if (this.cubeToSolve.oneCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] == this.cubeToSolve.oneCenterSide[ZEROTH_COL_ROW_MATRIX][SECOND_COL_ROW_MATRIX]
                && this.cubeToSolve.oneCenterSide[ZEROTH_COL_ROW_MATRIX][ZEROTH_COL_ROW_MATRIX] == this.cubeToSolve.oneCenterSide[ZEROTH_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX]) {
                return this.cubeToSolve.oneCenterSide[ZEROTH_COL_ROW_MATRIX][FIRST_COL_ROW_MATRIX];
            }
            this.cubeToSolve.rotateY();
        }
        return NONE_CHAR_FLAG;
    }

    public void solveCubeBeginnersMethod() {
        //White Cross
        this.finishWhiteCross();
        //White Corners
        this.insertWhiteCorners();
        //Middle Edges
        this.insertMiddleEdges();
        //OLL
        //Orient Yellow Edges
        this.orientYellowEdges();
        //Orient Yellow Corners
        this.orientYellowCorners();
        //PLL
        //Permute Yellow Corners
        this.permuteYellowCorners();
        //Permute Yellow Edges
        this.permuteYellowEdges();
        System.out.println(solutionMessage);
    }
}
