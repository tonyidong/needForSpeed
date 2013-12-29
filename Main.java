package needForSpeed;

import java.util.LinkedList;

import sedgewick.StdDraw;

public class Main {

	public static void main(String[] args) {
		// FIXME Auto-generated method stub
		int rows = 40;
		int cols = 40;
		Arena arena = new Arena(rows, cols);
		Self self = new Self(2, cols/2, arena);
		int score = 0;
		StdDraw.setCanvasSize(500, 500);
		LinkedList<Opponent> opponents = new LinkedList<Opponent>();
		
		while(true){
			arena.draw();
			self.drawMyself();
			if(Math.random() < 0.05){
				int theCol = (int)(Math.random()*cols);
				Opponent newOpponent = new Opponent(20, 7, arena);
				opponents.add(newOpponent);
			}
			for(Opponent x: opponents){
				x.drawItself();
				x.moveDownAuto();
			}
			
			StdDraw.show(50);
			StdDraw.clear();
		}

	}

}
