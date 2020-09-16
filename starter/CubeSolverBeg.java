/**
 * Norman Ta
 * 9-5-2020
 * <p>
 * CubeSolverBeg.java
 */

import java.util.Arrays;

public class CubeSolverBeg {
    Cube cubeToSolve;

    public CubeSolverBeg(Cube cubeToSolve) {
        this.cubeToSolve = cubeToSolve;
        this.cubeToSolve.initializePossibleCubePiecesBeg();
    }

    public void performRURiUi() {
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnUi();
    }

    public void performRightMidInsert() {
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
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnFi();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnF();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnRi();
    }

    public void performDotEOLL() {
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
        this.cubeToSolve.turnF();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnFi();
    }

    public void performLineEOLL() {
        this.cubeToSolve.turnF();
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnFi();
    }

    public void performSune() {
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnU2();
        this.cubeToSolve.turnRi();
    }

    public void performAntSune() {
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnU2();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnRi();
    }

    public void performTPerm() {
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

    public void insertWhiteCorners(){
        this.repositionBlueAsOne();
        int indexOfWRBCor = this.findPiece(4);
        CubePieces WRBCorner = this.cubeToSolve.currentCubeState.get(indexOfWRBCor);
        if(this.cubeToSolve.currentCubeState.get(7).getId() != 4) {
            if (indexOfWRBCor < 8) {
                while (!WRBCorner.equals(this.cubeToSolve.currentCubeState.get(7))) {
                    this.cubeToSolve.rotateY();
                }
                this.performRURiUi();
                indexOfWRBCor = this.findPiece(4);
                this.repositionBlueAsOne();
            }
            if (indexOfWRBCor > 11) {
                while (this.cubeToSolve.currentCubeState.get(19).getId() != 4) {
                    this.cubeToSolve.turnU();
                }
                while (this.cubeToSolve.fiveCenterSide[0][2] != 'w') {
                    this.performRURiUi();
                }
            }
        }

        //WBO Corner
        this.repositionOrangeAsOne();
        int indexOfWBOCor = this.findPiece(5);
        CubePieces WBOCorner = this.cubeToSolve.currentCubeState.get(indexOfWBOCor);
        if(this.cubeToSolve.currentCubeState.get(7).getId() != 5) {
            if (indexOfWBOCor < 8) {
                while (!WRBCorner.equals(this.cubeToSolve.currentCubeState.get(7))) {
                    this.cubeToSolve.rotateY();
                }
                this.performRURiUi();
                indexOfWBOCor = this.findPiece(5);
                this.repositionOrangeAsOne();
            }
            if (indexOfWBOCor > 11) {
                while (this.cubeToSolve.currentCubeState.get(19).getId() != 5) {
                    this.cubeToSolve.turnU();
                }
                while (this.cubeToSolve.fiveCenterSide[0][2] != 'w') {
                    this.performRURiUi();
                }
            }
        }

        //WOG Corner
        this.repositionGreenAsOne();
        int indexOfWOGCor = this.findPiece(6);
        CubePieces WOGCorner = this.cubeToSolve.currentCubeState.get(indexOfWOGCor);
        if(this.cubeToSolve.currentCubeState.get(7).getId() != 6) {
            if (indexOfWOGCor < 8) {
                while (!WOGCorner.equals(this.cubeToSolve.currentCubeState.get(7))) {
                    this.cubeToSolve.rotateY();
                }
                this.performRURiUi();
                indexOfWOGCor = this.findPiece(6);
                this.repositionGreenAsOne();
            }
            if (indexOfWOGCor > 11) {
                while (this.cubeToSolve.currentCubeState.get(19).getId() != 6) {
                    this.cubeToSolve.turnU();
                }
                while (this.cubeToSolve.fiveCenterSide[0][2] != 'w') {
                    this.performRURiUi();
                }
            }
        }
        //WGR Corner
        this.repositionRedAsOne();
        int indexOfWGRCor = this.findPiece(7);
        CubePieces WGRCorner = this.cubeToSolve.currentCubeState.get(indexOfWGRCor);
        if(this.cubeToSolve.currentCubeState.get(7).getId() != 7) {
            if (indexOfWGRCor < 8) {
                while (!WGRCorner.equals(this.cubeToSolve.currentCubeState.get(7))) {
                    this.cubeToSolve.rotateY();
                }
                this.performRURiUi();
                indexOfWGRCor = this.findPiece(7);
                this.repositionRedAsOne();
            }
            if (indexOfWGRCor > 11) {
                while (this.cubeToSolve.currentCubeState.get(19).getId() != 7) {
                    this.cubeToSolve.turnU();
                }
                while (this.cubeToSolve.fiveCenterSide[0][2] != 'w') {
                    this.performRURiUi();
                }
            }
        }
    }

    public void insertMiddleEdges() {
        //Red-Blue Mid Edge
        this.repositionRedAsOne();
        int indexOfRedBlueEdge = this.findPiece(8);
        CubePieces redBlueEdge = this.cubeToSolve.currentCubeState.get(indexOfRedBlueEdge);
        if (indexOfRedBlueEdge < 8) {
            throw new IllegalStateException("1st Layer Not Solved");
        }
        if (indexOfRedBlueEdge > 8 && indexOfRedBlueEdge < 12) {
            while (!redBlueEdge.equals(this.cubeToSolve.currentCubeState.get(11))) {
                this.cubeToSolve.rotateY();
            }
            this.performRightMidInsert();
            indexOfRedBlueEdge = this.findPiece(8);
            this.repositionRedAsOne();
        }
        if (indexOfRedBlueEdge > 11) {
            while (this.cubeToSolve.currentCubeState.get(12).getId() != 8) {
                this.cubeToSolve.turnU();
            }
            if (this.cubeToSolve.oneCenterSide[0][1] != 'r' && this.cubeToSolve.twoCenterSide[1][1] == this.cubeToSolve.oneCenterSide[0][1]) {
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
        CubePieces blueOrangeEdge = this.cubeToSolve.currentCubeState.get(indexOfBlueOrangeEdge);
        if (indexOfBlueOrangeEdge < 8) {
            throw new IllegalStateException("1st Layer Not Solved");
        }
        if (indexOfBlueOrangeEdge > 8 && indexOfBlueOrangeEdge < 12) {
            while (!blueOrangeEdge.equals(this.cubeToSolve.currentCubeState.get(11))) {
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
        CubePieces orangeGreenEdge = this.cubeToSolve.currentCubeState.get(indexOfOrangeGreenEdge);
        if (indexOfOrangeGreenEdge < 8) {
            throw new IllegalStateException("1st Layer Not Solved");
        }
        if (indexOfOrangeGreenEdge > 8 && indexOfOrangeGreenEdge < 12) {
            while (!orangeGreenEdge.equals(this.cubeToSolve.currentCubeState.get(11))) {
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
        CubePieces greenRedEdge = this.cubeToSolve.currentCubeState.get(indexOfGreenRedEdge);
        if (indexOfGreenRedEdge < 8) {
            throw new IllegalStateException("1st Layer Not Solved");
        }
        if (indexOfGreenRedEdge > 8 && indexOfGreenRedEdge < 12) {
            while (!greenRedEdge.equals(this.cubeToSolve.currentCubeState.get(11))) {
                this.cubeToSolve.rotateY();
            }
            this.performRightMidInsert();
            indexOfGreenRedEdge = this.findPiece(11);
            this.repositionRedAsOne();
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
        int amountOfYellowFacingUp = this.countYellowsUp();
        int amountOfYellowEdgesFacingUp = countYellowEdgesUp();
        if (amountOfYellowFacingUp == 0) {
            throw new IllegalStateException("Invalid State of Last Layer");
        }
        if (amountOfYellowEdgesFacingUp == 1) {
            performDotEOLL();
        }
        if (amountOfYellowEdgesFacingUp == 3) {
            if (this.cubeToSolve.sixCenterSide[1][0] == this.cubeToSolve.sixCenterSide[1][2] || this.cubeToSolve.sixCenterSide[0][1] == this.cubeToSolve.sixCenterSide[2][1]) {
                if (this.cubeToSolve.sixCenterSide[0][1] == this.cubeToSolve.sixCenterSide[2][1]) {
                    this.cubeToSolve.rotateY();
                }
                performLineEOLL();
            } else {
                while (this.cubeToSolve.sixCenterSide[1][0] != this.cubeToSolve.sixCenterSide[0][1]) {
                    this.cubeToSolve.rotateY();
                }
                performLEOLL();
            }
        }
    }

    public void orientYellowCorners() {
        int amountOfYellowFacingUp = countYellowsUp();
        if (amountOfYellowFacingUp == 5) {
            for (int i = 0; i < 4; i++) {
                if (this.cubeToSolve.twoCenterSide[0][2] == 'y') {
                    break;
                }
                this.cubeToSolve.rotateY();
            }
            this.performSune();
            amountOfYellowFacingUp = this.countYellowsUp();
        } else if (amountOfYellowFacingUp == 7) {
            for (int i = 0; i < 4; i++) {
                if (this.cubeToSolve.oneCenterSide[0][0] == 'y') {
                    break;
                }
                this.cubeToSolve.rotateY();
            }
            this.performSune();
            amountOfYellowFacingUp = this.countYellowsUp();
        }

        //Orient When Sune Case
        if (amountOfYellowFacingUp == 6) {
            for (int i = 0; i < 4; i++) {
                if (this.cubeToSolve.sixCenterSide[2][0] == 'y') {
                    break;
                }
                this.cubeToSolve.rotateY();
            }
            if (this.cubeToSolve.oneCenterSide[0][2] == 'y') {
                this.performSune();
            } else if (this.cubeToSolve.fourCenterSide[0][0] == 'y') {
                this.cubeToSolve.turnU2();
                this.performAntSune();
            } else {
                throw new IllegalStateException("Invalid Sune Case");
            }
        }
    }

    public void permuteYellowCorners() {
        if (!checkCPLLSolved()) {
            boolean headLightEdges = false;
            for (int i = 0; i < 4; i++) {
                if (cubeToSolve.twoCenterSide[0][0] == cubeToSolve.twoCenterSide[0][2]) {
                    this.performTPerm();
                    headLightEdges = true;
                    break;
                }
                this.cubeToSolve.rotateY();
            }
            if (!headLightEdges) {
                this.performYPerm();
            }
        }
    }

    public void permuteYellowEdges() {
        if (this.checkSolved()) {
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (cubeToSolve.threeCenterSide[0][1] ==
                cubeToSolve.threeCenterSide[0][2] &&
                cubeToSolve.threeCenterSide[0][1] ==
                    cubeToSolve.threeCenterSide[0][0]) {
                if (cubeToSolve.twoCenterSide[0][1] == cubeToSolve.fourCenterSide[0][0] && cubeToSolve.twoCenterSide[0][1] == cubeToSolve.fourCenterSide[0][2]) {
                    this.performUaPerm();
                    break;
                } else if (cubeToSolve.fourCenterSide[0][1] == cubeToSolve.twoCenterSide[0][0] && cubeToSolve.fourCenterSide[0][1] == cubeToSolve.twoCenterSide[0][2]) {
                    this.performUbPerm();
                    break;
                } else {
                    throw new IllegalStateException("Invalid Cube State of EPLL");
                }
            }
            this.cubeToSolve.rotateY();
        }
        if (cubeToSolve.oneCenterSide[0][1] == cubeToSolve.threeCenterSide[0][0] && cubeToSolve.twoCenterSide[0][1] == cubeToSolve.fourCenterSide[0][0]) {
            this.performHPerm();
        }
        if (cubeToSolve.oneCenterSide[0][1] == cubeToSolve.twoCenterSide[0][0] && cubeToSolve.threeCenterSide[0][1] == cubeToSolve.fourCenterSide[0][0]) {
            this.cubeToSolve.rotateYi();
            this.performZPerm();
        }
        if (cubeToSolve.oneCenterSide[0][1] == cubeToSolve.fourCenterSide[0][0] && cubeToSolve.twoCenterSide[0][1] == cubeToSolve.threeCenterSide[0][0]) {
            this.performZPerm();
        }
        while (!this.checkSolved()) {
            this.cubeToSolve.turnU();
        }
    }

    public int countYellowsUp() {
        int amountOfYellowFacingUp = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.cubeToSolve.sixCenterSide[i][j] == 'y') {
                    amountOfYellowFacingUp++;
                }
            }
        }
        return amountOfYellowFacingUp;
    }

    public int countYellowEdgesUp() {
        int amountOfYellowEdgesFacingUp = 0;
        if (this.cubeToSolve.sixCenterSide[0][1] == 'y') {
            amountOfYellowEdgesFacingUp++;
        }
        for (int i = 0; i < 3; i++) {
            if (this.cubeToSolve.sixCenterSide[1][i] == 'y') {
                amountOfYellowEdgesFacingUp++;
            }
        }
        if (this.cubeToSolve.sixCenterSide[2][1] == 'y') {
            amountOfYellowEdgesFacingUp++;
        }
        return amountOfYellowEdgesFacingUp;
    }

    public boolean checkCPLLSolved() {
        if (this.cubeToSolve.oneCenterSide[0][0] == this.cubeToSolve.oneCenterSide[0][2]) {
            if (this.cubeToSolve.twoCenterSide[0][0] == this.cubeToSolve.twoCenterSide[0][2]) {
                if (this.cubeToSolve.threeCenterSide[0][0] == this.cubeToSolve.threeCenterSide[0][2]) {
                    if (this.cubeToSolve.fourCenterSide[0][0] == this.cubeToSolve.fourCenterSide[0][2]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int findPiece(int id) {
        for (int i = 0; i < 20; i++) {
            if (this.cubeToSolve.currentCubeState.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void repositionRedAsOne() {
        while (this.cubeToSolve.oneCenterSide[1][1] != 'r') {
            this.cubeToSolve.rotateY();
        }
    }

    public void repositionBlueAsOne() {
        while (this.cubeToSolve.oneCenterSide[1][1] != 'b') {
            this.cubeToSolve.rotateY();
        }
    }

    public void repositionOrangeAsOne() {
        while (this.cubeToSolve.oneCenterSide[1][1] != 'o') {
            this.cubeToSolve.rotateY();
        }
    }

    public void repositionGreenAsOne() {
        while (this.cubeToSolve.oneCenterSide[1][1] != 'g') {
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

    public void solveCubeBeginnersMethod() {

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
    }
}
