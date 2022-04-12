package com.nttdata.actives.model;

import java.util.List;
import org.springframework.data.mongodb.core.mapping.Document;
import com.nttdata.actives.model.common.CreditlineStatus;
import com.nttdata.actives.model.common.CreditlinesType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "creditlines")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditLine {
  
  private String id;
  private String idcustomer;
  private String lineNumber;
  private CreditlinesType creditlinesType;
  private List<Movement> movements;
  private CreditlineStatus creditlineStatus;
  private String cardNumber;
  private String creditLine;
  private List<Debts> debts;

}
