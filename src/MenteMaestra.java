
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;




/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandroramirez
 */
public class MenteMaestra extends javax.swing.JFrame  {
public int intento=0;
public int estado1=0;
public int A[]= new int[10];
public int B[]= new int[10];
public int C[]= new int[10];
public int D[]= new int[10];
//elementos
public ImageIcon agua= new javax.swing.ImageIcon(getClass().getResource("/img/agua.jpg"));
public ImageIcon fuego= new javax.swing.ImageIcon(getClass().getResource("/img/fuego.jpg"));
public ImageIcon tierra= new javax.swing.ImageIcon(getClass().getResource("/img/tierra.jpg"));
public ImageIcon aire= new javax.swing.ImageIcon(getClass().getResource("/img/aire.jpg"));
public ImageIcon neutro= new javax.swing.ImageIcon(getClass().getResource("/img/neutro.jpg"));
public ImageIcon stasis= new javax.swing.ImageIcon(getClass().getResource("/img/stasis.jpg"));
//otros
public ImageIcon reves= new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"));
public ImageIcon resp= new javax.swing.ImageIcon(getClass().getResource("/img/interrogacion.png"));
//iconos de pistas
final ImageIcon unobien_uncambio= new javax.swing.ImageIcon(getClass().getResource("/img/pistas/1b1c.png"));
final ImageIcon unobien_doscambio= new javax.swing.ImageIcon(getClass().getResource("/img/pistas/1b2c.png"));
final ImageIcon unobien_trescambio= new javax.swing.ImageIcon(getClass().getResource("/img/pistas/1b3c.png"));
final ImageIcon uncambio= new javax.swing.ImageIcon(getClass().getResource("/img/pistas/1c.png"));
final ImageIcon dosbien= new javax.swing.ImageIcon(getClass().getResource("/img/pistas/2b.png"));
final ImageIcon dosbien_uncambio= new javax.swing.ImageIcon(getClass().getResource("/img/pistas/2b1c.png"));
final ImageIcon dosbien_doscambio= new javax.swing.ImageIcon(getClass().getResource("/img/pistas/2b2c.png"));
final ImageIcon doscambio= new javax.swing.ImageIcon(getClass().getResource("/img/pistas/2c.png"));
final ImageIcon tresbien= new javax.swing.ImageIcon(getClass().getResource("/img/pistas/3b.png"));
final ImageIcon trescambio= new javax.swing.ImageIcon(getClass().getResource("/img/pistas/3c.png"));
final ImageIcon cuatrobien= new javax.swing.ImageIcon(getClass().getResource("/img/pistas/4b.png"));
final ImageIcon cuatrocambio= new javax.swing.ImageIcon(getClass().getResource("/img/pistas/4c.png"));
//opciones, instrucciones etc
final ImageIcon instrucciones= new javax.swing.ImageIcon(getClass().getResource("/img/instrucciones.png"));
final ImageIcon acercade= new javax.swing.ImageIcon(getClass().getResource("/img/acercade.jpg"));
final ImageIcon simbolos= new javax.swing.ImageIcon(getClass().getResource("/img/simbologia.jpg"));
public int tiempo=60;
public int segs=0;
public int min=0;
//Tiempo modo dificil
Timer timer = new Timer (1000, new ActionListener () { 
    public void actionPerformed(ActionEvent e) 
    { 
        System.out.println(timer);
        tiempo=tiempo -1;
        segs=segs+1;
        if(segs==60){
            min=min+1;
            segs=0;
        }
        tiempototal.setText(Integer.toString(min)+":"+Integer.toString(segs));
        textotiempo.setText(Integer.toString(tiempo));
        barratiempo.setValue(tiempo);
        if(tiempo==0){
            findeltiempo();
        }
        
     } 
}); 
public int RespA=9;
public int RespB=9; 
public int RespC=9;
public int RespD=9;
public void findeltiempo(){
    switch(intento){
        case 0:
          opcion.setEnabled(false);
          opcion1.setEnabled(false);
          opcion2.setEnabled(false);
          opcion3.setEnabled(false);
          Verificar.setEnabled(false);  
          opcion4.setEnabled(true);
          opcion5.setEnabled(true);
          opcion6.setEnabled(true);
          opcion7.setEnabled(true);
          intento++;
          Verificar1.setEnabled(true);
            tiempo=60;
            resul1.setIcon(resp);
            break;
        case 1:
            opcion4.setEnabled(false);
          opcion5.setEnabled(false);
          opcion6.setEnabled(false);
          opcion7.setEnabled(false);
          Verificar1.setEnabled(false);  
          opcion8.setEnabled(true);
          opcion9.setEnabled(true);
          opcion10.setEnabled(true);
          opcion11.setEnabled(true);
          intento++;
          Verificar2.setEnabled(true);
            tiempo=60;
            resul2.setIcon(resp);
            break;
        case 2:
            opcion8.setEnabled(false);
          opcion9.setEnabled(false);
          opcion10.setEnabled(false);
          opcion11.setEnabled(false);
          Verificar2.setEnabled(false);  
          opcion12.setEnabled(true);
          opcion13.setEnabled(true);
          opcion14.setEnabled(true);
          opcion15.setEnabled(true);
          intento++;
          Verificar3.setEnabled(true);
            tiempo=60;
            resul3.setIcon(resp);
            break;
        case 3:
            opcion12.setEnabled(false);
          opcion13.setEnabled(false);
          opcion14.setEnabled(false);
          opcion15.setEnabled(false);
          Verificar3.setEnabled(false);  
          opcion16.setEnabled(true);
          opcion17.setEnabled(true);
          opcion18.setEnabled(true);
          opcion19.setEnabled(true);
          intento++;
          Verificar4.setEnabled(true);
            tiempo=60;
            resul4.setIcon(resp);
            break;
        case 4:
            opcion16.setEnabled(false);
          opcion17.setEnabled(false);
          opcion18.setEnabled(false);
          opcion19.setEnabled(false);
          Verificar4.setEnabled(false);  
          opcion20.setEnabled(true);
          opcion21.setEnabled(true);
          opcion22.setEnabled(true);
          opcion23.setEnabled(true);
          intento++;
          Verificar5.setEnabled(true);
            tiempo=60;
            resul5.setIcon(resp);
            break;
        case 5:
            opcion20.setEnabled(false);
          opcion21.setEnabled(false);
          opcion22.setEnabled(false);
          opcion23.setEnabled(false);
          Verificar5.setEnabled(false);  
          opcion24.setEnabled(true);
          opcion25.setEnabled(true);
          opcion26.setEnabled(true);
          opcion27.setEnabled(true);
          intento++;
          Verificar6.setEnabled(true);
            tiempo=60;
            resul6.setIcon(resp);
            break;
        case 6:
            opcion24.setEnabled(false);
          opcion25.setEnabled(false);
          opcion26.setEnabled(false);
          opcion27.setEnabled(false);
          Verificar6.setEnabled(false);  
          opcion28.setEnabled(true);
          opcion29.setEnabled(true);
          opcion30.setEnabled(true);
          opcion31.setEnabled(true);
          intento++;
          Verificar7.setEnabled(true);
            tiempo=60;
            resul7.setIcon(resp);
            break;
        case 7:
            opcion28.setEnabled(false);
          opcion29.setEnabled(false);
          opcion30.setEnabled(false);
          opcion31.setEnabled(false);
          Verificar7.setEnabled(false);  
          opcion32.setEnabled(true);
          opcion33.setEnabled(true);
          opcion34.setEnabled(true);
          opcion35.setEnabled(true);
          intento++;
          Verificar8.setEnabled(true);
            tiempo=60;
            resul8.setIcon(resp);
            break;
        case 8:
            opcion32.setEnabled(false);
          opcion33.setEnabled(false);
          opcion34.setEnabled(false);
          opcion35.setEnabled(false);
          Verificar8.setEnabled(false);  
          opcion36.setEnabled(true);
          opcion37.setEnabled(true);
          opcion38.setEnabled(true);
          opcion39.setEnabled(true);
          intento++;
          Verificar9.setEnabled(true);
            tiempo=60;
            resul9.setIcon(resp);
            break;
        case 9:
            opcion36.setEnabled(false);
          opcion37.setEnabled(false);
          opcion38.setEnabled(false);
          opcion39.setEnabled(false);
          Verificar9.setEnabled(false);
          resul10.setIcon(resp);
          timer.stop();
            tiempo=60;
             JOptionPane.showMessageDialog(null, "GAME OVER \n Se termino el tiempo No pudiste resolverlo la respuesta es la siguiente");
             descubrir();
            break;
    }
}
public void ocultapistas(){
resul1.setIcon(null);
resul2.setIcon(null);
resul3.setIcon(null);
resul4.setIcon(null);
resul5.setIcon(null);
resul6.setIcon(null);
resul7.setIcon(null);
resul8.setIcon(null);
resul9.setIcon(null);
resul10.setIcon(null);
}
public void cubrir(){
    RespuestaA.setIcon(resp);
        RespuestaB.setIcon(resp);
        RespuestaC.setIcon(resp);
        RespuestaD.setIcon(resp);
         opcion.setIcon(reves);
         opcion.setDisabledIcon(reves);
        opcion1.setIcon(reves);
        opcion1.setDisabledIcon(reves);
        opcion2.setIcon(reves);
        opcion2.setDisabledIcon(reves);
        opcion3.setIcon(reves);
        opcion3.setDisabledIcon(reves);
         opcion4.setIcon(reves);
         opcion4.setDisabledIcon(reves);
        opcion5.setIcon(reves);
        opcion5.setDisabledIcon(reves);
        opcion6.setIcon(reves);
        opcion6.setDisabledIcon(reves);
        opcion7.setIcon(reves);
        opcion7.setDisabledIcon(reves);
         opcion8.setIcon(reves);
         opcion8.setDisabledIcon(reves);
        opcion9.setIcon(reves);
        opcion9.setDisabledIcon(reves);
        opcion10.setIcon(reves);
        opcion10.setDisabledIcon(reves);
        opcion11.setIcon(reves);
        opcion11.setDisabledIcon(reves);
         opcion12.setIcon(reves);
         opcion12.setDisabledIcon(reves);
        opcion13.setIcon(reves);
        opcion13.setDisabledIcon(reves);
        opcion14.setIcon(reves);
        opcion14.setDisabledIcon(reves);
        opcion15.setIcon(reves);
        opcion15.setDisabledIcon(reves);
         opcion16.setIcon(reves);
         opcion16.setDisabledIcon(reves);
        opcion17.setIcon(reves);
        opcion17.setDisabledIcon(reves);
        opcion18.setIcon(reves);
        opcion18.setDisabledIcon(reves);
        opcion19.setIcon(reves);
        opcion19.setDisabledIcon(reves);
         opcion20.setIcon(reves);
         opcion20.setDisabledIcon(reves);
        opcion21.setIcon(reves);
        opcion21.setDisabledIcon(reves);
        opcion22.setIcon(reves);
        opcion22.setDisabledIcon(reves);
        opcion23.setIcon(reves);
        opcion23.setDisabledIcon(reves);
         opcion24.setIcon(reves);
         opcion24.setDisabledIcon(reves);
        opcion25.setIcon(reves);
        opcion25.setDisabledIcon(reves);
        opcion26.setIcon(reves);
        opcion26.setDisabledIcon(reves);
        opcion27.setIcon(reves);
        opcion27.setDisabledIcon(reves);
         opcion28.setIcon(reves);
         opcion28.setDisabledIcon(reves);
        opcion29.setIcon(reves);
        opcion29.setDisabledIcon(reves);
        opcion30.setIcon(reves);
        opcion30.setDisabledIcon(reves);
        opcion31.setIcon(reves);
        opcion31.setDisabledIcon(reves);
         opcion32.setIcon(reves);
         opcion32.setDisabledIcon(reves);
        opcion33.setIcon(reves);
        opcion33.setDisabledIcon(reves);
        opcion34.setIcon(reves);
        opcion34.setDisabledIcon(reves);
        opcion35.setIcon(reves);
        opcion35.setDisabledIcon(reves);
         opcion36.setIcon(reves);
         opcion36.setDisabledIcon(reves);
        opcion37.setIcon(reves);
        opcion37.setDisabledIcon(reves);
        opcion38.setIcon(reves);
        opcion38.setDisabledIcon(reves);
        opcion39.setIcon(reves);
        opcion39.setDisabledIcon(reves);
}
public Dimension escalar(Dimension imagen){
   int ancho_original=(int) imagen.getWidth();
   int alto_original=(int) imagen.getHeight();
   int ancho_boton=opcion.getSize().width;
   int alto_boton=opcion.getSize().height;
   int nuevo_ancho=ancho_original;
   int nuevo_alto=alto_original;
   
   //se nesesita escalar?
   if(ancho_original>ancho_boton){
       //se escala ancho para que encaje
       nuevo_ancho=ancho_boton;
       //escalar altura para mantener las proporciones
       nuevo_alto=(nuevo_ancho*alto_original)/ancho_original;
   }
   //ahora se checa si se nesesita escalar con la nueva alltura
   if(nuevo_alto > alto_boton){
       //escalar altura para que encaje
       nuevo_alto=alto_boton;
       //escalar altura para mantener las proporciones
       nuevo_ancho=(nuevo_alto*ancho_original)/ancho_original;
   }
  
    return new Dimension(nuevo_ancho,nuevo_alto);
}
public void modomeme(){
    if(mememode.isSelected()){
       
       int alto= opcion.getSize().height;
       int ancho= opcion.getSize().width;
       ImageIcon troll= new javax.swing.ImageIcon(getClass().getResource("/img/memes/trollface.jpg"));
       ImageIcon cereal= new javax.swing.ImageIcon(getClass().getResource("/img/memes/cereal.jpg"));
       ImageIcon forever= new javax.swing.ImageIcon(getClass().getResource("/img/memes/forever.jpg"));
       ImageIcon lol= new javax.swing.ImageIcon(getClass().getResource("/img/memes/lol.jpg"));
       ImageIcon megusta= new javax.swing.ImageIcon(getClass().getResource("/img/memes/megusta.jpg"));
       ImageIcon yaoming= new javax.swing.ImageIcon(getClass().getResource("/img/memes/yaoming.jpg")); 
       
       Dimension tamtroll= new Dimension(troll.getImage().getHeight(this),troll.getImage().getWidth(this));
       Dimension tamcereal= new Dimension(cereal.getImage().getHeight(this),cereal.getImage().getWidth(this));
       Dimension tamforever= new Dimension(forever.getImage().getHeight(this),forever.getImage().getWidth(this));
       Dimension tamlol= new Dimension(lol.getImage().getHeight(this),lol.getImage().getWidth(this));
       Dimension tammegusta= new Dimension(megusta.getImage().getHeight(this),megusta.getImage().getWidth(this));
       Dimension tamyao= new Dimension(yaoming.getImage().getHeight(this),yaoming.getImage().getWidth(this));
       //escalar proporcionadamente las imagenes
       int troll_altura=escalar(tamtroll).getSize().height;
       int troll_ancho=escalar(tamtroll).getSize().width;
       int cereal_altura=escalar(tamcereal).getSize().height;
       int cereal_ancho=escalar(tamcereal).getSize().width;
       int for_altura=escalar(tamforever).getSize().height;
       int for_ancho=escalar(tamforever).getSize().width;
       int lol_altura=escalar(tamlol).getSize().height;
       int lol_ancho=escalar(tamlol).getSize().width;
       int me_altura=escalar(tammegusta).getSize().height;
       int me_ancho=escalar(tammegusta).getSize().width;
       int yao_altura=escalar(tamyao).getSize().height;
       int yao_ancho=escalar(tamyao).getSize().width;
       agua =new ImageIcon(troll.getImage().getScaledInstance(troll_altura, troll_ancho, Image.SCALE_DEFAULT));
       fuego=new ImageIcon(cereal.getImage().getScaledInstance(cereal_altura, cereal_ancho, Image.SCALE_DEFAULT));
       tierra=new ImageIcon(forever.getImage().getScaledInstance(for_altura, for_ancho, Image.SCALE_DEFAULT));
       aire=new ImageIcon(lol.getImage().getScaledInstance(lol_altura, lol_ancho, Image.SCALE_DEFAULT));
       neutro=new ImageIcon(megusta.getImage().getScaledInstance(me_altura, me_ancho, Image.SCALE_DEFAULT));
       stasis=new ImageIcon(yaoming.getImage().getScaledInstance(yao_altura, yao_ancho, Image.SCALE_DEFAULT));
       
       
    }
    else{
        
    agua= new javax.swing.ImageIcon(getClass().getResource("/img/agua.jpg"));
    fuego= new javax.swing.ImageIcon(getClass().getResource("/img/fuego.jpg"));
    tierra= new javax.swing.ImageIcon(getClass().getResource("/img/tierra.jpg"));
    aire= new javax.swing.ImageIcon(getClass().getResource("/img/aire.jpg"));
    neutro= new javax.swing.ImageIcon(getClass().getResource("/img/neutro.jpg"));
    stasis= new javax.swing.ImageIcon(getClass().getResource("/img/stasis.jpg"));  
    }
    
}
public boolean repetidosyvacios(){
    boolean error=false;
        if(A[intento]==B[intento] || A[intento]==C[intento] || A[intento]==D[intento]|| A[intento]==9){
             error=true;
             System.out.println("se repitio A");
        }
        if(B[intento]==C[intento] || B[intento]==D[intento] || B[intento]==9){
             error=true;
             System.out.println("se repitio B");
        }
        if(C[intento]==D[intento] || C[intento]==9){
             error=true;
             System.out.println("se repitio C");
        }
        if(D[intento]==9){
             error=true;
             System.out.println("se repitio D");
        }
        System.out.println("---------");
        System.out.println("termino intento numero"+intento);
        System.out.println("---------");
        return(error);
}

public void deshabilita(){
        opcion.setEnabled(false);
        opcion1.setEnabled(false);
        opcion2.setEnabled(false);
        opcion3.setEnabled(false);
        opcion4.setEnabled(false);
        opcion5.setEnabled(false);
        opcion6.setEnabled(false);
        opcion7.setEnabled(false);
        opcion8.setEnabled(false);
        opcion9.setEnabled(false);
        opcion10.setEnabled(false);
        opcion11.setEnabled(false);
        opcion12.setEnabled(false);
        opcion13.setEnabled(false);
        opcion14.setEnabled(false);
        opcion15.setEnabled(false);
        opcion16.setEnabled(false);
        opcion17.setEnabled(false);
        opcion18.setEnabled(false);
        opcion19.setEnabled(false);
        opcion20.setEnabled(false);
        opcion21.setEnabled(false);
        opcion22.setEnabled(false);
        opcion23.setEnabled(false);
        opcion24.setEnabled(false);
        opcion25.setEnabled(false);
        opcion26.setEnabled(false);
        opcion27.setEnabled(false);
        opcion28.setEnabled(false);
        opcion29.setEnabled(false);
        opcion30.setEnabled(false);
        opcion31.setEnabled(false);
        opcion32.setEnabled(false);
        opcion33.setEnabled(false);
        opcion34.setEnabled(false);
        opcion35.setEnabled(false);
        opcion36.setEnabled(false);
        opcion37.setEnabled(false);
        opcion38.setEnabled(false);
        opcion39.setEnabled(false);
        Verificar.setEnabled(false);
        Verificar1.setEnabled(false);
        Verificar2.setEnabled(false);
        Verificar3.setEnabled(false);
        Verificar4.setEnabled(false);
        Verificar5.setEnabled(false);
        Verificar6.setEnabled(false);
        Verificar7.setEnabled(false);
        Verificar8.setEnabled(false);
        Verificar9.setEnabled(false);

        
}
public void descubrir(){
    switch(RespA){
            case 0:
                RespuestaA.setIcon(agua);
                break;             
            case 1:
                RespuestaA.setIcon(fuego);
                break;
            case 2:
                RespuestaA.setIcon(tierra);
                break;
            case 3:
                RespuestaA.setIcon(aire);
                break;
            case 4:
                RespuestaA.setIcon(stasis);
                break;
            case 5:
                RespuestaA.setIcon(neutro);
                break;
                
        }
                switch(RespB){
            case 0:
                RespuestaB.setIcon(agua);
                break;             
            case 1:
                RespuestaB.setIcon(fuego);
                break;
            case 2:
                RespuestaB.setIcon(tierra);
                break;
            case 3:
                RespuestaB.setIcon(aire);
                break;
            case 4:
                RespuestaB.setIcon(stasis);
                break;
            case 5:
                RespuestaB.setIcon(neutro);
                break;
                
        }
                        switch(RespC){
            case 0:
                RespuestaC.setIcon(agua);
                break;             
            case 1:
                RespuestaC.setIcon(fuego);
                break;
            case 2:
                RespuestaC.setIcon(tierra);
                break;
            case 3:
                RespuestaC.setIcon(aire);
                break;
            case 4:
                RespuestaC.setIcon(stasis);
                break;
            case 5:
                RespuestaC.setIcon(neutro);
                break;
                
        }
                                switch(RespD){
            case 0:
                RespuestaD.setIcon(agua);
                break;             
            case 1:
                RespuestaD.setIcon(fuego);
                break;
            case 2:
                RespuestaD.setIcon(tierra);
                break;
            case 3:
                RespuestaD.setIcon(aire);
                break;
            case 4:
                RespuestaD.setIcon(stasis);
                break;
            case 5:
                RespuestaD.setIcon(neutro);
                break;
                
                                }
           Rendirse.setEnabled(false);
}

public int correctas(){
    int correctas=0;
    if (A[intento]==RespA){
        correctas++;
    }
    if (B[intento]==RespB){
        correctas++;
    }
    if (C[intento]==RespC){
        correctas++;
    }
    if (D[intento]==RespD){
        correctas++;
    }
    return(correctas);
}

public int cambiar(){
    int cambios=0;
    if(A[intento]==RespB || A[intento]==RespC ||A[intento]==RespD){
        cambios++;
    }
    if(B[intento]==RespC || B[intento]==RespD ||B[intento]==RespA){
        cambios++;
    }
    if(C[intento]==RespD || C[intento]==RespA ||C[intento]==RespB){
        cambios++;
    }
    if(D[intento]==RespA || D[intento]==RespB ||D[intento]==RespC){
        cambios++;
    }
    
    return(cambios);
}

public ImageIcon checar(){
    ImageIcon resultado=null;
    if(correctas()==1&&cambiar()==1){
        resultado=unobien_uncambio;
    }
    if(correctas()==1&&cambiar()==2){
        resultado=unobien_doscambio;
    }
    if(correctas()==1&&cambiar()==3){
        resultado=unobien_trescambio;
    }
    if(correctas()==0&&cambiar()==1){
        resultado=uncambio;
    }
    if(correctas()==2&&cambiar()==0){
        resultado=dosbien;
    }
    if(correctas()==2&&cambiar()==1){
        resultado=dosbien_uncambio;
    }
    if(correctas()==2&&cambiar()==2){
        resultado=dosbien_doscambio;
    }
    if(correctas()==0&&cambiar()==2){
        resultado=doscambio;
    }
    if(correctas()==3&&cambiar()==0){
        resultado=tresbien;
    }
    if(correctas()==0&&cambiar()==3){
        resultado=trescambio;
    }
    if(correctas()==3&&cambiar()==0){
        resultado=tresbien;
    }
    if(correctas()==4&&cambiar()==0){
        resultado=cuatrobien;
        String tiempofinal;
        tiempofinal = " ";
        if(dificil.isSelected()){
            timer.stop();
            tiempofinal=" Tiempo de resolucion: "+tiempototal.getText();
        }
        JOptionPane.showMessageDialog(null, "Resolviste la combinacion en el intento numero: "
                                       +(intento+1) +" , Felicidades!!!\n"+tiempofinal);
        
        descubrir();
    }
    if(correctas()==0&&cambiar()==4){
        resultado=cuatrocambio;
        
    }
    if(dificil.isSelected()){
    tiempo=60;}
    return(resultado);
}
    /**
     * Creates new form MenteMaestra
     */
    public MenteMaestra() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dificultad = new javax.swing.ButtonGroup();
        opcion = new javax.swing.JButton();
        opcion1 = new javax.swing.JButton();
        opcion2 = new javax.swing.JButton();
        opcion3 = new javax.swing.JButton();
        Verificar = new javax.swing.JButton();
        Titulin = new javax.swing.JLabel();
        RespuestaA = new javax.swing.JLabel();
        RespuestaB = new javax.swing.JLabel();
        RespuestaC = new javax.swing.JLabel();
        RespuestaD = new javax.swing.JLabel();
        Rendirse = new javax.swing.JButton();
        opcion4 = new javax.swing.JButton();
        opcion5 = new javax.swing.JButton();
        opcion6 = new javax.swing.JButton();
        opcion7 = new javax.swing.JButton();
        Verificar1 = new javax.swing.JButton();
        opcion8 = new javax.swing.JButton();
        opcion9 = new javax.swing.JButton();
        opcion10 = new javax.swing.JButton();
        opcion11 = new javax.swing.JButton();
        Verificar2 = new javax.swing.JButton();
        opcion12 = new javax.swing.JButton();
        opcion13 = new javax.swing.JButton();
        opcion14 = new javax.swing.JButton();
        opcion15 = new javax.swing.JButton();
        Verificar3 = new javax.swing.JButton();
        opcion16 = new javax.swing.JButton();
        opcion17 = new javax.swing.JButton();
        opcion18 = new javax.swing.JButton();
        opcion19 = new javax.swing.JButton();
        Verificar4 = new javax.swing.JButton();
        opcion20 = new javax.swing.JButton();
        opcion21 = new javax.swing.JButton();
        opcion22 = new javax.swing.JButton();
        opcion23 = new javax.swing.JButton();
        Verificar5 = new javax.swing.JButton();
        opcion24 = new javax.swing.JButton();
        opcion25 = new javax.swing.JButton();
        opcion26 = new javax.swing.JButton();
        opcion27 = new javax.swing.JButton();
        Verificar6 = new javax.swing.JButton();
        opcion28 = new javax.swing.JButton();
        opcion29 = new javax.swing.JButton();
        opcion30 = new javax.swing.JButton();
        opcion31 = new javax.swing.JButton();
        Verificar7 = new javax.swing.JButton();
        opcion32 = new javax.swing.JButton();
        opcion33 = new javax.swing.JButton();
        opcion34 = new javax.swing.JButton();
        opcion35 = new javax.swing.JButton();
        Verificar8 = new javax.swing.JButton();
        opcion36 = new javax.swing.JButton();
        opcion37 = new javax.swing.JButton();
        opcion38 = new javax.swing.JButton();
        opcion39 = new javax.swing.JButton();
        Verificar9 = new javax.swing.JButton();
        resul1 = new javax.swing.JLabel();
        resul2 = new javax.swing.JLabel();
        resul3 = new javax.swing.JLabel();
        resul4 = new javax.swing.JLabel();
        resul5 = new javax.swing.JLabel();
        resul6 = new javax.swing.JLabel();
        resul7 = new javax.swing.JLabel();
        resul8 = new javax.swing.JLabel();
        resul9 = new javax.swing.JLabel();
        resul10 = new javax.swing.JLabel();
        barratiempo = new javax.swing.JProgressBar();
        textotiempo = new javax.swing.JLabel();
        tiempototal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Juegonuevo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mememode = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        facil = new javax.swing.JRadioButtonMenuItem();
        dificil = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        acerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mente Maestra por Alejandro Ramirez");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1173, 555));
        setResizable(false);
        getContentPane().setLayout(null);

        opcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion.setDisabledIcon(null);
        opcion.setEnabled(false);
        opcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionActionPerformed(evt);
            }
        });
        getContentPane().add(opcion);
        opcion.setBounds(10, 80, 80, 70);

        opcion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion1.setEnabled(false);
        opcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion1ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion1);
        opcion1.setBounds(10, 160, 80, 70);

        opcion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion2.setEnabled(false);
        opcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion2ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion2);
        opcion2.setBounds(10, 240, 80, 70);

        opcion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion3.setEnabled(false);
        opcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion3ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion3);
        opcion3.setBounds(10, 330, 80, 70);

        Verificar.setText("Verificar");
        Verificar.setEnabled(false);
        Verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerificarActionPerformed(evt);
            }
        });
        getContentPane().add(Verificar);
        Verificar.setBounds(0, 410, 93, 25);

        Titulin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/titulin.png"))); // NOI18N
        Titulin.setText("jLabel1");
        getContentPane().add(Titulin);
        Titulin.setBounds(330, 20, 460, 60);

        RespuestaA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RespuestaA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/interrogacion.png"))); // NOI18N
        getContentPane().add(RespuestaA);
        RespuestaA.setBounds(1080, 80, 70, 60);

        RespuestaB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RespuestaB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/interrogacion.png"))); // NOI18N
        getContentPane().add(RespuestaB);
        RespuestaB.setBounds(1080, 160, 70, 60);

        RespuestaC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RespuestaC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/interrogacion.png"))); // NOI18N
        getContentPane().add(RespuestaC);
        RespuestaC.setBounds(1080, 240, 70, 60);

        RespuestaD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RespuestaD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/interrogacion.png"))); // NOI18N
        getContentPane().add(RespuestaD);
        RespuestaD.setBounds(1080, 320, 70, 60);

        Rendirse.setText("Rendirse");
        Rendirse.setEnabled(false);
        Rendirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RendirseActionPerformed(evt);
            }
        });
        getContentPane().add(Rendirse);
        Rendirse.setBounds(1040, 420, 110, 25);

        opcion4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion4.setEnabled(false);
        opcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion4ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion4);
        opcion4.setBounds(110, 80, 80, 70);

        opcion5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion5.setEnabled(false);
        opcion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion5ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion5);
        opcion5.setBounds(110, 160, 80, 70);

        opcion6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion6.setEnabled(false);
        opcion6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion6ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion6);
        opcion6.setBounds(110, 240, 80, 70);

        opcion7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion7.setEnabled(false);
        opcion7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion7ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion7);
        opcion7.setBounds(110, 330, 80, 70);

        Verificar1.setText("Verificar");
        Verificar1.setEnabled(false);
        Verificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Verificar1ActionPerformed(evt);
            }
        });
        getContentPane().add(Verificar1);
        Verificar1.setBounds(100, 410, 93, 25);

        opcion8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion8.setEnabled(false);
        opcion8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion8ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion8);
        opcion8.setBounds(210, 80, 80, 70);

        opcion9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion9.setEnabled(false);
        opcion9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion9ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion9);
        opcion9.setBounds(210, 160, 80, 70);

        opcion10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion10.setEnabled(false);
        opcion10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion10ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion10);
        opcion10.setBounds(210, 240, 80, 70);

        opcion11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion11.setEnabled(false);
        opcion11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion11ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion11);
        opcion11.setBounds(210, 330, 80, 70);

        Verificar2.setText("Verificar");
        Verificar2.setEnabled(false);
        Verificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Verificar2ActionPerformed(evt);
            }
        });
        getContentPane().add(Verificar2);
        Verificar2.setBounds(200, 410, 93, 25);

        opcion12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion12.setEnabled(false);
        opcion12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion12ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion12);
        opcion12.setBounds(310, 80, 80, 70);

        opcion13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion13.setEnabled(false);
        opcion13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion13ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion13);
        opcion13.setBounds(310, 160, 80, 70);

        opcion14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion14.setEnabled(false);
        opcion14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion14ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion14);
        opcion14.setBounds(310, 240, 80, 70);

        opcion15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion15.setEnabled(false);
        opcion15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion15ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion15);
        opcion15.setBounds(310, 330, 80, 70);

        Verificar3.setText("Verificar");
        Verificar3.setEnabled(false);
        Verificar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Verificar3ActionPerformed(evt);
            }
        });
        getContentPane().add(Verificar3);
        Verificar3.setBounds(300, 410, 93, 25);

        opcion16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion16.setEnabled(false);
        opcion16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion16ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion16);
        opcion16.setBounds(410, 80, 80, 70);

        opcion17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion17.setEnabled(false);
        opcion17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion17ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion17);
        opcion17.setBounds(410, 160, 80, 70);

        opcion18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion18.setEnabled(false);
        opcion18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion18ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion18);
        opcion18.setBounds(410, 240, 80, 70);

        opcion19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion19.setEnabled(false);
        opcion19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion19ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion19);
        opcion19.setBounds(410, 330, 80, 70);

        Verificar4.setText("Verificar");
        Verificar4.setEnabled(false);
        Verificar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Verificar4ActionPerformed(evt);
            }
        });
        getContentPane().add(Verificar4);
        Verificar4.setBounds(400, 410, 93, 25);

        opcion20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion20.setEnabled(false);
        opcion20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion20ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion20);
        opcion20.setBounds(510, 80, 80, 70);

        opcion21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion21.setEnabled(false);
        opcion21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion21ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion21);
        opcion21.setBounds(510, 160, 80, 70);

        opcion22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion22.setEnabled(false);
        opcion22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion22ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion22);
        opcion22.setBounds(510, 240, 80, 70);

        opcion23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion23.setEnabled(false);
        opcion23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion23ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion23);
        opcion23.setBounds(510, 330, 80, 70);

        Verificar5.setText("Verificar");
        Verificar5.setEnabled(false);
        Verificar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Verificar5ActionPerformed(evt);
            }
        });
        getContentPane().add(Verificar5);
        Verificar5.setBounds(500, 410, 93, 25);

        opcion24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion24.setEnabled(false);
        opcion24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion24ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion24);
        opcion24.setBounds(610, 80, 80, 70);

        opcion25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion25.setEnabled(false);
        opcion25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion25ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion25);
        opcion25.setBounds(610, 160, 80, 70);

        opcion26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion26.setEnabled(false);
        opcion26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion26ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion26);
        opcion26.setBounds(610, 240, 80, 70);

        opcion27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion27.setEnabled(false);
        opcion27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion27ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion27);
        opcion27.setBounds(610, 330, 80, 70);

        Verificar6.setText("Verificar");
        Verificar6.setEnabled(false);
        Verificar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Verificar6ActionPerformed(evt);
            }
        });
        getContentPane().add(Verificar6);
        Verificar6.setBounds(600, 410, 93, 25);

        opcion28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion28.setEnabled(false);
        opcion28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion28ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion28);
        opcion28.setBounds(710, 80, 80, 70);

        opcion29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion29.setEnabled(false);
        opcion29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion29ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion29);
        opcion29.setBounds(710, 160, 80, 70);

        opcion30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion30.setEnabled(false);
        opcion30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion30ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion30);
        opcion30.setBounds(710, 240, 80, 70);

        opcion31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion31.setEnabled(false);
        opcion31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion31ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion31);
        opcion31.setBounds(710, 330, 80, 70);

        Verificar7.setText("Verificar");
        Verificar7.setEnabled(false);
        Verificar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Verificar7ActionPerformed(evt);
            }
        });
        getContentPane().add(Verificar7);
        Verificar7.setBounds(700, 410, 93, 25);

        opcion32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion32.setEnabled(false);
        opcion32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion32ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion32);
        opcion32.setBounds(810, 80, 80, 70);

        opcion33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion33.setEnabled(false);
        opcion33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion33ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion33);
        opcion33.setBounds(810, 160, 80, 70);

        opcion34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion34.setEnabled(false);
        opcion34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion34ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion34);
        opcion34.setBounds(810, 240, 80, 70);

        opcion35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion35.setEnabled(false);
        opcion35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion35ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion35);
        opcion35.setBounds(810, 330, 80, 70);

        Verificar8.setText("Verificar");
        Verificar8.setEnabled(false);
        Verificar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Verificar8ActionPerformed(evt);
            }
        });
        getContentPane().add(Verificar8);
        Verificar8.setBounds(800, 410, 93, 25);

        opcion36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion36.setEnabled(false);
        opcion36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion36ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion36);
        opcion36.setBounds(920, 80, 80, 70);

        opcion37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion37.setEnabled(false);
        opcion37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion37ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion37);
        opcion37.setBounds(920, 160, 80, 70);

        opcion38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion38.setEnabled(false);
        opcion38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion38ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion38);
        opcion38.setBounds(920, 240, 80, 70);

        opcion39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reves.png"))); // NOI18N
        opcion39.setEnabled(false);
        opcion39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion39ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion39);
        opcion39.setBounds(920, 330, 80, 70);

        Verificar9.setText("Verificar");
        Verificar9.setEnabled(false);
        Verificar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Verificar9ActionPerformed(evt);
            }
        });
        getContentPane().add(Verificar9);
        Verificar9.setBounds(910, 410, 93, 25);

        resul1.setText("1");
        getContentPane().add(resul1);
        resul1.setBounds(20, 440, 60, 60);

        resul2.setText("2");
        getContentPane().add(resul2);
        resul2.setBounds(130, 440, 60, 60);

        resul3.setText("3");
        getContentPane().add(resul3);
        resul3.setBounds(230, 440, 60, 60);

        resul4.setText("4");
        getContentPane().add(resul4);
        resul4.setBounds(330, 440, 60, 60);

        resul5.setText("5");
        getContentPane().add(resul5);
        resul5.setBounds(430, 440, 60, 60);

        resul6.setText("6");
        getContentPane().add(resul6);
        resul6.setBounds(530, 440, 60, 60);

        resul7.setText("7");
        getContentPane().add(resul7);
        resul7.setBounds(630, 440, 60, 60);

        resul8.setText("8");
        getContentPane().add(resul8);
        resul8.setBounds(730, 440, 60, 60);

        resul9.setText("9");
        getContentPane().add(resul9);
        resul9.setBounds(830, 440, 60, 60);

        resul10.setText("10");
        getContentPane().add(resul10);
        resul10.setBounds(930, 440, 60, 60);

        barratiempo.setMaximum(60);
        getContentPane().add(barratiempo);
        barratiempo.setBounds(1010, 30, 148, 20);

        textotiempo.setText(" ");
        getContentPane().add(textotiempo);
        textotiempo.setBounds(940, 30, 70, 15);

        tiempototal.setText(" ");
        getContentPane().add(tiempototal);
        tiempototal.setBounds(1050, 60, 80, 15);

        Juegonuevo.setText("Juego");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Juego Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Juegonuevo.add(jMenuItem1);

        mememode.setText("modo meme");
        Juegonuevo.add(mememode);

        jMenuBar1.add(Juegonuevo);

        jMenu1.setText("Dificultad");

        jMenuItem3.setText("Nesesitas Comenzar nuevo juego");
        jMenuItem3.setEnabled(false);
        jMenu1.add(jMenuItem3);

        dificultad.add(facil);
        facil.setSelected(true);
        facil.setText("Facil");
        facil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facilActionPerformed(evt);
            }
        });
        jMenu1.add(facil);

        dificultad.add(dificil);
        dificil.setText("Dificil");
        dificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dificilActionPerformed(evt);
            }
        });
        jMenu1.add(dificil);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Instrucciones");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Simbologia");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        acerca.setText("Acerca de");
        acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaActionPerformed(evt);
            }
        });
        jMenu2.add(acerca);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionActionPerformed
     estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion.setBackground(Color.cyan);
                opcion.setIcon(agua);
                opcion.setDisabledIcon(agua);
                A[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion.setBackground(Color.yellow);
                opcion.setIcon(fuego);
                opcion.setDisabledIcon(fuego);
                A[intento]=1;
                break;
                
            case 2:
                //opcion.setBackground(Color.green);
                opcion.setIcon(tierra);
                opcion.setDisabledIcon(tierra);
                A[intento]=2;
                break;
            case 3:
                //opcion.setBackground(Color.red);
                opcion.setIcon(aire);
                opcion.setDisabledIcon(aire);
                A[intento]=3;
                break;
            case 4:
                opcion.setIcon(stasis);
                opcion.setDisabledIcon(stasis);
                A[intento]=4;
                break;
            case 5:
                opcion.setIcon(neutro);
                opcion.setDisabledIcon(neutro);
                A[intento]=5;
                break;
          
        }
     //   String debug=logdebug.getText();
      //          logdebug.setText("Opcion A vale:"+Integer.toString(A[intento])+"\n" +debug);
         // TODO add your handling code here:
    }//GEN-LAST:event_opcionActionPerformed

    private void opcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion1ActionPerformed
            estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion1.setBackground(Color.cyan);
                opcion1.setIcon(agua);
                opcion1.setDisabledIcon(agua);
                B[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion1.setBackground(Color.yellow);
                opcion1.setIcon(fuego);
                opcion1.setDisabledIcon(fuego);
                B[intento]=1;
                break;
                
            case 2:
                //opcion1.setBackground(Color.green);
                opcion1.setIcon(tierra);
                opcion1.setDisabledIcon(tierra);
                B[intento]=2;
                break;
            case 3:
                //opcion1.setBackground(Color.red);
                opcion1.setIcon(aire);
                opcion1.setDisabledIcon(aire);
                B[intento]=3;
                break;
                case 4:
                opcion1.setIcon(stasis);
                opcion1.setDisabledIcon(stasis);
                B[intento]=4;
                break;
            case 5:
                opcion1.setIcon(neutro);
                opcion1.setDisabledIcon(neutro);
                B[intento]=5;
                break;
          
        } // TODO add your handling code here:
