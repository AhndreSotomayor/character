package com.my.character.expose.web;

import com.my.character.expose.dto.CharacterRequest;
import com.my.character.expose.dto.CharacterResponse;
import com.my.character.service.business.CharacterService;
import com.my.character.service.repository.CharacterRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/characters")
public class CharacterController {

    private final CharacterService characterService;


    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;

    }

    @GetMapping("/getCharacter")
    public ResponseEntity<CharacterResponse> getCharacter(@RequestParam(name = "id") Integer id) {
        if (null != characterService.getPartialInfoById(id)){
            return ResponseEntity.ok(characterService.getPartialInfoById(id));
        } else {
            return ResponseEntity.notFound().build();
        }
    }










  /*  @PostMapping("/createByItemAndClass")
    // se le pide al "Body" del postman, del cmd, etc. los datos
    // se filtran solo para obtener aquellos datos que hagan match con los de la plantilla de la clase "CharacterRequest"
    // con esa plantilla llena se crea un objeto "characterRequest" con todos los datos necesarios
    // se envia al "Character Service"
    // ResponseEntity es una clase de respuesta HTTP que va a envolver a "<String>", porque la
    // respuesta enviada al usuario sera una cadena de texto
    public ResponseEntity<String> createCharacterByItemAndClass(@RequestBody CharacterRequest characterRequest) {
        // Para enviar estos datos al service, lo invocamos asi, "characterService", despues indicamos
        // lo que se va a enviar "createCharacter" con su nombre que tambien podria ser cualquier otro,
        // por ultimo indicamos los datos de ese nombre que estan en el "characterRequest"
        String response = characterService.createCharacterByItemAndClass(characterRequest);
        if (response.equals("Creado Satisfactoriamente")) {
             // ahora, tal y como dijimos antes, al ejecutarse lo anterior CORRECTAMENTE, al usuario debemos
            // enviarle una respuesta de tipo "String", osea una cadena de texto
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.notFound().build();
        }

    }*/


  /*  @GetMapping("/getAllCharacters")
    public ResponseEntity<List<CharacterResponse>> getAllCharacters() {
        List<CharacterResponse> response = characterService.getAllCharacters();
        if (response == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(response);

    }*/


}