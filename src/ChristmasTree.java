
/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    
 ******************************************************************************/

import java.awt.Point;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.jointheleague.graphical.robot.Robot;


public class ChristmasTree {

	Robot rob  = new Robot("batman");
	
    public static void main(String[] args) {
        ChristmasTree ohChristmasTree = new ChristmasTree();
        ohChristmasTree.drawStar();
        ohChristmasTree.drawTreeBody();
        ohChristmasTree.drawTreeTrunk();
    }


    double treeWidth = 15;
    double scale = 1.1;    //This is how much the width of the tree increases with each layer down



    void drawTreeBody() {
        // 8. Change the color of the line the robot draws to forest green    
rob.setPenColor(0, 150, 0);
rob.penDown();
        // 1. Make a variable for turnAmount and set it to 175
int turnAmount= 175;

        // 2. Start the Robot facing to the right


        // 5. Repeat steps 3 through 11, 11 times
rob.setSpeed(200);
rob.penUp();
rob.penDown();
for (int i = 0; i < 11; i++) {
rob.setAngle(90);
rob.move((int) treeWidth);


            // 3. Move the robot the width of the tree
 
            // 4. Turn the robot the current turnAmount to the right
rob.turn(turnAmount);
            // 6. Set the treeWidth to the current treeWidth times the scale
   treeWidth=treeWidth*scale;
            // 7. Move the robot the width of a tree again
rob.move((int)treeWidth);
            // 9. Turn the robot the current turn amount to the LEFT
 rob.turn(-turnAmount);   
            // 10. Set the treeWidth to the current treeWidth times the scale again
 treeWidth=treeWidth*scale;   
            // 11. Decrease turnAmount by 1
 turnAmount= turnAmount-1;
}
}
    
    private Object turn(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	void drawTreeTrunk() {
        // 1. Move the robot half the width of the tree
rob.move((int) (treeWidth/2));

        // 2. Change the robot so that it is pointing straight down
rob.setAngle(180);

        // 4. Set the pen width to the tree width divided by 10
rob.setPenWidth((int) (treeWidth/10));

        // 5. Change the color of the line the robot draws to brown
rob.setPenColor(56, 36, 36);

        // 3. Move the robot a quarter the tree width
rob.move((int) (treeWidth/4));

    }
    
    void drawStar() {
    	rob.penDown();
    	rob.setSpeed(100);
    	for (int i = 0; i < 5; i++) { 
    rob.move(50);
   rob.turn(144);
    	}
    }

	private void setspeed(int i) {
		// TODO Auto-generated method stub
		
	}


}

