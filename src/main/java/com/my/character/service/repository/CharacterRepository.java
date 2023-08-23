package com.my.character.service.repository;

import com.my.character.service.entity.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
// JpaRepository<Maria, String> Maria es el nombre de la tabla (es "maria", pero esta parte
// no es sencible a las mayusculas, y como el Primary Key de la tabla maria es Textual se
// coloca que es de tipo String
public interface CharacterRepository extends JpaRepository<CharacterEntity, Integer> {

    Optional<CharacterEntity> findByName(String name);
}

