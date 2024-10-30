package Ejercicio7;

class Chalet extends Vivienda {
    private int numParcela;
    private boolean conPiscina;

    public Chalet(String calle, int superficieEnMetros, int numParcela, boolean conPiscina) {
        super(calle, superficieEnMetros);
        this.numParcela = numParcela;
        this.conPiscina = conPiscina;
    }

    @Override
    public double calcularPrecio() {
        return getSuperficieEnMetros() * 1300; 
    }

    @Override
    public double impuestoMunicipal() {
        double impuesto = calcularPrecio() * 0.05; 
        if (conPiscina) {
            impuesto += 200; 
        }
        return impuesto;
    }

    public int getNumParcela() {
        return numParcela;
    }

    public void setNumParcela(int numParcela) {
        this.numParcela = numParcela;
    }

    public boolean isConPiscina() {
        return conPiscina;
    }

    public void setConPiscina(boolean conPiscina) {
        this.conPiscina = conPiscina;
    }
}