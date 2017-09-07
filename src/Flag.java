import java.awt.*;
import javax.swing.JFrame;
import java.lang.*;
import java.util.Arrays;
public class Flag extends JFrame {
	private final Color BISQUE = new Color(0xcdb79e);
	//this set the value of length of the flage
	private int length = 1235;
	//this set the value of width of the flag
	private int width = (int)(length/1.9); //equals 650
	
	//Stripes
	//this set the value of Stripes length
	private int Slength = length;
	//this set the value of Stripes width
	private int Swidth = width/13;
	
	//Union
	//this set the value of length of the Union
	private int Ulength = (int)(width *0.76);
	//this set the value of width of the Union
	private	int Uwidth = (int)(width*7/13)+10;
	
	//Stars
	//this set the value of the radius of the star
	private double radius_of_the_star = 0.0616 * width * 0.5;
	//this set the value of the space between each star in x coordiantes  
	private double starspacex = 0.063 * width;
	//this set the value of the space between each star in y corrdiantes
	private double starspacey = 0.054 * width;
	//creates empty arrays
	private int [ ]xpoints = new int[10];
	private int [ ]ypoints = new int[10];
	private int [ ]xxpoints = new int[5];
	private int [ ]yypoints = new int[5];
	private int numberofpoints = 10;
	
	
	public Flag () {
//		for(int z =0; z <10; z++) {
//			if(z%2 ==1) {
//				scale == r;
//			}
//			if(z%2 ==0) {
//				scale *= r;
//			}
//		}
		init();
	}
	


	public void init() {
		//this code is to paint the background and the size of the flag
		setSize(1235,650);
		setBackground(Color.WHITE);
		repaint();
				
	}
	
	public void paint(Graphics g) {
		
		//use for loop to paint the stripes.
		for(int i = 650/26; i < 650; i += 1235/13) {
			
			g.setColor(Color.RED);
			g.fillRect(0,i,Slength,Swidth);
		}
		
		//code to paint the Union
		g.setColor(Color.BLUE);
		g.fillRect(0,0,Ulength,Uwidth);

		//code to paint the stars
		g.setColor(Color.WHITE);
		
		//this paint 50 stars
	
		int x =0;
		int y =(int)(starspacey *0.1);
		for (int number_of_stars = 1; number_of_stars <= 50; number_of_stars++) {
            //Tabs
//			for(int n = 1; n <5 ; n++) {
//				if(number_of_stars - 1*n ==0) {
//					x = (int)starspacex /2;
//					y = y+(int)starspacey;
//				}
//			}
            if (number_of_stars == 1 || number_of_stars==12 ||  number_of_stars==23 || number_of_stars==34 || number_of_stars==45) {
                x = (int)starspacex / 2;
                y = y + (int)starspacey;
            }
            else if (number_of_stars==7 || number_of_stars==18 || number_of_stars==29 || number_of_stars==40) {
                x = (int)(starspacex*1.5);
                y = y + (int)starspacey;
            }

            //this paint 5 Rows of 6 stars
            if ((number_of_stars<=6 && number_of_stars>=1) || (number_of_stars<=17 && number_of_stars>=12) || (number_of_stars<=28 && number_of_stars>=23) || (number_of_stars<=39 && number_of_stars>=34) || (number_of_stars<=50 && number_of_stars>=45)) {
                MakeStars(g, x, y);
                x = x + (int)starspacex * 2;
            }
            //this paint 4 Rows of 5 stars
            if ((number_of_stars<=11 && number_of_stars>=7) || (number_of_stars<=22 && number_of_stars>=18) || (number_of_stars<=33 && number_of_stars>=29) || (number_of_stars<=44 && number_of_stars>=40)){
                MakeStars(g, x, y);
                x = x + (int)starspacex * 2;
            }

        }
		
//		//I was trying to use a loop to draw the star but failed
		
//		for(int z = 0; z <= 9; z++){
//			xpoints[z] = (int)(40*Math.cos((Math.PI/10)*z)+ 0.054*650);
//			ypoints[z] = (int)(40*Math.sin((Math.PI/10)*z)+ 0.063*1235);
//		}
//		g.fillPolygon(xpoints,ypoints,numberofpoints);
		
		
//		for(int z = 0; z <= 9; z++){
		
//			xxpoints[z] = (int)(10*Math.cos((Math.PI/(5+1/10))*z)+ 0.063*1235);
//			yypoints[z] = (int)(10*Math.sin((Math.PI/(5+1/10))*z)+ 0.054*650);
//		}
//		int resultArray[] = ArraysUtils.addAll(xpoints,xxpoints);
		
//		System.out.println(Arrays.toString(xpoints));
//		System.out.println(Arrays.toString(ypoints));
//		System.out.println(Math.cos((Math.PI/5)));
		
		
		//these code is just for me when practicing how to draw a polygon
//		int a[] = {140,160,180,400};
//		int b[] = {160,150,140,500};
//		g.setColor(Color.BLACK);
//		g.fillPolygon(a,b,4);
//		
//		int x[]  = {20, 35, 50, 65, 80, 95};
//		int y[]  = {60, 105, 105, 110, 95, 95};
//		g.fillPolygon(x,y,6);
//		System.out.println(x);
//		System.out.println(y);	
	} 
	private void MakeStars(Graphics g, int x, int y) {

        int starradius = (int)(this.radius_of_the_star *3/5);
        //Making 10 points
        int[] xpoints = {x, x + (int)(1* starradius), x + (int)(1.309* starradius), x + (int)(1.618* starradius), x + (int)(2.618* starradius), x + (int)(1.809* starradius), x + (int)(2.118* starradius), x + (int)(1.309* starradius), x + (int)(0.5* starradius), x + (int)(0.809* starradius)};
        int[] ypoints = {y + (int)(0.9511 * starradius), y + (int)(0.9511* starradius), y, y + (int)(0.9511* starradius), y + (int)(0.9511* starradius), y + (int)(1.5388* starradius), y + (int)(2.4899* starradius), y + (int)(1.9021* starradius), y + (int)(2.4899* starradius), y + (int)(1.5388* starradius)};

        g.setColor(Color.WHITE);
        g.fillPolygon(xpoints, ypoints, numberofpoints);

    }
}

//(E the space between the Union and the first star) 0.054
//(F) 0.054
//(G the space between the Union and the first star) 0.063
//(H) 0.063
//Diameter of star (K) 0.0616

//The space between the first star¡¯s center and the height of the width.(e) 0.054 
//The space between each star¡¯s center. Vertically (f) 0.054
//The space between the first star¡¯s center and the height of the length(h) 0.063
//The space between each star¡¯s center  Horizontally(j) 0.063
//Diameter of star (K) 0.0616





//
//
//
//private	double e = 650* 54/1000;
////The space between each star¡¯s center.Vertically (f) 0.054
//private double f = 1235 * 54/1000;
////The space between the first star¡¯s center and the height of the length(h) 0.063
//private double h = 1235 * 63/1000;
////The space between each star¡¯s center. Horizontally(j) 0.063
//private double j = 650 * 63/1000;
////Diameter of star (K)
//private double k = 616/1000;

