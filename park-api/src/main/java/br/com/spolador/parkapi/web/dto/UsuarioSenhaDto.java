package br.com.spolador.parkapi.web.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UsuarioSenhaDto {

    @NotBlank
    @Size(min = 6, max = 6)
    private String senhaAtual;

    @NotBlank
    @Size(min = 6, max = 6)
    private String novaSenha;

    @NotBlank
    @Size(min = 6, max = 6)
    private String confirmaSenha;
}
