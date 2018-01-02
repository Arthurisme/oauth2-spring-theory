package com.resource.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resource.domain.Patient;
import com.resource.service.PatientService;

@RestController
public class ResourceController {

    @Autowired
    private PatientService patientService;

    @RequestMapping("/resource/patient/all")
    public List<Patient> findAll() {
        return patientService.findAll();
    }

}
