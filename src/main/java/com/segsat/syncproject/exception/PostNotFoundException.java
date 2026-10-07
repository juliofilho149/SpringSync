package com.segsat.syncproject.exception;

//Exceção personalizada para retornar uma mensagem que possa ser definida.
public class PostNotFoundException extends RuntimeException {
    public PostNotFoundException(String message) {
        super(message);
    }
}
