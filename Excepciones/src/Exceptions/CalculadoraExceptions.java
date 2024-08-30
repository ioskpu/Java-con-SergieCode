package Exceptions;

public class CalculadoraExceptions extends Exception {

    String description;


    //Constructor
    public CalculadoraExceptions(String description) {
        setDescription(description);
    }

    @Override
    public String getMessage() {
        return getDescription();
    }

    //Getters and Setters   
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

}
