import java.awt.*;
import java.awt.event.*;

class MathFrame extends Frame implements ActionListener{
    Label l1,l2;
    TextField tf1,tf2,tf3;
    Button  b1,b2,b3,b4;

    MathFrame(){
        setTitle("Math Frame");
        setBounds(300,100,400,400);
        setLayout(new FlowLayout());

        // step 1 create component
        l1 = new Label("Enter First Number: ");
        l2 = new Label("Enter Second Number: ");
        tf1 = new TextField(20);
        tf2 = new TextField(20);
        tf3 = new TextField(20);
        b1 = new Button("ADD");
        b2 = new Button("SUB");
        b3 = new Button("MUL");
        b4 = new Button("DIV");




        // step 2 add Component
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(tf3);


        // step 3 add Listener

            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);



        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        int a = Integer.parseInt(tf1.getText());
        int b = Integer.parseInt(tf2.getText());
        int c=0;
        if(ae.getSource()==b1){
            c = a+b;
        }
         if(ae.getSource()==b2){
            c = a-b;
        }
        if(ae.getSource()==b3){
            c = a*b;
        }
        if(ae.getSource()==b4){
            c = a/b;
        }

        tf3.setText(""+c);
    }
    
}

class TestMathFrame{
    public static void main(String args[]){
        MathFrame mf = new MathFrame();
    }

}