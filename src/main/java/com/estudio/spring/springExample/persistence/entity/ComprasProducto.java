package com.estudio.spring.springExample.persistence.entity;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "compras_productos")
public class ComprasProducto {

    @EmbeddedId
    private ComprasProductoPK id;
    private Integer cantidad;
    private Double total;
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;
}
