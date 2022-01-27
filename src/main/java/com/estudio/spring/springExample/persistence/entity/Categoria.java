package com.estudio.spring.springExample.persistence.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategoria;
    private String descripcion;
    private Boolean estado;

    @OneToMany(mappedBy = "categorias")
    private List<Producto> productos;

}
