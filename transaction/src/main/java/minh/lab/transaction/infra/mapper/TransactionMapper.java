package minh.lab.transaction.infra.mapper;

import minh.lab.transaction.domain.model.Transaction;
import minh.lab.transaction.infra.postgres.entity.TransactionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TransactionMapper {
    TransactionMapper INSTANCE = Mappers.getMapper(TransactionMapper.class);

    Transaction transactionEntityToModel(TransactionEntity transaction);
}
