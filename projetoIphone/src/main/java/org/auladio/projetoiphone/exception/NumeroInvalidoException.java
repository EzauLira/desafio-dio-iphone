package org.auladio.projetoiphone.exception;


public class NumeroInvalidoException extends Exception {

    public NumeroInvalidoException(String message) {
        super(message);
    }

    public static int numeroInvalido(int parametro) throws NumeroInvalidoException {
        if (parametro <= 0 || parametro > 4) {
            throw new NumeroInvalidoException("Número inválido! por favor escolha entre 1 a 4");
        }
        return parametro;
    }
}
