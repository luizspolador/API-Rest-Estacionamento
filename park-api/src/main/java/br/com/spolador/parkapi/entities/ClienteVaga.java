package br.com.spolador.parkapi.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "clientes_tem_vagas")
@EntityListeners(AuditingEntityListener.class)
public class ClienteVaga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_recibo", nullable = false, unique = true, length = 15)
    private String recibo;

    @Column(nullable = false, length = 8) // 3 letras - 4 num
    private String placa;

    @Column(nullable = false, length = 45)
    private String marca;

    @Column(nullable = false, length = 45)
    private String modelo;

    @Column(nullable = false, length = 45)
    private String cor;

    @Column(name = "data_entrada", nullable = false)
    private LocalDateTime dataEntrada;

    @Column(name = "data_saida")
    private LocalDateTime dataSaida;

    @Column(columnDefinition = "decimal(7,2)")
    private BigDecimal valor;

    @Column(columnDefinition = "decimal(7,2)")
    private BigDecimal desconto;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_vaga", nullable = false)
    private Vaga vaga;

    @CreatedDate
    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;
    @LastModifiedDate
    @Column(name = "data_modificacao")
    private LocalDateTime dataModificacao;
    @CreatedBy
    @Column(name = "criado_por")
    private String criadoPor;
    @LastModifiedBy
    @Column(name = "modificado_por")
    private String modificadoPor;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof ClienteVaga)) return false;
        ClienteVaga that = (ClienteVaga) object;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
