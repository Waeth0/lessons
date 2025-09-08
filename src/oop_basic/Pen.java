package oop_basic;

import java.util.Objects;

public class Pen {
    private PenMaterial material = PenMaterial.PLASTIC;
    private PenColor color = PenColor.GREEN;
    private PenConstruction construction = PenConstruction.FOUNTAIN;

    public PenMaterial getMaterial() {
        return material;
    }

    public void setMaterial(PenMaterial material) {
        this.material = material;
    }

    public PenColor getColor() {
        return color;
    }

    public void setColor(PenColor color) {
        this.color = color;
    }

    public PenConstruction getConstruction() {
        return construction;
    }

    public void setConstruction(PenConstruction construction) {
        this.construction = construction;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "material=" + material +
                ", color=" + color +
                ", construction=" + construction +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return material == pen.material && color == pen.color && construction == pen.construction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, color, construction);
    }

}
