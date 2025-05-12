package com.electro.electro_app.infraestructure.utils.validations;

import org.springframework.beans.factory.annotation.Autowired;
import com.electro.electro_app.application.service.*;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ExistsByCountrynameValidation implements ConstraintValidator<ExistsByCountryname, String> {

    @Autowired
    private ICountryService iCountryService;

    @Override
    public boolean isValid(String countryname, ConstraintValidatorContext context){
        if (iCountryService == null) {
            return true;
        }
        return !iCountryService.existsByCountryname(countryname);
    }
}
