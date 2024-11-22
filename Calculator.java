import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

/*<applet code="Calculator.class" width="700" height="700">
</applet>*/

public class Calculator extends Applet implements ActionListener
{
Color r1,r2,r3;
Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w;
TextField z;
double a4,b4,c4;
char op;

public void init()
{
setLayout(null);
a=new Button("ABS");
b=new Button("Backspace");
c=new Button("Clear");
d=new Button("7");
e=new Button("8");
f=new Button("9");
g=new Button("+");
h=new Button("%");
i=new Button("4");
j=new Button("5");
k=new Button("6");
l=new Button("-");
m=new Button("=");
n=new Button("1");
o=new Button("2");
p=new Button("3");
q=new Button("*");
r=new Button("SQRT");
s=new Button("0");
t=new Button(".");
u=new Button("+/-");
v=new Button("/");
w=new Button("1/x");

z=new TextField(60);

add(a);
add(b);
add(c);
add(d);
add(e);
add(f);
add(g);
add(h);
add(i);
add(j);
add(k);
add(l);
add(m);
add(n);
add(o);
add(p);
add(q);
add(r);
add(s);
add(t);
add(u);
add(v);
add(w);
add(z);

a.setBounds(100,200,100,50);
b.setBounds(250,200,150,50);
c.setBounds(450,200,120,50);

d.setBounds(50,300,100,50);
e.setBounds(180,300,100,50);
f.setBounds(310,300,100,50);
g.setBounds(440,300,100,50);
h.setBounds(570,300,100,50);

i.setBounds(50,400,100,50);
j.setBounds(180,400,100,50);
k.setBounds(310,400,100,50);
l.setBounds(440,400,100,50);
m.setBounds(570,400,100,50);

n.setBounds(50,500,100,50);
o.setBounds(180,500,100,50);
p.setBounds(310,500,100,50);
q.setBounds(440,500,100,50);
r.setBounds(570,500,100,50);

s.setBounds(50,600,100,50);
t.setBounds(180,600,100,50);
u.setBounds(310,600,100,50);
v.setBounds(440,600,100,50);
w.setBounds(570,600,100,50);

z.setBounds(50,50,600,100);

a.addActionListener(this);
b.addActionListener(this);
c.addActionListener(this);
d.addActionListener(this);
e.addActionListener(this);
f.addActionListener(this);
g.addActionListener(this);
h.addActionListener(this);
i.addActionListener(this);
j.addActionListener(this);
k.addActionListener(this);
l.addActionListener(this);
m.addActionListener(this);
n.addActionListener(this);
o.addActionListener(this);
p.addActionListener(this);
q.addActionListener(this);
r.addActionListener(this);
s.addActionListener(this);
t.addActionListener(this);
u.addActionListener(this);
v.addActionListener(this);
w.addActionListener(this);

}//init()

public void actionPerformed(ActionEvent e1)
{
String s1=e1.getActionCommand();

if(s1.equals("1"))
{
String s4=z.getText().concat("1");
z.setText(s4);
}

if(s1.equals("2"))
{
String s4=z.getText().concat("2");
z.setText(s4);
}

if(s1.equals("3"))
{
String s4=z.getText().concat("3");
z.setText(s4);
}

if(s1.equals("4"))
{
String s4=z.getText().concat("4");
z.setText(s4);
}


if(s1.equals("5"))
{
String s4=z.getText().concat("5");
z.setText(s4);
}

if(s1.equals("6"))
{
String s4=z.getText().concat("6");
z.setText(s4);
}


if(s1.equals("7"))
{
String s4=z.getText().concat("7");
z.setText(s4);
}


if(s1.equals("8"))
{
String s4=z.getText().concat("8");
z.setText(s4);
}


if(s1.equals("9"))
{
String s4=z.getText().concat("9");
z.setText(s4);
}

if(s1.equals("."))
{
String s4=z.getText().concat(".");
z.setText(s4);
}


if(s1.equals("0"))
{
String s4=z.getText().concat("0");
z.setText(s4);
}


if(s1.equals("Clear"))
{
z.setText("");
}


if(s1.equals("+"))
{
a4=Double.parseDouble(z.getText());
z.setText("");
op='+';
}


if(s1.equals("-"))
{
a4=Double.parseDouble(z.getText());
z.setText("");
op='-';
}


if(s1.equals("*"))
{
a4=Double.parseDouble(z.getText());
z.setText("");
op='*';
}


if(s1.equals("/"))
{
a4=Double.parseDouble(z.getText());
z.setText("");
op='/';
}


if(s1.equals("%"))
{
a4=Double.parseDouble(z.getText());
z.setText("");
op='%';
}


if(s1.equals("="))
{
b4=Double.parseDouble(z.getText());
z.setText("");

switch(op)
{
case '+':
c4=a4+b4;
z.setText(""+c4);
break;
case '-':
c4=a4-b4;
z.setText(""+c4);
break;
case '*':
c4=a4*b4;
z.setText(""+c4);
break;
case '/':
c4=a4/b4;
z.setText(""+c4);
break;
case '%':
c4=a4%b4;
z.setText(""+c4);
break;
}//switch
}//if =

if(s1.equals("SQRT"))
{
a4=Double.parseDouble(z.getText());
b4=Math.sqrt(a4);
z.setText(""+b4);
}

if(s1.equals("1/x"))
{
a4=Double.parseDouble(z.getText());
b4=1.0/a4;
z.setText(""+b4);
}

if(s1.equals("+/-"))
{
a4=Double.parseDouble(z.getText());
b4=-1.0*a4;
z.setText(""+b4);
}

if(s1.equals("ABS"))
{
a4=Double.parseDouble(z.getText());
b4=Math.abs(a4);
z.setText(""+b4);
}

if(s1.equals("Backspace"))
{
int a4=Integer.parseInt(z.getText());
int b4=a4/10;
z.setText(""+b4);
}
}//action

public void paint(Graphics g)
{
setBackground(r1);
setForeground(r3);
}

}//class