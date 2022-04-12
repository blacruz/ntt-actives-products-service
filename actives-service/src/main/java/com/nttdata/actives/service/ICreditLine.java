package com.nttdata.actives.service;

import com.nttdata.actives.dto.CreditLineDto;
import com.nttdata.actives.model.CreditLine;
import reactor.core.publisher.Mono;

public interface ICreditLine {

  public Mono<CreditLine> save(CreditLineDto creditLineDto);
}
