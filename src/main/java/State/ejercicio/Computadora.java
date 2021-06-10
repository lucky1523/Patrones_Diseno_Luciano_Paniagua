package State.ejercicio;



import java.util.ArrayList;
import java.util.List;

public class Computadora {
    private List<String> listProgramas = new ArrayList<>();
    private int consumoMemoriaRam;
    private int consumoCPU;
    private IStateComputadora state;

    public IStateComputadora getState() {
        return state;
    }

    public void setState(IStateComputadora state) {
        this.state = state;
    }

    public List<String> getListProgramas() {
        return listProgramas;
    }

    public void setListProgramas(List<String> listProgramas) {
        this.listProgramas = listProgramas;
    }

    public int getConsumoMemoriaRam() {
        return consumoMemoriaRam;
    }

    public void setConsumoMemoriaRam(int consumoMemoriaRam) {
        this.consumoMemoriaRam = consumoMemoriaRam;
    }

    public int getConsumoCPU() {
        return consumoCPU;
    }

    public void setConsumoCPU(int consumoCPU) {
        this.consumoCPU = consumoCPU;
    }
    public void limpiarProgramas(List<String> listProgramas){
        listProgramas.clear();

    }
    public void request(){
        this.state.handler(this);
    }
}




