package br.com.spolador.parkapi.web.dto.mapper;

import br.com.spolador.parkapi.web.dto.UsuarioCreateDto;
import br.com.spolador.parkapi.web.dto.UsuarioResponseDto;
import br.com.spolador.parkapi.entities.Usuario;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioMapper {

    public static Usuario toUsuario(UsuarioCreateDto createDto) { // Converte um objeto do tipo UsuarioCreateDto em um objeto Usuario.
        return new ModelMapper().map(createDto, Usuario.class);
    }

    public static UsuarioResponseDto toDto(Usuario usuario) { // Converte um objeto do tipo Usuario em um objeto UsuarioResponseDto. Também mapeia a propriedade role da entidade Usuario.
        String role = usuario.getRole().name().substring("ROLE_".length());
        PropertyMap<Usuario, UsuarioResponseDto> props = new PropertyMap<Usuario, UsuarioResponseDto>() {
            @Override
            protected void configure() {
                map().setRole(role);
            }
        };
        ModelMapper mapper = new ModelMapper();
        mapper.addMappings(props);
        return mapper.map(usuario, UsuarioResponseDto.class);
    }

    public static List<UsuarioResponseDto> toListDto(List<Usuario> usuarios) { // Converte uma lista de objetos do tipo Usuario em uma lista de objetos UsuarioResponseDto.
        return usuarios.stream().map(user -> toDto(user)).collect(Collectors.toList());
        //percorre a lista de usuarios, pega cada um dos usuarios na lista e transforma em um obj do tipo UsuarioResponseDto.
        //pega cada um desses objetos e adiciona em uma nova lista do tipo UsuarioResponseDto
    }
}
