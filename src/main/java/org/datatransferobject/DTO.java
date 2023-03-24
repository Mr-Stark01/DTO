package org.datatransferobject;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class DTO implements Serializable {
    private List<UnitDTO> unitDTOs;
    private List<TowerDTO> towerDTOs;
    private PlayerDTO playerDTO;
    private Date dateOfCreation;

    public DTO(List<UnitDTO> unitDTOs, List<TowerDTO> towerDTOs, PlayerDTO playerDTO){
        this.unitDTOs=unitDTOs;
        this.towerDTOs=towerDTOs;
        this.playerDTO=playerDTO;

        dateOfCreation = new Date();
    }

    public List<UnitDTO> getUnitDTOs() {
        return unitDTOs;
    }

    public List<TowerDTO> getTowersDTOs() {
        return towerDTOs;
    }

    public PlayerDTO getPlayerDTO() {
        return playerDTO;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }
}