package Logica;

public class ParPalabra{
    private int ID;
    private String espanol;
    private String ingles;
    private String categoria;
    private String imagen;
    
    public ParPalabra(){

    }

    public ParPalabra(String espanol, String ingles, String categoria, String imagen){
        this.espanol = espanol;
        this.ingles = ingles;
        this.categoria = categoria;
        this.imagen = imagen;
    }

    public int getID() {
        return ID;
    }

    public void setID(int id) {
        this.ID = id;
    }

    public String getEspanol() {
        return espanol;
    }

    public void setEspanol(String espanol) {
        if(espanol.length()<=0){
            this.espanol = "NoEspanol";
        }
        else{
            this.espanol = espanol;
        }
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        if(ingles.length()<=0){
            this.ingles = "NoIngles";
        }
        else{
            this.ingles = ingles;
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if(categoria.length()<=0){
            this.categoria = "NoCategoria";
        }
        else{
            this.categoria = categoria;
        }
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        if(imagen.length()<=0){
            this.imagen = "NoImage";
        }
        else{
            this.imagen = imagen;
        }  
    }

}