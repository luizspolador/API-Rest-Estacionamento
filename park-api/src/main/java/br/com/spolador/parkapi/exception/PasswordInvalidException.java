package br.com.spolador.parkapi.exception;

public class PasswordInvalidException extends RuntimeException {
    public PasswordInvalidException(String message) {
        super(message);
    }
}
