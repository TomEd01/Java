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
    private JPanel caja1,caja2,caja3;
    public CalculadoraTucan(){
        eti1= new JLabel("Numero 1");
        eti2= new JLabel("Numero 2");
        eti3= new JLabel("Respuesta");
        tfN1= new JTextField(10);
        tfN2= new JTextField(10);
        tfR= new JTextField (15);
        suma= new JButton (" + ");
        resta= new JButton (" - ");
        multi= new JButton (" x ");
        div= new JButton (" / ");
        ele= new JButton (" p ");
        mod= new JButton (" Md ");
        marco= getContentPane();
        marco.setLayout(new BorderLayout());
        caja1 = new JPanel(); caja1.setLayout(new GridLayout(2,2));
        caja2 = new JPanel(); caja2.setLayout(new GridLayout(2,4));
        caja3 = new JPanel(); caja3.setLayout(new GridLayout(1,2));
        caja1.add(eti1);caja1.add(tfN1);
        caja1.add(eti2);caja1.add(tfN2);
        caja2.add(suma);caja2.add(resta);
        caja2.add(multi);caja2.add(div);
        caja2.add(ele);caja2.add(mod);
        caja3.add(eti3);caja3.add(tfR);
        marco.add(BorderLayout.WEST,caja1);
        add(BorderLayout.CENTER,caja2);
        add(BorderLayout.EAST,caja3);
        /*marco.add(eti1);add(tfN1);
        add(eti2);add(tfN2);
        add(suma);add(resta);add(multi);add(div);add(ele);add(mod);
        add(eti3);add(tfR);*/
        suma.addActionListener(this);
        resta.addActionListener(this);
        multi.addActionListener(this);
        div.addActionListener(this);
        ele.addActionListener(this);
        mod.addActionListener(this);
        setTitle("Calculadora TECNM");
        setSize(780,130);
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
