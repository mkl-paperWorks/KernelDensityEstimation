import java.util.ArrayList;

import processing.core.PApplet;


/**
 * 使用Processing绘图
 */
public class Drawer extends PApplet{
	
	public void setup()
	{
		size(800, 600);
		
		noLoop();
	}
	
	public void draw()
	{
		background(255);
		noStroke();
	}
	
	/**
	 * 鼠标点击时才运行算法
	 */
	public void mouseClicked()
	{
		
	}
	
	public static void main(String args[])
	{
		PApplet.runSketch(new String[]{"k means cluster method"}, new Drawer());
	}
}
