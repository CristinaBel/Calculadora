package paquete;

import java.util.Locale;
import java.util.Map;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;


@Named(value = "calculadoraBean")
@RequestScoped
public class CalculadoraBean {

    
    private float v1;
    private float v2;
    private float v3;

    public float getV3() {
        return v3;
    }

    public void setV3(float v3) {
        this.v3 = v3;
    }

     public CalculadoraBean() {
    }
    
    public float getV1() {
        return v1;
    }

    public void setV1(float v1) {
        this.v1 = v1;
    }

    public float getV2() {
        return v2;
    }

    public void setV2(float v2) {
        this.v2 = v2;
    }
    
    public String sumar(){
        v3 = v1 + v2;
        return "";       
    }
    public float sumar(int v1, int v2){
        v3 = v1 + v2;
        return v3;       
    }
    public String restar(){
        v3 = v1 - v2;
        return "";       
    }
    public String multiplicar(){
        v3 = v1 * v2;
        return "";       
    }
    public String dividir(){
        v3 = v1 / v2;
        return "";       
    }
    
    public String cambiar(String idioma){
        FacesContext ctx = FacesContext.getCurrentInstance();
        Locale locale = new Locale(idioma);
        ctx.getViewRoot().setLocale(locale);
        Map<String, Object> atributos_sesion = ctx.getExternalContext().getSessionMap();
        atributos_sesion.put("idioma", locale);
        return null;
    }
    
    
    
}