/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AP_Project.Wine;
/**
 *
 * @author VNTK_White
 */
public class Wine extends BaseEntity {
    private String name;
    private String type;
    private String vineyardName;
    private String vintage;
    private String country;
    private double price;

    public Wine() {
        super();
    }
    @Override
    public void setId(int id) {
    super.setId(id);
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVineyardName() {
        return vineyardName;
    }

    public void setVineyardName(String vineyardName) {
        this.vineyardName = vineyardName;
    }

    public String getVintage() {
        return vintage;
    }

    public void setVintage(String vintage) {
        this.vintage = vintage;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    @Override
    public String toString() {
        return "ID: " + getId() + ", Name: " + getName() + ", Type: " + getType() + 
                ", Vineyard: " + getVineyardName() + ", Vintage: " + getVintage() + 
                ", Country: " + getCountry() + ", Price: " + getPrice();
    }
    
}
