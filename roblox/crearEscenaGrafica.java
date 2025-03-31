
package roblox;

import com.sun.j3d.utils.behaviors.mouse.MouseRotate;
import com.sun.j3d.utils.geometry.Box;
import com.sun.j3d.utils.geometry.Cylinder;
import com.sun.j3d.utils.geometry.Primitive;
import com.sun.j3d.utils.geometry.Sphere;
import javax.media.j3d.AmbientLight;
import javax.media.j3d.Appearance;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.DirectionalLight;
import javax.media.j3d.Material;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3f;

/**
 *
 * @author juani
 */
class crearEscenaGrafica {
    
     private Transform3D initialTGpanza = new Transform3D();
    private Transform3D initialTgMundo = new Transform3D();
    private Transform3D initialTgHomDer = new Transform3D();
    private Transform3D initialTgCotHomDer = new Transform3D();
    private Transform3D initialTgPierDer = new Transform3D();
    private Transform3D initialTgRodPierDer = new Transform3D();
    private Transform3D initialTgHomIzq = new Transform3D();
    private Transform3D initialTgCotHomIzq = new Transform3D();
    private Transform3D initialTgPierIzq = new Transform3D();
    private Transform3D initialTgRodPierIzq = new Transform3D();
    private Transform3D initialTgCabeza = new Transform3D();
       int pasos=0;
    int paraTextura = Primitive.GENERATE_NORMALS+Primitive.GENERATE_TEXTURE_COORDS;
    textura textura = new textura();
            
    BranchGroup bgRaiz = new BranchGroup();
    
     TransformGroup tgpanza;
     TransformGroup tgMundo;
    
    TransformGroup tgHomDer;
    TransformGroup tgRotHomDer;
    TransformGroup tgCotHomDer;
    
    TransformGroup tgPierDer;
    TransformGroup tgRotPierDer;
    TransformGroup tgRodPierDer;
    
    TransformGroup tgHomIzq;
    TransformGroup tgRotHomIzq;
    TransformGroup tgCotHomIzq;
    