//        String debug=logdebug.getText();
  //              logdebug.setText("Opcion B vale:"+Integer.toString(B[intento])+"\n" +debug);
    }//GEN-LAST:event_opcion1ActionPerformed

    private void opcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion2ActionPerformed
           estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion2.setBackground(Color.cyan);
                opcion2.setIcon(agua);
                opcion2.setDisabledIcon(agua);
                C[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion2.setBackground(Color.yellow);
                opcion2.setIcon(fuego);
                opcion2.setDisabledIcon(fuego);
                C[intento]=1;
                break;
                
            case 2:
                //opcion2.setBackground(Color.green);
                opcion2.setIcon(tierra);
                opcion2.setDisabledIcon(tierra);
                C[intento]=2;
                break;
            case 3:
                //opcion2.setBackground(Color.red);
                opcion2.setIcon(aire);
                opcion2.setDisabledIcon(aire);
                C[intento]=3;
                break;
            case 4:
                opcion2.setIcon(stasis);
                opcion2.setDisabledIcon(stasis);
                C[intento]=4;
                break;
            case 5:
                opcion2.setIcon(neutro);
                opcion2.setDisabledIcon(neutro);
                C[intento]=5;
                break;
          
        }  // TODO add your handling code here:
//        String debug=logdebug.getText();
  //              logdebug.setText("Opcion C vale:"+Integer.toString(C[intento])+"\n" +debug);
    }//GEN-LAST:event_opcion2ActionPerformed

    private void opcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion3ActionPerformed
             estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion3.setBackground(Color.cyan);
                opcion3.setIcon(agua);
                opcion3.setDisabledIcon(agua);
                D[intento]=0;
                break;
            case 1:
                //opcion3.setBackground(Color.yellow);
                opcion3.setIcon(fuego);
                opcion3.setDisabledIcon(fuego);
                D[intento]=1;
                break;
                
            case 2:
                //opcion3.setBackground(Color.green);
                opcion3.setIcon(tierra);
                opcion3.setDisabledIcon(tierra);
                D[intento]=2;
                break;
            case 3:
                //opcion3.setBackground(Color.red);
                opcion3.setIcon(aire);
                opcion3.setDisabledIcon(aire);
                D[intento]=3;
                break;
           case 4:
                opcion3.setIcon(stasis);
                opcion3.setDisabledIcon(stasis);
                D[intento]=4;
                break;
            case 5:
                opcion3.setIcon(neutro);
                opcion3.setDisabledIcon(neutro);
                D[intento]=5;
                break;
          
        }// TODO add your handling code here:
       
    }//GEN-LAST:event_opcion3ActionPerformed

    private void VerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerificarActionPerformed
        if(repetidosyvacios()){
        JOptionPane.showMessageDialog(null,"No se permiten simbolos iguales o sin descubrir","",JOptionPane.PLAIN_MESSAGE,resp);
        }else{
        opcion.setEnabled(false);
        opcion1.setEnabled(false);
        opcion2.setEnabled(false);
        opcion3.setEnabled(false);
        Verificar.setEnabled(false);
        //verifica los que estan correctos y si los 4 estan bien aparece el mensaje
        resul1.setIcon(checar());
        //activa el siguiente intento si no hay resultado positivo
        if(correctas()!=4){
        opcion4.setEnabled(true);
        opcion5.setEnabled(true);
        opcion6.setEnabled(true);
        opcion7.setEnabled(true);
        intento++;
        Verificar1.setEnabled(true);}
        }
       
        
        
 
    }//GEN-LAST:event_VerificarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        modomeme();
        ocultapistas();
        deshabilita();
        //SE COMIENZA NUEVO JUEGO SE REINICIAN LOS ARREGLOS
        for (int i = 0; i < A.length; i++) {
            A[i]=9;           
        }
        for (int i = 0; i < B.length; i++) {
            B[i]=9;
            
        }
        for (int i = 0; i < C.length; i++) {
            C[i]=9;
            
        }
        for (int i = 0; i < D.length; i++) {
            D[i]=9;
            
        }
        //Generar las nuevas respuestas
        RespA=(int) Math.floor(Math.random()*6);
        RespB=(int) Math.floor(Math.random()*6);
        while(RespB==RespA){
            RespB=(int) Math.floor(Math.random()*6);
//            logdebug.setText("B se repitio nuevo numero: "+Integer.toString(RespB));
        }
        RespC=(int) Math.floor(Math.random()*6);
        while(RespC==RespA || RespC==RespB){
            RespC=(int) Math.floor(Math.random()*6);
  //          logdebug.setText("C se repitio nuevo numero: "+Integer.toString(RespC));
        }
        RespD=(int) Math.floor(Math.random()*6);
        while(RespD==RespA || RespD==RespB || RespD==RespC){
            RespD=(int) Math.floor(Math.random()*6);
    //        logdebug.setText("D se repitio nuevo numero: "+Integer.toString(RespD));
        }
        //se cubren las respuestas
        cubrir();
      //  logdebug.setText("La respuesta es: "+Integer.toString(RespD)+Integer.toString(RespC)+Integer.toString(RespB)+Integer.toString(RespA));
        //ACTIVAR LOS BOTONES DEL PRIMER INTENTO
        opcion.setEnabled(true);
        opcion1.setEnabled(true);
        opcion2.setEnabled(true);
        opcion3.setEnabled(true);
        Verificar.setEnabled(true);
        Rendirse.setEnabled(true);
       
        //ACTIVAR LOS BOTONES DEL SEGUNDO INTENTO
        
        //REINICIAR INTENTO A CERO
        intento=0;
        timer.stop();
            min=0;
            segs=0;
            tiempo=60;
            textotiempo.setText(" ");
            tiempototal.setText(" ");
            barratiempo.setValue(0);
        if(dificil.isSelected()==true){
            System.out.println("modo dificil");            
            timer.start();
            
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void RendirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RendirseActionPerformed
    //se descubren las respuestas 
        timer.stop();
        descubrir();
         JOptionPane.showMessageDialog(null, "No has podido resolverlo la respuesta es la siguiente!!! y te rendiste al intento numero: "+intento);
        //SE DESAHBILITAN LAS OPCIONES
         deshabilita();
         
        // TODO add your handling code here:
    }//GEN-LAST:event_RendirseActionPerformed

    private void opcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion4ActionPerformed
             estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion1.setBackground(Color.cyan);
                opcion4.setIcon(agua);
                opcion4.setDisabledIcon(agua);
                A[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion1.setBackground(Color.yellow);
                opcion4.setIcon(fuego);
                opcion4.setDisabledIcon(fuego);
                A[intento]=1;
                break;
                
            case 2:
                //opcion1.setBackground(Color.green);
                opcion4.setIcon(tierra);
                opcion4.setDisabledIcon(tierra);
                A[intento]=2;
                break;
            case 3:
                //opcion1.setBackground(Color.red);
                opcion4.setIcon(aire);
                opcion4.setDisabledIcon(aire);
                A[intento]=3;
                break;
                case 4:
                opcion4.setIcon(stasis);
                opcion4.setDisabledIcon(stasis);
                A[intento]=4;
                break;
            case 5:
                opcion4.setIcon(neutro);
                opcion4.setDisabledIcon(neutro);
                A[intento]=5;
                break;
          
        } // TODO add your handling code here:
        //String debug=logdebug.getText();
         //       logdebug.setText("Opcion B vale:"+Integer.toString(B[intento])+"\n" +debug);   // TODO add your handling code here:
    }//GEN-LAST:event_opcion4ActionPerformed

    private void opcion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion5ActionPerformed
            estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion1.setBackground(Color.cyan);
                opcion5.setIcon(agua);
                opcion5.setDisabledIcon(agua);
                B[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion1.setBackground(Color.yellow);
                opcion5.setIcon(fuego);
                opcion5.setDisabledIcon(fuego);
                B[intento]=1;
                break;
                
            case 2:
                //opcion1.setBackground(Color.green);
                opcion5.setIcon(tierra);
                opcion5.setDisabledIcon(tierra);
                B[intento]=2;
                break;
            case 3:
                //opcion1.setBackground(Color.red);
                opcion5.setIcon(aire);
                opcion5.setDisabledIcon(aire);
                B[intento]=3;
                break;
                case 4:
                opcion5.setIcon(stasis);
                opcion5.setDisabledIcon(stasis);
                B[intento]=4;
                break;
            case 5:
                opcion5.setIcon(neutro);
                opcion5.setDisabledIcon(neutro);
                B[intento]=5;
                break;
          
        }   // TODO add your handling code here:
    }//GEN-LAST:event_opcion5ActionPerformed

    private void opcion6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion6ActionPerformed
                estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion1.setBackground(Color.cyan);
                opcion6.setIcon(agua);
                opcion6.setDisabledIcon(agua);
                C[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion1.setBackground(Color.yellow);
                opcion6.setIcon(fuego);
                opcion6.setDisabledIcon(fuego);
                C[intento]=1;
                break;
                
            case 2:
                //opcion1.setBackground(Color.green);
                opcion6.setIcon(tierra);
                opcion6.setDisabledIcon(tierra);
                C[intento]=2;
                break;
            case 3:
                //opcion1.setBackground(Color.red);
                opcion6.setIcon(aire);
                opcion6.setDisabledIcon(aire);
                C[intento]=3;
                break;
                case 4:
                opcion6.setIcon(stasis);
                opcion6.setDisabledIcon(stasis);
                C[intento]=4;
                break;
            case 5:
                opcion6.setIcon(neutro);
                opcion6.setDisabledIcon(neutro);
                C[intento]=5;
                break;
          
        }    // TODO add your handling code here:
    }//GEN-LAST:event_opcion6ActionPerformed

    private void opcion7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion7ActionPerformed
                estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion1.setBackground(Color.cyan);
                opcion7.setIcon(agua);
                opcion7.setDisabledIcon(agua);
                D[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion1.setBackground(Color.yellow);
                opcion7.setIcon(fuego);
                opcion7.setDisabledIcon(fuego);
                D[intento]=1;
                break;
                
            case 2:
                //opcion1.setBackground(Color.green);
                opcion7.setIcon(tierra);
                opcion7.setDisabledIcon(tierra);
                D[intento]=2;
                break;
            case 3:
                //opcion1.setBackground(Color.red);
                opcion7.setIcon(aire);
                opcion7.setDisabledIcon(aire);
                D[intento]=3;
                break;
                case 4:
                opcion7.setIcon(stasis);
                opcion7.setDisabledIcon(stasis);
                D[intento]=4;
                break;
            case 5:
                opcion7.setIcon(neutro);
                opcion7.setDisabledIcon(neutro);
                D[intento]=5;
                break;
          
        }    // TODO add your handling code here:
    }//GEN-LAST:event_opcion7ActionPerformed

    private void Verificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Verificar1ActionPerformed
