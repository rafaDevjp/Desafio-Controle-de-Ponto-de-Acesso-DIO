package com.digital.innovation.ControleDePonto.model;


import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Audited
@Entity
public class Empresa {
    @Id
    private long id;

    private String descricaoEmpresa;
    private String numeroCNPJ;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;

}