    TransformGroup tgPierIzq;
    TransformGroup tgRotPierIzq;
    TransformGroup tgRodPierIzq;
    public crearEscenaGrafica(){
     
            //mover mouse
           TransformGroup moverMouse = new TransformGroup();
           
           
           BoundingSphere mouseBounds = new BoundingSphere(new Point3d(), 10000000.0);
           MouseRotate myMouseRotate = new MouseRotate();
           myMouseRotate.setTransformGroup(moverMouse);
           myMouseRotate.setSchedulingBounds(mouseBounds);
           moverMouse.addChild(myMouseRotate);
           
       Color c = new Color();
       
       Transform3D t3dCabeza = new Transform3D();
       Transform3D t3dMundo = new Transform3D();
       Transform3D t3dCinto = new Transform3D();
       
       Transform3D t3dHomDer = new Transform3D();
       Transform3D t3dRotHomDer = new Transform3D();
       Transform3D t3dCotHomDer = new Transform3D();
       Transform3D t3dBraDer = new Transform3D();
       
       Transform3D t3dPierDer = new Transform3D();
       Transform3D t3dRotPierDer = new Transform3D();
       Transform3D t3dRodPierDer = new Transform3D();
       Transform3D t3dSolDer = new Transform3D();
       
       Transform3D t3dHomIzq = new Transform3D();
       Transform3D t3dRotHomIzq = new Transform3D();
       Transform3D t3dCotHomIzq = new Transform3D();
       Transform3D t3dBraIzq = new Transform3D();
       
       Transform3D t3dPierIzq = new Transform3D();
       Transform3D t3dRotPierIzq = new Transform3D();
       Transform3D t3dRodPierIzq = new Transform3D();
       Transform3D t3dSolIzq = new Transform3D();
       
       t3dCabeza.set(new Vector3f(0.0f,0.35f,0.0f));
       
       t3dCinto.set(new Vector3f(0.0f,-0.267f,0.0f));
       
       //t3 Derecho
       
       t3dHomDer.set(new Vector3f(0.125f,-0.1f,0.0f));
  
       t3dRotHomDer.set(new Vector3f(0.25f,0.20f,0.0f));
       
       t3dCotHomDer.set(new Vector3f(0f,0.01f,0.0f));
       
       t3dBraDer.set(new Vector3f(0.0f,-0.20f,0.0f));
       
       
       t3dPierDer.set(new Vector3f(0.08f,-0.10f,0.0f));
  
       t3dRotPierDer.set(new Vector3f(-0.20f,-0.35f,0.0f));
       
       t3dRodPierDer.set(new Vector3f(0f,0.01f,0.0f));
       
       t3dSolDer.set(new Vector3f(0.0f,-0.20f,0.0f));
       
       
       //t3 Izquierdo
       
       
       t3dHomIzq.set(new Vector3f(-0.125f,-0.1f,0.0f));
  
       t3dRotHomIzq.set(new Vector3f(-0.25f,0.20f,0.0f));
       
       t3dCotHomIzq.set(new Vector3f(0f,0.01f,0.0f));
       
       t3dBraIzq.set(new Vector3f(0.0f,-0.20f,0.0f));
       
       
       t3dPierIzq.set(new Vector3f(0.32f,-0.10f,0.0f));
  
       t3dRotPierIzq.set(new Vector3f(-0.20f,-0.35f,0.0f));
       
       t3dRodPierIzq.set(new Vector3f(0f,0.01f,0.0f));
       
       t3dSolIzq.set(new Vector3f(0.0f,-0.20f,0.0f));
       
       
       tgpanza = new TransformGroup();
       tgMundo = new TransformGroup();
       TransformGroup tgCinto = new TransformGroup(t3dCinto);
       tgRotHomDer = new TransformGroup(t3dRotHomDer);
       tgHomDer = new TransformGroup(t3dHomDer);
       tgCotHomDer = new TransformGroup(t3dCotHomDer);
       
       tgpanza.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
       tgMundo.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
       tgHomDer.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
       tgRotHomDer.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
       tgCotHomDer.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
       
       tgRotPierDer = new TransformGroup(t3dRotPierDer);
       tgPierDer = new TransformGroup(t3dPierDer);
       tgRodPierDer = new TransformGroup(t3dRodPierDer);
       
       tgRotPierDer.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
       tgPierDer.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
       tgRodPierDer.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
       
       tgHomIzq = new TransformGroup(t3dRotHomIzq);
       tgRotHomIzq = new TransformGroup(t3dHomIzq);
       tgCotHomIzq = new TransformGroup(t3dCotHomIzq);
       
       tgHomIzq.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
       tgRotHomIzq.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
       tgCotHomIzq.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
       
       tgRotPierIzq = new TransformGroup(t3dRotPierIzq);
       tgPierIzq = new TransformGroup(t3dPierIzq);
       tgRodPierIzq = new TransformGroup(t3dRodPierIzq);
       
       tgRotPierIzq.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
       tgPierIzq.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
       tgRodPierIzq.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);      
       
       moverMouse.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
       moverMouse.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
       TransformGroup tgBraDer = new TransformGroup(t3dBraDer);
       
       TransformGroup tgSolDer = new TransformGroup(t3dSolDer);
       
       TransformGroup tgBraIzq = new TransformGroup(t3dBraIzq);
       
       TransformGroup tgSolIzq = new TransformGroup(t3dSolIzq);
       
       TransformGroup tgCabeza = new TransformGroup(t3dCabeza);
        
       //panza
       Box bxpanza = new Box(0.235f,0.20f,0.15f,c.setColor(34,98,185));
       bxpanza.setAppearance(0, c.setColor(15,69,142));
       
       //Cinto
       Box bxCinto = new Box(0.235f,0.06f,0.15f,c.setColor(34,98,185));
       bxCinto.setAppearance(5, c.setColor(129,175,238));
       bxCinto.setAppearance(4, c.setColor(129,175,238));
       
       
       
       
       
       Sphere spRotHomDer = new Sphere(0.001f, c.setColor(255, 0, 0));
       tgRotHomDer.addChild(spRotHomDer);
       
       Sphere spCotDer = new Sphere(0.001f, c.setColor(255, 0, 0));
       tgCotHomDer.addChild(spCotDer);
       
       
       Sphere spRotPierDer = new Sphere(0.001f, c.setColor(255, 0, 0));
       tgRotPierDer.addChild(spRotPierDer);
       
