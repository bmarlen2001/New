package autopista;

public class auto {
   //Atributos
   private String color;
   private String tamanio;
   private String modelo;
   private int anio;
   private String marca;
  
   //Métodos
   
   
   //Constructores
   public auto(){
     this.color = " ";
     this.tamanio= " ";
     this.modelo = " ";
     this.anio= 0;
     this.marca = " ";
   }
   
   public auto(String color, String tamanio, String modelo, int anio, String marca){
     this.color = color;
     this.tamanio= tamanio;
     this.modelo = modelo;
     this.anio= anio;
     this.marca = marca;
     
     
   }
   
   
   //Demas Métodos
   
   //aplica cuando se tiene los atributos publicos 
    public String toStringPublic() {
        return "{" +
            " color='" + String.valueOf(this.color) + "'" +
            ", tamanio='" + String.valueOf (this.tamanio) + "'" +
            ", modelo='" +  String.valueOf(this.modelo) + "'" +
            ", anio='" +  String.valueOf(this.anio) + "'" +
            ", marca='" +  String.valueOf(this.marca) + "'" +
            "}";

            //getter y setter


    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
   

    }

   
    
    }


