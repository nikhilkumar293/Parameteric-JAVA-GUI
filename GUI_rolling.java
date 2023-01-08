package Parameteric_GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*; 
class MyFrame
    extends JFrame
    implements ActionListener {
  
    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel a;
    private JTextField ta;
    private JLabel B;
    private JTextField tB;
    private JLabel GM;
    private JTextField tGM;
    private JLabel S;
    private JTextField tS;
    private JLabel Gmax;
    private JTextField tGmax;
    private JLabel Gmin;
    private JTextField tGmin;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JTextArea tout1;
    private JTextArea tout2;
    private JTextArea tout3;
    private JTextArea tout4;
    private JLabel res;
 
  
    // constructor, to initialize the components
    // with default values.
    public MyFrame()
    {
        setTitle("WELCOME TO CALCULATE THE SUSCEPTIBILITY CRITERIA FOR SHIP");
        setBounds(300, 90, 1200, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
  
        c = getContentPane();
        c.setLayout(null);
  
        title = new JLabel("WELCOME TO CALCULATE THE SUSCEPTIBILITY CRITERIA FOR SHIP");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(1100, 30);
        title.setLocation(50, 30);
        c.add(title);
  
        a = new JLabel("Please enter your length of wave(m)");
        a.setFont(new Font("Arial", Font.PLAIN, 20));
        a.setSize(470, 20);
        a.setLocation(100, 100);
        c.add(a);
  
        ta = new JTextField();
        ta.setFont(new Font("Arial", Font.PLAIN, 15));
        ta.setSize(150, 20);
        ta.setLocation(490, 100);
        c.add(ta);
  
        B = new JLabel("Please enter your beam of the ship(m)");
        B.setFont(new Font("Arial", Font.PLAIN, 20));
        B.setSize(470, 20);
        B.setLocation(100, 150);
        c.add(B);
  
        tB = new JTextField();
        tB.setFont(new Font("Arial", Font.PLAIN, 15));
        tB.setSize(150, 20);
        tB.setLocation(490, 150);
        c.add(tB);
  
        GM = new JLabel("Please enter the GM value in calm water ");
        GM.setFont(new Font("Arial", Font.PLAIN, 20));
        GM.setSize(470, 20);
        GM.setLocation(100, 200);
        c.add(GM);
  
        tGM = new JTextField();
        tGM.setFont(new Font("Arial", Font.PLAIN, 15));
        tGM.setSize(150, 20);
        tGM.setLocation(490, 200);
        c.add(tGM);
        
        S = new JLabel("please enter your service speed");
        S.setFont(new Font("Arial", Font.PLAIN, 20));
        S.setSize(470, 20);
        S.setLocation(100, 250);
        c.add(S);
  
        tS = new JTextField();
        tS.setFont(new Font("Arial", Font.PLAIN, 15));
        tS.setSize(150, 20);
        tS.setLocation(490, 250);
        c.add(tS);
        
        Gmax = new JLabel("Please give GMax value");
        Gmax.setFont(new Font("Arial", Font.PLAIN, 20));
        Gmax.setSize(470, 20);
        Gmax.setLocation(100, 300);
        c.add(Gmax);
  
        tGmax = new JTextField();
        tGmax.setFont(new Font("Arial", Font.PLAIN, 15));
        tGmax.setSize(150, 20);
        tGmax.setLocation(490, 300);
        c.add(tGmax);
        
        Gmin = new JLabel("Please give GMin value");
        Gmin.setFont(new Font("Arial", Font.PLAIN, 20));
        Gmin.setSize(470, 20);
        Gmin.setLocation(100, 350);
        c.add(Gmin);
  
        tGmin = new JTextField();
        tGmin.setFont(new Font("Arial", Font.PLAIN, 15));
        tGmin.setSize(150, 20);
        tGmin.setLocation(490, 350);
        c.add(tGmin);
  
        term = new JCheckBox("Confirmation of the values.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 400);
        c.add(term);
  
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);
  
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);
  
        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(400, 110);
        tout.setLocation(660, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);
        
        tout1 = new JTextArea();
        tout1.setFont(new Font("Arial", Font.PLAIN, 15));
        tout1.setSize(400, 30);
        tout1.setLocation(660, 210);
        tout1.setLineWrap(true);
        tout1.setEditable(false);
        c.add(tout1);
        
        tout2 = new JTextArea();
        tout2.setFont(new Font("Arial", Font.PLAIN, 15));
        tout2.setSize(400, 30);
        tout2.setLocation(660, 240);
        tout2.setLineWrap(true);
        tout2.setEditable(false);
        c.add(tout2);
        
        tout3 = new JTextArea();
        tout3.setFont(new Font("Arial", Font.PLAIN, 15));
        tout3.setSize(400, 40);
        tout3.setLocation(660, 270);
        tout3.setLineWrap(true);
        tout3.setEditable(false);
        c.add(tout3);
        
        tout4 = new JTextArea();
        tout4.setFont(new Font("Arial", Font.PLAIN, 15));
        tout4.setSize(400, 80);
        tout4.setLocation(660, 310);
        tout4.setLineWrap(true);
        tout4.setEditable(false);
        c.add(tout4);
        
  
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        c.add(res);
  
        setVisible(true);
    }
  
    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
            	String data1;
            	data1=ta.getText();
            	double a;
            	a=Double.parseDouble(data1);
            	double T=0.8*Math.sqrt(a);;
            	data1 = Double.toString(T);
            	data1=String.format("%.3f", T);
            	String data2;
            	double w;
       		    w=(2*3.14)/T;
            	data2 = Double.toString(w);
            	data2=String.format("%.3f", w);
            	String data3;
            	String data4;
            	data3=tGmax.getText();
            	double Gmax;
            	Gmax=Double.parseDouble(data3);
            	data4=tGmin.getText();
            	double Gmin;
            	Gmin=Double.parseDouble(data4);
            	double b;
       		    b=0.5*(Gmax-Gmin);
       		    data3=Double.toString(b);
       		    data3=String.format("%.3f", b);
       		    double c;
    		    c=0.5*(Gmax+Gmin);
       		    data4=Double.toString(c);
       		    data4=String.format("%.3f", c);
       		    String data5;
       		    data5=tB.getText();
       		    double B;
       		    B=Double.parseDouble(data5);
       		    double d;
    		    d=(7.85*Math.sqrt(b))/B;
    		    data5=Double.toString(d);
    		    data5=String.format("%.3f", d);
    		    String data6;
    		    double E;
    			 E=(7.85*Math.sqrt(c))/B;
    			 data6=Double.toString(E);
    			 data6=String.format("%.3f", E);
                tout.setText("Period of wave is "+data1+ "\n"+"Wave Frequency is "+data2+"\n"+"Change of GM is "+data3+"\n"+"Mean of GM is "+data4+"\n"+"Natural roll frequency to change in GM :"+data5+"\n"+"Natural roll frequency to Mean change in GM :"+data6);
                int h = 0;
       		    if(w>(2*E))
       		     {
       		    	tout1.setText("expected from FOLLOWING SEAS"+ "\n");   
       		     }
       		     if(w<(2*E))
       		     {
       		    	tout1.setText("expected from HEAD SEAS"+ "\n");
       			 h=1;
       		     }
                
                String data7;
      		     data7=tS.getText();
      		    double S;
      		    S=Double.parseDouble(data7);
                double v;
       		    double F=0;
       		    v=19.06*(Math.abs((2*E)-w))/(w*w);
       		    if(v<S)
       		    {
       			 F=v;
       			tout2.setText("Wave frequency is "+String.format("%.3f", w)+ "\n");
       			 
       		    }
       		    if(v>S)
       		    {
       		 	 F=S;
       			 w=Math.sqrt(61.61/a);
       			tout2.setText("Wave frequency is "+String.format("%.3f", w)+ "\n");
       		    }
       		 double I=0;
    		 String data8;
    		 data8="Assumed linear roll damping coefficient is 0.03";
    		 if(h==1)
    		 {
    			I=w+((0.0524*F)*(w*w)); 
    			tout3.setText("Encounter frequency is "+String.format("%.3f", I)+ "\n"+data8);
    		 }
    		 if(h==0)
    		 {
    			I=w-((0.0524*F)*(w*w)); 
    			tout3.setText("Encounter frequency is "+String.format("%.3f", I)+ "\n"+data8);
    		 }
    		 String data9;
    		 data9=tGM.getText();
         	 double GM;
         	 GM=Double.parseDouble(data9);
    		 double J,P,Q;
    		 J=(7.854*Math.sqrt(GM))/B;
    		 P=((E*E)-((0.03*J)*(0.03*J))/(I*I));
    		 Q=(d*d)/(I*I);
    		 if(0.25-(0.5*Q)-(0.125*(Q*Q))+(0.03125*(Q*Q*Q))-((Q*Q*Q*Q)/384)<=P&&P<=(0.25+(0.5*Q)))
    		 {
    			 tout4.setText("Your P value is "+String.format("%.3f", P)+"\n"+"Your Q value is "+String.format("%.3f", Q)+"\n"+"Your Ship is NOT susceptible to parametric roll"+"\n"+"press reset to enter again"+"\n"); 	
    			 
    		 }
    		 else
    		 {
    			 tout4.setText("Your P value is "+String.format("%.3f", P)+"\n"+"Your Q value is "+String.format("%.3f", Q)+"\n"+"Your Ship is NOT susceptible to parametric roll"+"\n"+"press reset to enter again"+"\n"); 
    		 }
    		 
       		 tout.setEditable(false);
             res.setText("You have entered the data Successfully..");
            }
            else {
                tout.setText("");
                res.setText("Please accept the"
                            + " terms & conditions..");
            }
        }
  
        else if (e.getSource() == reset) {
            String def = "";
            ta.setText(def);
            tB.setText(def);
            tGM.setText(def);
            tS.setText(def);
            tGmax.setText(def);
            tGmin.setText(def);
            res.setText(def);
            tout.setText(def);
            tout1.setText(def);
            tout2.setText(def);
            tout3.setText(def);
            tout4.setText(def);
            term.setSelected(false);
        }
    }
}
  
// Driver Code
class GUI_rolling {
  
    public static void main(String[] args) throws Exception
    {
        MyFrame f = new MyFrame();
    }
}

