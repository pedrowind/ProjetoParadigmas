package CapitaoPatria;

public class CapitaoPatria {
    private int insanidade = 0;
    private boolean tomandoLeite = false;

    public CapitaoPatria(int insanidade) {
        this.insanidade = insanidade;
    }

    public void tomarLeite() {
        this.tomandoLeite = true;
        this.insanidade -= 10;
        if (this.insanidade < 0) {
            this.insanidade = 0;
        }
    }

    public void pararDeTomarLeite() {
        this.tomandoLeite = false;
    }

    public boolean isTomandoLeite() {
        return this.tomandoLeite;
    }

    public int getInsanidade() {
        return this.insanidade;
    }
}