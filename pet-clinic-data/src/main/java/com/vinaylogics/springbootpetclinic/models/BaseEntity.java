package com.vinaylogics.springbootpetclinic.models;

import java.io.Serializable;

public class BaseEntity  implements Serializable {
    private static final long serialVersionUID = -6564417582155434638L;

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
