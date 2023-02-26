package temptucan;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
//@author TomiCat xD
public class TempTucan extends JFrame implements ActionListener{
    private Container marco;
    private JLabel eti1,eti2;
    private JTextField tfC, tfF;
    private JSlider Sc,Sf;
    private JPanel caja,caja1;
    public TempTucan(){
        caja= new JPanel(); caja.setLayout(new GridLayout(2,1));
        caja1= new JPanel(); caja1.setLayout(new GridLayout(2,2));
        eti1= new JLabel("C°");
        eti2= new JLabel("F°");
        tfC= new JTextField(6);
        tfC.setEnabled(false);
        tfF= new JTextField(6);
        tfF.setEnabled(false);
        tfC.setText("25");
        tfF.setText("77");
        marco= getContentPane();
        marco.setLayout(new BorderLayout());
        Sc= new JSlider();
        Sc.setMinimum(0);
        Sc.setMaximum(100);
        Sc.setMinorTickSpacing(5);//Barritas pequeñas
        Sc.setMajorTickSpacing(25);//Barras Grandes
        Sc.setPaintTicks(true);
        Sc.setPaintLabels(true);
        Sc.setValue(25);
        Sf= new JSlider();
        Sf.setMinimum(32);
        Sf.setMaximum(212);
        Sf.setMinorTickSpacing(5);
        Sf.setMajorTickSpacing(45);
        Sf.setPaintTicks(true);
        Sf.setPaintLabels(true);
        Sf.setValue(77);
        caja.add(Sc);caja1.add(tfC);caja1.add(eti1);
        caja.add(Sf);caja1.add(tfF);caja1.add(eti2);
        add(BorderLayout.CENTER,caja);
        add(BorderLayout.EAST,caja1);
        setSize(480,160);
        setTitle("Temperatura Tucanes");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Sc.addChangeListener((ChangeEvent e) -> {
            int c=Sc.getValue();
            tfF.setText(Integer.toString((int)(1.8*c)+32));
            tfC.setText(Integer.toString(c));
            Sf.setValue(Integer.parseInt(tfF.getText()));
        });
        Sf.addChangeListener((ChangeEvent e) -> {
            int f = Sf.getValue();
            tfC.setText(Integer.toString((int)((f-32)/1.8)));
            tfF.setText(Integer.toString(f));
            Sc.setValue(Integer.parseInt(tfC.getText()));
        });
    }
    public static void main(String[] args) {
        // TODO code application logic here
        TempTucan te= new TempTucan();
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        //
    }
}