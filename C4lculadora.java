import java.lang.Math.*;
/**
 * Write a description of class C4lculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 
 */


public class C4lculadora extends Principal
{
    private String digito;

  
   ///import java util.*;
   public C4lculadora() //constructor
        {
            digito = "";
            resultado = 0;
            suma = false;
            resta = false;
            multiplicacion = false;
            divicion = false;
            raiz = false;
            potencia = false;
        }
    
    //get
    public String getDigito() //optiene
    {
        return digito;
    }
    
    public void setDigito(String digito) // Coloca
    {
        this.digito = digito;
    }
    
    public void agregarNum(int num)
    {
        setDigito(digito+num);
    }
    
    public void CE(String digito)
    {
      setDigito("");
      resultado = 0;
    }
        
    public void suma(String num)
    {
        this.resultado = Double.parseDouble(num);
        suma = true;
        setDigito("");
    }
    
     public void resta(String num)
    {  //Mensionar el atributo miembro de la clase
        this.resultado = Double.parseDouble(num);
        resta = true;
        setDigito("");
    }
     
     public void multiplicacion(String num)
    {  //Mensionar el atributo miembro de la clase
        this.resultado = Double.parseDouble(num);
        multiplicacion = true;
        setDigito("");
    }
     
     public void divicion(String num)
    {  //Mensionar el atributo miembro de la clase
        this.resultado = Double.parseDouble(num);
        divicion = true;
        setDigito("");
    }
     
     public void raiz(String digito)
    {  //Mensionar el atributo miembro de la clase
        this.resultado = Double.parseDouble(digito);
        raiz =  true;
        //setDigito("");
    }
     
     public void potencia(String num)
    {  //Mensionar el atributo miembro de la clase
        this.resultado = Double.parseDouble(num);
        potencia = true;
        setDigito("");
    }
               ///   =  ///
    public double producto(String numero)
    {
        if(suma == true)
        {
            resultado = resultado + Double.parseDouble(numero);
            
        }
        if (resta == true)
        {
            resultado = resultado - Double.parseDouble(numero);
                    }
        if (multiplicacion == true)
        {
            resultado = resultado * Double.parseDouble(numero);
        }
        if (divicion == true)
        {
            resultado = resultado / Double.parseDouble(numero);
        }
        if (raiz == true)
        {    
            resultado = Math.sqrt(resultado);
            
        } 
        if (potencia == true)
        {
            resultado = resultado + Double.parseDouble(numero);
            
        }
       
    
        //Volver valores a 0
        suma = false;
        resta = false;
        multiplicacion = false;
        divicion = false;
        raiz = false;
        potencia = false;
    
        //Regresa el valor generado
        return resultado;
    }
    
} 
