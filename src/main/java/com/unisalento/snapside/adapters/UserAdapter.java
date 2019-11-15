package com.unisalento.snapside.adapters;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import com.unisalento.snapside.generated.domain.UserEntity;
import com.unisalento.snapside.models.UserDTO;

public class UserAdapter {
    public static UserDTO UserEntityToUserDTO(UserEntity userEntity) {

       //DATE FORMATTER STRING
       // DateFormat dateFormatter = new SimpleDateFormat("yyyy-mm-DD");
       // String strDate = dateFormatter.format(userDTO.getDob());

        UserDTO user=new UserDTO();
        user.setName(userEntity.getName());
        user.setSurname(userEntity.getSurname());
        user.setDob(userEntity.getDob());
        user.setEmail(userEntity.getEmail());
        user.setAddress(userEntity.getAddress());
        user.setPassword(userEntity.getPassword());
        return user;
    }

/*    public static Utente StudenteDTOToUtente(StudenteDTO studenteDTO) throws ParseException{
        DateFormat formatter1;
        formatter1 = new SimpleDateFormat("yyyy-mm-DD");
        Utente utente=new Utente();
        utente.setNome(studenteDTO.getNome());
        utente.setCognome(studenteDTO.getCognome());
        utente.setDatanascita(formatter1.parse(studenteDTO.getData()));
        utente.setEmail(studenteDTO.getEmail());
        utente.setIndirizzo(studenteDTO.getIndirizzo());
        utente.setPassword(studenteDTO.getPassword());
        return utente;
    }*/
}