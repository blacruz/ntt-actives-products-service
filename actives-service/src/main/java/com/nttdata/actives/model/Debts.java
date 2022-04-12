package com.nttdata.actives.model;

import java.util.List;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document
public class Debts {

  private String description;
  private List<Dues> dues;
}
