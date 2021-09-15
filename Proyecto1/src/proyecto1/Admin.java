/**
 * ESta clase maneja las funciones de un admin
 * @sthephan Alexander Garcia Marroquin 200915522
 * @version 1.0
 */
//paquete
package proyecto1;
//Librerias utilizadas
import javax.swing.JFrame;
//inicio de clase
public class Admin extends JFrame{
    
    private Vendedor listaVendedores[];
    private Sucursal listaSucursales[];
    private Producto listaProductos[];
    private Cliente listaclientes[];
    
    public Admin(){
        this.setVisible(true);
        this.getContentPane().setLayout(null);
        this.setBounds(0,0, 800, 900);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    
    }
    
    
    
}