       Sphere spRodPierDer = new Sphere(0.001f, c.setColor(255, 0, 0));
       tgRodPierDer.addChild(spRodPierDer);
       
       
       Sphere spRotHomIzq = new Sphere(0.001f, c.setColor(255, 0, 0));
       tgRotHomIzq.addChild(spRotHomIzq);
       
       Sphere spCotIzq = new Sphere(0.001f, c.setColor(255, 0, 0));
       tgCotHomIzq.addChild(spCotIzq);
       
       
       Sphere spRotPierIzq = new Sphere(0.001f, c.setColor(255, 0, 0));
       tgRotPierIzq.addChild(spRotPierIzq);
       
       Sphere spRodPierIzq = new Sphere(0.001f, c.setColor(255, 0, 0));
       tgRodPierIzq.addChild(spRodPierIzq);
       
       //brazo derecho
       Box bxHomDer = new Box(0.125f,0.1f,0.15f,c.setColor(255, 222, 89));
      
       
       Box bxBraDer = new Box(0.125f,0.1f,0.15f,c.setColor(255, 222, 89));
       
       //Pierna derecha
       Box bxPierDer = new Box(0.125f,0.1f,0.15f,c.setColor(131, 136, 59));
      
       
       Box bxSolDer = new Box(0.125f,0.1f,0.15f,c.setColor(131, 136, 59));
       
       //brazo Izquierdo
       Box bxHomIzq = new Box(0.125f,0.1f,0.15f,c.setColor(255, 222, 89));
      
       
       Box bxBraIzq = new Box(0.125f,0.1f,0.15f,c.setColor(255, 222, 89));
       
       //Pierna izquierdo
       Box bxPierIzq = new Box(0.125f,0.1f,0.15f,c.setColor(131, 136, 59));
      
       
       Box bxSolIzq = new Box(0.125f,0.1f,0.15f,c.setColor(131, 136, 59));
      
       Box bxMundo = new Box(-3.0f,1.0f,10.0f,textura.crearTexturas("fontMadera.jpg"));
       bxMundo.setAppearance(0, textura.crearTexturas("fondo.jpg"));
       bxMundo.setAppearance(1, textura.crearTexturas("fondo.jpg"));
       bxMundo.setAppearance(4, c.setColor(129,175,238));
       
       //Cabeza
       Cylinder cCabeza = new Cylinder(0.15f, 0.25f, paraTextura, textura.crearTexturas("FaceR.png"));
       cCabeza.setAppearance(1, c.setColor(255, 222, 89));
       cCabeza.setAppearance(2, c.setColor(255, 222, 89));
       
        tgpanza.getTransform(initialTGpanza);
        tgMundo.getTransform(initialTgMundo);
        tgHomDer.getTransform(initialTgHomDer);
        tgCotHomDer.getTransform(initialTgCotHomDer);
        tgPierDer.getTransform(initialTgPierDer);
        tgRodPierDer.getTransform(initialTgRodPierDer);
        tgHomIzq.getTransform(initialTgHomIzq);
        tgCotHomIzq.getTransform(initialTgCotHomIzq);
        tgPierIzq.getTransform(initialTgPierIzq);
        tgRodPierIzq.getTransform(initialTgRodPierIzq);
        tgCabeza.getTransform(initialTgCabeza);
       
       Appearance panzaAppearance = bxpanza.getAppearance();
        if (panzaAppearance.getMaterial() == null) {
            panzaAppearance.setMaterial(new Material());
        }
        panzaAppearance.getMaterial().setLightingEnable(true);

        // Habilitar iluminación en la cabeza
        Appearance cabezaAppearance = cCabeza.getAppearance();
        if (cabezaAppearance.getMaterial() == null) {
            cabezaAppearance.setMaterial(new Material());
        }
        cabezaAppearance.getMaterial().setLightingEnable(true);

        // Agregar luces al escenario
        BoundingSphere influence = new BoundingSphere(new Point3d(0,0,0), 1000);

        // Luz ambiental (ilumina todo uniformemente)
        AmbientLight ambientLight = new AmbientLight(new Color3f(0.1f, 0.3f, 0.3f));
        ambientLight.setInfluencingBounds(influence);
        bgRaiz.addChild(ambientLight);

