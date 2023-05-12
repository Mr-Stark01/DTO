package org.datatransferobject;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class DTO implements Serializable {
    private static final long serialVersionUID = 6529685098267757690L;
    private List<UnitDTO> unitDTOs;
    private List<TowerDTO> towerDTOs;
    private PlayerDTO playerDTO;
    private Date dateOfCreation;
    private boolean checked;
    private int id;
    private String name;
    protected String message;

    public DTO(List<UnitDTO> unitDTOs, List<TowerDTO> towerDTOs, PlayerDTO playerDTO,int id,String name,String message){
        this.unitDTOs=unitDTOs;
        this.towerDTOs=towerDTOs;
        this.playerDTO=playerDTO;
        this.id=id;
        dateOfCreation = new Date();
        this.name=name;
        this.message=message;
    }
    public int getId() {
        return id;
    }

    public void updateDate(){
        dateOfCreation = new Date();
    }

    public List<UnitDTO> getUnitDTOs() {
        return unitDTOs;
    }

    public List<TowerDTO> getTowerDTOs() {
        return towerDTOs;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PlayerDTO getPlayerDTO() {
        return playerDTO;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "DTO{" +
                "unitDTOs=" + unitDTOs +
                ", towerDTOs=" + towerDTOs +
                ", playerDTO=" + playerDTO +
                ", dateOfCreation=" + dateOfCreation +
                ", checked=" + checked +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
