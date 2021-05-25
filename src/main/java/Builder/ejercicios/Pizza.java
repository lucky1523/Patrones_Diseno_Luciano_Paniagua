package Builder.ejercicios;

public class Pizza {
    public String ingredientes;
    public String tipoDeMasa;
    public String tipoDeQueso;
    public Pizza(){}

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes=ingredientes;
    }

    public String getTipoDeMasa() {
        return tipoDeMasa;
    }

    public void setTipoDeMasa(String tipoDeMasa) {
        this.tipoDeMasa = tipoDeMasa;
    }

    public String getTipoDeQueso() {
        return tipoDeQueso;
    }

    public void setTipoDeQueso(String tipoDeQueso) {
        this.tipoDeQueso = tipoDeQueso;
    }
    public void showData() {
        System.out.println("**********************************");
        System.out.println("tipoDeQueso : "+tipoDeQueso);
        System.out.println("tipoDeMasa : "+tipoDeMasa);
        System.out.println("Ingredientes" + ingredientes);



    }
}
