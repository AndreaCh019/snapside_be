package com.unisalento.snapside.exceptions;
import static java.lang.System.out;
import static java.lang.System.*;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.BAD_REQUEST, reason = "Non trovato")
public class AdNotFoundException extends Exception {


}

