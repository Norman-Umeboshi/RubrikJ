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

    public void orientFlippedWhiteEdge(){
        this.cubeToSolve.turnF2();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnF();
        this.cubeToSolve.turnR();
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

    public void finishWhiteCross(){
        //White-Red Edge
        this.repositionRedAsOne();
        int indexOfWREdge = this.findPiece(0);
        if(this.cubeToSolve.currentCubeState.get(0).getId() != 0) {
            if (indexOfWREdge < 8) {
                while (this.cubeToSolve.currentCubeState.get(0).getId() != 0) {
                    this.cubeToSolve.turnD();
                }
            }
            if (indexOfWREdge < 12) {
                while (this.cubeToSolve.currentCubeState.get(11).getId() != 0) {
                    this.cubeToSolve.rotateY();
                }
                this.cubeToSolve.turnR();
                this.repositionRedAsOne();
            }
            if (indexOfWREdge > 11) {
                while (this.cubeToSolve.currentCubeState.get(12).getId() != 0) {
                    this.cubeToSolve.turnU();
                }
                this.cubeToSolve.turnF2();
            }
        }
        if (this.cubeToSolve.fiveCenterSide[0][1] != 'w') {
            this.orientFlippedWhiteEdge();
        }

        //White-Blue Edge
        this.repositionBlueAsOne();
        int indexOfWBEdge = this.findPiece(1);
        if(this.cubeToSolve.currentCubeState.get(0).getId() != 1){
            if(indexOfWBEdge < 8){
                while (this.cubeToSolve.currentCubeState.get(6).getId() != 1) {
                    this.cubeToSolve.rotateY();
                }
                this.cubeToSolve.turnR2();
                this.repositionBlueAsOne();
            }
            if(indexOfWBEdge < 12){
                while(this.cubeToSolve.currentCubeState.get(11).getId() != 1){
                    this.cubeToSolve.rotateY();
                }
                this.performRURiUi();
                this.repositionBlueAsOne();
            }
            if(indexOfWBEdge > 11){
                while(this.cubeToSolve.currentCubeState.get(12).getId() != 1){
                    this.cubeToSolve.turnU();
                }
                this.cubeToSolve.turnF2();
            }
        }
        if(this.cubeToSolve.fiveCenterSide[0][1] != 'w'){
            this.orientFlippedWhiteEdge();
        }

        //White-Orange Edge
        this.repositionOrangeAsOne();
        int indexOfWOEdge = this.findPiece(2);
        if(this.cubeToSolve.currentCubeState.get(0).getId() != 2){
            if(indexOfWOEdge < 8){
                while(this.cubeToSolve.currentCubeState.get(6).getId() != 2){
                    this.cubeToSolve.rotateY();
                }
                this.cubeToSolve.turnR2();
                this.repositionOrangeAsOne();
            }
            if(indexOfWOEdge <12){
                while(this.cubeToSolve.currentCubeState.get(11).getId() != 2){
                    this.cubeToSolve.turnU();
                }
                this.performRURiUi();
                this.repositionOrangeAsOne();
            }
            if(indexOfWOEdge > 11){
                while(this.cubeToSolve.currentCubeState.get(12).getId() != 2){
                    this.cubeToSolve.turnU();
                }
                this.cubeToSolve.turnF2();
            }
        }
        if(this.cubeToSolve.fiveCenterSide[0][1] != 'w'){
            this.orientFlippedWhiteEdge();
        }

        //White-Green Edge
        this.repositionGreenAsOne();
        int indexOfWGEdge = this.findPiece(3);
        if(this.cubeToSolve.currentCubeState.get(0).getId() != 3){
            if(indexOfWGEdge < 8){
                while(this.cubeToSolve.currentCubeState.get(6).getId() != 3){
                    this.cubeToSolve.rotateY();
                }
                this.cubeToSolve.turnR2();
                this.repositionGreenAsOne();
            }
            if(indexOfWGEdge < 12){
                while(this.cubeToSolve.currentCubeState.get(11).getId() != 3){
                    this.cubeToSolve.turnU();
                }
                this.performRURiUi();
                this.repositionGreenAsOne();
            }
            if(indexOfWGEdge > 11){
                while(this.cubeToSolve.currentCubeState.get(12).getId() != 3){
                    this.cubeToSolve.turnU();
                }
                this.cubeToSolve.turnF2();
            }
        }
        if(this.cubeToSolve.fiveCenterSide[0][1] != 'w'){
            this.orientFlippedWhiteEdge();
        }
    }

    public void insertWhiteCorners(){
        this.repositionBlueAsOne();
        int indexOfWRBCor = this.findPiece(4);
        if(this.cubeToSolve.currentCubeState.get(7).getId() != 4) {
            if (indexOfWRBCor < 8) {
                while (this.cubeToSolve.currentCubeState.get(7).getId() != 4) {
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
        if(this.cubeToSolve.currentCubeState.get(7).getId() != 5) {
            if (indexOfWBOCor < 8) {
                while (this.cubeToSolve.currentCubeState.get(7).getId() != 5) {
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
        if(this.cubeToSolve.currentCubeState.get(7).getId() != 6) {
            if (indexOfWOGCor < 8) {
                while (this.cubeToSolve.currentCubeState.get(7).getId() != 6) {
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
        if(this.cubeToSolve.currentCubeState.get(7).getId() != 7) {
            if (indexOfWGRCor < 8) {
                while (this.cubeToSolve.currentCubeState.get(7).getId() != 7) {
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
        if (indexOfRedBlueEdge < 8) {
            throw new IllegalStateException("1st Layer Not Solved");
        }
        if (indexOfRedBlueEdge < 12) {
            while (this.cubeToSolve.currentCubeState.get(11).getId() != 8) {
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
    }
}
