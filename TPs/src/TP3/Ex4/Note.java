package TP3.Ex4;

public class Note {
    private float note;
    private int coefficient;

    public Note (float note, int coefficient) {
        if ((note < 0) || (20 < note) || (coefficient <= 0)) {
            throw new IllegalArgumentException("Note ou coefficient invalide");
        }
        this.note = note;
        this.coefficient = coefficient;
    }

    public void setNote (float note) {
        if ((0 <= note) && (note <= 20))
            this.note = note;
    }

    public float getNote () {
        return this.note;
    }

    public void setCoefficient (int coefficient) {
        if (coefficient > 0)
            this.coefficient = coefficient;
    }

    public int getCoefficient () {
        return this.coefficient;
    }

    @Override
    public String toString() {
        return this.note + " ---> " + this.coefficient;
    }
}
