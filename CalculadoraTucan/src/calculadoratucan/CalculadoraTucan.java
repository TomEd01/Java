package calculadoratucan;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//@author TomiCat xD
public class CalculadoraTucan extends JFrame implements ActionListener{
    private Container marco;
    private JLabel eti1,eti2,eti3;
    private JTextField tfN1,tfN2,tfR;
    private JButton suma,resta,multi,div,ele,mod;
    public CalculadoraTucan(){
        eti1= new JLabel("Hola");
        eti2= new JLabel("Hola");
        eti3= new JLabel("Hola");
        tfN1= new JTextField(10);
        tfN2= new JTextField(10);
        tfR= new JTextField (15);
        suma= new JButton (" + ");
        resta= new JButton (" - ");
        multi= new JButton (" x ");
        div= new JButton (" / ");
        ele= new JButton (" v ");
        mod= new JButton (" M ");
        marco= getContentPane();
        marco.setLayout(new FlowLayout());
        marco.add(eti1);add(tfN1);
        add(eti2);add(tfN2); 
        add(suma);add(resta);add(multi);add(div);add(ele);add(mod);
        add(eti3);add(tfR);
        suma.addActionListener(this);
        resta.addActionListener(this);
        multi.addActionListener(this);
        div.addActionListener(this);
        ele.addActionListener(this);
        mod.addActionListener(this);
        setTitle("Microcalculadora Tucan");
        setSize(240,120);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        CalculadoraTucan ci = new CalculadoraTucan();
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        double n1,n2,r;
        n1=Double.parseDouble(tfN1.getText());
        n2=Double.parseDouble(tfN2.getText());
        if(ae.getSource()==suma) r=n1+n2;
        else if(ae.getSource()==resta) r=n1-n2;
        else if(ae.getSource()==multi) r=n1*n2;
        else if(ae.getSource() == div) r=n1/n2;
        else if(ae.getSource() == ele) r=Math.pow(n1, n2);
        else r=n1%n2;
        tfR.setText(""+r);
    }
}