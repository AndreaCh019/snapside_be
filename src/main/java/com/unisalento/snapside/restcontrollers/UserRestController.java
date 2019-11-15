package com.unisalento.snapside.restcontrollers;

import java.util.Iterator;
import java.util.List;

import com.unisalento.snapside.adapters.UserAdapter;
import com.unisalento.snapside.generated.domain.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unisalento.snapside.services.UserService;

import com.unisalento.snapside.iservices.IUserService;
import com.unisalento.snapside.models.UserDTO;

import com.unisalento.snapside.exceptions.UserNotFoundException;


@RestController() //
@RequestMapping(value="/user")

public class UserRestController {

    @Autowired
    IUserService userService;

    @GetMapping(value="/login/{email}/{password}", produces=MediaType.APPLICATION_JSON_VALUE)
    public UserDTO login(@PathVariable("email") String email,@PathVariable("password") String password) throws UserNotFoundException{
        boolean loggedin = false;
        List<UserEntity> users = null;
        users=(userService.getAll());
        UserEntity user = new UserEntity();
        UserDTO userDTO= new UserDTO();
        Iterator<UserEntity> users_iter = users.iterator();
        while(users_iter.hasNext()) {
            UserDTO currentUserDTO= new UserDTO();

            UserEntity currentUserEntity=users_iter.next();

            currentUserDTO= UserAdapter.UserEntityToUserDTO(currentUserEntity);
            System.out.println(currentUserDTO.getEmail()+","+currentUserDTO.getPassword());
            if(currentUserDTO.getEmail().equals(email) && currentUserDTO.getPassword().equals(password))
            {
                //classSingleton1.setStudenteDTO(studenteeDTO);
                //System.out.println(classSingleton1.getStudenteDTO());
                loggedin=true;
                System.out.println(loggedin);
                userDTO=currentUserDTO;
                break;
            }
        }
        return userDTO;
    }


    /*
    @GetMapping(value="/loginDocente/{email}/{password}", produces=MediaType.APPLICATION_JSON_VALUE)
    public DocenteDTO loginDocente(@PathVariable("email") String email,@PathVariable("password") String password) throws DocenteNotFoundException{
        boolean loggato = false;
        List<Docente> docente = null;
        docente=(docenteService.getAll());
        Utente utente=new Utente();
        DocenteDTO docenteDTO= new DocenteDTO();
        Iterator<Docente> docent = docente.iterator();
        while(docent.hasNext()) {
            DocenteDTO docenteeDTO= new DocenteDTO();
            Docente doc=docent.next();
            utente=doc.getUtente();
            docenteeDTO=DocenteAdapter.DocenteToDocenteDTO(doc, utente);
            System.out.println(docenteeDTO.getEmail()+","+docenteeDTO.getPassword());
            if(docenteeDTO.getEmail().equals(email) && docenteeDTO.getPassword().equals(password))
            {
                //classSingleton1.setStudenteDTO(studenteeDTO);
                //System.out.println(classSingleton1.getStudenteDTO());
                loggato=true;
                System.out.println(loggato);
                docenteDTO=docenteeDTO;
                break;
            }
        }
        return docenteDTO;
    }*/
}
