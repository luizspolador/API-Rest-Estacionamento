package br.com.spolador.parkapi.jwt;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//todo pedido de autenticação que for recebido e atendindo com sucesso, será retornado uma resposta (token) gerado
@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class JwtToken {
    private String token;
}
