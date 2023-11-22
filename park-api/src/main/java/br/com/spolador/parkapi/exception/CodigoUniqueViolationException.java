package br.com.spolador.parkapi.exception;

public class CodigoUniqueViolationException extends RuntimeException {
    public CodigoUniqueViolationException(String msg) {
        super(msg);
    }
}
