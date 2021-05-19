package Prototype.ejercicios;

public class Sim {
    private String NomEmpresa;
    private int NumTelefono;

    public Sim(){}

    public Sim(String nomEmpresao,int numTelefono){
        this.NomEmpresa=nomEmpresao;
        this.NumTelefono=numTelefono;
    }

    public String getNomEmpresa() {
        return NomEmpresa;
    }

    public void setNomEmpresa(String nomEmpresa) {
        NomEmpresa = nomEmpresa;
    }

    public int getNumTelefono() {
        return NumTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        NumTelefono = numTelefono;
    }
}
