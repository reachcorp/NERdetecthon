package com.reachcorp.reach.nerdetecthon.dto.entities.insight;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Biographics entity.
 */
public class Biographics extends InsightEntity implements Serializable {

    private String id;

    @NotNull
    private String biographicsFirstname;

    @NotNull
    private String biographicsName;

    private Integer biographicsAge;

    private Gender biographicsGender;

    private byte[] biographicsImage;
    private String biographicsImageContentType;

    private String biographicsCoordinates;

    private String biographicsSymbol;

    private String externalId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBiographicsFirstname() {
        return biographicsFirstname;
    }

    public void setBiographicsFirstname(String biographicsFirstname) {
        this.biographicsFirstname = biographicsFirstname;
    }

    public String getBiographicsName() {
        return biographicsName;
    }

    public void setBiographicsName(String biographicsName) {
        this.biographicsName = biographicsName;
    }

    public Integer getBiographicsAge() {
        return biographicsAge;
    }

    public void setBiographicsAge(Integer biographicsAge) {
        this.biographicsAge = biographicsAge;
    }

    public Gender getBiographicsGender() {
        return biographicsGender;
    }

    public void setBiographicsGender(Gender biographicsGender) {
        this.biographicsGender = biographicsGender;
    }

    public byte[] getBiographicsImage() {
        return biographicsImage;
    }

    public void setBiographicsImage(byte[] biographicsImage) {
        this.biographicsImage = biographicsImage;
    }

    public String getBiographicsImageContentType() {
        return biographicsImageContentType;
    }

    public void setBiographicsImageContentType(String biographicsImageContentType) {
        this.biographicsImageContentType = biographicsImageContentType;
    }

    public String getBiographicsCoordinates() {
        return biographicsCoordinates;
    }

    public void setBiographicsCoordinates(String biographicsCoordinates) {
        this.biographicsCoordinates = biographicsCoordinates;
    }

    public String getBiographicsSymbol() {
        return biographicsSymbol;
    }

    public void setBiographicsSymbol(String biographicsSymbol) {
        this.biographicsSymbol = biographicsSymbol;
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

        Biographics biographics = (Biographics) o;
        if (biographics.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), biographics.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Biographics{" +
                "id=" + getId() +
                ", biographicsFirstname='" + getBiographicsFirstname() + "'" +
                ", biographicsName='" + getBiographicsName() + "'" +
                ", biographicsAge=" + getBiographicsAge() +
                ", biographicsGender='" + getBiographicsGender() + "'" +
                ", biographicsImage='" + getBiographicsImage() + "'" +
                ", biographicsCoordinates='" + getBiographicsCoordinates() + "'" +
                ", biographicsSymbol='" + getBiographicsSymbol() + "'" +
                ", externalId='" + getExternalId() + "'" +
                "}";
    }
}
