/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion.pkg3.pkg2;

/**
 *
 * @author Estudiante
 */
public class operaciones {
    public static double PrimerNroyBorrar(javax.swing.JTextField barraCalculadora) {
        String texto = barraCalculadora.getText();
        barraCalculadora.setText(""); 
        return Double.parseDouble(texto);
    }
    public static double SegundoNro(javax.swing.JTextField barraCalculadora) {
        String texto = barraCalculadora.getText();
        barraCalculadora.setText(""); 
        return Double.parseDouble(texto);
    }
    public static void limpiarCalculadora(javax.swing.JTextField barraCalculadora, 
                                          PantallaCalculadoraReto pantalla) {
        barraCalculadora.setText(""); 
        pantalla.sumando = false;
        pantalla.restando = false;
        pantalla.multiplicacion = false;
        pantalla.dividiendo = false;
        pantalla.numero1 = 0;
    }
    
}
