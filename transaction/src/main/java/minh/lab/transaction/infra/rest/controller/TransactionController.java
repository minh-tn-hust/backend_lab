package minh.lab.transaction.infra.rest.controller;

import org.hibernate.annotations.ParamDef;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/transactions")
public class TransactionController {
    @GetMapping("/{id}")
    public String getTransactionById(@PathVariable String id) {
        return String.format("Hello %s! transaction", id);
    }
}
