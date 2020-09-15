/**
 * Norman Ta
 * 9-5-2020
 *
 * CubeSolverBeg.java
 */

import java.util.Arrays;

public class CubeSolverBeg {
    Cube cubeToSolve;

    public CubeSolverBeg(Cube cubeToSolve) {
        this.cubeToSolve = cubeToSolve;
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
    public void performDotEOLL(){
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
    public void performLEOLL(){
        this.cubeToSolve.turnF();
        this.cubeToSolve.turnU();
        this.cubeToSolve.turnR();
        this.cubeToSolve.turnUi();
        this.cubeToSolve.turnRi();
        this.cubeToSolve.turnFi();
    }
    public void performLineEOLL(){
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

    public void performZPerm(){
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
    public int countYellowsUp(){
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
    public int countYellowEdgesUp(){
        int amountOfYellowEdgesFacingUp = 0;
        if(this.cubeToSolve.sixCenterSide[0][1] == 'y'){
            amountOfYellowEdgesFacingUp++;
        }
        for(int i = 0; i < 3; i++){
            if(this.cubeToSolve.sixCenterSide[i][1] == 'y'){
                amountOfYellowEdgesFacingUp++;
            }
        }
        if(this.cubeToSolve.sixCenterSide[2][1] == 'y'){
            amountOfYellowEdgesFacingUp++;
        }
        return amountOfYellowEdgesFacingUp;
    }
    public boolean checkCPLLSolved(){
        if(this.cubeToSolve.oneCenterSide[0][0] == this.cubeToSolve.oneCenterSide[0][2]){
            if(this.cubeToSolve.twoCenterSide[0][0] == this.cubeToSolve.twoCenterSide[0][2]){
                if(this.cubeToSolve.threeCenterSide[0][0] == this.cubeToSolve.threeCenterSide[0][2]){
                    if(this.cubeToSolve.fourCenterSide[0][0] == this.cubeToSolve.fourCenterSide[0][2]){
                        return true;
                    }
                }
            }
        }
        return false;
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


        int amountOfYellowFacingUp = countYellowsUp();
        int amountOfYellowEdgesFacingUp = countYellowEdgesUp();

        if (amountOfYellowFacingUp == 0) {
            throw new IllegalStateException("Invalid State of Last Layer");
        }

        //Orient Yellow Edges
        if(amountOfYellowEdgesFacingUp == 1){
            performDotEOLL();
        }
        if(amountOfYellowEdgesFacingUp == 3){
            if(this.cubeToSolve.sixCenterSide[1][0] == this.cubeToSolve.sixCenterSide[1][2] || this.cubeToSolve.sixCenterSide[0][1] == this.cubeToSolve.sixCenterSide[2][1]){
                if(this.cubeToSolve.sixCenterSide[0][1] == this.cubeToSolve.sixCenterSide[2][1]){
                    this.cubeToSolve.rotateY();
                }
                performLineEOLL();
            }
            else{
                while(this.cubeToSolve.sixCenterSide[1][0] == this.cubeToSolve.sixCenterSide[0][1]){
                    this.cubeToSolve.rotateY();
                }
                performLEOLL();
            }
        }


        //Orient Yellow Corners
        amountOfYellowFacingUp = countYellowsUp();
        if (amountOfYellowFacingUp == 5) {
            for (int i = 0; i < 4; i++) {
                if (this.cubeToSolve.twoCenterSide[0][2] == 'y') {
                    break;
                }
                this.cubeToSolve.rotateY();
            }
            this.performSune();
            amountOfYellowFacingUp++;
        } else if (amountOfYellowFacingUp == 7) {
            for (int i = 0; i < 4; i++) {
                if (this.cubeToSolve.oneCenterSide[0][0] == 'y') {
                    break;
                }
                this.cubeToSolve.rotateY();
            }
            this.performSune();
            amountOfYellowFacingUp--;
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


        //Permute Yellow Corners
        if(!checkCPLLSolved()) {
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
        if (this.checkSolved()) {
            return;
        }
        //Permute Yellow Edges
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
                }
                else  {
                    throw new IllegalStateException("Invalid Cube State of EPLL");
                }
            }
            this.cubeToSolve.rotateY();
        }
        if(cubeToSolve.oneCenterSide[0][1] == cubeToSolve.threeCenterSide[0][0] && cubeToSolve.twoCenterSide[0][1] == cubeToSolve.fourCenterSide[0][0]) {
            this.performHPerm();
        }
        if(cubeToSolve.oneCenterSide[0][1] == cubeToSolve.twoCenterSide[0][0] && cubeToSolve.threeCenterSide[0][1] == cubeToSolve.fourCenterSide[0][0]){
            this.cubeToSolve.rotateYi();
            this.performZPerm();
        }
        if(cubeToSolve.oneCenterSide[0][1] == cubeToSolve.fourCenterSide[0][0] && cubeToSolve.twoCenterSide[0][1] == cubeToSolve.threeCenterSide[0][0]){
            this.performZPerm();
        }
        while (!this.checkSolved()) {
            this.cubeToSolve.turnU();
        }
    }
}
