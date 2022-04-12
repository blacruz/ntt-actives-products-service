package com.nttdata.actives.dto;


import java.util.List;
import com.nttdata.actives.model.Debts;
import com.nttdata.actives.model.common.CreditlineStatus;
import lombok.Data;

@Data
public class CreditLineDto {
  
  private String idCustomer;
  private CreditlineStatus creditlineStatus;
  private String creditLine;
  private List<Debts> debts;
}
