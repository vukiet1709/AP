/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AP_Project.Wine;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author VNTK_White
 */
public class WineBottle extends Wine {
    private String producerName;
    private int quantity;
    private double volume;
    private List<String> grapeVarieties = new ArrayList<>();
    private String bottleCode;

    public WineBottle() {
    super();
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public List<String> getGrapeVarieties() {
        return grapeVarieties;
    }

    public void addGrapeVariety(String grapeVariety) {
        grapeVarieties.add(grapeVariety);
    }

    public String getBottleCode() {
        return bottleCode;
    }

    public void setBottleCode(String bottleCode) {
        this.bottleCode = bottleCode;
    }
    public void setGrapeVarieties(List<String> grapeVarieties) {
    this.grapeVarieties = grapeVarieties;
    }
}
