package com.nttdata.actives.model;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document
@Data
public class Movement {
  
  @Id
  private String id;
  
  private Date date;
  private String customerId;
  private String agent;
  private float amount;
  private Integer factor;
  private Integer operationNumber;
  
  
}
