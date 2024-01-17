package fr.uga.miage.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Region")

public class Region {
    @Id
    @Column(name = "nomRegion")
    private String nomRegion;
public Region(){
    
}
    public Region(String nomRegion){
        this.nomRegion=nomRegion;
    }
   
    
}
