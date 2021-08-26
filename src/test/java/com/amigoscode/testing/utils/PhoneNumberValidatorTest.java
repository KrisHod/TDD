package com.amigoscode.testing.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;


public class PhoneNumberValidatorTest {

    private PhoneNumberValidator underTest;

    @BeforeEach
    void setUp(){
        underTest= new PhoneNumberValidator();
    }

    @ParameterizedTest
    @CsvSource({
            "+19020000000,true",
            "+190200000009,false",
            "19020000000,false"})
    void itShouldValidatePhoneNumber(String phoneNumber, boolean expected){
        //When
        boolean isValid = underTest.test(phoneNumber);

        //Then
        assertThat(isValid).isEqualTo(expected);
    }
}

