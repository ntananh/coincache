package com.unhomie.coincache.domain;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class User {

    @NotNull
    private String username;

    @NotNull
    private String password;
}
