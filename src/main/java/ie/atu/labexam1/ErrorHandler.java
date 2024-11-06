package ie.atu.labexam1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;
@ControllerAdvice
public class ErrorHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,String>> showErros(MethodArgumentNotValidException ex){

        Map<String, String > errorList = new HashMap<>();
        for (FeildError error : ex.getFieldError()){
            String err_name = error.getFeild();
            String err_message = error.getDefaultMessage();
            errorList.put(err_name, err_message);
        }
        return ResponseEntity.statust(400).body(errorList);
    }

}
