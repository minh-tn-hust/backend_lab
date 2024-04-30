package minh.lab.transaction.infra.postgres.repository;


import minh.lab.transaction.infra.postgres.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionJpaRepository extends JpaRepository<TransactionEntity, Integer> {
}
