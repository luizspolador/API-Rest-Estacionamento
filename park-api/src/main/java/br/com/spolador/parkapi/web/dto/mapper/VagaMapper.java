package br.com.spolador.parkapi.web.dto.mapper;

import br.com.spolador.parkapi.entities.Vaga;
import br.com.spolador.parkapi.web.dto.VagaCreateDto;
import br.com.spolador.parkapi.web.dto.VagaResponseDto;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class VagaMapper {

    public static Vaga toVaga(VagaCreateDto dto) {
        return new ModelMapper().map(dto, Vaga.class);
    }

    public static VagaResponseDto toDto(Vaga vaga) {
        return new ModelMapper().map(vaga, VagaResponseDto.class);
    }
}
