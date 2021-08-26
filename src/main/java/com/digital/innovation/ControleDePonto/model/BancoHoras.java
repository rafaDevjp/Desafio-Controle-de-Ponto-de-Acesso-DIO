package com.digital.innovation.ControleDePonto.model;



import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BancoHoras {


    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @Embeddable

    public class BancoHorasId implements Serializable{
        private long idBancohoras;
        private long idMovimentacao;
        private long idUsuarios;
    }

    @EmbeddedId
    private BancoHorasId id;
    private LocalDateTime datatrabalhada;
    private BigDecimal quantidadeHoras;
    private BigDecimal saldoHoras;

}
