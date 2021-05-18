package com.pdzierzega.intecacredit;

import com.pdzierzega.intecacredit.DTO.RequestDto;
import com.pdzierzega.intecacredit.DTO.ResponseDto;
import com.pdzierzega.intecacredit.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
public class CreditController {

    private CreditService creditService;

    @Autowired
    public CreditController(CreditService creditService) {
        this.creditService = creditService;
    }

    @PostMapping("/credits")
    public int createCredit(@RequestBody RequestDto request) {
        int creditId = creditService.createCredit(request);
        return creditId;
    }

    @GetMapping("/credits")
    public Collection<ResponseDto> getCredits(){
        return creditService.getAllAsList();
    }

}
