import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage; 
import java.awt.event.*; 


public class Game  extends JPanel implements Runnable, KeyListener, MouseListener, MouseMotionListener{

	
	private BufferedImage back; 
	private int key;
	private ImageIcon butterfly;
	private ImageIcon kitten;
	private ImageIcon car;
	private ImageIcon penguin;
	private Color newcolor;
	private Pieces i;
	private Player p;
	private ImageIcon image1;
	private ImageIcon image2;
	private ImageIcon image3;
	private ImageIcon image4;
	private ImageIcon image5;
	private ImageIcon image6;
	private ImageIcon image7;
	private ImageIcon image8;
	private ImageIcon image9;
	private ImageIcon banner;

	private boolean dragging;
	private boolean dragImage1;
	private boolean dragImage2;
	private boolean dragImage3;
	private boolean dragImage4;
	private boolean dragImage5;
	private boolean dragImage6;
	private boolean dragImage7;
	private boolean dragImage8;
	private boolean dragImage9;
	int x1, y1;  
    int x2, y2; 
    int x3, y3;
    int x4, y4;
    int x5, y5;
    int x6, y6;
    int x7, y7;
    int x8, y8;
    int x9, y9;
    int offsetX, offsetY;
    private boolean z;
   
	
	
	
	
	public Game() {
		new Thread(this).start();	
		this.addKeyListener(this);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		key =-1; 
		i= new Pieces();
		p= new Player();
		newcolor= new Color (207, 250, 244);
		butterfly=new ImageIcon("butterfly.jpeg");
		kitten= new ImageIcon ("kitten.jpeg");
		car= new ImageIcon ("redcar.jpg");
		penguin= new ImageIcon ("penguin.jpeg");
		banner= new ImageIcon ("banner.png");
		image1= new ImageIcon(i.getImage1());
		image2= new ImageIcon(i.getImage2());
		image3= new ImageIcon(i.getImage3());
		image4= new ImageIcon(i.getImage4());
		image5= new ImageIcon(i.getImage5());
		image6= new ImageIcon(i.getImage6());
		image7= new ImageIcon(i.getImage7());
		image8= new ImageIcon(i.getImage8());
		image9= new ImageIcon(i.getImage9());

		
		x8 = 730;
        y8 = 150;
        x4 = 900;
        y4 = 150;
        x6 = 1070;
        y6 = 150;
        x3 = 730;
        y3 = 320;
        x9 = 900;
        y9 = 320;
        x5 = 1070;
        y5 = 320;
        x2 = 730;
        y2 = 490;
        x7 = 900;
        y7 = 490;
		x1 = 1070;  
        y1 = 490;
         z=false;
        
        
        
	
		
		
	
		
		
	}
	
