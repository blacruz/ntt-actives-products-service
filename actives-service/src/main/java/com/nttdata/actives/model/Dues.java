package com.nttdata.actives.model;

import java.util.Date;
import org.springframework.data.mongodb.core.mapping.Document;
import com.nttdata.actives.model.common.DuesState;
import lombok.Data;

@Document
@Data
public class Dues {

  private float amount;
  private Date dueDate;
  private DuesState duesState;
}
