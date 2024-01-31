package br.com.mjv.builder;

import br.com.mjv.dto.PlayerDTO;
import br.com.mjv.model.Player;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PlayerBuilder {


    private final ModelMapper modelMapper;

    public PlayerBuilder(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public PlayerDTO toDTO(Player player){
        return this.modelMapper.map(player, PlayerDTO.class);
    }
    
    public Player toEntity(PlayerDTO playerDTO){
       return this.modelMapper.map(player, Player.class);
    }
}