	public void run()
	   {
	   	try
	   	{
	   		while(true)
	   		{
	   		   Thread.currentThread().sleep(5);
	            repaint();
	         }
	      }
	   		catch(Exception e)
	      {
	      }
	  	}
	

	

	
	
	
	public void paint(Graphics g){
		
		Graphics2D twoDgraph = (Graphics2D) g; 
		if( back ==null)
			back=(BufferedImage)( (createImage(getWidth(), getHeight()))); 
		

		Graphics g2d = back.createGraphics();
	
		g2d.clearRect(0,0,getSize().width, getSize().height);
		
		//g2d.drawImage(background.getImage(), 0, 0, getSize().width, getSize().height, this);
		Color start= new Color(250, 207, 213);
		g2d.setColor(start);
		g2d.setFont(new Font("Comic Sans", Font.BOLD, 50));
		g2d.drawString("Choose Your Favorite Image!", 350, 50);
		g2d.drawImage(butterfly.getImage(), 100,100, 300, 300, this);
		g2d.drawImage(kitten.getImage(), 1000,100, 300, 300, this);
		g2d.drawImage(car.getImage(), 100,450, 300, 300, this);
		g2d.drawImage(penguin.getImage(), 1000,450, 300, 300, this);
		Color start2= new Color(116, 120, 117);
		g2d.setColor(start2);
		g2d.setFont(new Font("Comic Sans", Font.BOLD, 35));
		g2d.drawString("Press B for", 420, 220);
		g2d.drawString("Butterfly", 420, 250);
		g2d.drawString("Press K for",780 , 220);
		g2d.drawString("Kitten", 780, 250);
		g2d.drawString("Press C for", 420, 590);
		g2d.drawString("Car", 420, 620);
		g2d.drawString("Press P for", 780, 590);
		g2d.drawString("Penguin", 780, 620);
		
		
		if(z==true) {
			
		
		g2d.setColor(newcolor);
		g2d.fillRect(0, 0, 1400, 1200);
		g2d.setColor(start2);
		g2d.setFont(new Font("Comic Sans", Font.BOLD, 50));
		g2d.drawString("Click and drag the pieces!", 350, 80);
		g2d.setColor(Color.BLACK);
		g2d.drawLine(90, 150, 540, 150);
		g2d.drawLine(90, 600, 540, 600);
		g2d.drawLine(90, 150, 90, 600);
		g2d.drawLine(540, 150, 540, 600);
		g2d.drawLine(240, 150, 240, 600);
		g2d.drawLine(390, 150, 390, 600);
		g2d.drawLine(90, 300, 540, 300);
		g2d.drawLine(90, 450, 540, 450);
		
		g2d.drawImage(image1.getImage(),x1, y1,150, 150, this);
		g2d.drawImage(image2.getImage(),x2, y2,150, 150, this);
		g2d.drawImage(image3.getImage(),x3, y3,150, 150, this);
		g2d.drawImage(image4.getImage(),x4, y4,150, 150, this);
		g2d.drawImage(image5.getImage(),x5, y5,150, 150, this);
		g2d.drawImage(image6.getImage(),x6, y6,150, 150, this);
		g2d.drawImage(image7.getImage(),x7, y7,150, 150, this);
		g2d.drawImage(image8.getImage(),x8, y8,150, 150, this);
		g2d.drawImage(image9.getImage(),x9, y9,150, 150, this);
		}
		
		
		if(x1>=80 && x1<=100 && y1>=140 && y1<=160) {
			if(dragging==false) {
				x1=90;
				y1=150;
				
			}
		}
		if(x2>=230 && x2<=250 && y2>=140 && y2<=160) {
			if(dragging==false) {
				x2=240;
				y2=150;
				
			}
		}
		if(x3>=380 && x3<=400 && y3>=140 && y3<=160) {
			if(dragging==false) {
				x3=390;
				y3=150;
				
			}
		}
		if(x4>=80 && x4<=100 && y4>=290 && y4<=310) {
			if(dragging==false) {
				x4=90;
				y4=300;
				
			}
		}
		if(x5>=230 && x5<=250 && y5>=290 && y5<=310) {
			if(dragging==false) {
				x5=240;
				y5=300;
				
			}
		}
		if(x6>=380 && x6<=400 && y6>=290 && y6<=310) {
			if(dragging==false) {
				x6=390;
				y6=300;
				
			}
		}
		if(x7>=80 && x7<=100 && y7>=440 && y7<=460) {
			if(dragging==false) {
				x7=90;
				y7=450;
				
			}
		}
		if(x8>=230 && x8<=250 && y8>=440 && y8<=460) {
			if(dragging==false) {
				x8=240;
				y8=450;
				
			}
		}
		if(x9>=380 && x9<=400 && y9>=440 && y9<=460) {
			if(dragging==false) {
				x9=390;
				y9=450;
				
			}
		}
		if(x1==90 && y1==150 && x2==240 && y2==150 && x3==390 && y3==150 && x4==90 && y4==300 && x5==240 && y5==300 && x6==390 && y6==300 && x7==90 && y7==450 && x8==240 && y8==450 && x9==390 && y9==450) {
			g2d.setColor(newcolor);
			g2d.fillRect(0,0,1200,100);
			Color win= new Color(116, 120, 117);
			g2d.setColor(win);
			g2d.setFont(new Font("Comic Sans", Font.BOLD, 100));
			g2d.drawString("Great Job!", 700, 400);
			g2d.setFont(new Font("Comic Sans", Font.BOLD, 50));
			g2d.drawString("Restart to Play Again", 400, 700);	
			g2d.drawImage(banner.getImage(),575, 120,760, 500, this);
			
		}
		
		
		
		
		   
		




		


		g2d.setColor(Color.WHITE);
		g2d.setFont(new Font("Times New Roman", Font.BOLD, 20));
		//g2d.drawString("KEY "+ key, 5, 30);
		
	
			
			

		twoDgraph.drawImage(back, null, 0, 0);

	}
	
@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
	if (dragging == false)  
        return;
      int x = e.getX();  
      int y = e.getY();
      if (dragImage1) {  
         x1 = x- offsetX;  
         y1 = y- offsetY;
      }
      if (dragImage2) {  
          x2 = x- offsetX;  
          y2 = y- offsetY;
       }
      if (dragImage3) {  
          x3 = x- offsetX;  
          y3 = y- offsetY;
       }
      if (dragImage4) {  
          x4 = x- offsetX;  
          y4 = y- offsetY;
       }
      if (dragImage5) {  
          x5 = x- offsetX;  
          y5 = y- offsetY;
       }
      if (dragImage6) {  
          x6 = x- offsetX;  
          y6 = y- offsetY;
       }
      if (dragImage7) {  
          x7 = x- offsetX;  
          y7 = y- offsetY;
       }
      if (dragImage7) {  
          x7 = x- offsetX;  
          y7 = y- offsetY;
       }
      if (dragImage8) {  
          x8 = x- offsetX;  
          y8 = y- offsetY;
       }
      if (dragImage9) {  
          x9 = x- offsetX;  
          y9 = y- offsetY;
       }
   
		
	}



	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}



	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
            
         int x = e.getX();  
         int y = e.getY();
         p.playmusic("click.wav");
         if (x >= x1 && x < x1+150 && y >= y1 && y < y1+150) {
             
         dragging = true;
         dragImage1 = true;
         dragImage2 = false;
         dragImage3 = false;
         dragImage4 = false;
         dragImage5 = false;
         dragImage6 = false;
         dragImage7 = false;
         dragImage8 = false;
         dragImage9 = false;
        offsetX = x - x1;  
         offsetY = y - y1;
      }
         if (x >= x2 && x < x2+150 && y >= y2 && y < y2+150) {
               
            dragging = true;
            dragImage2=true;
            dragImage1 = false;
            dragImage3 = false;
            dragImage4 = false;
            dragImage5 = false;
            dragImage6 = false;
            dragImage7 = false;
            dragImage8 = false;
            dragImage9 = false;
           offsetX = x - x2;  
           offsetY = y - y2;
         }
         
         if (x >= x3 && x < x3+150 && y >= y3 && y < y3+150) {
             
         dragging = true;
         dragImage3 = true;
         dragImage2 = false;
         dragImage1 = false;
         dragImage4 = false;
         dragImage5 = false;
         dragImage6 = false;
         dragImage7 = false;
         dragImage8 = false;
         dragImage9 = false;
        offsetX = x - x3;  
         offsetY = y - y3;
      }
         if (x >= x4 && x < x4+150 && y >= y4 && y < y4+150) {
             
         dragging = true;
         dragImage4 = true;
         dragImage2 = false;
         dragImage1 = false;
         dragImage3 = false;
         dragImage5 = false;
         dragImage6 = false;
         dragImage7 = false;
         dragImage8 = false;
         dragImage9 = false;
        offsetX = x - x4;  
         offsetY = y - y4;
      }
         if (x >= x5 && x < x5+150 && y >= y5 && y < y5+150) {
            
         dragging = true;
         dragImage5 = true;
         dragImage2 = false;
         dragImage1 = false;
         dragImage4 = false;
         dragImage3 = false;
         dragImage6 = false;
         dragImage7 = false;
         dragImage8 = false;
         dragImage9 = false;
        offsetX = x - x5;  
         offsetY = y - y5;
      }
         if (x >= x6 && x < x6+150 && y >= y6 && y < y6+150) {
            
         dragging = true;
         dragImage6 = true;
         dragImage2 = false;
         dragImage1 = false;
         dragImage4 = false;
         dragImage5 = false;
         dragImage3 = false;
         dragImage7 = false;
         dragImage8 = false;
         dragImage9 = false;
        offsetX = x - x6;  
         offsetY = y - y6;
      }
         if (x >= x7 && x < x7+150 && y >= y7 && y < y7+150) {
            
         dragging = true;
         dragImage7 = true;
         dragImage2 = false;
         dragImage1 = false;
         dragImage4 = false;
         dragImage5 = false;
         dragImage6 = false;
         dragImage3 = false;
         dragImage8 = false;
         dragImage9 = false;
        offsetX = x - x7;  
         offsetY = y - y7;
      }
         if (x >= x8 && x < x8+150 && y >= y8 && y < y8+150) {
            
         dragging = true;
         dragImage8 = true;
         dragImage2 = false;
         dragImage1 = false;
         dragImage4 = false;
         dragImage5 = false;
         dragImage6 = false;
         dragImage7 = false;
         dragImage3 = false;
         dragImage9 = false;
        offsetX = x - x8;  
         offsetY = y - y8;
      }
         if (x >= x9 && x < x9+150 && y >= y9 && y < y9+150) {
           
         dragging = true;
         dragImage9 = true;
         dragImage2 = false;
         dragImage1 = false;
         dragImage4 = false;
         dragImage5 = false;
         dragImage6 = false;
         dragImage7 = false;
         dragImage8 = false;
         dragImage3 = false;
        offsetX = x - x9;  
         offsetY = y - y9;
      }
   
	}
	



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		dragging = false;
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}




	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		key= e.getKeyCode();
		System.out.println(key);
		
	if (key==75) {
		p.playmusic("end.wav");
		image1=new ImageIcon("kitten1.jpeg");
		image2=new ImageIcon("kitten2.jpeg");
		image3=new ImageIcon("kitten3.jpeg");
		image4=new ImageIcon("kitten4.jpeg");
		image5=new ImageIcon("kitten5.jpeg");
		image6=new ImageIcon("kitten6.jpeg");
		image7=new ImageIcon("kitten7.jpeg");
		image8=new ImageIcon("kitten8.jpeg");
		image9=new ImageIcon("kitten9.jpeg");
		z=true;
	}
	if (key==66) {
		p.playmusic("end.wav");
		image1=new ImageIcon("butterfly1.png");
		image2=new ImageIcon("butterfly2.png");
		image3=new ImageIcon("butterfly3.png");
		image4=new ImageIcon("butterfly4.png");
		image5=new ImageIcon("butterfly5.png");
		image6=new ImageIcon("butterfly6.png");
		image7=new ImageIcon("butterfly7.png");
		image8=new ImageIcon("butterfly8.png");
		image9=new ImageIcon("butterfly9.png");
		z=true;
	}
	if (key==67) {
		p.playmusic("end.wav");
		image1=new ImageIcon("car1.jpeg");
		image2=new ImageIcon("car2.jpeg");
		image3=new ImageIcon("car3.jpeg");
		image4=new ImageIcon("car4.jpeg");
		image5=new ImageIcon("car5.jpeg");
		image6=new ImageIcon("car6.jpeg");
		image7=new ImageIcon("car7.jpeg");
		image8=new ImageIcon("car8.jpeg");
		image9=new ImageIcon("car9.jpeg");
		z=true;
		
	}
	if (key==80) {
		p.playmusic("end.wav");
		image1=new ImageIcon("penguin1.jpeg");
		image2=new ImageIcon("penguin2.jpeg");
		image3=new ImageIcon("penguin3.jpeg");
		image4=new ImageIcon("penguin4.jpeg");
		image5=new ImageIcon("penguin5.jpeg");
		image6=new ImageIcon("penguin6.jpeg");
		image7=new ImageIcon("penguin7.jpeg");
		image8=new ImageIcon("penguin8.jpeg");
		image9=new ImageIcon("penguin9.jpeg");
		z=true;
	}
		
	
		}
  
	

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
		

	
}

