
import Controladores.ConexionControler;
import Modelos.Conexion;
import Modelos.PersonaModelo;
import Vistas.frmLogin;
import Vistas.frmPersonas;
import Vistas.frmPrincipal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author PALACIOS
 */
public class Main {


    public static void main(String[] args) {
        
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmLogin VistaLogin = new frmLogin(VistaPrincipal, true);
        frmPersonas VistaPersonas = new frmPersonas(VistaPrincipal, true);
        Conexion nuevaConexion = new Conexion();
        PersonaModelo ModeloPersona = new PersonaModelo();
        
        ConexionControler ControladorConexion = new ConexionControler(VistaLogin, 
        VistaPrincipal, VistaPersonas,ModeloPersona ,nuevaConexion);
        
    }
    
}
