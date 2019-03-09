package com.fr.formation.dtos;

import javax.validation.constraints.NotNull;

public class UserGetIdDto extends UserDto {

    @NotNull
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}