package s101n2ex1.domain.model;

class Telephone {

    private String marca;
    private String model;

    public Telephone(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    void trucar(String telephoneNumber){

        // TODO it could check weather or not it is actually a phone number
        System.out.println("Trucant a " + telephoneNumber);

    }

}
