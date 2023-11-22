package br.com.spolador.parkapi.web.dto.mapper;

import br.com.spolador.parkapi.entities.ClienteVaga;
import br.com.spolador.parkapi.web.dto.EstacionamentoCreateDto;
import br.com.spolador.parkapi.web.dto.EstacionamentoResponseDto;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClienteVagaMapper {

    public static ClienteVaga toClienteVaga(EstacionamentoCreateDto dto){
        return new ModelMapper().map(dto, ClienteVaga.class);
    }

    public static EstacionamentoResponseDto toDto(ClienteVaga clienteVaga){
        return new ModelMapper().map(clienteVaga, EstacionamentoResponseDto.class);
    }
}
