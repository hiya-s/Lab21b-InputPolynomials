

	import java.util.*;
	import java.awt.*; //for graphics stuff

	public class InputPolygons
	{
		public static void main(String[] args)
		{
			int height = 500, width = 500;
			
			StdDraw.setCanvasSize(width, height); //set the size / scale of the drawing window
			StdDraw.setXscale(0, width);
			StdDraw.setYscale(0, height);

			//add your code below
			Random random = new Random();
			
			int red =  random.nextInt(256);
			int green = random.nextInt(256);
			int blue = random.nextInt(256);
			
			StdDraw.setPenColor(red, green, blue);
			
			//2
			double dx = random.nextDouble()*150;
			double dy =  random.nextDouble()*150;
			while(true) {
		
			StdDraw.clear();
			double x[] = {40+dx,10 + dx,90 + dx};
			double y [] = {90+dy,20+dy,20+dy};
			
			red =  random.nextInt(256);
			green = random.nextInt(256);
			blue = random.nextInt(256);
			StdDraw.setPenColor(red, green, blue);
			
			StdDraw.filledPolygon(x,y);
			StdDraw.pause(100);
			dx = random.nextDouble()*150;
			dy =  random.nextDouble()*150;
			}
			
			
			
			
			//3
			/*for(int i =0; i<2000; i++) {
			StdDraw.clear();
			double side = 78;
			double height1 = side * Math.pow(3,1/2)/2;
			StdDraw.setPenColor(0,0,255);
			double mouseY = StdDraw.mouseY();
			double mouseX = StdDraw.mouseX();
			//double x1[] = {140,220,180};
			//double y1 [] = {140,140,(140 + 40 * Math.pow(3,1/2))};
			double x1[] = {mouseX, mouseX - side/2, mouseX + side/2};
			double y1[] = {mouseY + height/2, mouseY - height/2, mouseY - height/2};
			StdDraw.filledPolygon(x1,y1);
			StdDraw.pause(120);
		
			}
			*/
			
		/*	//4
			double h = 76;
			double w = 50;
			
			double dx = 25;
			double dy = 25;
			StdDraw.setPenColor(Color.blue);
			
			for(int i =0; i<2000; i++) {
				StdDraw.clear();
				if(StdDraw.isKeyPressed(37)){
					dx = dx-10;
				}
				if(StdDraw.isKeyPressed(39)){
					dx = dx+10;
				}
				if(StdDraw.isKeyPressed(40)){
					dy = dy-10;
				}
				if(StdDraw.isKeyPressed(38)){
					dy = dy+10;
				}
				double [] x = {dx , dx-w/2, dx, dx +w/2};
				double [] y = {dy +h/2 , dy, dy -h/2, dy};
				StdDraw.filledPolygon(x,y);
				StdDraw.pause(120);
			}
			*/
			
			/*//5
			double groundY = 60;
			
			double speed = 0;
			double gravity = 2;
			
			double origX = width/2;
			double origY = groundY;
			
			for (int i =0;i<2000; i++) {
				StdDraw.clear();
				StdDraw.setPenColor(255,0,0);
				StdDraw.line(0, groundY, width, groundY);
				
				origY = speed + origY;
				speed -= gravity;
				
				if(origY < groundY) {
					origY = groundY;
					speed =0;
				}
				
				if(StdDraw.isKeyPressed(32)&& origY ==groundY) {
					speed = 20;
				}
				double x[] = {origX, origX - 25, origX + 25};
				double y[] = {origY +43, origY, origY};
				StdDraw.setPenColor(0,255,0);
				StdDraw.filledPolygon(x,y);
				
			}
			
			*/		
		}
	}

