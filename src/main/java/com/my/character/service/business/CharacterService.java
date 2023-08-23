package com.my.character.service.business;

import com.my.character.expose.dto.CharacterRequest;
import com.my.character.expose.dto.CharacterResponse;
import com.my.character.service.entity.CharacterEntity;
import com.my.character.service.repository.CharacterRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class CharacterService {

    private final CharacterRepository characterRepository;


    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }


    public CharacterResponse getPartialInfoById(Integer id) {
        CharacterEntity characterEntity = characterRepository.findById(id).orElse(null);
        CharacterResponse characterResponse;
        characterResponse = new CharacterResponse();

        if (characterEntity != null) {
            characterResponse.setName(characterEntity.getName());
            characterResponse.setClassName(characterEntity.getClassEntity().getName());
            characterResponse.setCreateDate(characterEntity.getCreateDate());
        }
        return characterResponse;

    }










































   /* public String createCharacter(CharacterRequest characterRequest) {
        if (characterRequest != null) {
            CharacterEntity characterEntity = new CharacterEntity();
            if (characterRequest.getName() != null) {
                characterEntity.setName(characterRequest.getName());
            } else {
                return "por favor ingresar datos del Name";
            }
            if (characterRequest.getItem() != null) {
                characterEntity.setItem(characterRequest.getItem());
            } else {
                return "por favor ingresar datos del Item";
            }
            characterEntity.setCreateDate(LocalDateTime.now());
           /* try {
                characterRepository.save(characterEntity);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            characterRepository.save(characterEntity);
            return "Creado Satisfactoriamente";
        } else {
            return "POR FAVOR SOLO INGRESAR DATOS";
        }

    }*/


    /*public String createCharacterByItemAndClass(CharacterRequest characterRequest) {
        if (characterRequest != null) {
            CharacterEntity characterEntity = new CharacterEntity();
            if (characterRequest.getName() != null) {
                characterEntity.setName(characterRequest.getName());
            } else {
                return "falto ingresar el name";
            }
            if (characterRequest.getItem() != null) {
                characterEntity.setItem(characterRequest.getItem());
            } else {
                return "por favor ingresar datos del Item";
            }
            if (characterRequest.getClassId() != null) {
                characterEntity.setClassId(characterRequest.getClassId());
            } else {
                return "por favor ingresar datos de la clase";
            }
            if (clientItems.getItemByName(characterRequest.getItem()) == null) {
                return "por favor ingresar los datos correctos del item de Castlevania";
            }
            if (clientItems.getClassByName(characterRequest.getClassId().toString()) == null) {
                return "por favor ingresar los datos correctos de classtype";
            }
            characterEntity.setCreateDate(LocalDateTime.now());
            characterRepository.save(characterEntity);
            return "Creado Satisfactoriamente";
        } else {
            return "no se pudo crear el Character";
        }
    }


    public List<CharacterResponse> getAllCharacters() {
        List<CharacterEntity> characterEntityList = characterRepository.findAll();
        List<CharacterResponse> characterResponseList = new ArrayList<>();
        // como podemos ver, se puede crear uno o mas objetos dentro de una funcion, en este caso particular
        // dentro de la funcion "for"
        // a esta parte de codigo "i<=characterEntityList.size() - 1", se le coloca el -1, porque "size"
        // no empieza desde 0 como se necesita, sino que empieza de 1
        for(int i=0; i<=characterEntityList.size() - 1 ; i++){
        // al crearse este objeto dentro de la funcion for, nos quiere decir que en cada loop o ciclo,
        // va a ser creado
            CharacterResponse characterResponse = new CharacterResponse();
            characterResponse.setClassId(characterEntityList.get(i).getClassId()); // Copiamos el ID del personaje.
            characterResponse.setName(characterEntityList.get(i).getName()); // Copiamos el nombre del personaje.
            characterResponse.setItem(characterEntityList.get(i).getItem());
        // como sabemos, las funciones arrojan una respuesta, pero por defecto, no retienen o no guardan
        // ningun tipo de respuesta, por ello cuando se realizan loops o loops anidados, si no se escribe
        // un codigo que permita que esta o estas respuestas sean guardadas o impresas, la misma funcion
        // terminara por sobreescribirla, por ello se coloca el "System.out.println()", de esa forma toda
        // respuesta arrojada va a ser impresa o COMO EN ESTE CASO, SE ESCRIBE ESTE CODIGO
        // PARA GUARDAR LA INFORMACION
            characterResponseList.add(characterResponse);
            //trasladar los datos del entity al dto responses
        }
        return characterResponseList;



    }


    // crear un metodo para obtener solamente
    // el name class, el name character y el create date*/


}

