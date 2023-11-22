package br.com.spolador.parkapi.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class ClienteCreateDto {
    @NotBlank
    @Size(min = 5, max = 100)
    private String nome;
    @Size(min = 11, max = 11)
    @CPF
    private String cpf;
}