        // Luz direccional (ilumina desde una dirección específica)
        Vector3f lightDirection = new Vector3f(0.0f, -1.0f, -1.0f); // Dirección desde arriba y atrás
        DirectionalLight directionalLight = new DirectionalLight(new Color3f(1.0f, 1.0f, 1.0f), lightDirection);
        directionalLight.setInfluencingBounds(influence);
        bgRaiz.addChild(directionalLight);
           
 
        bgRaiz.addChild(moverMouse);
        
        bgRaiz.addChild(tgMundo);
        tgMundo.addChild(bxMundo);
        moverMouse.addChild(tgpanza);
        
        tgRotHomDer.addChild(tgHomDer);
        tgCotHomDer.addChild(tgBraDer);
        tgHomDer.addChild(tgCotHomDer);
        
        tgRotPierDer.addChild(tgPierDer);
        tgRodPierDer.addChild(tgSolDer);
        tgPierDer.addChild(tgRodPierDer);
        
        tgRotHomIzq.addChild(tgHomIzq);
        tgCotHomIzq.addChild(tgBraIzq);
        tgHomIzq.addChild(tgCotHomIzq);
        
        tgRotPierIzq.addChild(tgPierIzq);
        tgRodPierIzq.addChild(tgSolIzq);
        tgPierIzq.addChild(tgRodPierIzq);
        
        tgHomDer.addChild(bxHomDer);
        tgPierDer.addChild(bxPierDer);
        
        tgHomIzq.addChild(bxHomIzq);
        tgPierIzq.addChild(bxPierIzq);
        
        tgCabeza.addChild(cCabeza);
        tgpanza.addChild(bxpanza);
        tgpanza.addChild(tgCinto);
        
        tgpanza.addChild(tgRotHomDer);
        tgpanza.addChild(tgRotPierDer);
        tgpanza.addChild(tgRotHomIzq);
        tgpanza.addChild(tgRotPierIzq);
        
        tgpanza.addChild(tgCabeza);
        tgCinto.addChild(bxCinto);
        
