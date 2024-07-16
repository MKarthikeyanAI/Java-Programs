import java.awt.*;
class Awtbutton extends Frame
{
    Awtbutton()
    {
        Button b1=new Button("click me");
        b1.setBounds(30,100,80,30);
        add(b1);
        b1.setSize(400,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[])
    {
        Awtbutton f= new Awtbutton();
    }
}