if(repetidosyvacios()==true){
        JOptionPane.showMessageDialog(null,"No se permiten simbolos iguales o sin descubrir","",JOptionPane.PLAIN_MESSAGE,resp);
        }else{            opcion4.setEnabled(false);
        opcion5.setEnabled(false);
        opcion6.setEnabled(false);
        opcion7.setEnabled(false);
        Verificar1.setEnabled(false);
        resul2.setIcon(checar());
        if(correctas()!=4){
        intento++;
        opcion8.setEnabled(true);
        opcion9.setEnabled(true);
        opcion10.setEnabled(true);
        opcion11.setEnabled(true);
        Verificar2.setEnabled(true);}
        }

            // TODO add your handling code here:
    }//GEN-LAST:event_Verificar1ActionPerformed

    private void opcion8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion8ActionPerformed
 estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion.setBackground(Color.cyan);
                opcion8.setIcon(agua);
                opcion8.setDisabledIcon(agua);
                A[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion.setBackground(Color.yellow);
                opcion8.setIcon(fuego);
                opcion8.setDisabledIcon(fuego);
                A[intento]=1;
                break;
                
            case 2:
                //opcion.setBackground(Color.green);
                opcion8.setIcon(tierra);
                opcion8.setDisabledIcon(tierra);
                A[intento]=2;
                break;
            case 3:
                //opcion.setBackground(Color.red);
                opcion8.setIcon(aire);
                opcion8.setDisabledIcon(aire);
                A[intento]=3;
                break;
            case 4:
                opcion8.setIcon(stasis);
                opcion8.setDisabledIcon(stasis);
                A[intento]=4;
                break;
            case 5:
                opcion8.setIcon(neutro);
                opcion8.setDisabledIcon(neutro);
                A[intento]=5;
                break;
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opcion8ActionPerformed

    private void opcion9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion9ActionPerformed
     estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion1.setBackground(Color.cyan);
                opcion9.setIcon(agua);
                opcion9.setDisabledIcon(agua);
                B[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion1.setBackground(Color.yellow);
                opcion9.setIcon(fuego);
                opcion9.setDisabledIcon(fuego);
                B[intento]=1;
                break;
                
            case 2:
                //opcion1.setBackground(Color.green);
                opcion9.setIcon(tierra);
                opcion9.setDisabledIcon(tierra);
                B[intento]=2;
                break;
            case 3:
                //opcion1.setBackground(Color.red);
                opcion9.setIcon(aire);
                opcion9.setDisabledIcon(aire);
                B[intento]=3;
                break;
                case 4:
                opcion9.setIcon(stasis);
                opcion9.setDisabledIcon(stasis);
                B[intento]=4;
                break;
            case 5:
                opcion9.setIcon(neutro);
                opcion9.setDisabledIcon(neutro);
                B[intento]=5;
                break;
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opcion9ActionPerformed

    private void opcion10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion10ActionPerformed
           estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion2.setBackground(Color.cyan);
                opcion10.setIcon(agua);
                opcion10.setDisabledIcon(agua);
                C[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion2.setBackground(Color.yellow);
                opcion10.setIcon(fuego);
                opcion10.setDisabledIcon(fuego);
                C[intento]=1;
                break;
                
            case 2:
                //opcion2.setBackground(Color.green);
                opcion10.setIcon(tierra);
                opcion10.setDisabledIcon(tierra);
                C[intento]=2;
                break;
            case 3:
                //opcion2.setBackground(Color.red);
                opcion10.setIcon(aire);
                opcion10.setDisabledIcon(aire);
                C[intento]=3;
                break;
            case 4:
                opcion10.setIcon(stasis);
                opcion10.setDisabledIcon(stasis);
                C[intento]=4;
                break;
            case 5:
                opcion10.setIcon(neutro);
                opcion10.setDisabledIcon(neutro);
                C[intento]=5;
                break;
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opcion10ActionPerformed

    private void opcion11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion11ActionPerformed
             estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion3.setBackground(Color.cyan);
                opcion11.setIcon(agua);
                opcion11.setDisabledIcon(agua);
                D[intento]=0;
                break;
            case 1:
                //opcion3.setBackground(Color.yellow);
                opcion11.setIcon(fuego);
                opcion11.setDisabledIcon(fuego);
                D[intento]=1;
                break;
                
            case 2:
                //opcion3.setBackground(Color.green);
                opcion11.setIcon(tierra);
                opcion11.setDisabledIcon(tierra);
                D[intento]=2;
                break;
            case 3:
                //opcion3.setBackground(Color.red);
                opcion11.setIcon(aire);
                opcion11.setDisabledIcon(aire);
                D[intento]=3;
                break;
           case 4:
                opcion11.setIcon(stasis);
                opcion11.setDisabledIcon(stasis);
                D[intento]=4;
                break;
            case 5:
                opcion11.setIcon(neutro);
                opcion11.setDisabledIcon(neutro);
                D[intento]=5;
                break;
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opcion11ActionPerformed

    private void Verificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Verificar2ActionPerformed
if(repetidosyvacios()){
            JOptionPane.showMessageDialog(null, "No se permiten simbolos iguales o sin descubrir");
        }else{                opcion8.setEnabled(false);
        opcion9.setEnabled(false);
        opcion10.setEnabled(false);
        opcion11.setEnabled(false);
        Verificar2.setEnabled(false);
        
        resul3.setIcon(checar());
       if(correctas()!=4){
        intento++;
        
        opcion12.setEnabled(true);
        opcion13.setEnabled(true);
        opcion14.setEnabled(true);
        opcion15.setEnabled(true);
        Verificar3.setEnabled(true);}
       }
      
    }//GEN-LAST:event_Verificar2ActionPerformed

    private void opcion12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion12ActionPerformed
estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion.setBackground(Color.cyan);
                opcion12.setIcon(agua);
                opcion12.setDisabledIcon(agua);
                A[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion.setBackground(Color.yellow);
                opcion12.setIcon(fuego);
                opcion12.setDisabledIcon(fuego);
                A[intento]=1;
                break;
                
            case 2:
                //opcion.setBackground(Color.green);
                opcion12.setIcon(tierra);
                opcion12.setDisabledIcon(tierra);
                A[intento]=2;
                break;
            case 3:
                //opcion.setBackground(Color.red);
                opcion12.setIcon(aire);
                opcion12.setDisabledIcon(aire);
                A[intento]=3;
                break;
            case 4:
                opcion12.setIcon(stasis);
                opcion12.setDisabledIcon(stasis);
                A[intento]=4;
                break;
            case 5:
                opcion12.setIcon(neutro);
                opcion12.setDisabledIcon(neutro);
                A[intento]=5;
                break;
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opcion12ActionPerformed

    private void opcion13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion13ActionPerformed
    estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion1.setBackground(Color.cyan);
                opcion13.setIcon(agua);
                opcion13.setDisabledIcon(agua);
                B[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion1.setBackground(Color.yellow);
                opcion13.setIcon(fuego);
                opcion13.setDisabledIcon(fuego);
                B[intento]=1;
                break;
                
            case 2:
                //opcion1.setBackground(Color.green);
                opcion13.setIcon(tierra);
                opcion13.setDisabledIcon(tierra);
                B[intento]=2;
                break;
            case 3:
                //opcion1.setBackground(Color.red);
                opcion13.setIcon(aire);
                opcion13.setDisabledIcon(aire);
                B[intento]=3;
                break;
                case 4:
                opcion13.setIcon(stasis);
                opcion13.setDisabledIcon(stasis);
                B[intento]=4;
                break;
            case 5:
                opcion13.setIcon(neutro);
                opcion13.setDisabledIcon(neutro);
                B[intento]=5;
                break;
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opcion13ActionPerformed

    private void opcion14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion14ActionPerformed
          estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion2.setBackground(Color.cyan);
                opcion14.setIcon(agua);
                opcion14.setDisabledIcon(agua);
                C[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion2.setBackground(Color.yellow);
                opcion14.setIcon(fuego);
                opcion14.setDisabledIcon(fuego);
                C[intento]=1;
                break;
                
            case 2:
                //opcion2.setBackground(Color.green);
                opcion14.setIcon(tierra);
                opcion14.setDisabledIcon(tierra);
                C[intento]=2;
                break;
            case 3:
                //opcion2.setBackground(Color.red);
                opcion14.setIcon(aire);
                opcion14.setDisabledIcon(aire);
                C[intento]=3;
                break;
            case 4:
                opcion14.setIcon(stasis);
                opcion14.setDisabledIcon(stasis);
                C[intento]=4;
                break;
            case 5:
                opcion14.setIcon(neutro);
                opcion14.setDisabledIcon(neutro);
                C[intento]=5;
                break;
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opcion14ActionPerformed

    private void opcion15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion15ActionPerformed
             estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion3.setBackground(Color.cyan);
                opcion15.setIcon(agua);
                opcion15.setDisabledIcon(agua);
                D[intento]=0;
                break;
            case 1:
                //opcion3.setBackground(Color.yellow);
                opcion15.setIcon(fuego);
                opcion15.setDisabledIcon(fuego);
                D[intento]=1;
                break;
                
            case 2:
                //opcion3.setBackground(Color.green);
                opcion15.setIcon(tierra);
                opcion15.setDisabledIcon(tierra);
                D[intento]=2;
                break;
            case 3:
                //opcion3.setBackground(Color.red);
                opcion15.setIcon(aire);
                opcion15.setDisabledIcon(aire);
                D[intento]=3;
                break;
           case 4:
                opcion15.setIcon(stasis);
                opcion15.setDisabledIcon(stasis);
                D[intento]=4;
                break;
            case 5:
                opcion15.setIcon(neutro);
                opcion15.setDisabledIcon(neutro);
                D[intento]=5;
                break;
          
        }         // TODO add your handling code here:
    }//GEN-LAST:event_opcion15ActionPerformed

    private void Verificar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Verificar3ActionPerformed
if(repetidosyvacios()){
            JOptionPane.showMessageDialog(null, "No se permiten simbolos iguales o sin descubrir");
        }else{                opcion12.setEnabled(false);
        opcion13.setEnabled(false);
        opcion14.setEnabled(false);
        opcion15.setEnabled(false);
        Verificar3.setEnabled(false);
        resul4.setIcon(checar());
        if(correctas()!=4){
        intento++;
        
        opcion16.setEnabled(true);
        opcion17.setEnabled(true);
        opcion18.setEnabled(true);
        opcion19.setEnabled(true);
        Verificar4.setEnabled(true);}
        }
    }//GEN-LAST:event_Verificar3ActionPerformed

    private void opcion16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion16ActionPerformed
estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion.setBackground(Color.cyan);
                opcion16.setIcon(agua);
                opcion16.setDisabledIcon(agua);
                A[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion.setBackground(Color.yellow);
                opcion16.setIcon(fuego);
                opcion16.setDisabledIcon(fuego);
                A[intento]=1;
                break;
                
            case 2:
                //opcion.setBackground(Color.green);
                opcion16.setIcon(tierra);
                opcion16.setDisabledIcon(tierra);
                A[intento]=2;
                break;
            case 3:
                //opcion.setBackground(Color.red);
                opcion16.setIcon(aire);
                opcion16.setDisabledIcon(aire);
                A[intento]=3;
                break;
            case 4:
                opcion16.setIcon(stasis);
                opcion16.setDisabledIcon(stasis);
                A[intento]=4;
                break;
            case 5:
                opcion16.setIcon(neutro);
                opcion16.setDisabledIcon(neutro);
                A[intento]=5;
                break;
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opcion16ActionPerformed

    private void opcion17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion17ActionPerformed
    estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion1.setBackground(Color.cyan);
                opcion17.setIcon(agua);
                opcion17.setDisabledIcon(agua);
                B[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion1.setBackground(Color.yellow);
                opcion17.setIcon(fuego);
                opcion17.setDisabledIcon(fuego);
                B[intento]=1;
                break;
                
            case 2:
                //opcion1.setBackground(Color.green);
                opcion17.setIcon(tierra);
                opcion17.setDisabledIcon(tierra);
                B[intento]=2;
                break;
            case 3:
                //opcion1.setBackground(Color.red);
                opcion17.setIcon(aire);
                opcion17.setDisabledIcon(aire);
                B[intento]=3;
                break;
                case 4:
                opcion17.setIcon(stasis);
                opcion17.setDisabledIcon(stasis);
                B[intento]=4;
                break;
            case 5:
                opcion17.setIcon(neutro);
                opcion17.setDisabledIcon(neutro);
                B[intento]=5;
                break;
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opcion17ActionPerformed

    private void opcion18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion18ActionPerformed
          estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion2.setBackground(Color.cyan);
                opcion18.setIcon(agua);
                opcion18.setDisabledIcon(agua);
                C[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion2.setBackground(Color.yellow);
                opcion18.setIcon(fuego);
                opcion18.setDisabledIcon(fuego);
                C[intento]=1;
                break;
                
            case 2:
                //opcion2.setBackground(Color.green);
                opcion18.setIcon(tierra);
                opcion18.setDisabledIcon(tierra);
                C[intento]=2;
                break;
            case 3:
                //opcion2.setBackground(Color.red);
                opcion18.setIcon(aire);
                opcion18.setDisabledIcon(aire);
                C[intento]=3;
                break;
            case 4:
                opcion18.setIcon(stasis);
                opcion18.setDisabledIcon(stasis);
                C[intento]=4;
                break;
            case 5:
                opcion18.setIcon(neutro);
                opcion18.setDisabledIcon(neutro);
                C[intento]=5;
                break;
          
        }         // TODO add your handling code here:
    }//GEN-LAST:event_opcion18ActionPerformed

    private void opcion19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion19ActionPerformed
             estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion3.setBackground(Color.cyan);
                opcion19.setIcon(agua);
                opcion19.setDisabledIcon(agua);
                D[intento]=0;
                break;
            case 1:
                //opcion3.setBackground(Color.yellow);
                opcion19.setIcon(fuego);
                opcion19.setDisabledIcon(fuego);
                D[intento]=1;
                break;
                
            case 2:
                //opcion3.setBackground(Color.green);
                opcion19.setIcon(tierra);
                opcion19.setDisabledIcon(tierra);
                D[intento]=2;
                break;
            case 3:
                //opcion3.setBackground(Color.red);
                opcion19.setIcon(aire);
                opcion19.setDisabledIcon(aire);
                D[intento]=3;
                break;
           case 4:
                opcion19.setIcon(stasis);
                opcion19.setDisabledIcon(stasis);
                D[intento]=4;
                break;
            case 5:
                opcion19.setIcon(neutro);
                opcion19.setDisabledIcon(neutro);
                D[intento]=5;
                break;
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opcion19ActionPerformed

    private void Verificar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Verificar4ActionPerformed
if(repetidosyvacios()){
            JOptionPane.showMessageDialog(null, "No se permiten simbolos iguales o sin descubrir");
        }else{        opcion16.setEnabled(false);
        opcion17.setEnabled(false);
        opcion18.setEnabled(false);
        opcion19.setEnabled(false);
        Verificar4.setEnabled(false);
        resul5.setIcon(checar());
        if(correctas()!=4){
        intento++;
        Verificar5.setEnabled(true);
        opcion20.setEnabled(true);
        opcion21.setEnabled(true);
        opcion22.setEnabled(true);
        opcion23.setEnabled(true);}
        
            }    // TODO add your handling code here:
    }//GEN-LAST:event_Verificar4ActionPerformed

    private void opcion20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion20ActionPerformed
estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion.setBackground(Color.cyan);
                opcion20.setIcon(agua);
                opcion20.setDisabledIcon(agua);
                A[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion.setBackground(Color.yellow);
                opcion20.setIcon(fuego);
                opcion20.setDisabledIcon(fuego);
                A[intento]=1;
                break;
                
            case 2:
                //opcion.setBackground(Color.green);
                opcion20.setIcon(tierra);
                opcion20.setDisabledIcon(tierra);
                A[intento]=2;
                break;
            case 3:
                //opcion.setBackground(Color.red);
                opcion20.setIcon(aire);
                opcion20.setDisabledIcon(aire);
                A[intento]=3;
                break;
            case 4:
                opcion20.setIcon(stasis);
                opcion20.setDisabledIcon(stasis);
                A[intento]=4;
                break;
            case 5:
                opcion20.setIcon(neutro);
                opcion20.setDisabledIcon(neutro);
                A[intento]=5;
                break;
          
        }         // TODO add your handling code here:
    }//GEN-LAST:event_opcion20ActionPerformed

    private void opcion21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion21ActionPerformed
   estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion1.setBackground(Color.cyan);
                opcion21.setIcon(agua);
                opcion21.setDisabledIcon(agua);
                B[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion1.setBackground(Color.yellow);
                opcion21.setIcon(fuego);
                opcion21.setDisabledIcon(fuego);
                B[intento]=1;
                break;
                
            case 2:
                //opcion1.setBackground(Color.green);
                opcion21.setIcon(tierra);
                opcion21.setDisabledIcon(tierra);
                B[intento]=2;
                break;
            case 3:
                //opcion1.setBackground(Color.red);
                opcion21.setIcon(aire);
                opcion21.setDisabledIcon(aire);
                B[intento]=3;
                break;
                case 4:
                opcion21.setIcon(stasis);
                opcion21.setDisabledIcon(stasis);
                B[intento]=4;
                break;
            case 5:
                opcion21.setIcon(neutro);
                opcion21.setDisabledIcon(neutro);
                B[intento]=5;
                break;
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opcion21ActionPerformed

    private void opcion22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion22ActionPerformed
         estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion2.setBackground(Color.cyan);
                opcion22.setIcon(agua);
                opcion22.setDisabledIcon(agua);
                C[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion2.setBackground(Color.yellow);
                opcion22.setIcon(fuego);
                opcion22.setDisabledIcon(fuego);
                C[intento]=1;
                break;
                
            case 2:
                //opcion2.setBackground(Color.green);
                opcion22.setIcon(tierra);
                opcion22.setDisabledIcon(tierra);
                C[intento]=2;
                break;
            case 3:
                //opcion2.setBackground(Color.red);
                opcion22.setIcon(aire);
                opcion22.setDisabledIcon(aire);
                C[intento]=3;
                break;
            case 4:
                opcion22.setIcon(stasis);
                opcion22.setDisabledIcon(stasis);
                C[intento]=4;
                break;
            case 5:
                opcion22.setIcon(neutro);
                opcion22.setDisabledIcon(neutro);
                C[intento]=5;
                break;
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opcion22ActionPerformed

    private void opcion23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion23ActionPerformed
             estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion3.setBackground(Color.cyan);
                opcion23.setIcon(agua);
                opcion23.setDisabledIcon(agua);
                D[intento]=0;
                break;
            case 1:
                //opcion3.setBackground(Color.yellow);
                opcion23.setIcon(fuego);
                opcion23.setDisabledIcon(fuego);
                D[intento]=1;
                break;
                
            case 2:
                //opcion3.setBackground(Color.green);
                opcion23.setIcon(tierra);
                opcion23.setDisabledIcon(tierra);
                D[intento]=2;
                break;
            case 3:
                //opcion3.setBackground(Color.red);
                opcion23.setIcon(aire);
                opcion23.setDisabledIcon(tierra);
                D[intento]=3;
                break;
           case 4:
                opcion23.setIcon(stasis);
                opcion23.setDisabledIcon(stasis);
                D[intento]=4;
                break;
            case 5:
                opcion23.setIcon(neutro);
                opcion23.setDisabledIcon(neutro);
                D[intento]=5;
                break;
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opcion23ActionPerformed

    private void Verificar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Verificar5ActionPerformed
if(repetidosyvacios()){
            JOptionPane.showMessageDialog(null, "No se permiten simbolos iguales o sin descubrir");
        }else{        opcion20.setEnabled(false);
        opcion21.setEnabled(false);
        opcion22.setEnabled(false);
        opcion23.setEnabled(false);
        Verificar5.setEnabled(false);
        resul6.setIcon(checar());
        if(correctas()!=4){
        intento++;
        Verificar6.setEnabled(true);
        opcion24.setEnabled(true);
        opcion25.setEnabled(true);
        opcion26.setEnabled(true);
        opcion27.setEnabled(true);}
        
            }     // TODO add your handling code here:
    }//GEN-LAST:event_Verificar5ActionPerformed

    private void opcion24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion24ActionPerformed
estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion.setBackground(Color.cyan);
                opcion24.setIcon(agua);
                opcion24.setDisabledIcon(agua);
                A[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion.setBackground(Color.yellow);
                opcion24.setIcon(fuego);
                opcion24.setDisabledIcon(fuego);
                A[intento]=1;
                break;
                
            case 2:
                //opcion.setBackground(Color.green);
                opcion24.setIcon(tierra);
                opcion24.setDisabledIcon(tierra);
                A[intento]=2;
                break;
            case 3:
                //opcion.setBackground(Color.red);
                opcion24.setIcon(aire);
                opcion24.setDisabledIcon(aire);
                A[intento]=3;
                break;
            case 4:
                opcion24.setIcon(stasis);
                opcion24.setDisabledIcon(stasis);
                A[intento]=4;
                break;
            case 5:
                opcion24.setIcon(neutro);
                opcion24.setDisabledIcon(neutro);
                A[intento]=5;
                break;
          
        }         // TODO add your handling code here:
    }//GEN-LAST:event_opcion24ActionPerformed

    private void opcion25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion25ActionPerformed
  estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion1.setBackground(Color.cyan);
                opcion25.setIcon(agua);
                opcion25.setDisabledIcon(agua);
                B[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion1.setBackground(Color.yellow);
                opcion25.setIcon(fuego);
                opcion25.setDisabledIcon(fuego);
                B[intento]=1;
                break;
                
            case 2:
                //opcion1.setBackground(Color.green);
                opcion25.setIcon(tierra);
                opcion25.setDisabledIcon(tierra);
                B[intento]=2;
                break;
            case 3:
                //opcion1.setBackground(Color.red);
                opcion25.setIcon(aire);
                opcion25.setDisabledIcon(aire);
                B[intento]=3;
                break;
                case 4:
                opcion25.setIcon(stasis);
                opcion25.setDisabledIcon(stasis);
                B[intento]=4;
                break;
            case 5:
                opcion25.setIcon(neutro);
                opcion25.setDisabledIcon(neutro);
                B[intento]=5;
                break;
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opcion25ActionPerformed

    private void opcion26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion26ActionPerformed
         estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion2.setBackground(Color.cyan);
                opcion26.setIcon(agua);
                opcion26.setDisabledIcon(agua);
                C[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion2.setBackground(Color.yellow);
                opcion26.setIcon(fuego);
                opcion26.setDisabledIcon(fuego);
                C[intento]=1;
                break;
                
            case 2:
                //opcion2.setBackground(Color.green);
                opcion26.setIcon(tierra);
                opcion26.setDisabledIcon(tierra);
                C[intento]=2;
                break;
            case 3:
                //opcion2.setBackground(Color.red);
                opcion26.setIcon(aire);
                opcion26.setDisabledIcon(aire);
                C[intento]=3;
                break;
            case 4:
                opcion26.setIcon(stasis);
                opcion26.setDisabledIcon(stasis);
                C[intento]=4;
                break;
            case 5:
                opcion26.setIcon(neutro);
                opcion26.setDisabledIcon(neutro);
                C[intento]=5;
                break;
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opcion26ActionPerformed

    private void opcion27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion27ActionPerformed
             estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion3.setBackground(Color.cyan);
                opcion27.setIcon(agua);
                opcion27.setDisabledIcon(agua);
                D[intento]=0;
                break;
            case 1:
                //opcion3.setBackground(Color.yellow);
                opcion27.setIcon(fuego);
                opcion27.setDisabledIcon(fuego);
                D[intento]=1;
                break;
                
            case 2:
                //opcion3.setBackground(Color.green);
                opcion27.setIcon(tierra);
                opcion27.setDisabledIcon(tierra);
                D[intento]=2;
                break;
            case 3:
                //opcion3.setBackground(Color.red);
                opcion27.setIcon(aire);
                opcion27.setDisabledIcon(aire);
                D[intento]=3;
                break;
           case 4:
                opcion27.setIcon(stasis);
                opcion27.setDisabledIcon(stasis);
                D[intento]=4;
                break;
            case 5:
                opcion27.setIcon(neutro);
                opcion27.setDisabledIcon(neutro);
                D[intento]=5;
                break;
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opcion27ActionPerformed

    private void Verificar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Verificar6ActionPerformed
if(repetidosyvacios()){
            JOptionPane.showMessageDialog(null, "No se permiten simbolos iguales o sin descubrir");
        }else{       opcion24.setEnabled(false);
        opcion25.setEnabled(false);
        opcion26.setEnabled(false);
        opcion27.setEnabled(false);
        Verificar6.setEnabled(false);
       resul7.setIcon(checar());
       if(correctas()!=4){
        intento++;
        Verificar7.setEnabled(true);
        opcion28.setEnabled(true);
        opcion29.setEnabled(true);
        opcion30.setEnabled(true);
        opcion31.setEnabled(true);}
        
              } // TODO add your handling code here:
    }//GEN-LAST:event_Verificar6ActionPerformed

    private void opcion28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion28ActionPerformed
estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion.setBackground(Color.cyan);
                opcion28.setIcon(agua);
                opcion28.setDisabledIcon(agua);
                A[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion.setBackground(Color.yellow);
                opcion28.setIcon(fuego);
                opcion28.setDisabledIcon(fuego);
                A[intento]=1;
                break;
                
            case 2:
                //opcion.setBackground(Color.green);
                opcion28.setIcon(tierra);
                opcion28.setDisabledIcon(tierra);
                A[intento]=2;
                break;
            case 3:
                //opcion.setBackground(Color.red);
                opcion28.setIcon(aire);
                opcion28.setDisabledIcon(aire);
                A[intento]=3;
                break;
            case 4:
                opcion28.setIcon(stasis);
                opcion28.setDisabledIcon(stasis);
                A[intento]=4;
                break;
            case 5:
                opcion28.setIcon(neutro);
                opcion28.setDisabledIcon(neutro);
                A[intento]=5;
                break;
          
        }         // TODO add your handling code here:
    }//GEN-LAST:event_opcion28ActionPerformed

    private void opcion29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion29ActionPerformed
  estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion1.setBackground(Color.cyan);
                opcion29.setIcon(agua);
                opcion29.setDisabledIcon(agua);
                B[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion1.setBackground(Color.yellow);
                opcion29.setIcon(fuego);
                opcion29.setDisabledIcon(fuego);
                B[intento]=1;
                break;
                
            case 2:
                //opcion1.setBackground(Color.green);
                opcion29.setIcon(tierra);
                opcion29.setDisabledIcon(tierra);
                B[intento]=2;
                break;
            case 3:
                //opcion1.setBackground(Color.red);
                opcion29.setIcon(aire);
                opcion29.setDisabledIcon(aire);
                B[intento]=3;
                break;
                case 4:
                opcion29.setIcon(stasis);
                opcion29.setDisabledIcon(stasis);
                B[intento]=4;
                break;
            case 5:
                opcion29.setIcon(neutro);
                opcion29.setDisabledIcon(neutro);
                B[intento]=5;
                break;
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opcion29ActionPerformed

    private void opcion30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion30ActionPerformed
         estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion2.setBackground(Color.cyan);
                opcion30.setIcon(agua);
                opcion30.setDisabledIcon(agua);
                C[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion2.setBackground(Color.yellow);
                opcion30.setIcon(fuego);
                opcion30.setDisabledIcon(fuego);
                C[intento]=1;
                break;
                
            case 2:
                //opcion2.setBackground(Color.green);
                opcion30.setIcon(tierra);
                opcion30.setDisabledIcon(tierra);
                C[intento]=2;
                break;
            case 3:
                //opcion2.setBackground(Color.red);
                opcion30.setIcon(aire);
                opcion30.setDisabledIcon(aire);
                C[intento]=3;
                break;
            case 4:
                opcion30.setIcon(stasis);
                opcion30.setDisabledIcon(stasis);
                C[intento]=4;
                break;
            case 5:
                opcion30.setIcon(neutro);
                opcion30.setDisabledIcon(neutro);
                C[intento]=5;
                break;
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opcion30ActionPerformed

    private void opcion31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion31ActionPerformed
             estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion3.setBackground(Color.cyan);
                opcion31.setIcon(agua);
                opcion31.setDisabledIcon(agua);
                D[intento]=0;
                break;
            case 1:
                //opcion3.setBackground(Color.yellow);
                opcion31.setIcon(fuego);
                opcion31.setDisabledIcon(fuego);
                D[intento]=1;
                break;
                
            case 2:
                //opcion3.setBackground(Color.green);
                opcion31.setIcon(tierra);
                opcion31.setDisabledIcon(tierra);
                D[intento]=2;
                break;
            case 3:
                //opcion3.setBackground(Color.red);
                opcion31.setIcon(aire);
                opcion31.setDisabledIcon(aire);
                D[intento]=3;
                break;
           case 4:
                opcion31.setIcon(stasis);
                opcion31.setDisabledIcon(stasis);
                D[intento]=4;
                break;
            case 5:
                opcion31.setIcon(neutro);
                opcion31.setDisabledIcon(neutro);
                D[intento]=5;
                break;
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opcion31ActionPerformed

    private void Verificar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Verificar7ActionPerformed
if(repetidosyvacios()){
            JOptionPane.showMessageDialog(null, "No se permiten simbolos iguales o sin descubrir");
        }else{      opcion28.setEnabled(false);
        opcion29.setEnabled(false);
        opcion30.setEnabled(false);
        opcion31.setEnabled(false);
        Verificar7.setEnabled(false);
        resul8.setIcon(checar());
        if(correctas()!=4){
        intento++;
        Verificar8.setEnabled(true);
        opcion32.setEnabled(true);
        opcion33.setEnabled(true);
        opcion34.setEnabled(true);
        opcion35.setEnabled(true);}
        
               } // TODO add your handling code here:
    }//GEN-LAST:event_Verificar7ActionPerformed

    private void opcion32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion32ActionPerformed
estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion.setBackground(Color.cyan);
                opcion32.setIcon(agua);
                opcion32.setDisabledIcon(agua);
                A[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion.setBackground(Color.yellow);
                opcion32.setIcon(fuego);
                opcion32.setDisabledIcon(fuego);
                A[intento]=1;
                break;
                
            case 2:
                //opcion.setBackground(Color.green);
                opcion32.setIcon(tierra);
                opcion32.setDisabledIcon(tierra);
                A[intento]=2;
                break;
            case 3:
                //opcion.setBackground(Color.red);
                opcion32.setIcon(aire);
                opcion32.setDisabledIcon(aire);
                A[intento]=3;
                break;
            case 4:
                opcion32.setIcon(stasis);
                opcion32.setDisabledIcon(stasis);
                A[intento]=4;
                break;
            case 5:
                opcion32.setIcon(neutro);
                opcion32.setDisabledIcon(neutro);
                A[intento]=5;
                break;
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opcion32ActionPerformed

    private void opcion33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion33ActionPerformed
  estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion1.setBackground(Color.cyan);
                opcion33.setIcon(agua);
                opcion33.setDisabledIcon(agua);
                B[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion1.setBackground(Color.yellow);
                opcion33.setIcon(fuego);
                opcion33.setDisabledIcon(fuego);
                B[intento]=1;
                break;
                
            case 2:
                //opcion1.setBackground(Color.green);
                opcion33.setIcon(tierra);
                opcion33.setDisabledIcon(tierra);
                B[intento]=2;
                break;
            case 3:
                //opcion1.setBackground(Color.red);
                opcion33.setIcon(aire);
                opcion33.setDisabledIcon(aire);
                B[intento]=3;
                break;
                case 4:
                opcion33.setIcon(stasis);
                opcion33.setDisabledIcon(stasis);
                B[intento]=4;
                break;
            case 5:
                opcion33.setIcon(neutro);
                opcion33.setDisabledIcon(neutro);
                B[intento]=5;
                break;
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opcion33ActionPerformed

    private void opcion34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion34ActionPerformed
         estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion2.setBackground(Color.cyan);
                opcion34.setIcon(agua);
                opcion34.setDisabledIcon(agua);
                C[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion2.setBackground(Color.yellow);
                opcion34.setIcon(fuego);
                opcion34.setDisabledIcon(fuego);
                C[intento]=1;
                break;
                
            case 2:
                //opcion2.setBackground(Color.green);
                opcion34.setIcon(tierra);
                opcion34.setDisabledIcon(tierra);
                C[intento]=2;
                break;
            case 3:
                //opcion2.setBackground(Color.red);
                opcion34.setIcon(aire);
                opcion34.setDisabledIcon(aire);
                C[intento]=3;
                break;
            case 4:
                opcion34.setIcon(stasis);
                opcion34.setDisabledIcon(stasis);
                C[intento]=4;
                break;
            case 5:
                opcion34.setIcon(neutro);
                opcion34.setDisabledIcon(neutro);
                C[intento]=5;
                break;
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opcion34ActionPerformed

    private void opcion35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion35ActionPerformed
             estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion3.setBackground(Color.cyan);
                opcion35.setIcon(agua);
                opcion35.setDisabledIcon(agua);
                D[intento]=0;
                break;
            case 1:
                //opcion3.setBackground(Color.yellow);
                opcion35.setIcon(fuego);
                opcion35.setDisabledIcon(fuego);
                D[intento]=1;
                break;
                
            case 2:
                //opcion3.setBackground(Color.green);
                opcion35.setIcon(tierra);
                opcion35.setDisabledIcon(tierra);
                D[intento]=2;
                break;
            case 3:
                //opcion3.setBackground(Color.red);
                opcion35.setIcon(aire);
                opcion35.setDisabledIcon(aire);
                D[intento]=3;
                break;
           case 4:
                opcion35.setIcon(stasis);
                opcion35.setDisabledIcon(stasis);
                D[intento]=4;
                break;
            case 5:
                opcion35.setIcon(neutro);
                opcion35.setDisabledIcon(neutro);
                D[intento]=5;
                break;
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opcion35ActionPerformed

    private void Verificar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Verificar8ActionPerformed
if(repetidosyvacios()){
            JOptionPane.showMessageDialog(null, "No se permiten simbolos iguales o sin descubrir");
        }else{      opcion32.setEnabled(false);
        opcion33.setEnabled(false);
        opcion34.setEnabled(false);
        opcion35.setEnabled(false);
        Verificar8.setEnabled(false);
        resul9.setIcon(checar());
        if(correctas()!=4){
        intento++;
        Verificar9.setEnabled(true);
        opcion36.setEnabled(true);
        opcion37.setEnabled(true);
        opcion38.setEnabled(true);
        opcion39.setEnabled(true);}
        
         }       // TODO add your handling code here:
    }//GEN-LAST:event_Verificar8ActionPerformed

    private void opcion36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion36ActionPerformed
estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion.setBackground(Color.cyan);
                opcion36.setIcon(agua);
                opcion36.setDisabledIcon(agua);
                A[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion.setBackground(Color.yellow);
                opcion36.setIcon(fuego);
                opcion36.setDisabledIcon(fuego);
                A[intento]=1;
                break;
                
            case 2:
                //opcion.setBackground(Color.green);
                opcion36.setIcon(tierra);
                opcion36.setDisabledIcon(tierra);
                A[intento]=2;
                break;
            case 3:
                //opcion.setBackground(Color.red);
                opcion36.setIcon(aire);
                opcion36.setDisabledIcon(aire);
                A[intento]=3;
                break;
            case 4:
                opcion36.setIcon(stasis);
                opcion36.setDisabledIcon(stasis);
                A[intento]=4;
                break;
            case 5:
                opcion36.setIcon(neutro);
                opcion36.setDisabledIcon(neutro);
                A[intento]=5;
                break;
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opcion36ActionPerformed

    private void opcion37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion37ActionPerformed
  estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion1.setBackground(Color.cyan);
                opcion37.setIcon(agua);
                opcion37.setDisabledIcon(agua);
                B[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion1.setBackground(Color.yellow);
                opcion37.setIcon(fuego);
                opcion37.setDisabledIcon(fuego);
                B[intento]=1;
                break;
                
            case 2:
                //opcion1.setBackground(Color.green);
                opcion37.setIcon(tierra);
                opcion37.setDisabledIcon(tierra);
                B[intento]=2;
                break;
            case 3:
                //opcion1.setBackground(Color.red);
                opcion37.setIcon(aire);
                opcion37.setDisabledIcon(aire);
                B[intento]=3;
                break;
                case 4:
                opcion37.setIcon(stasis);
                opcion37.setDisabledIcon(stasis);
                B[intento]=4;
                break;
            case 5:
                opcion37.setIcon(neutro);
                opcion37.setDisabledIcon(neutro);
                B[intento]=5;
                break;
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opcion37ActionPerformed

    private void opcion38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion38ActionPerformed
         estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion2.setBackground(Color.cyan);
                opcion38.setIcon(agua);
                opcion38.setDisabledIcon(agua);
                C[intento]=0;
                break;
               // opcion.setIcon();
            case 1:
                //opcion2.setBackground(Color.yellow);
                opcion38.setIcon(fuego);
                opcion38.setDisabledIcon(fuego);
                C[intento]=1;
                break;
                
            case 2:
                //opcion2.setBackground(Color.green);
                opcion38.setIcon(tierra);
                opcion38.setDisabledIcon(tierra);
                C[intento]=2;
                break;
            case 3:
                //opcion2.setBackground(Color.red);
                opcion38.setIcon(aire);
                opcion38.setDisabledIcon(aire);
                C[intento]=3;
                break;
            case 4:
                opcion38.setIcon(stasis);
                opcion38.setDisabledIcon(stasis);
                C[intento]=4;
                break;
            case 5:
                opcion38.setIcon(neutro);
                opcion38.setDisabledIcon(neutro);
                C[intento]=5;
                break;
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opcion38ActionPerformed

    private void opcion39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion39ActionPerformed
             estado1++;
        if(estado1==6){
          estado1=0;  
        }
        switch(estado1){
            case 0:             
                //opcion3.setBackground(Color.cyan);
                opcion39.setIcon(agua);
                opcion39.setDisabledIcon(agua);
                D[intento]=0;
                break;
            case 1:
                //opcion3.setBackground(Color.yellow);
                opcion39.setIcon(fuego);
                opcion39.setDisabledIcon(fuego);
                D[intento]=1;
                break;
                
            case 2:
                //opcion3.setBackground(Color.green);
                opcion39.setIcon(tierra);
                opcion39.setDisabledIcon(tierra);
                D[intento]=2;
                break;
            case 3:
                //opcion3.setBackground(Color.red);
                opcion39.setIcon(aire);
                opcion39.setDisabledIcon(aire);
                D[intento]=3;
                break;
           case 4:
                opcion39.setIcon(stasis);
                opcion39.setDisabledIcon(stasis);
                D[intento]=4;
                break;
            case 5:
                opcion39.setIcon(neutro);
                opcion39.setDisabledIcon(neutro);
                D[intento]=5;
                break;
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_opcion39ActionPerformed

    private void Verificar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Verificar9ActionPerformed
if(repetidosyvacios()){
            JOptionPane.showMessageDialog(null, "No se permiten simbolos iguales o sin descubrir");
        }else{      opcion36.setEnabled(false);
        opcion37.setEnabled(false);
        opcion38.setEnabled(false);
        opcion39.setEnabled(false);
        Verificar9.setEnabled(false);
        resul10.setIcon(checar());
        if(correctas()!=4){
            timer.stop();
         JOptionPane.showMessageDialog(null, "GAME OVER \n No pudiste resolverlo la respuesta es la siguiente");
         descubrir();
        tiempo=60;
        min=0;
        segs=0;}
        }
            // TODO add your handling code here:
    }//GEN-LAST:event_Verificar9ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JOptionPane.showMessageDialog(null,"","Instrucciones de Mente Maestra",JOptionPane.PLAIN_MESSAGE,instrucciones);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void facilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facilActionPerformed

    private void acercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaActionPerformed
       JOptionPane.showMessageDialog(null,"","Acerca de Mente Maestra",JOptionPane.PLAIN_MESSAGE,acercade);     // TODO add your handling code here:
    }//GEN-LAST:event_acercaActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       JOptionPane.showMessageDialog(null,"","Simbologia",JOptionPane.PLAIN_MESSAGE,simbolos);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void dificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dificilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dificilActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenteMaestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenteMaestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenteMaestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenteMaestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenteMaestra().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Juegonuevo;
    private javax.swing.JButton Rendirse;
    private javax.swing.JLabel RespuestaA;
    private javax.swing.JLabel RespuestaB;
    private javax.swing.JLabel RespuestaC;
    private javax.swing.JLabel RespuestaD;
    private javax.swing.JLabel Titulin;
    private javax.swing.JButton Verificar;
    private javax.swing.JButton Verificar1;
    private javax.swing.JButton Verificar2;
    private javax.swing.JButton Verificar3;
    private javax.swing.JButton Verificar4;
    private javax.swing.JButton Verificar5;
    private javax.swing.JButton Verificar6;
    private javax.swing.JButton Verificar7;
    private javax.swing.JButton Verificar8;
    private javax.swing.JButton Verificar9;
    private javax.swing.JMenuItem acerca;
    private javax.swing.JProgressBar barratiempo;
    private javax.swing.JRadioButtonMenuItem dificil;
    private javax.swing.ButtonGroup dificultad;
    private javax.swing.JRadioButtonMenuItem facil;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JCheckBoxMenuItem mememode;
    private javax.swing.JButton opcion;
    private javax.swing.JButton opcion1;
    private javax.swing.JButton opcion10;
    private javax.swing.JButton opcion11;
    private javax.swing.JButton opcion12;
    private javax.swing.JButton opcion13;
    private javax.swing.JButton opcion14;
    private javax.swing.JButton opcion15;
    private javax.swing.JButton opcion16;
    private javax.swing.JButton opcion17;
    private javax.swing.JButton opcion18;
    private javax.swing.JButton opcion19;
    private javax.swing.JButton opcion2;
    private javax.swing.JButton opcion20;
    private javax.swing.JButton opcion21;
    private javax.swing.JButton opcion22;
    private javax.swing.JButton opcion23;
    private javax.swing.JButton opcion24;
    private javax.swing.JButton opcion25;
    private javax.swing.JButton opcion26;
    private javax.swing.JButton opcion27;
    private javax.swing.JButton opcion28;
    private javax.swing.JButton opcion29;
    private javax.swing.JButton opcion3;
    private javax.swing.JButton opcion30;
    private javax.swing.JButton opcion31;
    private javax.swing.JButton opcion32;
    private javax.swing.JButton opcion33;
    private javax.swing.JButton opcion34;
    private javax.swing.JButton opcion35;
    private javax.swing.JButton opcion36;
    private javax.swing.JButton opcion37;
    private javax.swing.JButton opcion38;
    private javax.swing.JButton opcion39;
    private javax.swing.JButton opcion4;
    private javax.swing.JButton opcion5;
    private javax.swing.JButton opcion6;
    private javax.swing.JButton opcion7;
    private javax.swing.JButton opcion8;
    private javax.swing.JButton opcion9;
    private javax.swing.JLabel resul1;
    private javax.swing.JLabel resul10;
    private javax.swing.JLabel resul2;
    private javax.swing.JLabel resul3;
    private javax.swing.JLabel resul4;
    private javax.swing.JLabel resul5;
    private javax.swing.JLabel resul6;
    private javax.swing.JLabel resul7;
    private javax.swing.JLabel resul8;
    private javax.swing.JLabel resul9;
    private javax.swing.JLabel textotiempo;
    private javax.swing.JLabel tiempototal;
    // End of variables declaration//GEN-END:variables
}
