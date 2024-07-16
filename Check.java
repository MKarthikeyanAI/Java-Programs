import javax.swing.*;
class Check
{
    Check()
    {
        JFrame f=new JFrame();
        JCheckBox c1=new JCheckBox("JAVA");
        JCheckBox c2=new JCheckBox("WEB");
        c1.setBounds(100,100,100,100);
        c2.setBounds(100,150,100,100);
        f.add(c1);
        f.add(c2);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        Check c=new Check();
    }
}