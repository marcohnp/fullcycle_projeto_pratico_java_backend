package com.fullcycle.admin.catalogo.domain.exceptions;

import com.fullcycle.admin.catalogo.domain.validation.Error;

import java.util.List;

public class DomainException extends NoStacktraceException{

    private final List<Error> errors;

    private DomainException(final String aMassage, final List<Error> anErrors){
        super(aMassage);
        this.errors = anErrors;
    }

    public static DomainException with(final Error anError){
        return new DomainException(anError.message(), List.of(anError));
    }

    public static DomainException with(final List<Error> anErrors){
        return new DomainException("", anErrors);
    }

    public List<Error> getErrors() {
        return errors;
    }
}
