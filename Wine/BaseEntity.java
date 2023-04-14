/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AP_Project.Wine;
import java.time.LocalDateTime;
/**
 *
 * @author VNTK_White
 */
public class BaseEntity {
    private static int lastId = 0;
    private int id;
    private LocalDateTime created;
    private LocalDateTime updated;  
    
    public BaseEntity() {
        this.id = BaseEntity.createId();
        this.created = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    private static int createId() {
        lastId++;
        return lastId;
    }
}
