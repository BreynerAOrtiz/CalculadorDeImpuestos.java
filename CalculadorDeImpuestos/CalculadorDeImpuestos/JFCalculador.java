import javax.swing.*;
import java.awt.*;
import javax.swing.border.TitledBorder;
 
/**
 * Interfaz del Calculador de Impuestos - 5 zonas segun el enunciado.
 */
public class JFCalculador extends JFrame
{
    
    private ImageIcon imagenVehiculo;
    private JLabel lblImagenVehiculo;
    private JLabel lblmarca;
    private JLabel lbllinea;
    private JLabel lblmodelo;
    private JLabel lblvalor;
    private JTextField txtmarca;
    private JTextField txtlinea;
    private JTextField txtmodelo;
    private JTextField txtvalor;
    private JButton btnPrimero;   
    private JButton btnAnterior;  
    private JButton btnSiguiente; 
    private JButton btnUltimo;    
 

    private JTextField txtBuscarLinea;
    private JTextField txtBuscarMarca;
    private JButton btnBuscarLinea;
    private JButton btnBuscarMarca;
    private JButton btnBuscarMasCaro;
 
 
    private JCheckBox chkProntoPago;
    private JCheckBox chkServicioPublico;
    private JCheckBox chkTrasladoCuenta;
 
    
    private JButton btnCalcular;
    private JButton btnOpcion1;
    private JButton btnOpcion2;
 
    private Calculador calculador;
 
    public JFCalculador(){
        calculador = new Calculador();
 
        setTitle("CALCULADOR DE IMPUESTOS");
        setSize(500,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
 
        crearInterfaz();
        actualizarInterfaz();
 
        setVisible(true);
    }
 
    public void crearInterfaz(){
        
        JPanel principal = new JPanel();
        principal.setLayout(new BoxLayout(principal, BoxLayout.Y_AXIS));
 
        
        JPanel encabezado = new JPanel();
        JLabel titulo = new JLabel("CALCULADOR DE IMPUESTOS");
        titulo.setFont(new Font("Times New Roman", Font.BOLD, 24));
        encabezado.add(titulo);
 
        
        JPanel panelVehiculo = new JPanel();
        panelVehiculo.setLayout(new BoxLayout(panelVehiculo, BoxLayout.Y_AXIS));
        panelVehiculo.setBorder(new TitledBorder("Datos del vehiculo"));
 
        imagenVehiculo = new ImageIcon("images/Auto.jpg");
        Image escalada = imagenVehiculo.getImage().getScaledInstance(200, 120, Image.SCALE_SMOOTH);
        lblImagenVehiculo = new JLabel(new ImageIcon(escalada));
        lblImagenVehiculo.setAlignmentX(Component.CENTER_ALIGNMENT);
 
        
        JPanel datosGrid = new JPanel(new GridLayout(4, 2, 5, 5));
        lblmarca = new JLabel("Marca");
        lbllinea = new JLabel("Linea");
        lblmodelo = new JLabel("Modelo");
        lblvalor = new JLabel("Valor");
        txtmarca = new JTextField();
        txtlinea = new JTextField();
        txtmodelo = new JTextField();
        txtvalor = new JTextField();
        
        txtmarca.setEditable(false);
        txtlinea.setEditable(false);
        txtmodelo.setEditable(false);
        txtvalor.setEditable(false);
 
        datosGrid.add(lblmarca);
        datosGrid.add(txtmarca);
        datosGrid.add(lbllinea);
        datosGrid.add(txtlinea);
        datosGrid.add(lblmodelo);
        datosGrid.add(txtmodelo);
        datosGrid.add(lblvalor);
        datosGrid.add(txtvalor);
 
       
        JPanel navegacion = new JPanel(new GridLayout(1, 4, 5, 5));
        btnPrimero = new JButton("<<");
        btnAnterior = new JButton("<");
        btnSiguiente = new JButton(">");
        btnUltimo = new JButton(">>");
        navegacion.add(btnPrimero);
        navegacion.add(btnAnterior);
        navegacion.add(btnSiguiente);
        navegacion.add(btnUltimo);
 
        panelVehiculo.add(lblImagenVehiculo);
        panelVehiculo.add(datosGrid);
        panelVehiculo.add(navegacion);
 
        JPanel panelBusquedas = new JPanel(new GridLayout(3, 2, 5, 5));
        panelBusquedas.setBorder(new TitledBorder("Busquedas"));
 
        txtBuscarLinea = new JTextField();
        txtBuscarMarca = new JTextField();
        btnBuscarLinea = new JButton("Buscar por linea");
        btnBuscarMarca = new JButton("Buscar por marca");
        btnBuscarMasCaro = new JButton("Buscar vehiculo mas caro");
 
        panelBusquedas.add(txtBuscarLinea);
        panelBusquedas.add(btnBuscarLinea);
        panelBusquedas.add(txtBuscarMarca);
        panelBusquedas.add(btnBuscarMarca);
        panelBusquedas.add(new JLabel()); 
        panelBusquedas.add(btnBuscarMasCaro);
 
   
        JPanel panelDescuentos = new JPanel(new GridLayout(2, 2, 5, 5));
        panelDescuentos.setBorder(new TitledBorder("Descuentos"));
 
        chkProntoPago = new JCheckBox("Pronto pago");
        chkServicioPublico = new JCheckBox("Servicio publico");
        chkTrasladoCuenta = new JCheckBox("Traslado de cuenta");
 
        panelDescuentos.add(chkProntoPago);
        panelDescuentos.add(chkTrasladoCuenta);
        panelDescuentos.add(chkServicioPublico);
 
       
        JPanel panelOpciones = new JPanel(new GridLayout(1, 3, 5, 5));
        panelOpciones.setBorder(new TitledBorder("Opciones"));
 
        btnCalcular = new JButton("Calcular");
        btnOpcion1 = new JButton("Opcion 1");
        btnOpcion2 = new JButton("Opcion 2");
 
        panelOpciones.add(btnCalcular);
        panelOpciones.add(btnOpcion1);
        panelOpciones.add(btnOpcion2);
 
       
        principal.add(encabezado);
        principal.add(panelVehiculo);
        principal.add(panelBusquedas);
        principal.add(panelDescuentos);
        principal.add(panelOpciones);
 
        add(principal);
    }
 
    public void actualizarInterfaz(){
      
        
        
    }
}