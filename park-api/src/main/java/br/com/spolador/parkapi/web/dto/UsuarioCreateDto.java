package br.com.spolador.parkapi.web.dto;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class UsuarioCreateDto {

    @Email(message = "formato do e-mail inválido", regexp = "^[a-z0-9.+-]+@[a-z0-9.-]+\\.[a-z]{2,}$")
    @NotBlank
    private String username;

    @NotBlank
    @Size(min = 6, max = 6)
    private String password;
}
