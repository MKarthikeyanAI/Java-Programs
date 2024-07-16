import javax.swing.*;
public class CBE
{
    JFrame f;
    CBE()
    {
        f=new JFrame("DropDown");
        String country[]={"india","USA","UK","Japan"};
        JComboBox cb=new JComboBox(country);
        cb.setBounds(50,50,90,20);
        f.add(cb);
        f.setSize(400,300);
        f.setLayout(null);

        
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new CBE();
    }


}