import java.util.ArrayList;

import processing.core.PApplet;


/**
 * ʹ��Processing��ͼ
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
	 * �����ʱ�������㷨
	 */
	public void mouseClicked()
	{
		
	}
	
	public static void main(String args[])
	{
		PApplet.runSketch(new String[]{"k means cluster method"}, new Drawer());
	}
}
