package com.estudio.spring.springExample.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    private Integer id;
    private String nombre;
    private String apellido;
    private BigDecimal celular;
    private String direccion;
    @Column(name="Correo_electronico")
    private String correoElectronico;

    @OneToMany(mappedBy = "cliente")
    List<Compra> compras;

}