        tgBraDer.addChild(bxBraDer);
        tgSolDer.addChild(bxSolDer);
        tgBraIzq.addChild(bxBraIzq);
        tgSolIzq.addChild(bxSolIzq);
    }
    
    public void GirarTG(TransformGroup tg, String eje, int grados){
        Transform3D leerBrazo = new Transform3D();
        Transform3D moverBrazo = new Transform3D();
        
        tg.getTransform(leerBrazo);
        if(eje.equals("X")){
            moverBrazo.rotX(Math.PI/180*grados);
        }   
        if(eje.equals("Y")){
            moverBrazo.rotY(Math.PI/180*grados);
        }
        if(eje.equals("Z")){
            moverBrazo.rotZ(Math.PI/180*grados);
        }
        
        tg.getTransform(leerBrazo);
      
        
        leerBrazo.mul(moverBrazo);
        tg.setTransform(leerBrazo);
    }
    
     public void MoverPersonajeTG(TransformGroup tg, float x, float y) {
    // Obtén el Transform3D actual del TransformGroup
    Transform3D t3dPanza = new Transform3D();
    tg.getTransform(t3dPanza);

    // Crea una traslación adicional
    Transform3D traslacion = new Transform3D();
    traslacion.set(new Vector3f(x, 0, y));

    // Multiplica la traslación con la transformación actual
    t3dPanza.mul(traslacion);

    // Aplica la nueva transformación al TransformGroup
    tg.setTransform(t3dPanza);
}
     
     public void caminar(){
        if(pasos<8){
     
            
        GirarTG(tgRodPierDer, "y", 5);
        GirarTG(tgPierDer, "X", -5);
        
        GirarTG(tgHomIzq, "X", 5);
        GirarTG(tgCotHomIzq, "X", 5);
       
        GirarTG(tgPierIzq, "X", 5);
        GirarTG(tgRodPierIzq, "X", 5);
        
        GirarTG(tgHomDer, "X", 5);
        GirarTG(tgCotHomDer, "X", -5);
        } else if(pasos<16){
       
            
        GirarTG(tgRodPierDer, "X", -5);
        GirarTG(tgPierDer, "X", 5);
        
        GirarTG(tgHomIzq, "X", -5);
        GirarTG(tgCotHomIzq, "X", -5);
       
        GirarTG(tgPierIzq, "X", -5);
        GirarTG(tgRodPierIzq, "X", -5);
        
        GirarTG(tgHomDer, "X", -5);
        GirarTG(tgCotHomDer, "X", 5);
        } else if(pasos<24){
 
            
        GirarTG(tgRodPierDer, "X", 5);
        GirarTG(tgPierDer, "X", 5);
        
        GirarTG(tgHomIzq, "X", -5);
        GirarTG(tgCotHomIzq, "X", 5);
       
        GirarTG(tgPierIzq, "X", -5);
        GirarTG(tgRodPierIzq, "X", 5);
        
        GirarTG(tgHomDer, "X", 5);
        GirarTG(tgCotHomDer, "X", 5);
        }else if(pasos<32){
        
            
        GirarTG(tgRodPierDer, "X", -5);
        GirarTG(tgPierDer, "X", -5);
       
        GirarTG(tgHomIzq, "X", 5);
        GirarTG(tgCotHomIzq, "X", -5);
        
        GirarTG(tgPierIzq, "X", 5);
        GirarTG(tgRodPierIzq, "X", -5);
        
        GirarTG(tgHomDer, "X", -5);
        GirarTG(tgCotHomDer, "X", -5);
        }else {
            pasos = 1;
        }
        pasos++;
        MoverPersonajeTG(tgMundo, 0, 0.05f);
        
     }
     
     public void reset() {
        tgpanza.setTransform(initialTGpanza);
        tgMundo.setTransform(initialTgMundo);
        tgHomDer.setTransform(initialTgHomDer);
        tgCotHomDer.setTransform(initialTgCotHomDer);
        tgPierDer.setTransform(initialTgPierDer);
        tgRodPierDer.setTransform(initialTgRodPierDer);
        tgHomIzq.setTransform(initialTgHomIzq);
        tgCotHomIzq.setTransform(initialTgCotHomIzq);
        tgPierIzq.setTransform(initialTgPierIzq);
        tgRodPierIzq.setTransform(initialTgRodPierIzq);
      tgMundo.setTransform(initialTgMundo); // ¡Importante para resetear la posición del mundo!

        // Reiniciar contador de pasos
        pasos = 0;
    }
     
     public void BailarBachata(){
         if(pasos<5){
        MoverPersonajeTG(tgMundo, 0.05f, 0);

        GirarTG(tgPierDer, "Z", -6);  
        
    
        GirarTG(tgHomIzq, "y", 10);
        
        } else if(pasos<10){
 
        GirarTG(tgPierDer, "Z", 5);   
        
        } else if(pasos<15){
            
        MoverPersonajeTG(tgMundo, 0.05f, 0);
   
        GirarTG(tgHomIzq, "Y", -10);
 
        GirarTG(tgPierDer, "Z", -5);
       
        }else if(pasos<20){
            
        GirarTG(tgPierDer, "Z", 5);      
        
        }else if(pasos<25){
            
        MoverPersonajeTG(tgMundo, 0.05f, 0);
        
        GirarTG(tgPierDer, "Z", -5);    
        
        }else if(pasos<30){
        
        GirarTG(tgPierDer, "Z", 5);     
        
        }else if(pasos<35){
            
        MoverPersonajeTG(tgMundo, -0.05f, 0);
        
        GirarTG(tgHomDer, "Z", 5); 
        
        GirarTG(tgPierIzq, "Z", 5);  
        
        }else if(pasos<40){
        
        GirarTG(tgPierIzq, "Z", -5);  
        
        }else if(pasos<45){
        
        MoverPersonajeTG(tgMundo, -0.05f, 0);
        
        GirarTG(tgHomDer, "Z", -5); 
        
        GirarTG(tgPierIzq, "Z", 5);  
        
        }else if(pasos<50){
        
        GirarTG(tgPierIzq, "Z", -5);  
        
        }else if(pasos<55){
            
        MoverPersonajeTG(tgMundo, -0.05f, 0);
        
        GirarTG(tgPierIzq, "Z", 5);  
        
        }else if(pasos<60){
        
        GirarTG(tgPierIzq, "Z", -5);  
        
        }
        
        else {
            pasos = 0;
        }
        pasos++;
     }
}