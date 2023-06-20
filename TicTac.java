import java.awt.*;
import java.awt.event.*;


class myButton extends Button
{
    myButton(String l)
    {
        super(l);
        this.setBackground(Color.RED);
        this.setFont(new Font("Arial", Font.BOLD, 80));
        this.setForeground(Color.YELLOW);
    }
}

class TicTac extends Frame implements ActionListener
{

    TextField tf1, tf2, tf3, tf4;
    myButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button reset;
    int click=0;
    int i;
    int win1=0, win2=0, lose1=0, lose2=0;

    TicTac()
    {
        setLayout(null);
        Label lb1 = new Label("Player:-");
        Label lb2 = new Label("Symbol:-");
        Label lb3 = new Label("P1:-");
        Label lb4 = new Label("P2:-");

        tf1 = new TextField(3);
        tf2 = new TextField(1);
        tf3 = new TextField(3);
        tf4 = new TextField(3);

        btn1 = new myButton("");
        btn2 = new myButton("");
        btn3 = new myButton("");
        btn4 = new myButton("");
        btn5 = new myButton("");
        btn6 = new myButton("");
        btn7 = new myButton("");
        btn8 = new myButton("");
        btn9 = new myButton("");

        Button reset = new Button("RESET");
        reset.setBackground(Color.yellow);
        reset.setForeground(Color.red);

        tf1.setEditable(false);
        tf2.setEditable(false);
        tf3.setEditable(false);
        tf4.setEditable(false);

        tf1.setText("Player1");
        tf2.setText("X");
        tf3.setText("Win(0)"+" and "+"Lose(0)");
        tf4.setText("Win(0)"+" and "+"Lose(0)");

        Panel p1 = new Panel();
        p1.setLayout(new GridLayout(3, 3, 4, 4));
        p1.add(btn1);
        p1.add(btn2);
        p1.add(btn3);
        p1.add(btn4);
        p1.add(btn5);
        p1.add(btn6);
        p1.add(btn7);
        p1.add(btn8);
        p1.add(btn9);
        add(p1);
        p1.setLocation(60, 60);
        p1.setSize(200,200);

        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(9, 1, 6, 6));
        p2.add(lb1);
        p2.add(tf1);
        p2.add(lb2);
        p2.add(tf2);
        p2.add(lb3);
        p2.add(tf3);
        p2.add(lb4);
        p2.add(tf4);
        p2.add(reset);
        add(p2);
        p2.setLocation(360, 60);
        p2.setSize(200,300);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        reset.addActionListener(new Inner1());
    }

    public void actionPerformed(ActionEvent ae)
    {
        Object ob = ae.getSource();

        if(click % 2 == 0) {
            if(ob == btn1)
            {
                btn1.setLabel("X");
                btn1.setEnabled(false);
            }
            if(ob == btn2)
            {
                btn2.setLabel("X");
                btn2.setEnabled(false);
            }
            if(ob == btn3)
            {
                btn3.setLabel("X");
                btn3.setEnabled(false);
            }
            if(ob == btn4)
            {
                btn4.setLabel("X");
                btn4.setEnabled(false);
            }
            if(ob == btn5)
            {
                btn5.setLabel("X");
                btn5.setEnabled(false);
            }
            if(ob == btn6)
            {
                btn6.setLabel("X");
                btn6.setEnabled(false);
            }
            if(ob == btn7)
            {
                btn7.setLabel("X");
                btn7.setEnabled(false);
            }
            if(ob == btn8)
            {
                btn8.setLabel("X");
                btn8.setEnabled(false);
            }
            if(ob == btn9)
            {
                btn9.setLabel("X");
                btn9.setEnabled(false);
            }

            tf1.setText("Player2");
            tf2.setText("O");

            click++;

            i = match();
            if(i == 1)
            {  
                win1++;
                lose2++;
                end();
                tf3.setText("Win("+win1+")"+" and "+"Lose("+lose1+")");
                tf4.setText("Lose("+lose2+")"+" and "+"Win("+win2+")");
            }
            if(i == 0)
            {
                win2++;
                lose1++;
                end();
                tf3.setText("Win("+win1+")"+" and "+"Lose("+lose1+")");
                tf4.setText("Win("+win2+")"+" and "+"Lose("+lose2+")");
            }
            if(click==9)
            {
                end();
            }
        }
        else {
            if(ob == btn1)
            {
                btn1.setLabel("O");
                btn1.setEnabled(false);
            }
            if(ob == btn2)
            {
                btn2.setLabel("O");
                btn2.setEnabled(false);
            }
            if(ob == btn3)
            {
                btn3.setLabel("O");
                btn3.setEnabled(false);
            }
            if(ob == btn4)
            {
                btn4.setLabel("O");
                btn4.setEnabled(false);
            }
            if(ob == btn5)
            {
                btn5.setLabel("O");
                btn5.setEnabled(false);
            }
            if(ob == btn6)
            {
                btn6.setLabel("O");
                btn6.setEnabled(false);
            }
            if(ob == btn7)
            {
                btn7.setLabel("O");
                btn7.setEnabled(false);
            }
            if(ob == btn8)
            {
                btn8.setLabel("O");
                btn8.setEnabled(false);
            }
            if(ob == btn9)
            {
                btn9.setLabel("O");
                btn9.setEnabled(false);
            }
            tf1.setText("Player1");
            tf2.setText("X");
            click++;
            i = match();
            if(i == 1)
            {  
                win1++;
                lose2++;
                end();
                tf3.setText("Win("+win1+")"+" and "+"Lose("+lose1+")");
                tf4.setText("Lose("+lose2+")"+" and "+"Win("+win2+")");
            }
            if(i == 0)
            {
                win2++;
                lose1++;
                end();
                tf3.setText("Win("+win1+")"+" and "+"Lose("+lose1+")");
                tf4.setText("Win("+win2+")"+" and "+"Lose("+lose2+")");
            }
            if(click==9)
            {
                end();
            }
        }
    }
    class Inner1 implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
        btn1.setLabel("");
        btn1.setEnabled(true);

        btn2.setLabel("");
        btn2.setEnabled(true);

        btn3.setLabel("");
        btn3.setEnabled(true);

        btn4.setLabel("");
        btn4.setEnabled(true);

        btn5.setLabel("");
        btn5.setEnabled(true);
        
        btn6.setLabel("");
        btn6.setEnabled(true);

        btn7.setLabel("");
        btn7.setEnabled(true);

        btn8.setLabel("");
        btn8.setEnabled(true);

        btn9.setLabel("");
        btn9.setEnabled(true);

        tf1.setText("Player1");
        tf2.setText("X");
        click=0;
        }
    }
    public int match()
    {   

        if(btn1.getLabel() == btn2.getLabel() && btn1.getLabel() == btn3.getLabel())
        {
            if(btn1.getLabel() == "X")
            {
            return 1;
            } 

           if(btn1.getLabel() == "O")
           {
            return 0;
           }
        }
        else if(btn4.getLabel() == btn5.getLabel() && btn4.getLabel() == btn6.getLabel())
        {
            if(btn4.getLabel() == "X")
            {
            return 1;
            } 

            if(btn4.getLabel() == "O") 
           {
            return 0;
           }
        }
        else if(btn7.getLabel() == btn8.getLabel() && btn7.getLabel() == btn9.getLabel())
        {
          
            if(btn7.getLabel() == "X")
            {
            return 1;
            } 

            if(btn7.getLabel() == "O") 
           {
            return 0;
           }
        }
        else if(btn1.getLabel() == btn5.getLabel() && btn1.getLabel() == btn9.getLabel())
        {
            if(btn1.getLabel() == "X")
            {
            return 1;
            } 

            if(btn1.getLabel() == "O") 
           {
            return 0;
           }
        }
        else if(btn3.getLabel() == btn5.getLabel() && btn3.getLabel() == btn7.getLabel())
        {
            if(btn3.getLabel() == "X")
            {
            return 1;
            } 

            if(btn3.getLabel() == "O")
           {
            return 0;
           }
        }
        else if(btn1.getLabel() == btn4.getLabel() && btn1.getLabel() == btn7.getLabel())
        {
            if(btn1.getLabel() == "X")
            {
            return 1;
            } 

            if(btn1.getLabel() == "O")
           {
            return 0;
           }
        }
        else if(btn2.getLabel() == btn5.getLabel() && btn2.getLabel() == btn8.getLabel())
        {
            if(btn2.getLabel() == "X")
            {
            return 1;
            } 
            if(btn2.getLabel() == "O")
           {
            return 0;
           }
        }
        else if(btn3.getLabel() == btn6.getLabel() && btn3.getLabel() == btn9.getLabel())
        {
            if(btn3.getLabel() == "X")
            {
            return 1;
            } 
            if(btn3.getLabel() == "O")
           {
            return 0;
           }
        }

        return -1;
    }
    public void end()
    {
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);




    }
    public static void main(String[] args) {
        TicTac fr = new TicTac();
        fr.setTitle("TicTac");
        fr.setSize(600,500);
        fr.setVisible(true);
    }


}

