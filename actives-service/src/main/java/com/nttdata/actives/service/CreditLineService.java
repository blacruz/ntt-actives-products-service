package com.nttdata.actives.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nttdata.actives.dto.CreditLineDto;
import com.nttdata.actives.model.CreditLine;
import com.nttdata.actives.repository.RepositoryActives;
import com.nttdata.actives.service.dto.ActivesInDTOCreditLine;
import reactor.core.publisher.Mono;

@Service
public class CreditLineService implements ICreditLine{
  
  @Autowired
  public RepositoryActives creditLineService;


  @Override
  public Mono<CreditLine> save(CreditLineDto creditLineDto) {
    CreditLine creditLine = ActivesInDTOCreditLine.map(creditLineDto);
    return creditLineService.save(creditLine);
  }

}
