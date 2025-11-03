package dev.ismail.EcommerceProductService.exception;

import dev.ismail.EcommerceProductService.dto.ExceptionResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductNotFoundExceptionHandler {
    @ExceptionHandler({ProductNotFoundException.class,NoProductPresentException.class})
    public ResponseEntity handleProductNotFoundException(ProductNotFoundException pe ){
        ExceptionResponseDTO exceptionResponseDTO = new ExceptionResponseDTO(
                pe.getMessage(),
                404
        );
        return new ResponseEntity<>(exceptionResponseDTO, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NoProductPresentException.class)
    public ResponseEntity handleNoProductPresentException(NoProductPresentException pe){
        ExceptionResponseDTO exceptionResponseDTO = new ExceptionResponseDTO(
                pe.getMessage(),
                404
        );
        return new ResponseEntity<>(exceptionResponseDTO, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(InvalidInputException.class)
    public ResponseEntity handleInvalidInputException(InvalidInputException ie){
        ExceptionResponseDTO exceptionResponseDTO = new ExceptionResponseDTO(
                ie.getMessage(),
                400
        );
        return new ResponseEntity<>(exceptionResponseDTO, HttpStatus.BAD_REQUEST);
    }
}
