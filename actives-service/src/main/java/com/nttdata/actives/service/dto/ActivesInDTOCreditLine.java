package com.nttdata.actives.service.dto;


import com.nttdata.actives.dto.CreditLineDto;
import com.nttdata.actives.model.CreditLine;
import com.nttdata.actives.model.common.CreditlineStatus;

public class ActivesInDTOCreditLine {

  public static CreditLine map(CreditLineDto creditLineDto)
  {
    CreditLine creditLine = new CreditLine();
    creditLine.setCreditLine(creditLineDto.getCreditLine());
    creditLine.setDebts(creditLineDto.getDebts());
    creditLine.setCreditlineStatus(CreditlineStatus.ENABLED);
    creditLine.setIdcustomer(creditLineDto.getIdCustomer());
    return creditLine;
  }
}
