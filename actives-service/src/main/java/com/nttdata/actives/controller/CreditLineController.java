package com.nttdata.actives.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nttdata.actives.dto.CreditLineDto;
import com.nttdata.actives.model.CreditLine;
import com.nttdata.actives.service.CreditLineService;
import reactor.core.publisher.Mono;

@RequestMapping("/activos")
@RestController
public class CreditLineController {

  
  @Autowired
  public CreditLineService creditLineService;
  
  @PostMapping("/creditline")
  public Mono<CreditLine> createCreditLine(@RequestBody CreditLineDto creditLineDto){
    Mono<CreditLine> mono = creditLineService.save(creditLineDto);
    return mono;
  }
}
