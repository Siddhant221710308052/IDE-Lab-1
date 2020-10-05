import java.awt.*; 
import java.applet.*; 
import java.awt.event.*; 
//<applet code=applet1 width=200 height=200> 
//</applet> 
 
public class applet1 extends Applet implements ActionListener 
{ 
 Label l1,l2,l3; 
 Button b1,b2;  
TextField t1,t2,t3;
  public void init() 
 { 
  setLayout(new GridLayout(4,2,10,10));
   setBackground(Color.yellow);   
l1=new Label("value of a");   
l2=new Label("value of b");   
l3=new Label("RESULT");   
t1=new TextField(10);   
t2=new TextField(10);   
t3=new TextField(10);   
b1=new Button("ADD");   
b2=new Button("CLEAR"); 
 add(l1);   
add(t1);   
add(l2);   
add(t2);   
add(l3);   
add(t3);   
add(b1);   
add(b2);   
b1.addActionListener(this);   
b2.addActionListener(this); 
  setVisible(true); 
 } 
 public void actionPerformed(ActionEvent ae) 
 { 
  if(ae.getSource()==b1)  //if(ae.getActionCommand()=="ADD") 
  { 
   int a=Integer.parseInt(t1.getText());    
int b=Integer.parseInt(t2.getText()); 
   int res=a+b;    
String s=" "+res;    
t3.setText(s); 
  } 
  if(ae.getSource()==b2)  //if(ae.getActionCommand()=="CLEAR") 
  {  
  t1.setText(""); 
   t2.setText("");   
 t3.setText("");    
t1.requestFocus(); 
  } 
} 
public void paint(Graphics g) 
 { 
  showStatus("this is addition pgm in applets"); 
 } 
} 
 