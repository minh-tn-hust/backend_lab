package minh.lab.transaction.infra.postgres.repository;

import lombok.AllArgsConstructor;
import minh.lab.transaction.domain.repository.TransactionPersistence;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TransactionRepository implements TransactionPersistence {
    private final TransactionJpaRepository jpaRepository;
}
