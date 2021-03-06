package com.reachcorp.reach.nerdetecthon.dto.entities.insight;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Equipment entity.
 */
public class Equipment extends InsightEntity implements Serializable {

    private String id;

    @NotNull
    private String equipmentName;

    private String equipmentDescription;

    private EquipmentType equipmentType;

    private String equipmentCoordinates;

    private String equipmentSymbol;

    private byte[] equipmentImage;
    private String equipmentImageContentType;

    private String externalId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getEquipmentDescription() {
        return equipmentDescription;
    }

    public void setEquipmentDescription(String equipmentDescription) {
        this.equipmentDescription = equipmentDescription;
    }

    public EquipmentType getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(EquipmentType equipmentType) {
        this.equipmentType = equipmentType;
    }

    public String getEquipmentCoordinates() {
        return equipmentCoordinates;
    }

    public void setEquipmentCoordinates(String equipmentCoordinates) {
        this.equipmentCoordinates = equipmentCoordinates;
    }

    public String getEquipmentSymbol() {
        return equipmentSymbol;
    }

    public void setEquipmentSymbol(String equipmentSymbol) {
        this.equipmentSymbol = equipmentSymbol;
    }

    public byte[] getEquipmentImage() {
        return equipmentImage;
    }

    public void setEquipmentImage(byte[] equipmentImage) {
        this.equipmentImage = equipmentImage;
    }

    public String getEquipmentImageContentType() {
        return equipmentImageContentType;
    }

    public void setEquipmentImageContentType(String equipmentImageContentType) {
        this.equipmentImageContentType = equipmentImageContentType;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Equipment equipment = (Equipment) o;
        if (equipment.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), equipment.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + getId() +
                ", equipmentName='" + getEquipmentName() + "'" +
                ", equipmentDescription='" + getEquipmentDescription() + "'" +
                ", equipmentType='" + getEquipmentType() + "'" +
                ", equipmentCoordinates='" + getEquipmentCoordinates() + "'" +
                ", equipmentSymbol='" + getEquipmentSymbol() + "'" +
                ", equipmentImage='" + getEquipmentImage() + "'" +
                ", externalId='" + getExternalId() + "'" +
                "}";
    }
}
