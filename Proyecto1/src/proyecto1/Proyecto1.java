/**
 * Esta clase maneja todo el software es la "main"
 * @sthephan Alexander Garcia Marroquin 200915522
 * @version 1.0
 */ 
////////paquete
package proyecto1;
///liberias utilizadas
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
///////////declaraciuon de clase
public class Proyecto1 {
    
    //campos de clase
    private JFrame ventana;
    
    private String usuario="";
    private String contraseUsada="";
    
    /**
     * Constructor base cuando el software se inicia sin parametros     
     */
    public Proyecto1(){
        iniciar_ventana();
        
    }//cierre de constructor
    

    public static void main(String[] args) {
        Proyecto1 obejto = new Proyecto1();
    }
    
    /**
     *metodo que inicicializara la ventana de inicio
    */
    public void iniciar_ventana(){
        
        // propiedades de ventana
        ventana = new JFrame();
        ventana.setBounds(0,0,600,600);
        ventana.setVisible(true);
        ventana.getContentPane().setLayout(null);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        ventana.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                int valor = JOptionPane.showConfirmDialog(null,"¿Desea salir de la aplicacion?","¿Finalizar aplicación?", JOptionPane.YES_NO_OPTION);
                if(valor==JOptionPane.YES_OPTION){                    
                    System.exit(0);                
                }
            }
        });
        ventana.getContentPane().setBackground(Color.DARK_GRAY);
        
        JLabel present = new JLabel("P.O.S",SwingConstants.CENTER);
        present.setBounds(200,15,200,150);
        present.setFont(new Font("Arial",Font.BOLD,60));        
        present.setForeground(Color.white);
        ventana.getContentPane().add(present);
        
        JLabel user = new JLabel("Usuario",SwingConstants.CENTER);
        user.setBounds(200,125,200,100);
        user.setFont(new Font("Arial",Font.BOLD,28));
        user.setForeground(Color.white);
        ventana.getContentPane().add(user);
        
        JTextField usuarioTexto = new JTextField();
        usuarioTexto.setBounds(150,215,300,50);
        usuarioTexto.setFont(new Font("Arial",Font.ROMAN_BASELINE,16));
        usuarioTexto.setHorizontalAlignment(JTextField.CENTER);
        ventana.getContentPane().add(usuarioTexto);
        
        JLabel password = new JLabel("Contraseña",SwingConstants.CENTER);
        password.setBounds(200,250,200,100);
        password.setFont(new Font("Arial",Font.BOLD,28));
        password.setForeground(Color.WHITE);
        ventana.getContentPane().add(password);
        
        JPasswordField passwordTexto = new JPasswordField();        
        passwordTexto.setBounds(150,350,300,50);
        passwordTexto.setFont(new Font("Arial",Font.ROMAN_BASELINE,24));
        passwordTexto.setHorizontalAlignment(JPasswordField.CENTER);
        ventana.getContentPane().add(passwordTexto);
        
        
        JButton entrarPrincipal = new JButton("Entrar");
        entrarPrincipal.setVisible(true);
        entrarPrincipal.setBounds(150,450,300,75);
        entrarPrincipal.setFont(new Font("Arial",Font.BOLD,24));
        entrarPrincipal.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(usuarioTexto.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"El campo Usuario sigue vacio, ingrese un usario","Informacion no valida",JOptionPane.WARNING_MESSAGE);
                }else{
                            
                }
            
            }
        
        });
        
        
        
        
        
        ventana.getContentPane().add(entrarPrincipal);
        
        ////////////actualizar el jframe
        ventana.getContentPane().repaint();
    
    }
    
    public void acceder(){
    
    }
    
    
    
}//cierre ded clase Proyecto1
