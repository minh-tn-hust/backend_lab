package minh.lab.transaction.infra.postgres.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TransactionEntity {
    @Id
    @Nonnull
    @Column(name = "id")
    private long id;

    @Column(name = "sender_id")
    @Nonnull
    private long senderId;

    @Column(name = "receiver_id")
    @Nonnull
    private long receiverId;

    @Column(name = "amount")
    private long amount;
}
