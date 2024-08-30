public abstract class CriaturasMarinas {
    //atributos
    public String nombre;

    //constructor
    public CriaturasMarinas(String nombre) {
        this.nombre = nombre;
    }

    //esto obliga a las clases que hereden de CriaturasMarinas a implementar el metodo nadar
    abstract void nadar();

    

}
