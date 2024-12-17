
package Sistema;


//import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;

public class SistemaAtm {
    
    List <Double> lista_de_retiros = new ArrayList<Double>();
    List<Double> lista_de_depositos = new ArrayList<Double>();

   
    
  
    //Variables locales 
    
    public static double saldoActual ;
    
    public SistemaAtm () {
        
        saldoActual=2000;
    }
    
    //Metodo 
    
    public void depositar (double deposito) {
        
        saldoActual = saldoActual + deposito;
        lista_de_depositos.add(deposito);
        
        
    }
    
    public void retirar (double retiro ) {
        if (saldoActual>=retiro) {
            
            saldoActual = saldoActual-retiro;
            lista_de_retiros .add(retiro);
            
        }
        else {
            JOptionPane.showMessageDialog(null, "[ERROR] Saldo insuficiente");
        }
    }
    

    public double  mostrarRetiros (double retiro) {
        
     if (lista_de_retiros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se han realizado retiros.");
        } else {
            StringBuilder sb = new StringBuilder();
            for (Double  retiross : lista_de_retiros) {
                sb.append("Retiros: $").append(retiross).append("\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        }
     return 1;
   }

    
    public double mostarDepositos(double deposito) {
        if(lista_de_depositos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se han realizado depositos.");
            
        } else {
             StringBuilder sbu = new StringBuilder();
             for (Double depositos : lista_de_depositos) {
                 
                 sbu.append("Depositos : $").append(depositos).append("\n");
             }
             JOptionPane.showMessageDialog(null, sbu.toString());
        }
        return 1;
    }
    
    public double obtenerSaldo () {
        
        return saldoActual;
    }
    
}
