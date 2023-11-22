package br.com.spolador.parkapi.web.dto;

import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class EstacionamentoCreateDto {

    @NotBlank
    @Size(min = 8, max = 8)
    @Pattern(regexp = "[A-Z]{3}-[0-9]{4}", message = "A placa do veículo deve seguir o padrão 'XXX-0000'")
    private String placa;

    @NotBlank
    private String marca;

    @NotBlank
    private String modelo;

    @NotBlank
    private String cor;

    @NotBlank
    @Size(min = 11, max = 11)
    @CPF
    private String clienteCpf;
}
