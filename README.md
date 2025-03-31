# Roblox character in java3d library

## Descripción  
Este proyecto simula un personaje de Roblox en un entorno 3D interactivo, desarrollado en Java con la librería Java 3D para animaciones y renderizado gráfico. El personaje puede realizar acciones como caminar, bailar y girar sus articulaciones (piernas, rodillas, hombros), controladas mediante una interfaz gráfica intuitiva. Además, incluye integración de audio y ajuste de parámetros de movimiento en tiempo real.  

![Interfaz del Proyecto](img/fondoMadera.jpg)  

---

## Características Principales  
- **Animaciones Dinámicas**: Movimientos suaves del personaje (caminar, bailar).  
- **Control Interactivo**: Botones para girar articulaciones específicas (pierna derecha, rodilla izquierda, etc.).  
- **Reproducción de Música**: Integración de archivos WAV para acompañar las acciones del personaje.  
- **Ajuste de Ángulos**: Barras deslizantes para modificar los grados de rotación de las articulaciones.  
- **Renderizado 3D**: Uso de Java 3D para crear figuras geométricas y texturas realistas.  

---

## Requisitos  
- **Java Development Kit (JDK) 11** [[Jdk 11 documentation]](https://docs.oracle.com/en/java/javase/11/)  
- **Librerías Java 3D**:  
  - `j3dcore.jar`  
  - `j3dtuils.jar`  
  - `vecmath.jar`  

---

## Instalación  
1. Clona el repositorio o descarga el código fuente.  
2. Asegúrate de tener JDK 11 instalado.  
3. Agrega las librerías Java 3D al proyecto (ejemplo en NetBeans):
   Haz clic derecho en "Libraries" → "Add JAR/Folder" → Selecciona los archivos .jar de Java 3D.
4. Ejecuta el archivo `NewJFrame.java` para iniciar la aplicación.  

---

## Uso  
### Acciones del Personaje  
- **Caminar**: Presiona el botón "Caminar" para activar el movimiento lineal.  
- **Bailar**: Haz clic en "Bailar" para ejecutar una secuencia de danza predefinida.  
- **Girar Articulaciones**: Usa los botones como "Girar Pierna D", "Girar Rodilla" o "Girar Hombro" para rotar partes específicas.  
- **Reproducir Música**: Haz clic en "Musica" para escuchar un tema de fondo.  

### Ajuste de Parámetros  
- **Ángulo de Rotación**: Arrastra la barra "Grados" para cambiar el rango de movimiento de las articulaciones.  
- **Velocidad**: Modifica la barra "Eje" para ajustar la velocidad de las animaciones.  

---

## Estructura del Proyecto  

`
├── img/
│ ├── Face.png
│ ├── FaceR.png
│ └── ...
├── musica/
│ └── RechazamePrinceRoy.wav
├── roblox/
│ ├── Color.java
│ ├── HiloBailar.java
│ └── ...
└── Libraries/
├── Java3d-j3core.jar
├── Java3d-j3dtuils.jar
└── ...

`
---


---

## Contribuciones  
¡Contribuciones bienvenidas! Si encuentras errores o tienes ideas para mejorar el proyecto, abre un issue o envía un pull request.  

---

## Licencia  
Este proyecto está bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.  
