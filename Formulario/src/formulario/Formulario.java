package formulario;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//@author TomiCat xD
public class Formulario extends JFrame implements ActionListener{
    private Container marco;
    private JLabel eti1,eti2,eti3,eti4,eti5;
    private JTextField tfMatricula,tfNombre,tfNoTel,tfEmail;
    private JButton guardar;
    private JTextArea datos;
    private JScrollPane barraDesp;
    private JPanel caja,caja1;
    public Formulario(){
        eti1= new JLabel("Matricula");
        eti2= new JLabel("Nombre");
        eti3= new JLabel("No. Telefono");
        eti4= new JLabel("Email");
        eti5= new JLabel("Datos");
        tfMatricula= new JTextField(25);
        tfNombre= new JTextField(25);
        tfNoTel= new JTextField(25);
        tfEmail= new JTextField(25);
        guardar= new JButton ("Guardar");
        datos = new JTextArea(10,35);
        barraDesp = new JScrollPane(datos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        barraDesp.setBounds(0,0,340,340);
        marco= getContentPane();
        marco.setLayout(new BorderLayout());
        caja = new JPanel(); caja.setLayout(new GridLayout(5,2));
        caja1 = new JPanel(); caja1.setLayout(new FlowLayout());
        caja.add(eti1);caja.add(tfMatricula);
        caja.add(eti2);caja.add(tfNombre);
        caja.add(eti3);caja.add(tfNoTel);
        caja.add(eti4);caja.add(tfEmail);
        caja.add(guardar);
        caja1.add(eti5);
        caja1.add(barraDesp);
        marco.add(BorderLayout.NORTH,caja);
        add(BorderLayout.SOUTH,caja1);
        guardar.addActionListener(this);
        setTitle("Formulario Tucan");
        setSize(370,350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/formulario/tecnm.png")).getImage());
    }
    public static void main(String[] args) {
        Formulario fe = new Formulario();
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        String M,No,Tel,Ema;
        M=tfMatricula.getText();
        No=tfNombre.getText();
        Tel=tfNoTel.getText();
        Ema=tfEmail.getText();
        datos.append(M+" "+No+" "+Tel+" "+Ema+"\n");
        tfMatricula.setText("");
        tfNombre.setText("");
        tfNoTel.setText("");
        tfEmail.setText("");
    }
}
