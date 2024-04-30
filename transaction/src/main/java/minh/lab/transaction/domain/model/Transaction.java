package minh.lab.transaction.domain.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Generated;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class Transaction {
    private long id;
    private long senderId;
    private long receiverId;
}
