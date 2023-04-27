/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Conexion;
import Modelos.PersonaModelo;
import Vistas.frmLogin;
import Vistas.frmPersonas;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ConexionControler implements ActionListener {
    
    frmLogin VistaLogin;
    frmPrincipal VistaPrincipal;
    frmPersonas VistaPersonas;
    PersonaModelo ModeloPersona;
    Conexion ModeloConexion;

    public ConexionControler(frmLogin VistaLogin, frmPrincipal VistaPrincipal, frmPersonas VistaPersonas, PersonaModelo ModeloPersona, Conexion ModeloConexion) {
        this.VistaLogin = VistaLogin;
        this.VistaPrincipal = VistaPrincipal;
        this.VistaPersonas = VistaPersonas;
        this.ModeloPersona = ModeloPersona;
        this.ModeloConexion = ModeloConexion;
        
             //LEVANTAR FORMULARIO PRINCIPAL
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        //Proner a la escucha boton principal
        this.VistaLogin.btnAceptar.addActionListener(this);
        
        this.VistaLogin.setLocationRelativeTo(null);
        this.VistaLogin.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource() == this.VistaLogin.btnAceptar)
       
       this.ModeloConexion.Conectar(this.VistaLogin.txtUser.getText(),
               this.VistaLogin.txtPass.getText());
        
        if(ModeloConexion != null){
            this.VistaLogin.dispose();
            this.VistaPersonas.btnGuardar.addActionListener(this);
            this.VistaPersonas.setLocationRelativeTo(null);
            this.VistaPersonas.setVisible(true);
        }
       if(arg0.getSource() ==this.VistaPersonas.btnGuardar){
           //MANDAR A GUARDAR EL REGISTRO
           this.ModeloPersona.GuardarPersona(this.VistaPersonas.txtApellido.getText(),
                   this.VistaPersonas.txtNombre.getText(),
                   this.VistaPersonas.txtTelefono.getText());
           
       }
    }
    
    
    
}
