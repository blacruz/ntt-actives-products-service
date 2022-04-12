package com.nttdata.actives.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.nttdata.actives.model.CreditLine;

public interface RepositoryActives extends ReactiveMongoRepository<CreditLine, String>{

}
