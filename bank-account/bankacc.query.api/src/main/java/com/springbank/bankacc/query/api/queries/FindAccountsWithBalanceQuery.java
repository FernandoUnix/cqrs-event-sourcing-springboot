package com.springbank.bankacc.query.api.queries;

import com.springbank.bankacc.query.api.dto.EqualityType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FindAccountsWithBalanceQuery {
    private EqualityType equalityType;
    private double balance;
}
