package com.chtrembl.petstore.pet.model;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class StatusEnumConverter implements AttributeConverter<Pet.StatusEnum, String> {

    @Override
    public String convertToDatabaseColumn(Pet.StatusEnum statusEnum) {
        return null == statusEnum ? null : statusEnum.getValue();
    }

    @Override
    public Pet.StatusEnum convertToEntityAttribute(String databaseValue) {
        return Pet.StatusEnum.fromValue(databaseValue);
    }
}
