package com.nouari.orm_jpa_hibernate_spring_data.controller;
import com.nouari.orm_jpa_hibernate_spring_data.base.BaseController;
import com.nouari.orm_jpa_hibernate_spring_data.model.Patient;
import com.nouari.orm_jpa_hibernate_spring_data.repository.PatientRep;
import com.nouari.orm_jpa_hibernate_spring_data.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/patients")
public class PatientController extends BaseController<PatientService, Patient, PatientRep,Long> {

    @Autowired
    private PatientService service;


    @GetMapping("/mvc")
    public String getAllMVC(Model module,Integer page,Integer size){
        Page<Patient> patientList= (Page<Patient>) service.findAll(PageRequest.of(page,size));
        module.addAttribute("patientList",patientList);
        return "PatientView.html";
    }
}
